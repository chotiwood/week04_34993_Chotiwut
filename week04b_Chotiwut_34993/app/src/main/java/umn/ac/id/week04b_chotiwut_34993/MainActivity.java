package umn.ac.id.week04b_chotiwut_34993;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText ETisian;
    private Button btnSatu, btnDua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ETisian = findViewById(R.id.fragment_first_edittext_tulisan);
        btnSatu = findViewById(R.id.main_button_change_1);
        btnDua = findViewById(R.id.main_button_change_2);

        btnSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intentDua = new Intent(MainActivity.this, SecondActivity.class);
                String name = ETisian.getText().toString();
                intentDua.putExtra("Nama", name);
                startActivityForResult(intentDua, 1);
            }
        });

        btnDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intentTiga = new Intent(MainActivity.this, ThirdActivity.class);
                String name = ETisian.getText().toString();
                intentTiga.putExtra("Nama", name);
                startActivityForResult(intentTiga, 1);
            }
        });
    }
}