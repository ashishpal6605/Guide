package com.example.guide.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.guide.DetailActivity;
import com.example.guide.FamousPlacesActivity;
import com.example.guide.Model.FamousPlacesModel;
import com.example.guide.R;

import java.util.ArrayList;
import java.util.List;

public class FamousPlacesAdapter extends RecyclerView.Adapter<FamousPlacesAdapter.FamousPlacesviewHolder> {


    private ArrayList<FamousPlacesModel> statelist = new ArrayList<>();


    @NonNull
    @Override
    public FamousPlacesviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_state_row, parent, false);
        return new FamousPlacesviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FamousPlacesviewHolder holder, int position) {
        FamousPlacesModel statesModel = statelist.get(position);
        holder.bindDataToUI(statesModel);


    }

    public void passDataToAdapter(List<FamousPlacesModel> statesModelList) {
        this.statelist.addAll(statesModelList);
        notifyDataSetChanged();

    }

    @Override
    public int getItemCount() {
        return statelist.size();
    }

    class FamousPlacesviewHolder extends RecyclerView.ViewHolder {
        private TextView stateName;


        public FamousPlacesviewHolder(@NonNull View itemView) {
            super(itemView);

            stateName = itemView.findViewById(R.id.state_name);
        }


        public void bindDataToUI(FamousPlacesModel statesModel) {
            stateName.setText(statesModel.getPlaces_name());


            stateName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent famousPlaces = new Intent(stateName.getContext(), DetailActivity.class);
                    famousPlaces.putExtra("place_name", statesModel.getPlaces_name());
                    famousPlaces.putExtra("place_content", statesModel.getPlaces_Content());
                    famousPlaces.putExtra("Location", statesModel.getLocation());
                    stateName.getContext().startActivity(famousPlaces);
                }
            });

        }
    }
}
