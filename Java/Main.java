import java.util.ArrayList;
import java.util.Map;

class Main{
    public static void main(String[] args) {
        System.out.println("Hola Bienvenido a Uber"); 
        UberX uberX = new UberX("FLY213", new Account("Rodrigo Hernandez", "HEL923"), "Renault", "RB25");   
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberX uberX2= new UberX("LOW456", new Account("Sergio Perez", "PES876"), "Ferrari", "Modena");
        uberX2.setPassenger(4);
        uberX2.printDataCar();
        
        UberVan uberVan= new UberVan("FAS723", new Account("Luis Hamilton", "ID354"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
        
    }   
}
