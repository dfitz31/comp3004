package no_idea.stock_o_matic3000;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AddMeal extends BaseActivity {

ListView listView;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_meal);

        listView = (ListView)findViewById(R.id.list);

        String[] values = new String[] {
                "Add Ingredient"
        };



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);





    }

    protected void onResume(){
        super.onResume();
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








