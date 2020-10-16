package com.santiago.petagram.vistafragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.santiago.petagram.R;
import com.santiago.petagram.adapter.MascotaAdaptadorGrid;
import com.santiago.petagram.pojo.Mascota;

import java.util.ArrayList;


public class PerfilFragment extends Fragment {
    ArrayList <Mascota> mascotas;
    ArrayList <Mascota> mascotasMain;
    public RecyclerView rvMascotasGrid;
    public RecyclerView rvMascotasGridMain;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this vista.vistafragment
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        rvMascotasGrid = (RecyclerView) v.findViewById(R.id.rvMascotasGrid);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),3);

        rvMascotasGrid.setLayoutManager(gridLayoutManager);
        inicializarListaMascotasGrid();
        inicializarAdaptadorGrid();

        return v;
    }
    public void inicializarAdaptadorGrid (){
        MascotaAdaptadorGrid mascotaAdaptadorGrid = new MascotaAdaptadorGrid(mascotas,getActivity());
        rvMascotasGrid.setAdapter(mascotaAdaptadorGrid);
    }


    public void inicializarListaMascotasGrid() {
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.mascota1, 1));
        mascotas.add(new Mascota(R.drawable.mascota1, 2));
        mascotas.add(new Mascota(R.drawable.mascota1, 3));
        mascotas.add(new Mascota(R.drawable.mascota1, 4));
        mascotas.add(new Mascota(R.drawable.mascota1, 5));
        mascotas.add(new Mascota(R.drawable.mascota1, 6));
        mascotas.add(new Mascota(R.drawable.mascota1, 7));
        mascotas.add(new Mascota(R.drawable.mascota1, 8));
        mascotas.add(new Mascota(R.drawable.mascota1, 9));

    }

}
