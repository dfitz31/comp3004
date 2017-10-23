package no_idea.stock_o_matic3000;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    ListView listView;
    int count = 0;
    String[] values = new String[] { "View Items",
            "Add Meal",
            "Generate List,",
            count + ""


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v("CREATION","Created Bitch");

        listView = (ListView)findViewById(R.id.list);



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition     = position;

                // ListView Clicked item value
                String  itemValue    = (String) listView.getItemAtPosition(position);

                // Show Alert


                Intent newActivity = new Intent(MainActivity.this, AddItem.class);
                startActivity(newActivity);

                // if pos 0 calll view items

            }

        });
    }
    protected void onStart(){
        super.onStart();
        Log.v("CREATION","Start v1 " + count);
        count++;
        values = new String[] { "View Items",
                "Add Meal",
                "Generate List,",
                count + ""
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);
        listView.setAdapter(adapter);

    }

    protected void onStop(){
        super.onStop();
        Log.v("CREATION","Stop v1 " + count);
        count = count + 1;
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("CREATION","Pause v1 " + count);
        count = count + 1;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("CREATION","Destory v1 " + count);

        count = count + 1;
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("CREATION","Restart v1 " + count);

        count = count + 1;
    }

}








