package com.example.bcs421individualproj1.register;

import android.os.Bundle;
import android.util.Patterns;

import com.example.bcs421individualproj1.R;
import com.example.bcs421individualproj1.register.RegisterFormState;

public class RegisterViewModel extends RegisterActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

    }

    private boolean isFNameValid(String fName) {
        if (fName == null) {
            return false;
        } else {
            return true;
        }
    }

/*
    public void loginDataChanged(String username, String password) {
        if (!isUserNameValid(username)) {
            RegisterFormState.setValue(new RegisterFormState(R.string.invalid_username, null));
        } else if (!isPasswordValid(password)) {
            RegisterFormState.setValue(new RegisterFormState(null, R.string.invalid_password));
        } else {
            RegisterFormState.setValue(new RegisterFormState(true));
        }
    }

 */

    private boolean isUserNameValid(String username) {
        if (username == null) {
            return false;
        }
        if (username.contains("@")) {
            return Patterns.EMAIL_ADDRESS.matcher(username).matches();
        } else {
            return !username.trim().isEmpty();
        }
    }

    // A placeholder password validation check
    private boolean isPasswordValid(String password) {
        return password != null && password.trim().length() > 5;
    }
}

