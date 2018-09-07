package com.dendev.millionaire;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.dendev.millionaire.dialogs.EnterNameDialog;
import com.dendev.millionaire.dialogs.OnNameSavedListener;
import com.dendev.millionaire.room.Info;

public class EnterActivity extends AppCompatActivity implements View.OnClickListener,
        OnNameSavedListener {

    private Button newGame;

    public static Info info = new Info();


    private void findId() {
        newGame = findViewById(R.id.new_game_but);
        setOnCLick();
    }

    private void setOnCLick() {
        newGame.setOnClickListener(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_activity);
        findId();
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.new_game_but:
               EnterNameDialog dialog =  new EnterNameDialog();
               dialog.setOnNameSavedListener(this);
               dialog.show(getSupportFragmentManager(), "");
                break;
        }
    }

    @Override
    public void onSaved(String firstName, String secName) {
        info.setFirstName(firstName);
        info.setSecName(secName);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
