package no_idea.stock_o_matic3000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class AddIngredient extends BaseActivity {

ListView listView;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_ingredient);

        listView = (ListView) findViewById(R.id.list);

        String[] values = control.listFoodString();



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition = position;

                // ListView Clicked item value
                String itemValue = (String) listView.getItemAtPosition(position);

                if (itemPosition == 0) {
                    Intent newActivity = new Intent(AddIngredient.this, AddItem.class);
                    startActivity(newActivity);
                }


                Context context = getApplicationContext();

                int duration = Toast.LENGTH_SHORT;

                //get Amount on click of list item
                final EditText amountField = (EditText) findViewById(R.id.amount);
                String amount = amountField.getText().toString();
                if (amount.equals("")){amount = "1";}

                control.getHolderRecipe().addIngredient(control.getFoodItem(position - 1), Integer.parseInt(amount));

                /*
                //Following code is for Database
                FoodItem newItem = control.getFoodItem(position - 1);
                newItem.setQuantity(Integer.parseInt(amount));
                db.createFoodListEntry(newItem, new long[] {control.getHolderRecipe().getRecipeId() });
                */

                //control.addFood(name, amount, expDate);

                CharSequence text= control.getHolder().getName() + " Has been added";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();


                finish();

            }

        });

    }


    protected void onResume(){
        super.onResume();
        setContentView(R.layout.add_ingredient);

        listView = (ListView) findViewById(R.id.list);

        String[] values = control.listFoodString();



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition = position;

                // ListView Clicked item value
                String itemValue = (String) listView.getItemAtPosition(position);

                if (itemPosition == 0) {
                    Intent newActivity = new Intent(AddIngredient.this, AddItem.class);
                    startActivity(newActivity);
                }


                Context context = getApplicationContext();

                int duration = Toast.LENGTH_SHORT;

                //get Amount on click of list item
                final EditText amountField = (EditText) findViewById(R.id.amount);
                String amount = amountField.getText().toString();
                if (amount.equals("")) {
                    amount = "1";
                }

                control.getHolderRecipe().addIngredient(control.getFoodItem(position - 1),
                        Integer.parseInt(amount));
                //control.addFood(name, amount, expDate);

                CharSequence text = control.getHolder().getName() + " Has been added";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();


                finish();

            }

        });
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








