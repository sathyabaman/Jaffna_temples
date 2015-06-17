package lk.adspace.jaffnatemples;



import java.util.ArrayList;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class Dbhandler extends SQLiteOpenHelper  {


    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "jaffnatempletest";

    // Temple table name
    private static final String TABLE_TEMPLE = "templ";


    // Contacts Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_TMPNAME = "temple_name";
    private static final String KEY_TMPTYPE = "temple_type";
    private static final String KEY_LATITUDE = "latitude";
    private static final String KEY_LONGITUDE = "longitude";
    private static final String KEY_IMGNAME = "image_name";
    private static final String KEY_YEARBUILD = "year_build";
    private static final String KEY_ADDRESS = "address";
    private static final String KEY_CITY = "city";
    private static final String KEY_EMAIL = "email";
    private static final String KEY_WEB = "website";
    private static final String KEY_TEL1 = "telephone1";
    private static final String KEY_TEL2 = "telephone2";
    private static final String KEY_DESCRI = "Description";
    /**
	 * @uml.property  name="temple_list"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="lk.adspace.jaffnatemples.kovil"
	 */
    private final ArrayList<kovil> temple_list = new ArrayList<kovil>();


    public Dbhandler (Context context) {
    super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }



    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
    String CREATE_TEMPLE_TABLE = "CREATE TABLE " + TABLE_TEMPLE + "("
        + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," + KEY_TMPNAME + " TEXT," + KEY_TMPTYPE + " TEXT," + KEY_LATITUDE + " TEXT," + KEY_LONGITUDE + " TEXT," + KEY_IMGNAME + " TEXT,"
        + KEY_YEARBUILD + " TEXT," + KEY_ADDRESS + " TEXT," + KEY_CITY + " TEXT," + KEY_EMAIL + " TEXT," + KEY_WEB + " TEXT," + KEY_TEL1 + " TEXT," + KEY_TEL2 + " TEXT,"
        + KEY_DESCRI + " TEXT" + ")";
    db.execSQL(CREATE_TEMPLE_TABLE);
    }


    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    // Drop older table if existed
    db.execSQL("DROP TABLE IF EXISTS " + TABLE_TEMPLE);

    // Create tables again
    onCreate(db);
    }



    // Adding new temple
    public void Add_Temple(kovil Kovil) {
    SQLiteDatabase db = this.getWritableDatabase();
    ContentValues values = new ContentValues();

    values.put(KEY_TMPNAME, Kovil.gettemplename()); 
    values.put(KEY_TMPTYPE, Kovil.gettempletype()); 
    values.put(KEY_LATITUDE, Kovil.getlatitude()); 
    values.put(KEY_LONGITUDE, Kovil.getlongitude()); 
    values.put(KEY_IMGNAME, Kovil.getimage_name()); 
    values.put(KEY_YEARBUILD, Kovil.getyear_build()); 
    values.put(KEY_ADDRESS, Kovil.getaddress()); 
    values.put(KEY_CITY, Kovil.getcity()); 
    values.put(KEY_EMAIL, Kovil.getemail()); 
    values.put(KEY_WEB, Kovil.getwebsite()); 
    values.put(KEY_TEL1, Kovil.gettelephone1()); 
    values.put(KEY_TEL2, Kovil.gettelephone2());
    values.put(KEY_DESCRI, Kovil.getDescription());

    // Inserting Row
    db.insert(TABLE_TEMPLE, null, values);
    db.close(); // Closing database connection
    }






    // Getting single contact
    kovil Get_Temple(int id) {
    SQLiteDatabase db = this.getReadableDatabase();

    Cursor cursor = db.query(TABLE_TEMPLE, new String[] { KEY_ID,
            KEY_TMPNAME, KEY_TMPTYPE, KEY_LATITUDE, KEY_LONGITUDE, KEY_IMGNAME, KEY_YEARBUILD, KEY_ADDRESS, KEY_CITY, KEY_EMAIL, KEY_EMAIL, KEY_WEB, KEY_TEL1, KEY_TEL2, KEY_DESCRI }, KEY_ID + "=?",
        new String[] { String.valueOf(id) }, null, null, null, null);
    if (cursor != null)
        cursor.moveToFirst();

    kovil Kovil = new kovil(Integer.parseInt(cursor.getString(0)),
        cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5), cursor.getString(6), cursor.getString(7), cursor.getString(8), cursor.getString(9), cursor.getString(10), cursor.getString(11), cursor.getString(12), cursor.getString(13));
    // return contact
    cursor.close();
    db.close();

    return Kovil;
    }





    // Getting All Contacts
    public ArrayList<kovil> Get_Temple(String temple_type, int Limit) {
    try {
        temple_list.clear();

        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_TEMPLE +" WHERE temple_type= " + temple_type +" LIMIT " + Limit;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        System.out.print("CALLED");
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
        do {
            kovil Kovil = new kovil();
            Kovil.setID(Integer.parseInt(cursor.getString(0)));
            Kovil.settemplename(cursor.getString(1)); 
            Kovil.settempletype(cursor.getString(2)); 
            Kovil.setlatitude(cursor.getString(3)); 
            Kovil.setlongitude(cursor.getString(4)); 
            Kovil.setimage_name(cursor.getString(5)); 
            Kovil.setyear_build(cursor.getString(6)); 
            Kovil.setaddress(cursor.getString(7)); 
            Kovil.setcity(cursor.getString(8)); 
            Kovil.setemail(cursor.getString(9)); 
            Kovil.setwebsite(cursor.getString(10)); 
            Kovil.settelephone1(cursor.getString(11)); 
            Kovil.settelephone2(cursor.getString(12));
            Kovil.setDescription(cursor.getString(13));

            // Adding contact to list
            temple_list.add(Kovil);
        } while (cursor.moveToNext());
        }

        // return contact list
        cursor.close();
        db.close();
        return temple_list;
    } catch (Exception e) {
        // TODO: handle exception
        Log.e("all_temples", "" + e);
    }

    return temple_list;
    }

    
    
    public String collect(String temptype, String limit){
    	
    	SQLiteDatabase ourDatabase = this.getWritableDatabase();
    	String result="";
    	String []column =new String[]{KEY_ID,KEY_TMPNAME,KEY_TMPTYPE,KEY_LATITUDE,KEY_LONGITUDE,KEY_IMGNAME,KEY_YEARBUILD,KEY_ADDRESS,KEY_CITY,KEY_EMAIL,KEY_WEB,KEY_TEL1,KEY_TEL2,KEY_DESCRI};
		//Cursor c=ourDatabase.query("templ", column, null, null, null, null,null, limit);
		Cursor c=ourDatabase.rawQuery("SELECT * FROM "+TABLE_TEMPLE+" WHERE temple_type= '"+temptype+"' LIMIT "+limit+";", null);
    	
		
		c.moveToFirst();
		int iKEY_ID = c.getColumnIndex(KEY_ID);
		int iKEY_TMPNAME= c.getColumnIndex(KEY_TMPNAME);
		
		
		for (c.moveToFirst();!c.isAfterLast();c.moveToNext()){
			
			//if (c.getString(iKEY_TMPTYPE).equals(temptype)){
			
		result = result+c.getString(iKEY_ID)+"\t\t"+c.getString(iKEY_TMPNAME)+"\n";
			//}
		}
		
		return result;
		
    }
    
