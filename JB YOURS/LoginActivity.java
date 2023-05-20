package com.hello.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText email, name;
    private Button login;
    private TextView regis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email = (EditText) findViewById(R.id.editTextUserEmail);
        name = (EditText) findViewById(R.id.editTextUserPassword);
        login =(Button) findViewById(R.id.R_btn_login);
        regis =(TextView) findViewById(R.id.txt_register);

        email.setOnClickListener(this);
        name.setOnClickListener(this);
        login.setOnClickListener(this);
        regis.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i;
        if(view.getId()==R.id.R_btn_login){
            String Isiemail = email.getText().toString().trim();
            String IsiPassword = name.getText().toString().trim();
            boolean isEmptyFields = false;
            if(TextUtils.isEmpty(Isiemail)){
                isEmptyFields = true;
                email.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(IsiPassword)){
                isEmptyFields = true;
                name.setError("Field ini tidak boleh kosong");
            }
            if (!isEmptyFields){
                i = new Intent(this, Beranda.class);
                startActivity(i);
            }
        }else if (view.getId() == R.id.txt_register){
            i = new Intent(this, RegisterActivity.class);
            startActivity(i);
        }
    }
}