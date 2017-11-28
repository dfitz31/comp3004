package no_idea.stock_o_matic3000;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;

public class BaseActivity extends Activity {

    protected static Control control = new Control();
    protected static DatabaseHelper db;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        db = new DatabaseHelper(getApplicationContext());
        
    }


    protected void onStart(){
        super.onStart();


    }

    protected void onStop(){
        super.onStop();

    }

    @Override
    protected void onPause() {
        super.onPause();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

    @Override
    protected void onRestart() {
        super.onRestart();

    }
}








