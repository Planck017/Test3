package com.example.test3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.button1);
        b1.setOnClickListener(view -> Toast.makeText(this,"You click button1.",Toast.LENGTH_LONG).show());

        Button b2 = findViewById(R.id.button2);
        b2.setOnClickListener(view -> finish());

        Button b3 = findViewById(R.id.button3);
        b3.setOnClickListener(view -> {Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("Extra_data",  "Hello SecondActivity"); startActivity(intent);});

        Button b4 = findViewById(R.id.button4);
        b4.setOnClickListener(view -> {Intent intent = new Intent("com.example.test3.ACTIONS_START");
            intent.addCategory("com.example.test3.CATEGORY");startActivityForResult(intent,1);});

        Button b5 = findViewById(R.id.button5);
        b5.setOnClickListener(view -> {Intent intent = new Intent(this,ForthActivity.class);
            startActivity(intent);});

        Button b6 = findViewById(R.id.button6);
        b6.setOnClickListener(view -> {Intent intent = new Intent(this,FifthActivity.class);
            startActivity(intent);});



    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK){
            Log.d("FirstActivity",data.getStringExtra("data_return"));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()){
            case R.id.menuAdd: Toast.makeText(this,"Add menu button",Toast.LENGTH_LONG).show();
                break;
            case R.id.menuRemove: Toast.makeText(this,"Remove menu button",Toast.LENGTH_LONG).show();
                break;
        }
        return true;
    }


}