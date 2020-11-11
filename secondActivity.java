package id.ac.telkomuniversity.vsi3f4.praktikactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class secondActivity extends AppCompatActivity {

    private TextView chris;
    private String yen;
    private String KEY_NAME = "yenny";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        chris = findViewById(R.id.textView3);


        Bundle isitext = getIntent().getExtras();
        yen = isitext.getString(KEY_NAME);
        chris.setText(yen);
        Toast.makeText(getApplicationContext(), "Berhasil pindah keActivity kedua", Toast.LENGTH_LONG).show();
    }
}