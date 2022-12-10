package com.hamitmizrak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ReCyclerViewData extends AppCompatActivity {

    //global variable
    ReCyclerViewAdaptorData adaptor;
    ArrayList<ReCyclerViewMessage> list;
    RecyclerView recyclerView;

    public void processingImageAndText(){
        String data="Android Öğreniyorum";
        ReCyclerViewMessage message1=new ReCyclerViewMessage("item 1: "+data,R.drawable.ai);
        ReCyclerViewMessage message2=new ReCyclerViewMessage("item 1: "+data,R.drawable.earth);
        list.add(message1);
        list.add(message2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_re_cycler_view_data);
        //start
        list=new ArrayList<>();
        adaptor=new ReCyclerViewAdaptorData(list);
        recyclerView=findViewById(R.id.recyclerListData);

        //sıralamak istiyoruz
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adaptor);
        processingImageAndText();
    }
}