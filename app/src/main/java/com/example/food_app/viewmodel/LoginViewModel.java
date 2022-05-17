package com.example.food_app.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.food_app.model.LoginApiResponse;
import com.example.food_app.repository.LoginRepository;

public class LoginViewModel extends ViewModel {

    private final LoginRepository loginRepository;

    public LoginViewModel() {
        loginRepository = new LoginRepository();
    }

    public LiveData<LoginApiResponse> getLoginResponseLiveData(String mobile, String password) {
        return loginRepository.getLoginResponseData(mobile, password);
    }
}
