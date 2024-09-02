package com.narayaalbani.workshopmobileapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.narayaalbani.workshopmobileapplication.databinding.FragmentFirstBinding;

import java.util.Objects;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);

        binding.buttonFirst.setOnClickListener(v -> {
            String inputText = Objects.requireNonNull(binding.textField.getText()).toString();
            binding.textviewFirst.setText(inputText);
        });

        return binding.getRoot();
    }

    public void resetText() {
        binding.textField.setText("");
        binding.textviewFirst.setText("");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}