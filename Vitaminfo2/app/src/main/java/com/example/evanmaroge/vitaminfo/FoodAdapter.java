package com.example.evanmaroge.vitaminfo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

    public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {
        private String[] foods;

        private LayoutInflater inflater;

        private Context context;

        class ViewHolder extends RecyclerView.ViewHolder {

            TextView textView;
            public ViewHolder(View itemView){
                super(itemView);
                textView = (TextView)itemView.findViewById(R.id.listText);
            }

        }

        // Provide a suitable constructor (depends on the kind of dataset)
        public FoodAdapter(Context context, String[] foodFromVitamins) {

            inflater = LayoutInflater.from(context);
            foods = foodFromVitamins;
            this.context = context;
        }

        // Create new views (invoked by the layout manager)
        @Override
        public FoodAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                         int viewType) {
            View view = inflater.inflate(R.layout.fragment_food_recview_layout, parent, false);
            ViewHolder holder = new ViewHolder(view);
            return holder;
        }

        // Replace the contents of a view (invoked by the layout manager)
        @Override
        public void onBindViewHolder(ViewHolder holder, final int position) {

        String data = foods[position];
        holder.textView.setText(data);
            holder.textView.setOnClickListener(new View.OnClickListener(){


                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context,FoodInfoActivity.class);

                    String foodSelected = foods[position];

                    intent.putExtra("foodSelected", foodSelected);

                    context.startActivity(intent);
                }

            });

        }

        // Return the size of your dataset (invoked by the layout manager)
        @Override
        public int getItemCount() {
            return foods.length;
        }
    }
