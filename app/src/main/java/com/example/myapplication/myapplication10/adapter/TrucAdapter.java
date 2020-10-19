package com.example.myapplication.myapplication10.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.myapplication.myapplication10.R;
import com.example.myapplication.myapplication10.adapter.bo.Truc;

import java.util.List;

public class TrucAdapter extends ArrayAdapter<Truc> {

    private int idPresentationLigne;
    public TrucAdapter(@NonNull Context context, int resource, @NonNull List<Truc> objects) {
        super(context, resource, objects);
        idPresentationLigne = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View ligneView = inflater.inflate(idPresentationLigne, parent, false);
        TextView tvNom = ligneView.findViewById(R.id.nom_truc);
        TextView tvValeur = ligneView.findViewById(R.id.valeur_truc);
        Truc truc = getItem(position);

        tvNom.setText(truc.getLibelle());
        tvValeur.setText(truc.getValeur());
        return ligneView;
    }
}
