package nl.psdcompany.duonavigationdrawer.example;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by anucha on 3/7/2018.
 */

public class SQLiteHelper extends SQLiteOpenHelper {

    private static SQLiteHelper sqLiteDB;
    private static final String DB_NAME = "dbase";
    private static final int DB_VERSION = 1;
    public SQLiteHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }
    public static synchronized SQLiteHelper getInstance(Context context) {
        if(sqLiteDB == null) {
            sqLiteDB = new SQLiteHelper(context.getApplicationContext());
        }
        return sqLiteDB;
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql="CREATE TABLE tb_barcode (id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "Bracode)";
        db.execSQL(sql);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
