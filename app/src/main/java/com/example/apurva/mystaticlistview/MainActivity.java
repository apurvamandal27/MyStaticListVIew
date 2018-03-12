package com.example.apurva.mystaticlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String []myArray;
    ArrayAdapter<String> adapter;
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.mylist);
        myArray=getResources().getStringArray(R.array.myarray);

        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myArray);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, ""+myArray[position]+"  is clicked", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
