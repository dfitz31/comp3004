package no_idea.stock_o_matic3000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddItem extends BaseActivity {





    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_item);

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

    public void submit (View button){



        final EditText nameField = (EditText) findViewById(R.id.name);
        final EditText amountField = (EditText) findViewById(R.id.amount);
        final EditText expDateField = (EditText) findViewById(R.id.expDate);

        String name = nameField.getText().toString();
        String amount = amountField.getText().toString();
        String expDate = expDateField.getText().toString();

        control.addFood(name, amount, expDate);

        /*//The following code is for the database
        int d = 0;
        int m = 0;
        int y = 0;

        String[] parts = expDate.split("/");
        for(int i = 0; i < parts.length; i++){
            if(i == 0){
                d = Integer.parseInt(parts[i]);
            }
            else if(i == 1){
                m = Integer.parseInt(parts[i]);
            }
            else{
                y = Integer.parseInt(parts[i]);
            }
        }
        //create and add new item to Database
        FoodItem toAdd = new FoodItem(name, Integer.parseInt(amount), d, m, y);

        db.createFoodListEntry(toAdd, new long[] { mainListTagId });
        //Item should now be added to both control list and Database*/

        CharSequence text = name + " was Added";
        Context context = getApplicationContext();

        int duration = Toast.LENGTH_SHORT;


        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        finish();


    }

}








