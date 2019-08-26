package com.example.student.kiemtra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnTong;
    EditText edtA, edtB;
    TextView txtTong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTong = findViewById(R.id.btnTong);
        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        txtTong = findViewById(R.id.txtTong);

        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                txtTong.setText(Integer.toString(a+b));
            }
        });
    }
}
