package com.example.food_app.activity;
import static com.example.food_app.utils.ProgressDialog.createAlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.food_app.R;
import com.example.food_app.utils.Validation;
import com.example.food_app.viewmodel.LoginViewModel;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    private LoginViewModel loginViewModel;
    private EditText mobile;
    private EditText password;
    private Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        loginButton.setOnClickListener(this);
        loginViewModel = ViewModelProviders.of(this).get(LoginViewModel.class);
    }
    public void onLoginClick(View View){
        startActivity(new Intent(this,SignUpActivity.class));
        overridePendingTransition(R.anim.slide_in_right,R.anim.stay);

    }
    private void logInUser() {
        String userName = mobile.getText().toString();
        String passWord = password.getText().toString();

        if (userName.isEmpty()) {
            mobile.setError(getString(R.string.email_required));
            mobile.requestFocus();
        }

        if (passWord.isEmpty()) {
            password.setError(getString(R.string.password_required));
            password.requestFocus();
            return;
        }

        if (!Validation.isValidPassword(passWord)) {
            password.setError(getString(R.string.password__at_least_8_characters));
            password.requestFocus();
            return;
        }

        AlertDialog alert = createAlertDialog(this);

        loginViewModel.getLoginResponseLiveData(userName,passWord).observe(this, loginApiResponse -> {
            if (!loginApiResponse.isError()) {
                goToProductActivity();
            }else {
                alert.dismiss();
                Toast.makeText(this, loginApiResponse.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cirLoginButton:
                logInUser();
                break;
            default: // Should not get here
        }
    }

    private void goToProductActivity() {
        Intent intent = new Intent(this, CartActivity.class);
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
    public void initView(){
        mobile = findViewById(R.id.editTextEmail);
        password = findViewById(R.id.editTextPassword);
        loginButton = findViewById(R.id.cirLoginButton);
    }
}