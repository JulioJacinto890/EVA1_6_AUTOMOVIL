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
public class AUTOMOVIL {
    private String marca;
    private String modelo;
    private String placas;
    private int año;
    private String dueño;
    
    
    public AUTOMOVIL(){
        marca="Honda ";
        modelo="civic";
        placas="ELJ-345";
        año=1997;
        dueño="DON Antonio";
    }
    
    
    public void setMarca(String ma){
        marca=ma;
    }
    public void setModelo(String mo){
        modelo=mo;
    }
    public void setPlacas(String pla){
        placas=pla;
    }
    public void setAño(int a){
        año=a;
    }
    public void setDueño(String due){
        dueño=due;
    }
    
    
    
    
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getPlacas(){
        return placas;
    }
    public int getAño(){
        return año;
    }
    public String getDueño(){
        return dueño;
    }
    
    public int adeudo(){
        int adeudo=0;
        if(año<=2000){
            adeudo=1500;
        }else if(año>=2001 && año<=2005){
            adeudo=2000;
        }else if(año>=2006 && año<=2010){
            adeudo=2500;
        }else if(año>=2011 && año<=2015){
            adeudo=3000;
        }else if(año>=2016 && año<=2023){
            adeudo=4000;
        }
        
        return adeudo;
    }
    
    
    public void imprimirDatos(){
        System.out.println("--------------------");
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Placas: "+getPlacas());
        System.out.println("Año: "+getAño());
        System.out.println("Dueño: "+getDueño());
        System.out.println("Adeudo: "+adeudo());

    }
}