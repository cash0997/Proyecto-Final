
package co.calcutronica.model;


import co.calcutronica.util.ColorValor;


public class ResistorColores {
    
    private String color1;
    private String color2;
    private String multiplicador;
    private String tolerancia;

    
    public ResistorColores(String color1, String color2, String multiplicador, String tolerancia) {
        this.color1 = color1;
        this.color2 = color2;
        this.multiplicador = multiplicador;
        this.tolerancia = tolerancia;
    }
    
    public String getCadena( ){
        
        int valor = Integer.parseInt(ColorValor.getInstancia().getValue(this.color1)+""+ColorValor.getInstancia().getValue(this.color2));
        System.out.println(valor);
        double pow = Math.pow(10, ColorValor.getInstancia().getValue(this.multiplicador));
        double total = valor * pow;
                      
        return total+ " Ohms, +/-"+ColorValor.getInstancia().getValue(this.tolerancia)+"%";
    }
    
    

    public String getColor1() {
        return color1;
    }

    public void setColor1(String color1) {
        this.color1 = color1;
    }

    public String getColor2() {
        return color2;
    }

    public void setColor2(String color2) {
        this.color2 = color2;
    }

    public String getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(String multiplicador) {
        this.multiplicador = multiplicador;
    }

    public String getTolerancia() {
        return tolerancia;
    }

    public void setTolerancia(String tolerancia) {
        this.tolerancia = tolerancia;
    }
    
     
    
}
