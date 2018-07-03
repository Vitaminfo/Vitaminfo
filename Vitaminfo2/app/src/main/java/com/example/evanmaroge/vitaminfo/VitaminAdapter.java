package com.example.evanmaroge.vitaminfo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class VitaminAdapter extends RecyclerView.Adapter<VitaminAdapter.VitaminViewHolder> {


    private Context context;
    private String[] vitamins;
    private String[] letters;

    public VitaminAdapter(Context context, String[] vitamins,String[] letters) {
        this.context = context;
        this.vitamins = vitamins;
        this.letters=letters;
    }

    @NonNull
    @Override
    public VitaminViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_layout,null);
        VitaminViewHolder holder = new VitaminViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull VitaminViewHolder holder, int position) {
        String vitamin = vitamins[position];
        String letter = letters[position];
        holder.name.setText(vitamin);
        holder.let.setText(letter);
    }

    @Override
    public int getItemCount() {
        return vitamins.length;
    }

    class VitaminViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView name, let;


        public VitaminViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.textViewTitle);
            let = itemView.findViewById(R.id.textView0);




        }
    }
}
