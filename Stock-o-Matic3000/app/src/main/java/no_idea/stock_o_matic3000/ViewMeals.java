package no_idea.stock_o_matic3000;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ViewMeals extends BaseActivity {

ListView listView;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_meals);

        listView = (ListView)findViewById(R.id.list);

        String[] values = control.listMealString();

        //values = control.somethingForMeals();





        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent newActivity;
                int itemPosition     = position;
                if (itemPosition == 0) {
                    newActivity = new Intent(ViewMeals.this, AddMeal.class);
                }
                else {
                    newActivity = new Intent(ViewMeals.this, EditMeal.class);
                }
                startActivity(newActivity);
                //finish();
            }

        });
    }

    protected void onResume(){
        super.onResume();
        setContentView(R.layout.view_meals);

        listView = (ListView)findViewById(R.id.list);

        String[] values = control.listMealString();

        //values = control.somethingForMeals();





        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent newActivity;
                int itemPosition     = position;
                if (itemPosition == 0) {
                    newActivity = new Intent(ViewMeals.this, AddMeal.class);
                }
                else {
                    control.setHolderRecipe(control.getRecipe(position - 1));
                    newActivity = new Intent(ViewMeals.this, EditMeal.class);
                }
                startActivity(newActivity);
                //finish();
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








