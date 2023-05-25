package com.example.guide.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.guide.FamousPlacesActivity;
import com.example.guide.Model.StatesModel;
import com.example.guide.R;

import java.util.ArrayList;
import java.util.List;

public class StatesAdapter extends RecyclerView.Adapter<StatesAdapter.StateViewHolder> {


    private ArrayList<StatesModel> statelist = new ArrayList<>();
    Context mcontext;

    // data is passed into the constructor
    public StatesAdapter(Context context, ArrayList<StatesModel> data) {
        this.statelist = data;
        this.mcontext = context;
    }


    @NonNull
    @Override
    public StateViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_state_row, parent, false);
        return new StateViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StateViewHolder holder, int position) {
        StatesModel statesModel = statelist.get(position);
        holder.courseIV.setImageResource(statesModel.getCourse_image());

        holder.bindDataToUI(statesModel);


    }

    public void passDataToAdapter(List<StatesModel> statesModelList) {
        this.statelist.addAll(statesModelList);
        notifyDataSetChanged();

    }

    @Override
    public int getItemCount() {
        return statelist.size();
    }

    class StateViewHolder extends RecyclerView.ViewHolder {
        public ImageView courseIV;
        private TextView stateName;


        public StateViewHolder(@NonNull View itemView) {
            super(itemView);

            stateName = itemView.findViewById(R.id.state_name);
            courseIV = itemView.findViewById(R.id.state_img);
        }


        public void bindDataToUI(StatesModel statesModel) {
            stateName.setText(statesModel.getName());
            courseIV.setImageResource(statesModel.getCourse_image());


            stateName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent famousPlaces = new Intent(mcontext, FamousPlacesActivity.class);
                    famousPlaces.putExtra("state_name", statesModel.getName());
                    mcontext.startActivity(famousPlaces);


                }
            });

        }
    }
}
