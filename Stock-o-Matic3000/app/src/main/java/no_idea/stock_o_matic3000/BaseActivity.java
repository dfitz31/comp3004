package no_idea.stock_o_matic3000;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;

public class BaseActivity extends Activity {

    protected static Control control = new Control();
    DatabaseHelper db;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        db = new DatabaseHelper(getApplicationContext());


        //Copying data from Database to control class variables.
        ArrayList<FoodItem> toCopy = db.getMainList();
        FoodList foods = control.getMainList();
        foods.setItems(toCopy);

        control.setMainList(foods);
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
        db.closeDB();


    }

    @Override
    protected void onRestart() {
        super.onRestart();

    }
}








