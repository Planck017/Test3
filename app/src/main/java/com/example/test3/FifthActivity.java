package com.example.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FifthActivity extends AppCompatActivity {

    private static final int[] iconArray = {
            R.drawable.b, R.drawable.b, R.drawable.b, R.drawable.b,
            R.drawable.b
    };

    private static final String[] nameArray={
         "Apple","Banana","Orange","Watermelon","Pear"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        List<Map<String,Object>> list = new ArrayList<>();
        for (int i = 0;i < iconArray.length;i++){
            Map<String,Object> item = new HashMap<>();
            item.put("icon",iconArray[i]);
            item.put("name",nameArray[i]);
            list.add(item);
        }
        SimpleAdapter adapter = new SimpleAdapter(this,list,R.layout.fruit_item,new String[]{"icon","name"},new int[]{R.id.fruitImage,R.id.fruitText});
        ListView view = findViewById(R.id.listViewAct5);
        view.setAdapter(adapter);
    }


}

