<<<<<<< HEAD
package android.database.sqlite;

import android.provider.BaseColumns;

/**
 * Description: Schema and contract for SQLite database for application
 */

public final class StockOMaticReaderContract {

    private StockOMaticReaderContract() {}

    public static class StockOMaticEntry implements BaseColumns {
        public static final String TABLE_NAME = "Food List";
        public static final String COLUMN_NAME_ITEM = "Item Name";
        public static final String COLUMN_NAME_QUANTITY = "Quantity";
        public static final String COLUMN_NAME_MONTH = "Month";
        public static final String COLUMN_NAME_DAY = "Day";
        public static final String COLUMN_NAME_YEAR = "Year";
    }

    private static final String SQL_CREATE_ENTRIES = "CREATE TABLE " +
            StockOMaticEntry.TABLE_NAME + " (" + StockOMaticEntry._ID + " INTEGER PRIMARY KEY," +
            StockOMaticEntry.COLUMN_NAME_ITEM + " TEXT," + StockOMaticEntry.COLUMN_NAME_QUANTITY + " TEXT," +
            StockOMaticEntry.COLUMN_NAME_MONTH + " NUMBER," + StockOMaticEntry.COLUMN_NAME_DAY + " NUMBER," +
            StockOMaticEntry.COLUMN_NAME_YEAR + " NUMBER)";

    private static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " + StockOMaticEntry.TABLE_NAME;

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
}

=======
package android.database.sqlite;

import android.provider.BaseColumns;

/**
 * Description: Schema and contract for SQLite database for application
 */

public final class StockOMaticReaderContract {

    private StockOMaticReaderContract() {}

    public static class StockOMaticEntry implements BaseColumns {
        public static final String TABLE_NAME = "Food List";
        public static final String COLUMN_NAME_ITEM = "Item Name";
        public static final String COLUMN_NAME_QUANITITY = "Quantity";
        public static final String COLUMN_NAME_MONTH = "Month";
        public static final String COLUMN_NAME_DAY = "Day";
        public static final String COLUMN_NAME_YEAR = "Year";
    }
}

>>>>>>> dd6a8d2d8c3818a42490e33f6d7bdacef8194955
