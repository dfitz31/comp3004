package no_idea.stock_o_matic3000;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class MainActivity extends BaseActivity {

    ListView listView;
    int count = 0;
    String[] values = new String[] { "Items",
            "Meal List",
            "Generate List"



    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        db = new DatabaseHelper(getApplicationContext());
        //Copying Main List data from Database to control class variables.
        ArrayList<FoodItem> mainList = db.getMainList();
        FoodList foods = new FoodList();
        foods.setItems(mainList);
        control.setMainList(foods);


        setContentView(R.layout.activity_main);



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


                if (itemPosition == 1){

                    Intent newActivity = new Intent(MainActivity.this, ViewMeals.class);
                    startActivity(newActivity);

                }

                else if (itemPosition == 2){

                    Intent newActivity = new Intent(MainActivity.this, ListGen.class);
                    startActivity(newActivity);

                }

                else {

                    Intent newActivity = new Intent(MainActivity.this, ViewItems.class);
                    startActivity(newActivity);
                }
                // if pos 0 calll view items

            }

        });
    }
    protected void onStart(){
        super.onStart();

        //Alarm Manager code not working, will try to debug

        /*ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);
        listView.setAdapter(adapter);

        AlarmManager alarmMgr = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(this, AlarmReceiver.class);
        PendingIntent alarmIntent = PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        // set for 5 seconds later
        alarmMgr.set(AlarmManager.RTC_WAKEUP, Calendar.getInstance().getTimeInMillis() + 5000, alarmIntent);*/
    }

    protected void onStop() {
        super.onStop();

    }

    @Override
    protected void onPause() {
        super.onPause();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        db.onUpgrade(db.getDB(), 1, 1);

        ArrayList<FoodItem> mainListSave = control.getMainList().getItems();

        for(int i = 0; i < mainListSave.size(); i ++){
            db.createMainListEntry(mainListSave.get(i));
        }

        db.closeDB();

    }

    @Override
    protected void onRestart() {
        super.onRestart();


        count = count + 1;
    }

}








