package com.example.food_app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.food_app.MainActivity;
import com.example.food_app.R;
import com.example.food_app.data.SQLite;
import com.example.food_app.model.User;

import java.util.Calendar;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText name, email, mobile, password;
    private Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        initView();

        register.setOnClickListener(this);
    }
//    public void onLoginClick(View view){
//        startActivity(new Intent(this,LoginActivity.class));
//        overridePendingTransition(R.anim.slide_in_left,android.R.anim.slide_out_right);
//
//    }
    @Override
    public void onClick(View view) {
        int id = view.getId();
        if(id == R.id.cirLoginButton){
            String nameStr = name.getText().toString();
            String emailStr = name.getText().toString();
            String mobileStr = mobile.getText().toString();
            String passStr = password.getText().toString();

            if(nameStr.equals("") || emailStr.equals("") || mobileStr.equals("") || passStr.equals("")){
                Toast.makeText(this, "Nhap thieu!!!!!!!!!!!!", Toast.LENGTH_LONG).show();
            }
            else{
//                User item = new User(nameStr,emailStr,mobileStr,passStr);
//                SQLite sqLiteHelper = new SQLite(this);
//                sqLiteHelper.register(item);
//                Toast.makeText(this, "Thanh công", Toast.LENGTH_LONG).show();
//                Intent intent = new Intent(this, LoginActivity.class);
//                startActivity(intent);
//                finish();
            }
        }
    }
    //
    public void initView(){
        name = findViewById(R.id.editTextName);
        email = findViewById(R.id.editTextEmail);
        mobile = findViewById(R.id.editTextMobile);
        password = findViewById(R.id.editTextPassword);
        register = findViewById(R.id.cirLoginButton);
    }
}