/*************************************************************************************************
  * 
  */
  
public class StockOMaticOpenHelper extends SQLiteOpenHelper {
  
  private static final int DATABASE_VERSION = 2;
  private static final String FOOD_LIST_TABLE_NAME = "Food List";
  private static final String FOOD_LIST_TABLE_CREATE = "CREATE TABLE " + FOOD_LIST_TABLE_NAME + " (" + KEY_ITEM_NAME + " TEXT," + KEY_QUANTITY + " NUMBER," + KEY_MONTH +
    " NUMBER," + KEY_DAY + " NUMBER," + KEY_YEAR + " NUMBER);";
  
  
  public StockOMaticDatabaseHelper(Context context) { 
    super(context, DATABASE_NAME, null, DATABASE_VERSION);
  }
  
  @Override
  public void onCreate(SQLiteDatabase db) {
   db.execSQL(FOOD_LIST_TABLE_CREATE); 
  }
  
}
