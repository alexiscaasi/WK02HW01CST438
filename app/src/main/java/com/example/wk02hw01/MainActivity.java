package com.example.wk02hw01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText etUsername;
    private EditText etPassword;
    private Button btnLogin;
    ArrayList<User> users = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        users = setupUsers();

        etUsername = findViewById(R.id.Username);
        etPassword = findViewById(R.id.Password);
        btnLogin = findViewById(R.id.Login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                if(verifyLogin(username, password)) {
                    // successful login -> send user to LandingPageActivity
                    Intent intent = new Intent(MainActivity.this, LandingPageActivity.class);
                    intent.putExtra("username", username);
                    startActivity(intent);
                } else {
                    // failed login -> display message
                    Toast.makeText(getApplicationContext(), "Unverified Login Credentials", Toast.LENGTH_LONG).show();
                    // failed login -> highlight password
                    //etPassword.getBackground().setColorFilter(getResources().getColor(R.color.highlightColor), PorterDuff.Mode.SRC_ATOP);
                    etPassword.setTextColor(getResources().getColor(R.color.highlightColor));
                }
            }
        });
    }

    public static ArrayList<User> setupUsers() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("din_djarin", "baby_yoda_ftw"));
        users.add(new User("aye_caasi", "november22"));
        users.add(new User("acaasi", "1234"));
        users.add(new User("anakinSkywalker", "may4"));
        return users;
    }

    private boolean verifyLogin(String username, String password){
        for(User user : users) {
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }




}