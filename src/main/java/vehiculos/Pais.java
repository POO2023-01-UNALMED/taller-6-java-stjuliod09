package vehiculos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pais {
    private String nombre;
    private static ArrayList<Pais> Paises = new ArrayList<Pais>();
    
    public Pais(String nombre) {
        this.nombre = nombre;
        Paises.add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public static Pais paisMasVendedor(){

        HashMap<String, Integer> frecuenciaElementos = new HashMap<>();

        for (Pais pais:Paises){
            if (frecuenciaElementos.containsKey(pais.getNombre())) {
                frecuenciaElementos.put(pais.getNombre(), frecuenciaElementos.get(pais.getNombre()) + 1);
            } else {
                frecuenciaElementos.put(pais.getNombre(), 1);
            }
        }

        int ventaPaisGanador = 0;
        String nombrePaisGanador = "";

        for (Map.Entry<String, Integer> entrada : frecuenciaElementos.entrySet()) {
            if (entrada.getValue() > ventaPaisGanador) {
                nombrePaisGanador = entrada.getKey();
                ventaPaisGanador = entrada.getValue();
            }
        }

        for (Pais pais:Paises){
            if (pais.getNombre().equals(nombrePaisGanador)){
                return pais;
            }
        }

        return null;


 

    }


    

    

    
}
