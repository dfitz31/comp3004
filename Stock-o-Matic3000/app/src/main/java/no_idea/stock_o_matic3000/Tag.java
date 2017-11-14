package no_idea.stock_o_matic3000;

/*********************************************************
 * Another class in order to help with SQLiteDatabase handling
 *
 * This class will store "tag names" for foodItems put into the database.
 * Example: Tag names will include the Food List tag which will be assigned id = 0 by default.
 *
 * Other tags will include recipes, each with a unique tag which will also be given to its FoodItems.
 * This will be done within the DatabaseHelper class.
 *
 */
public class Tag {

    private int id; //Integer ID for tag
    private String tag_name; //Name of tag

    //Default constructor
    public Tag() {

    }
    //Constructor which initializes tag_name alone
    public Tag(String tag_name) {
        this.tag_name = tag_name;
    }

    //Constructor with full Tag initialization
    public Tag(int id, String tag_name) {
        this.id = id;
        this.tag_name = tag_name;
    }

    // ID setter
    public void setId(int id) {
        this.id = id;
    }

    //Tag_name setter
    public void setTagName(String tag_name) {
        this.tag_name = tag_name;
    }

    //ID getter
    public int getId() {
        return this.id;
    }

    //Tag_name getter
    public String getTagName() {
        return this.tag_name;
    }
}
