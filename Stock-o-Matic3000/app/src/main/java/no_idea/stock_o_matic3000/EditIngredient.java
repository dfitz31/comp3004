package no_idea.stock_o_matic3000;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class EditIngredient extends BaseActivity {

ListView listView;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_ingredient);

        listView = (ListView) findViewById(R.id.list);

        String[] values = new String[] {
                control.getHolder().toString()};

        final EditText amountField = (EditText) findViewById(R.id.amount);
        amountField.setText("");


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


                Context context = getApplicationContext();

                int duration = Toast.LENGTH_SHORT;

                //get Amount on click of list item
                final EditText amountField = (EditText) findViewById(R.id.amount);
                String amount = amountField.getText().toString();

                //set Holder
                control.setHolder(control.getFoodItem(position - 1));

                //control.addFood(name, amount, expDate);

                CharSequence text= control.getHolder().getName() + " Has been Editied";
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








