package com.hamitmizrak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewData extends AppCompatActivity {

    //gloval variable
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_data);
        //start
        listView=findViewById(R.id.listViewId);
        String[] listData={"Servlet","JSP","JSF","Spring Framework","Spring Boot"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, listData);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            //counter
            int counter=1;
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
               Log.i("Listem",listData[position]);
                Toast.makeText(ListViewData.this, counter+" KEZ TIKLANDI "+ listData[position], Toast.LENGTH_SHORT).show();
                counter++;
            }
        });
    }
}