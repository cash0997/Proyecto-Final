
package co.calcutronica.model;

public class Ohm {
    
    private String valor1;
    private String valor2;
    private String opcion;
   
    public Ohm(String valor1, String valor2, String opcion) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.opcion = opcion;
    }
    
    public String getCadena( ){
        
        if (Integer.parseInt(this.opcion) == 1){            
            double calculo = Double.parseDouble(this.valor1) * Double.parseDouble(this.valor2);  
            return calculo+" V";        
            }        
        if (Integer.parseInt(this.opcion) == 2){            
            double calculo = Double.parseDouble(this.valor1) / Double.parseDouble(this.valor2);  
            return calculo+" Amp";        
            }               
        if (Integer.parseInt(this.opcion) == 3){            
            double calculo = Double.parseDouble(this.valor1) / Double.parseDouble(this.valor2);  
            return calculo+" Ohms";        
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
    
    
    
}
