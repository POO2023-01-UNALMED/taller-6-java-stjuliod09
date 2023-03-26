package vehiculos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Fabricante {
    private String nombre;
    private Pais pais;
    static ArrayList<Fabricante> Fabricas = new ArrayList<Fabricante>(); 

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        Fabricas.add(this);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Pais getPais() {
        return pais;
    }
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    
    public static Fabricante fabricaMayorVentas(){
        HashMap<String, Integer> frecuenciaElementos = new HashMap<String, Integer>();

        for (Fabricante fabrica:Fabricas){
            if (frecuenciaElementos.containsKey(fabrica.getNombre())) {
                frecuenciaElementos.put(fabrica.getNombre(), frecuenciaElementos.get(fabrica.getNombre()) + 1);
            } else {
                frecuenciaElementos.put(fabrica.getNombre(), 1);
            }
        }

        int ventaFabricaGanadora = 0;
        String nombreFabricaGanadora = "";

        for (Map.Entry<String, Integer> entrada : frecuenciaElementos.entrySet()) {
            if (entrada.getValue() > ventaFabricaGanadora) {
                nombreFabricaGanadora = entrada.getKey();
                ventaFabricaGanadora = entrada.getValue();
            }
        }

        for (Fabricante fabrica: Fabricas){
            if (fabrica.getNombre().equals(nombreFabricaGanadora)){
                return fabrica;
            }
        }

        return null;

    }

    



}
