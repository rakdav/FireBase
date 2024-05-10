package com.example.firebase.ui.loginregister;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.firebase.model.AuthAppRepository;
import com.google.firebase.auth.FirebaseUser;

public class LoginRegisterViewModel extends AndroidViewModel {
    private AuthAppRepository authAppRepository;
    private MutableLiveData<FirebaseUser> userLiveData;
    public LoginRegisterViewModel(@NonNull Application application) {
        super(application);
        authAppRepository = new AuthAppRepository(application);
        userLiveData = authAppRepository.getUserLiveData();
    }
    public void login(String email, String password) {
        authAppRepository.login(email,password);
    }
    public void register(String email, String password) {
        authAppRepository.register(email, password);
    }
    public MutableLiveData<FirebaseUser> getUserLiveData() {
        return userLiveData;
    }
}
