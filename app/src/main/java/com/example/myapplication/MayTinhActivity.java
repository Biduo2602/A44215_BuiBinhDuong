package com.example.myapplication;

import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MayTinhActivity extends AppCompatActivity {
    EditText txt11,txt22;
    Button btn11;

    TextView tv11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_may_tinh);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        txt11 = findViewById(R.id.txt1);
        txt22 = findViewById(R.id.txt2);
        btn11 = findViewById(R.id.btn1);
        tv11 = findViewById(R.id.tv1);
        btn11.setOnClickListener(v -> {
            tingTong();
        });
    }

    private void tingTong() {
        String string1 = txt11.getText().toString();
        float soThu1 = Float.parseFloat(string1);
        String string2 = txt22.getText().toString();
        float soThu2 = Float.parseFloat(string2);
        float tong = soThu1 + soThu2;
        tv11.setText(String.valueOf(tong));
    }

}