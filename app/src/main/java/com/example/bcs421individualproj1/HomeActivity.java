package com.example.bcs421individualproj1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

import com.example.bcs421individualproj1.register.RegisterActivity;
import com.example.bcs421individualproj1.ui.login.LoginActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button myBtn = (Button) findViewById(R.id.button);
        Button myBtn2 = (Button) findViewById(R.id.button2);

        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, LoginActivity.class));
            }

                                 });
        myBtn2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    startActivity(new Intent(HomeActivity.this, RegisterActivity.class));
                }
        });



    }
}
