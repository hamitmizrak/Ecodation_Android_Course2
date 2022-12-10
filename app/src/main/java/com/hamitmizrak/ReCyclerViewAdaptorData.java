package com.hamitmizrak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

//subClass RecyclerViewHolder
public class ReCyclerViewAdaptorData extends RecyclerView.Adapter<ReCyclerViewAdaptorData.RecyclerViewHolder> {

    //Field
    private ArrayList<ReCyclerViewMessage> list;

    //parametreli constructor
    public ReCyclerViewAdaptorData(ArrayList<ReCyclerViewMessage> list) {
        this.list = list;
    }

    //resim görüntülemek
    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new RecyclerViewHolder(view);
    }

    //Listede her bir data için
    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.textView.setText(list.get(position).getName());
        holder.imageView.setImageResource(list.get(position).getPhoto());
    }

    //listede eleman sayısı kadar listelemek
    @Override
    public int getItemCount() {
        return list.size();
    }

    //SubClass
    class RecyclerViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        //sub class Constructor
        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewRecyclerId);
            textView = itemView.findViewById(R.id.textViewRecyclerViewId);
        }
    }
}
