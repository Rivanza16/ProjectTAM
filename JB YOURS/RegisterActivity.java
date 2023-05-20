package com.hello.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText emailR, nameY, password, passwordC;
    private Button register;
    private TextView login;
     private ImageView gotoback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        emailR = (EditText) findViewById(R.id.editTextEmail);
        nameY = (EditText) findViewById(R.id.editTextName);
        password =(EditText) findViewById(R.id.editTextPw);
        passwordC =(EditText) findViewById(R.id.editTextConPw);
        register =(Button) findViewById(R.id.R_btn_register);
        login=(TextView) findViewById(R.id.txt_login);
        gotoback=(ImageView) findViewById(R.id.imageView2);

        gotoback.setOnClickListener(this);
        emailR.setOnClickListener(this);
        nameY.setOnClickListener(this);
        login.setOnClickListener(this);
        password.setOnClickListener(this);
        passwordC.setOnClickListener(this);
        register.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i;
        if(view.getId()==R.id.R_btn_register){
            String IsiemailR = emailR.getText().toString().trim();
            String Isinama = nameY.getText().toString().trim();
            String Isipassword = password.getText().toString().trim();
            String IsiPasswordC = passwordC.getText().toString().trim();
            boolean isEmptyFields = false;
            if(TextUtils.isEmpty(IsiemailR)){
                isEmptyFields = true;
                emailR.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(Isinama)){
                isEmptyFields = true;
                nameY.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(Isipassword)){
                isEmptyFields = true;
                password.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(IsiPasswordC)){
                isEmptyFields = true;
                passwordC.setError("Field ini tidak boleh kosong");
            }
            if (!isEmptyFields){
                i = new Intent(this, Beranda.class);
                startActivity(i);
            }
        }else if (view.getId() == R.id.txt_login){
            i = new Intent(this, LoginActivity.class);
            startActivity(i);
        } else if (view.getId() == R.id.imageView2) {
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
}