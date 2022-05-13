package com.labpbm.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    EditText nama,npm;
    TextView spinnerValue;
    Spinner jurusan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = (EditText) findViewById(R.id.editNama);
        npm = (EditText) findViewById(R.id.editNpm);
        jurusan = (Spinner) findViewById(R.id.jurusan);
        spinnerValue = (TextView)  findViewById(R.id.viewJurusan);
        ArrayAdapter <CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.daftarJurusan, android.R.layout.simple_spinner_dropdown_item);
        jurusan.setAdapter(adapter);
        jurusan.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
    String prodiSaya = adapterView.getItemAtPosition(i).toString();
            spinnerValue.setText(String.valueOf(prodiSaya));
    }
    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
        public void submitRegis(View view){
            Intent hubung = new Intent(this, HasilActivity.class);
            hubung.putExtra("nama", nama.getText().toString());
            hubung.putExtra("npm", npm.getText().toString());
            hubung.putExtra("jurusan",spinnerValue.getText().toString());
            startActivity(hubung);
        }
}