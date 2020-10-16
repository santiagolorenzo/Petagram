package com.santiago.petagram.vistafragment;

import com.santiago.petagram.adapter.MascotaAdaptador;
import com.santiago.petagram.pojo.Mascota;

import java.util.ArrayList;

public interface IRecyclerViewFragmentView {

    public void generarLinearLayoutVertical();
    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas);
    public void inicializarAdaptadorRV(MascotaAdaptador mascotaAdaptador);

}