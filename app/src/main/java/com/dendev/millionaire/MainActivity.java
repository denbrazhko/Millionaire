package com.dendev.millionaire;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    //Buttons
    Button newGameBut;


    private void findID(){
        newGameBut = findViewById(R.id.new_game_but);
    }

    private void setOnClick() {
        newGameBut.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_activity);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.new_game_but:

                break;
        }
    }
}
