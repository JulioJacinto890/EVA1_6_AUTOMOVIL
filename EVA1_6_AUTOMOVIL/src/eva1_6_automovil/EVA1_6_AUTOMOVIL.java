/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_automovil;

/**
 *
 * @author hp
 */
public class EVA1_6_AUTOMOVIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AUTOMOVIL auto1=new AUTOMOVIL();
        
        auto1.setMarca("Honda");
        auto1.setModelo("civic");
        auto1.setPlacas("ELJ-535");
        auto1.setAño(2020);
        auto1.setDueño("Julio");
        
        
        auto1.imprimirDatos();
        
        
        
        
        AUTOMOVIL auto2=new AUTOMOVIL();
        
        auto2.setMarca("Volkswagen");
        auto2.setModelo("Bocho");
        auto2.setPlacas("232-435");
        auto2.setAño(1995);
        auto2.setDueño("Pedro");
        
        
        auto2.imprimirDatos();
        
        
        
        
        
        AUTOMOVIL auto3=new AUTOMOVIL();
        auto3.imprimirDatos();
    }
    
}