package com.sourabhkarkal.databinding;

/**
 * Created by sourabhkarkal on 19/11/15.
 */
import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class User extends BaseObservable{
    private String firstName;
    private String lastName;
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        notifyPropertyChanged(com.sourabhkarkal.databinding.BR.firstName);
        notifyPropertyChanged(com.sourabhkarkal.databinding.BR.lastName);
    }

    @Bindable
    public String getFirstName() {
        return this.firstName;
    }
    @Bindable
    public String getLastName() {
        return this.lastName;
    }

    public void setName(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        notifyPropertyChanged(com.sourabhkarkal.databinding.BR.firstName);
        notifyPropertyChanged(com.sourabhkarkal.databinding.BR.lastName);
    }


}
