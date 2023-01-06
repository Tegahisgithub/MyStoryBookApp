package com.example.mystorybookapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] tStory=getResources().getStringArray(R.array.title_story);
        String[] dStory=getResources().getStringArray(R.array.details_story);

        listView=findViewById(R.id.list);

        ArrayAdapter<String> adapter= new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, tStory);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            int position = 0;
            String t= dStory[position];
            Intent intent=new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("story",t);
            startActivity(intent);
        });
    }
}