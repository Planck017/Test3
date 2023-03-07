package com.example.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SixthActivity extends AppCompatActivity {

    private List<Bean> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);

        for (int i = 0; i < 100 ; i++){
            Bean bean = new Bean();
            bean.setName("Recycle Item "+i);
            data.add(bean);
        }



    }

}