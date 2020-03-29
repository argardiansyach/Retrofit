package id.putraprima.retrofit.api.models;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class AppPref extends Application {

    public static final String VERSION_KEY = "version";
    public static final String APP_NAME_KEY = "app";
    private static SharedPreferences sharedPreferences;

    @Override
    public void onCreate() {
        super.onCreate();
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
    }

    public static void setPreference(String key, Object item) {
        SharedPreferences.Editor editor = sharedPreferences.edit();

        if (item instanceof String) {
            editor.putString(key, (String) item);
        }
        editor.apply();

    }

    public static String getPreferenceString(String key) {
        return sharedPreferences.getString(key, "");
    }
}



