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

