package cl.roman.teaappv.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cl.roman.teaappv.R;
import cl.roman.teaappv.model.Tea;

public class AdapterTea extends RecyclerView.Adapter<AdapterTea.TeaHolder> {

    public Activity activity;
    public List<Tea> list;
    public int tea_item;

    public AdapterTea(Activity activity, List<Tea> list, int tea_item) {
        this.activity = activity;
        this.list = list;
        this.tea_item = tea_item;
    }

    @NonNull
    @Override
    public TeaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(tea_item,parent,false);
        return new TeaHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TeaHolder holder, int position) {
        Tea tea = list.get(position);
        holder.item_img.setImageResource(tea.foto);
        holder.item_title.setText(tea.nombre);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class TeaHolder extends RecyclerView.ViewHolder{
        public ImageView item_img;
        public TextView item_title;

        public TeaHolder(View itemView) {
            super(itemView);
            item_img = itemView.findViewById(R.id.item_img);
            item_title = itemView.findViewById(R.id.item_title);
        }
    }

}
