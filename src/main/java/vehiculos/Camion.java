package vehiculos;

public class Camion extends Vehiculo {

    private int ejes;
    private static int CantidadCamiones;


    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes){
        super(placa, 2, 80,  nombre, precio, peso, "4X2", fabricante);
        this.ejes = ejes;
        CantidadCamiones ++;

    }


    public int getEjes() {
        return ejes;
    }


    public void setEjes(int ejes) {
        this.ejes = ejes;
    }


    public static int getCantidadCamiones() {
        return CantidadCamiones;
    }


    public static void setCantidadCamiones(int cantidadCamiones) {
        CantidadCamiones = cantidadCamiones;
    }
    
    

}
