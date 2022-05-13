package com.labpbm.form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    TextView txt1, txt2, txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        txt1 = (TextView) findViewById(R.id.namauser);
        txt2 = (TextView) findViewById(R.id.npmuser);
        txt3 = (TextView) findViewById(R.id.jurusanuser);

        String nama = getIntent().getExtras().getString("nama");
        String npm = getIntent().getExtras().getString("npm");
        String jurusan = getIntent().getExtras().getString("jurusan");

        txt1.setText("Nama:\n" + nama);
        txt2.setText("Npm:\n" + npm);
        txt3.setText("Jurusan\n" + jurusan);
    }
}
