package com.thiagoezaki.projetofirebasetez.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.thiagoezaki.projetofirebasetez.R;
import com.zomato.photofilters.utils.ThumbnailItem;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class AdapterMiniaturas extends RecyclerView.Adapter<AdapterMiniaturas.MyViewHolder> {

    private List<ThumbnailItem> listaFiltros;
    private Context context;

    public AdapterMiniaturas(List<ThumbnailItem> listaFiltros, Context context) {
        this.listaFiltros = listaFiltros;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View itemLista= LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_filtros,parent,false);
       return new AdapterMiniaturas.MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            ThumbnailItem item= listaFiltros.get(position);

            holder.picture.setImageBitmap(item.image);
            holder.nomeFiltro.setText(item.filterName);
    }

    @Override
    public int getItemCount() {
        return listaFiltros.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView picture;
        TextView nomeFiltro;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            picture=itemView.findViewById(R.id.imageViewFiltro);
            nomeFiltro=itemView.findViewById(R.id.textViewFiltro);

        }
    }

}
