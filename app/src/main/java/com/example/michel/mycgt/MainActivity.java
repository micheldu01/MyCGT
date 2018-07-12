package com.example.michel.mycgt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        // START METHOD IF USER IS CONNECT
        this.askIfUserConnect();





    }

    // METHOD ASK IF CONNECT
    private void askIfUserConnect(){

        boolean if_connect = false;

        // ASK IF USER IS CONNECT
        if (if_connect == false){

            // START INTENT AUTH ACTIVITY
            startActivity(new Intent(MainActivity.this, AuthentificationActivity.class));

        }
    }
}
