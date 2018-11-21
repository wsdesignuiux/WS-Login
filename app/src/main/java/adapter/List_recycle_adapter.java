package adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.vaibhav.k_login.Login_1_wsdActivity;
import com.example.vaibhav.k_login.Login_2_wsdActivity;
import com.example.vaibhav.k_login.Login_3_wsdActivity;
import com.example.vaibhav.k_login.Login_4_wsdActivity;
import com.example.vaibhav.k_login.Login_5_wsdActivity;
import com.example.vaibhav.k_login.Login_6_wsdActivity;
import com.example.vaibhav.k_login.R;

import java.util.ArrayList;

import model.Recycle_model;

public class List_recycle_adapter extends RecyclerView.Adapter<List_recycle_adapter.ViewHolder> {

    Context context;
    ArrayList<Recycle_model>recycleModels;

    public List_recycle_adapter(Context context, ArrayList<Recycle_model> recycleModels) {
        this.context = context;
        this.recycleModels = recycleModels;
    }

    @NonNull
    @Override
    public List_recycle_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycle,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull List_recycle_adapter.ViewHolder holder, final int position) {
            holder.textrecycle.setText(recycleModels.get(position).getTextrecycle());

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (position == 0) {
                        Intent i = new Intent(context, Login_1_wsdActivity.class);
                        context.startActivity(i); }

                    else if (position == 1) {
                        Intent i = new Intent(context, Login_2_wsdActivity.class);
                        context.startActivity(i); }

                    else if (position == 2) {
                        Intent i = new Intent(context, Login_3_wsdActivity.class);
                        context.startActivity(i); }

                    else if (position == 3) {
                        Intent i = new Intent(context, Login_4_wsdActivity.class);
                        context.startActivity(i); }

                    else if (position == 4) {
                        Intent i = new Intent(context, Login_5_wsdActivity.class);
                        context.startActivity(i); }

                    else if (position == 5) {
                        Intent i = new Intent(context, Login_6_wsdActivity.class);
                        context.startActivity(i); }
                }
            });
    }

    @Override
    public int getItemCount() {
        return recycleModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textrecycle;
        public ViewHolder(View itemView) {
            super(itemView);

            textrecycle = itemView.findViewById(R.id.textrecycle);
        }
    }
}
