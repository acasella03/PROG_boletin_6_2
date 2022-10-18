package prog_boletin_6_2;

public class Satelite {
    private double meridiano;
    private double paralelo;
    private double distanciaTierra;
    
    public Satelite(){
        
    }
    
    public Satelite(double m, double p, double d){
        meridiano=m;
        paralelo=p;
        distanciaTierra=d;
    }
    
    public void verPosicion(){
        System.out.println ("El satelite se encuentra en el paralelo "+paralelo + "\nEl meridiano " + meridiano+ "\nA una distancia de la tierra " + distanciaTierra);
    }
}
