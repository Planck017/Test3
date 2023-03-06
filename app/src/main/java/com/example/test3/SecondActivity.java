package com.example.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String s = getIntent().getStringExtra("Extra_data");
        Log.d("SecondActivity",s);

        Button b2_1 = findViewById(R.id.button2_1);
        b2_1.setOnClickListener(view -> {EditText e1 = findViewById(R.id.editTest1);
            String s1 = e1.getText().toString();
            Toast.makeText(this,s1,Toast.LENGTH_LONG).show();
            Log.d("SecondActivity",s1);});
    }


}