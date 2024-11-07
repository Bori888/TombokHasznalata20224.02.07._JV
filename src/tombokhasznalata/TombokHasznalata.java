
package tombokhasznalata;


public class TombokHasznalata {

   
    public static void main(String[] args) {
        String[] tomb ={"egy","ketto","harom" };
        
        System.out.println("tomb" + tomb);
        
        for(int i = 0; i < tomb.length; i++){
            System.out.printf("[%d. index] = %s\n", i,tomb[i]);
        }
        tomb = new String[4];
        System.out.printf("Az üres tömb: ");
        for(int i = 0; i < tomb.length; i++){
            System.out.printf("[%d. index] = %s\n", i,tomb[i]);
            
        }
        tomb[2] = "zwei";
        System.out.printf("Részben feltöltot neémetül tömb: ");
        for(int i = 0; i < tomb.length; i++){
            System.out.printf("[%d. index] = %s\n", i,tomb[i]);
            
        }
        tomb[0] = "null";
        tomb[1] = "one";
        tomb[2] = "two";
        tomb[3] = "three";
        System.out.printf("teljesen feltöltot angolul tömb: ");
        for(int i = 0; i < tomb.length; i++){
            System.out.printf("[%d. index] = %s\n", i,tomb[i]);
            
        }
        
        
    }
    
}
