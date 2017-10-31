package no_idea.stock_o_matic3000;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EditItem extends BaseActivity {

    FoodItem holder;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_item);

        final EditText nameField = (EditText) findViewById(R.id.name);
        final EditText amountField = (EditText) findViewById(R.id.amount);
        final EditText expDateField = (EditText) findViewById(R.id.expDate);

        holder = control.getHolder();
        nameField.setText(holder.getName());
        amountField.setText(holder.getQuantity() + "");
        expDateField.setText(holder.getDate());



    }

    public void submit (View button){

        Context context = getApplicationContext();
        CharSequence text = "Thing added yo";
        int duration = Toast.LENGTH_SHORT;

        final EditText nameField = (EditText) findViewById(R.id.name);
        final EditText amountField = (EditText) findViewById(R.id.amount);
        final EditText expDateField = (EditText) findViewById(R.id.expDate);

        String name = nameField.getText().toString();
        String amount = amountField.getText().toString();
        String expDate = expDateField.getText().toString();

        control.editFood(control.getHolder(), name, amount, expDate);



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








