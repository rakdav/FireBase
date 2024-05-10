package com.example.firebase.ui.loginregister;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.firebase.R;
import com.example.firebase.databinding.FragmentDashboardBinding;
import com.example.firebase.databinding.FragmentLoginRegisterBinding;


public class LoginRegisterFragment extends Fragment {
    private LoginRegisterViewModel loginRegisterViewModel;
    private FragmentLoginRegisterBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        loginRegisterViewModel =
                new ViewModelProvider(this).get(LoginRegisterViewModel.class);
        binding = FragmentLoginRegisterBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}