package com.santiago.petagram.db;

import android.content.ContentValues;
import android.content.Context;

import com.santiago.petagram.R;
import com.santiago.petagram.pojo.Mascota;

import java.util.ArrayList;

public class ConstructorMascotas {

    private Context context;
    private static final int Hueso = 1;

    public ConstructorMascotas(Context context) {
        this.context = context;
    }

    public ArrayList<Mascota> obtenerDatos(){

        BaseDatos db = new BaseDatos(context);
        insertarMisMascotas(db);
        return db.obtenerTodasLasMascotas();
    }

    public void insertarMisMascotas (BaseDatos db){
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_NOMBRE, "Lucas");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_FOTO, R.drawable.mascota1);

        db.insertarMascota(contentValues);

        contentValues =  new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_NOMBRE, "Simon");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_FOTO, R.drawable.mascota2);

        db.insertarMascota(contentValues);

        contentValues =  new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_NOMBRE, "Zeus");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_FOTO, R.drawable.mascota2);

        db.insertarMascota(contentValues);

        contentValues =  new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_NOMBRE, "Kiara");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_FOTO, R.drawable.mascota1);

        db.insertarMascota(contentValues);

        contentValues =  new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_NOMBRE, "Nala");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_FOTO, R.drawable.mascota1);

        db.insertarMascota(contentValues);
    }

    public void darHuesoMascota(Mascota mascota) {

        BaseDatos db = new BaseDatos(context);
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_HUESOS_MASCOTA_ID_MASCOTA, mascota.getId());
        contentValues.put(ConstantesBaseDatos.TABLA_HUESOS_MASCOTA_QTY_HUESOS, Hueso);
        db.insertarHuesosMascota(contentValues);
    }

    public int obtenerHuesosMascota (Mascota mascota){
        BaseDatos db = new BaseDatos(context);
        return db.obtenerHuesosMascota(mascota);
    }

}
