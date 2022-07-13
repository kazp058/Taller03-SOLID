package Postres;

import java.util.ArrayList;
import Adicionales.Aderezo;

public class Postre{
    protected String sabor;
    protected double precioParcial;
    protected ArrayList<Aderezo> aderezos;

    public Postre(String sabor){
        aderezos= new ArrayList<>();
        this.sabor=sabor;
    }

    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }

    public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
        return precioFinal;
    }

    public String showPrecioFinal(){
        return "Precio Final: $ " + calcularPrecioFinal();
    }

    public static void anadirAderezo(Postre postre,Aderezo aderezo){
        postre.getAderezos().add(aderezo);
    }
    
    public static void quitarAderezo(Postre postre,Aderezo aderezo){
        postre.getAderezos().remove(aderezo);
    }
}
