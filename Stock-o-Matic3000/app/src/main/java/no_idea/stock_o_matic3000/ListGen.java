package no_idea.stock_o_matic3000;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListGen extends BaseActivity {

    ListView listView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_gen);

        control.generateShoppingList();

        listView = (ListView)findViewById(R.id.list);

        String[] values = new String[]{"this", "should", "be", "meals"};

        values = control.listShoppingString();

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
                    newActivity = new Intent(ListGen.this, AddItem.class);
                }
                else {
                    System.out.println(control.getHolder().getName());
                    newActivity = new Intent(ListGen.this, EditItem.class);
                }
                startActivity(newActivity);
                //finish();



            }

        });

    }


    protected void onStart(){
        super.onStart();


    }

    protected void onResume(){
        super.onResume();

        control.generateShoppingList();

        listView = (ListView)findViewById(R.id.list);

        String[] values = new String[]{"this", "should", "be", "meals"};

        values = control.listShoppingString();

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
                    newActivity = new Intent(ListGen.this, AddItem.class);
                }
                else {
                    System.out.println(control.getHolder().getName());
                    newActivity = new Intent(ListGen.this, EditItem.class);
                }
                startActivity(newActivity);
                //finish();



            }

        });

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








