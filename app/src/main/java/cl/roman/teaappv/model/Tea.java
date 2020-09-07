package cl.roman.teaappv.model;

import java.util.ArrayList;
import java.util.List;

import cl.roman.teaappv.R;

public class Tea {
    public String id;
    public String nombre;
    public int foto;
    public int precio;

    public Tea(String id, String nombre, int foto, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.foto = foto;
        this.precio = precio;
    }

    public static List<Tea> teaList(){
        List<Tea> list = new ArrayList<>();
        list.add(new Tea("1","Black Tea", R.drawable.black_tea,1200));
        list.add(new Tea("2","Chamomile Tea", R.drawable.chamomile_tea,1200));
        list.add(new Tea("3","Green Tea", R.drawable.green_tea,1200));
        list.add(new Tea("4","Honey Lemon Tea", R.drawable.honey_lemon_tea,1200));
        list.add(new Tea("5","Oolong Tea", R.drawable.oolong_tea,1200));
        list.add(new Tea("6","White Tea", R.drawable.white_tea,1200));
        return list;
    }


}