public String[][] collecting(String temptype, int limit){
    	
    	SQLiteDatabase ourDatabase = this.getWritableDatabase();
    	String selectedKovil[][]=new String[limit][3];
    	
    	/*
    	 * selectedKovil[x][0]=LATITUDE
    	 * selectedKovil[x][1]=LONGITUDE
    	 * selectedKovil[x][2]=NAME
    	 */
    	
    	String []column =new String[]{KEY_ID,KEY_TMPNAME,KEY_TMPTYPE,KEY_LATITUDE,KEY_LONGITUDE,KEY_IMGNAME,KEY_YEARBUILD,KEY_ADDRESS,KEY_CITY,KEY_EMAIL,KEY_WEB,KEY_TEL1,KEY_TEL2,KEY_DESCRI};
		//Cursor c=ourDatabase.query("templ", column, temptype, null, null,  null, null, String.valueOf(limit));
		Cursor c=ourDatabase.rawQuery("SELECT * FROM "+TABLE_TEMPLE+" WHERE temple_type= '"+temptype+"' LIMIT "+limit+";", null);
    	
		
		
		c.moveToFirst();
		int iKEY_ID = c.getColumnIndex(KEY_ID);
		int iKEY_TMPNAME= c.getColumnIndex(KEY_TMPNAME);
		int iKEY_TMPTYPE= c.getColumnIndex(KEY_TMPTYPE);
		int iKEY_LATITUDE= c.getColumnIndex(KEY_LATITUDE);
		int iKEY_LONGITUDE= c.getColumnIndex(KEY_LONGITUDE);
		int i=0;
		for (c.moveToFirst();!c.isAfterLast();c.moveToNext()){
			
			if (c.getString(iKEY_TMPTYPE).equals(temptype)){
				
				selectedKovil[i][0]=c.getString(iKEY_LATITUDE);
				selectedKovil[i][1]=c.getString(iKEY_LONGITUDE);
				selectedKovil[i][2]=c.getString(iKEY_TMPNAME);
				i++;
				
			}
			if(i>limit)
				break;
		}
		
		return selectedKovil;
		
    }


    
    
    

    // Getting contacts Count
    public int Get_Total_Temple() {
        String countQuery = "SELECT * FROM " + TABLE_TEMPLE;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        db.close();
        return count;
    }






	/**
	 * @uml.property  name="search_result"
	 * @uml.associationEnd  inverse="dbhandler:lk.adspace.jaffnatemples.Search_result"
	 */
	private Search_result search_result;


	/**
	 * Getter of the property <tt>search_result</tt>
	 * @return  Returns the search_result.
	 * @uml.property  name="search_result"
	 */
	public Search_result getSearch_result() {
		return search_result;
	}



	/**
	 * Setter of the property <tt>search_result</tt>
	 * @param search_result  The search_result to set.
	 * @uml.property  name="search_result"
	 */
	public void setSearch_result(Search_result search_result) {
		this.search_result = search_result;
	}


}