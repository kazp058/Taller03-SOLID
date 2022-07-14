/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Adicionales.Crema;
import Adicionales.Frutilla;
import Postres.*;
import Procesos.*;
import Leche.*;
import java.util.ArrayList;

/**
 *
 * @author djurado
 */
public class Sistema {
    public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Descremada
        // Finalmente mostrar el precio final de cada uno
        //LecheEntera leche = new LecheDeslactosada();
        //ManejadorDeLeche mnj_leche = new ManejadorDeLeche();
        
        // Producir Helado
        //Helado helado_vainilla = new Helado("Vainilla");
        //Postre.anadirAderezo(helado_vainilla, new Crema());
        //Postre.anadirAderezo(helado_vainilla, new Frutilla());
        //System.out.println(helado_vainilla);
        //mnj_leche.cambiarTipoLeche(leche, helado_vainilla);
        //System.out.println(helado_vainilla.showPrecioFinal());
        
        // Producir Pastel
        //Pastel pastel_chocolate = new Pastel("Chocolate");
        //Postre.quitarAderezo(pastel_chocolate, new Crema());
        //Postre.anadirAderezo(pastel_chocolate, new Frutilla());
        //System.out.println(pastel_chocolate);
        //mnj_leche.cambiarTipoLeche(leche, pastel_chocolate);
        //System.out.println(helado_vainilla.showPrecioFinal());
        
        ArrayList<Postre> arrPostres = new ArrayList<>();
        LecheDescremada leche_Descremada = new LecheDescremada();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche();
        //ManejadorDeLeche mnj_leche = new ManejadorDeLeche(new LecheDescremada());
        
        // Producir Helado
        Postre helado_vainilla = new Helado("Vainilla");
        arrPostres.add(helado_vainilla);
        // Producir Pastel
        Postre pastel_chocolate = new Pastel("Chocolate");
        arrPostres.add(pastel_chocolate);
        
        arrPostres.forEach(postre -> {
            Postre.anadirAderezo(postre, new Crema());
            Postre.anadirAderezo(postre, new Frutilla());
            System.out.println(postre);
            mnj_leche.cambiarTipoLeche(leche_Descremada,postre);
            System.out.println(postre.showPrecioFinal());
        });        

        
    }
}
