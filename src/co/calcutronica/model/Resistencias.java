/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.calcutronica.model;


public class Resistencias {
    
    private String valor1;
    private String valor2;
    private String opcion;

    public Resistencias(String valor1, String valor2, String opcion) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.opcion = opcion;
    }
    
    public String getCadena( ){
        
        if (Integer.parseInt(this.opcion) == 1){            
            double calculo = Double.parseDouble(this.valor1) + Double.parseDouble(this.valor2);  
            return calculo+" Ohms";        
            }        
        if (Integer.parseInt(this.opcion) == 2){  
            
                if (Double.parseDouble(this.valor1) == 0){
                    return 0+"";
                }
                if (Double.parseDouble(this.valor2) == 0){
                     return 0+"";
                }        
                else{
                     return (Double.parseDouble(this.valor1) * Double.parseDouble(this.valor2))/
                            (Double.parseDouble(this.valor1) + Double.parseDouble(this.valor2))+"Ohms";
                }
            }   
        return "";
    }

    public String getValor1() {
        return valor1;
    }

    public void setValor1(String valor1) {
        this.valor1 = valor1;
    }

    public String getValor2() {
        return valor2;
    }

    public void setValor2(String valor2) {
        this.valor2 = valor2;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }
    
}
