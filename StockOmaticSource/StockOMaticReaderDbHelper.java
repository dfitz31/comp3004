package android.database.sqlite;

/**
 * Description: SQLite database helper class for app
 */

public class StockOMaticReaderDbHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "StockOMaticReader.db";

    public StockOMaticReaderDbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

        db.execSQL(DQL_DELETE_ENTRIES);
        onCreate(db);
    }




}
