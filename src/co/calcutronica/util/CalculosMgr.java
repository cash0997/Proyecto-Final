

package co.calcutronica.util;


public class CalculosMgr {
    
        public double voltaje (double resistencia, double corriente){

            if (corriente == 0){
                 return 0;
            }
            else{
                 return resistencia * corriente;
            }
        }

        public double resistencia (double voltaje, double corriente){
            return voltaje / corriente;
        }

        public double corriente (double voltaje, double resistencia){
            return voltaje / resistencia;
        }

        public double serie (double resistencia1, double resistencia2){
            return resistencia1 + resistencia2;
        }
        public double paralelo (double resistencia1, double resistencia2){

            if (resistencia1 == 0){
                 return 0;
            }
            if (resistencia2 == 0){
                 return 0;
            }        
            else{
                 return (resistencia1 * resistencia2)/(resistencia1 + resistencia2);
            }

        }
   
}
