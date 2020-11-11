package id.ac.telkomuniversity.vsi3f4.praktikactivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String KEY_NAME ="yenny";


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText Isitext = findViewById(R.id.editText);
        Button pindah = findViewById(R.id.button);

        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isitext = Isitext.getText().toString();

                if (isitext.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Input tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else{
                    Intent intent = new Intent(MainActivity.this, secondActivity.class);
                    intent.putExtra(KEY_NAME, isitext);
                    bukaalert(intent);

                }
            }

        });
    }

    public void bukaalert(final Intent intent){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Anda Yakin Ingin Pindah");
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                startActivity(intent);
            }
        });
        builder.setNegativeButton("Tidak",null);
        builder.setIcon(R.mipmap.ic_launcher);
        builder.show();
    }
}