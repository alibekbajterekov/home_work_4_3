package com.example.home_work_4_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.home_work_4_3.databinding.FragmentContinentBinding;

import java.util.ArrayList;


public class ContinentFragment extends Fragment implements OnItemClick {

    private FragmentContinentBinding binding;
    private ArrayList<String> continentList = new ArrayList<>();
    private ContinentAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new ContinentAdapter(continentList, this);
        binding.rvContinent.setAdapter(adapter);
    }

    private void loadData() {
        continentList.add("America");
        continentList.add("Africa");
        continentList.add("Asia");
        continentList.add("Europe");
        continentList.add("Australia");
    }

    @Override
    public void onClick(int position) {
        String str = continentList.get(position);
        Bundle bundle = new Bundle();
        bundle.putString("continent",str );
        Fragment fragment = new CountryFragment();
        fragment.setArguments(bundle);

        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment)
                .addToBackStack(null).commit();

    }
}