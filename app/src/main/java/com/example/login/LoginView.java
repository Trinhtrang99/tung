package com.example.login;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class LoginView extends BaseObservable {
    String name, pass;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
        notifyPropertyChanged(BR.pass);
    }
}
