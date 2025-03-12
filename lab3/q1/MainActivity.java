package com.example.q1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] item = new String[20];
    int[] items = {R.drawable.logo1,R.drawable.logo1,R.drawable.logo1,R.drawable.logo1,R.drawable.logo1,R.drawable.logo1,
            R.drawable.logo1,R.drawable.logo1,R.drawable.logo10,R.drawable.logo11,R.drawable.logo13,R.drawable.logo15,
            R.drawable.logo10,R.drawable.logo11,R.drawable.logo13,R.drawable.logo15,R.drawable.logo10,
            R.drawable.logo11,R.drawable.logo13,R.drawable.logo15};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gv = (GridView) findViewById(R.id.gv);

        for(int i=0; i<20; i++){
            item[i] = "Item "+ (i);
        }

        //gv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, item));
        gv.setAdapter(new ImageAdapter(this, items));
        /*gv.setOnItemClickListener(new GridView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), items[position], Toast.LENGTH_SHORT).show();
            }
        });*/

    }
}