package com.example.home_work_4_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.home_work_4_3.databinding.FragmentCountryBinding;
import com.example.home_work_4_3.databinding.ItemCountryBinding;

import java.util.ArrayList;


public class CountryFragment extends Fragment {


    private ArrayList<Country> countryList = new ArrayList<>();
    private FragmentCountryBinding binding;
    private RecyclerView.Adapter adapter;

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountryBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getArguments() != null) {
            String position = getArguments().getString("continent");
            if (position == "America") {
                loadDataAmerica();
                adapter = new CountryAdapter(countryList);
                binding.rvCountry.setAdapter(adapter);
            } else if (position == "Africa") {
                loadDataAfrica();
                adapter = new CountryAdapter(countryList);
                binding.rvCountry.setAdapter(adapter);
            } else if (position == "Asia") {
                loadDataAsia();
                adapter = new CountryAdapter(countryList);
                binding.rvCountry.setAdapter(adapter);
            } else if (position == "Europe") {
                loadDataEurope();
                adapter = new CountryAdapter(countryList);
                binding.rvCountry.setAdapter(adapter);
            } else if (position == "Australia") {
                loadDataAustralia();
                adapter = new CountryAdapter(countryList);
                binding.rvCountry.setAdapter(adapter);
            }
        }


    }

    private void loadDataAmerica() {
        countryList.add(new Country("Canada", "Ottawa", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Canada_%28Pantone%29.svg/250px-Flag_of_Canada_%28Pantone%29.svg.png"));
        countryList.add(new Country("USA", "Washington", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Flag_of_the_United_States_%28Pantone%29.svg/250px-Flag_of_the_United_States_%28Pantone%29.svg.png"));
        countryList.add(new Country("Mexico", "Mexico", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Flag_of_Mexico.svg/2560px-Flag_of_Mexico.svg.png"));
        countryList.add(new Country("Brazil", "Brasilia", "https://gtmarket.ru/files/flags/Flag_of_Brazil.png"));
        countryList.add(new Country("Argentina", "Buenos Aires", "https://cdn.britannica.com/69/5869-004-7D75CD05/Flag-Argentina.jpg"));
    }

    private void loadDataAfrica() {
        countryList.add(new Country("Nigeria", "Abuja", "https://cdn.britannica.com/68/5068-004-72A3F250/Flag-Nigeria.jpg"));
        countryList.add(new Country("Kenya", "Nairobi", "https://cdn.britannica.com/15/15-004-B5D6BF80/Flag-Kenya.jpg"));
        countryList.add(new Country("Ghana", "Accra", "https://cdn.britannica.com/54/5054-004-A09ABCDF/Flag-Ghana.jpg"));
        countryList.add(new Country("Morocco", "Rabat", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Flag_of_Morocco.svg/255px-Flag_of_Morocco.svg.png"));
        countryList.add(new Country("Mali", "Bamako", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/92/Flag_of_Mali.svg/1280px-Flag_of_Mali.svg.png"));
    }

    private void loadDataAsia() {
        countryList.add(new Country("Japan", "Tokyo", "https://upload.wikimedia.org/wikipedia/en/thumb/9/9e/Flag_of_Japan.svg/1200px-Flag_of_Japan.svg.png"));
        countryList.add(new Country("China", "Beijing", "https://cdn.britannica.com/90/7490-004-BAD4AA72/Flag-China.jpg"));
        countryList.add(new Country("Kyrgyzstan", "Bishkek", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Flag_of_Kyrgyzstan.svg/800px-Flag_of_Kyrgyzstan.svg.png"));
        countryList.add(new Country("South Korea", "Seoul", "https://asiasociety.org/sites/default/files/styles/1200w/public/K/korean-flag.jpg"));
        countryList.add(new Country("Thailand", "Bangkok", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a9/Flag_of_Thailand.svg/255px-Flag_of_Thailand.svg.png"));
    }

    private void loadDataEurope() {
        countryList.add(new Country("Germany", "Berlin", "https://upload.wikimedia.org/wikipedia/en/thumb/b/ba/Flag_of_Germany.svg/1200px-Flag_of_Germany.svg.png"));
        countryList.add(new Country("France", "Paris", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/18/Flag_of_France_%28lighter_variant%29.svg/250px-Flag_of_France_%28lighter_variant%29.svg.png"));
        countryList.add(new Country("Italy", "Roma", "https://upload.wikimedia.org/wikipedia/en/thumb/0/03/Flag_of_Italy.svg/255px-Flag_of_Italy.svg.png"));
        countryList.add(new Country("Denmark", "Copenhagen", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/Flag_of_Denmark.svg/800px-Flag_of_Denmark.svg.png"));
        countryList.add(new Country("Poland", "Warsaw", "https://upload.wikimedia.org/wikipedia/en/thumb/1/12/Flag_of_Poland.svg/1200px-Flag_of_Poland.svg.png"));
    }

    private void loadDataAustralia() {
        countryList.add(new Country("Australia", "Canberra", "https://cdn.britannica.com/78/6078-004-77AF7322/Flag-Australia.jpg"));
        countryList.add(new Country("Papua New Guinea", "Port Mores", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/Flag_of_Papua_New_Guinea.svg/640px-Flag_of_Papua_New_Guinea.svg.png"));
        countryList.add(new Country("New Zealand", "Wellington", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Flag_of_New_Zealand.svg/800px-Flag_of_New_Zealand.svg.png"));
        countryList.add(new Country("Fiji", "Suva", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Flag_of_Fiji.svg/2560px-Flag_of_Fiji.svg.png"));
        countryList.add(new Country("Solomon Islands", "Honiara", "https://cdn.britannica.com/98/3298-004-5CE240EE/Flag-Solomon-Islands.jpg"));
    }
}