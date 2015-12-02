package co.calcutronica.util;

import java.util.HashMap;


public class ColorValor {
    
    private static ColorValor instancia = new ColorValor();
    private HashMap <String, Integer> colorsValues; 
    
    public static ColorValor getInstancia(){
        return instancia;
    }
    
    @SuppressWarnings("unchecked")
    
	private ColorValor(){
        colorsValues  = new HashMap();    
        initmap();
        
    };
    
    public void initmap (){
        colorsValues.put(Color.COLOR_NEGRO, 0);
        colorsValues.put(Color.COLOR_CAFE, 1);
        colorsValues.put(Color.COLOR_ROJO, 2);
        colorsValues.put(Color.COLOR_NARANJA, 3);
        colorsValues.put(Color.COLOR_AMARILLO, 4);
        colorsValues.put(Color.COLOR_VERDE, 5);
        colorsValues.put(Color.COLOR_AZUL, 6);
        colorsValues.put(Color.COLOR_VIOLETA, 7);
        colorsValues.put(Color.COLOR_GRIS, 8);
        colorsValues.put(Color.COLOR_BLANCO, 9);
        colorsValues.put(Color.COLOR_DORADO, 5);
        colorsValues.put(Color.COLOR_PLATEADO, 10);
        colorsValues.put(Color.COLOR_SIN_COLOR, 20);
        
        
    }   
    
    public int getValue(String key){       
        return colorsValues.get(key);
    }
}
