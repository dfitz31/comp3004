package no_idea.stock_o_matic3000;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;

public class BaseActivity extends Activity {

    protected static Control control = new Control();
    DatabaseHelper db;

    //For use in extended classes
    Tag mainList = new Tag("mainList");
    long mainListTagId;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        db = new DatabaseHelper(getApplicationContext());


        //Copying data from Database to control class variables.
        ArrayList<FoodItem> toCopy = db.getAllFoodItemsByTag("mainList");
        FoodList foods = control.getMainList();


        for(int i = 0; i< toCopy.size(); i++){
            foods.addItem(toCopy.get(i));
        }

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








