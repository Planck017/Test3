package com.example.test3;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class FifthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        List<Bean> data = new ArrayList<>();

        for (int i = 0 ;i < 100 ;i++){
            Bean bean = new Bean();
            bean.setName("test"+i);
            data.add(bean);
        }

        ListView view = findViewById(R.id.listViewAct5);
        view.setAdapter(new BeanAdapter(data,this));

        view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("item","You just touch "+ i);
            }
        });
    }
}

