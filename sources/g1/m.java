package g1;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class m extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Integer f2683b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f2684c = "signalhelper";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f2685d = "signal";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static AtomicInteger f2686e = new AtomicInteger();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static m f2687f = null;

    private m(Context context, String str, int i2) {
        this(context, str, null, i2);
    }

    private m(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i2) {
        super(context, str, cursorFactory, i2);
    }

    public static synchronized m b(Context context, String str, int i2) {
        f2686e.incrementAndGet();
        if (f2687f == null) {
            f2687f = new m(context, str, i2);
        }
        return f2687f;
    }

    public synchronized void a() {
        h.a("SignalDatabaseHelper", "clearSignalDB-->");
        getWritableDatabase().delete(f2685d, null, null);
    }

    public synchronized void c(String str) {
        h.a("SignalDatabaseHelper", "insertRecord:" + str);
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.execSQL("create table if not exists signal (ID integer primary key autoincrement, jsonString text)");
        Cursor cursorQuery = writableDatabase.query(f2685d, new String[]{"ID", "jsonString"}, null, null, null, null, null);
        if (cursorQuery.getCount() >= 100) {
            cursorQuery.moveToFirst();
            writableDatabase.delete(f2685d, "ID=?", new String[]{String.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("ID")))});
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("jsonString", str);
        writableDatabase.insert(f2685d, null, contentValues);
        cursorQuery.close();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public synchronized void close() {
        super.close();
        if (f2686e.decrementAndGet() == 0) {
            f2687f = null;
        }
    }

    public synchronized JSONArray d() {
        JSONArray jSONArray;
        Cursor cursorQuery = getWritableDatabase().query(f2685d, new String[]{"jsonString"}, null, null, null, null, null);
        CursorWindow cursorWindow = new CursorWindow("queryWindow", 20971520L);
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorQuery;
        abstractWindowedCursor.setWindow(cursorWindow);
        jSONArray = new JSONArray();
        if (abstractWindowedCursor.getCount() > 0) {
            while (abstractWindowedCursor.moveToNext()) {
                try {
                    jSONArray.put(new JSONObject(abstractWindowedCursor.getString(abstractWindowedCursor.getColumnIndex("jsonString"))));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        } else {
            h.a("SignalDatabaseHelper", "signal database is null");
        }
        abstractWindowedCursor.close();
        cursorWindow.close();
        return jSONArray;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized void onCreate(SQLiteDatabase sQLiteDatabase) {
        h.a("SignalDatabaseHelper", "onCreate-->");
        sQLiteDatabase.execSQL("create table if not exists signal (ID integer primary key autoincrement, jsonString text)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }
}
