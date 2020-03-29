package id.putraprima.retrofit.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import id.putraprima.retrofit.R;
import id.putraprima.retrofit.api.models.AppPref;

import static id.putraprima.retrofit.api.models.AppPref.getPreferenceString;

public class MainActivity extends AppCompatActivity {

    private EditText edtEmail;
    private EditText edtPassword;
    private TextView tvName;
    private TextView tvVersion;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        tvName = findViewById(R.id.mainTxtAppName);
        tvVersion = findViewById(R.id.mainTxtAppVersion);

        tvVersion.setText(getPreferenceString(AppPref.VERSION_KEY));
        tvName.setText(AppPref.getPreferenceString(AppPref.APP_NAME_KEY));

    }

    public void handleLogin(View view) {
        Intent intent = new Intent(this, SplashActivity.class);
        startActivity(intent);

    }
}
