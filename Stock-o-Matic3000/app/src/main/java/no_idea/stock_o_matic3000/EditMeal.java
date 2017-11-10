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

import static android.R.attr.button;

public class EditMeal extends BaseActivity {


ListView listView;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_meal);
        final EditText nameField = (EditText) findViewById(R.id.name);
        nameField.setText("THis is the name");



    }

    protected void onResume() {
        super.onResume();
        setContentView(R.layout.edit_meal);
        final EditText nameField = (EditText) findViewById(R.id.name);
        nameField.setText(control.getHolderRecipe().getName());
        listView = (ListView) findViewById(R.id.list);

        String[] values = control.getHolderRecipe().ingredientsToArray();


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent newActivity;
                int itemPosition = position;
                if (itemPosition == 0) {
                    newActivity = new Intent(EditMeal.this, AddIngredient.class);
                } else {
                    control.setHolder(control.getHolderRecipe().getItem(position - 1));
                    newActivity = new Intent(EditMeal.this, EditIngredient.class);
                }
                startActivity(newActivity);
                //finish();
            }

        });
    }


    public void submit (View button){
        final EditText nameField = (EditText) findViewById(R.id.name);

        String name = nameField.getText().toString();

        control.getHolderRecipe().setName(name);

        CharSequence text = name + " meal was Updated";
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;


        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        finish();






        finish();
    }

    public void eat (View button) {
        final EditText amountField = (EditText) findViewById(R.id.amount);
        int numMeals = Integer.parseInt(amountField.getText().toString());
        control.eat(numMeals, control.getHolderRecipe());

        CharSequence text =" Items Revomed From List";
        Context context = getApplicationContext();

        int duration = Toast.LENGTH_SHORT;


        Toast toast = Toast.makeText(context, text, duration);
        toast.show();


        finish();
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








