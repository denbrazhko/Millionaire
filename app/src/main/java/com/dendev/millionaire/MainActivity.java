package com.dendev.millionaire;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    //View



    private void findID(){
    }

    private void setOnClick() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findID();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

        }
    }
}
