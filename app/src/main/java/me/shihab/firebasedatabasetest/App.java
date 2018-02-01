package me.shihab.firebasedatabasetest;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by User on 2/1/2018.
 */

public class App extends Application {

    private static FirebaseDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();
        database = FirebaseDatabase.getInstance();
    }

    public static FirebaseDatabase getDatabase() {
        if (database == null) {
            return database = FirebaseDatabase.getInstance();
        }
        return database;
    }


}
