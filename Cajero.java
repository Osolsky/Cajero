public class Cajero {

    private int opGlobales;

    private int dineroDepositos;
    private int dineroServicios;

    private int totalDeDespositos;
    private int totalDeServicios;
    private int totalDeConsultas;

    private String nombreDeCajero;


    public Cajero(String nombreDeCajero) {
        this.nombreDeCajero = nombreDeCajero;
    }

    public void getReporte(){
        System.out.println("----------------------------------------");
        System.out.println("Reporte del " + getNombreDeCajero() );
        System.out.println("Las operaciones globales son de " + getOpGlobales());
        System.out.println("El monto total de depositos es de " + getDineroDepositos());
        System.out.println("El monto total de servicios es de " + getDineroServicios());
        System.out.println("El total de consultas fue de " + getTotalDeConsultas());
        System.out.println("El total de depositos fue de " + getTotalDeDespositos());
        System.out.println("El total de de servicios fue de " + getTotalDeServicios());
    }


    public void instanciarCajeros(){
        Cajero [] cajerosEnBanco = new Cajero[5];
        cajerosEnBanco [0] = new Cajero("cajero1");
        cajerosEnBanco [1] = new Cajero("cajero2");
        cajerosEnBanco [2] = new Cajero("cajero3");
        cajerosEnBanco [3] = new Cajero("cajero4");
        cajerosEnBanco [4] = new Cajero("cajero5");
    }


    public int getOpGlobales() {
        return opGlobales;
    }

    public int getDineroDepositos() {
        return dineroDepositos;
    }

    public int getDineroServicios() {
        return dineroServicios;
    }

    public int getTotalDeDespositos() {
        return totalDeDespositos;
    }

    public int getTotalDeServicios() {
        return totalDeServicios;
    }

    public int getTotalDeConsultas() {
        return totalDeConsultas;
    }

    public String getNombreDeCajero() {
        return nombreDeCajero;
    }
}
