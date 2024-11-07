
package gyokos_szamok03.pkg11;

 class TombokMegjelenitese {
     
     public static void main(String[] args) {
        private static void tonbokMegjelenitese() {
            char[] betuk={'a','b','c','d'};
            String kimenet = egyszorban (betuk);
                    
            betuk =new char[7];
            for (int i = 0; i < betuk.length; i++) {
                betuk[i] =(char)(i+97);
                
            }
        
        }
        private static String egysorban(char[] tomb) {
            String kimenet ="";
            for (int i = 0; i < tomb.length; i++) {
                
            }
        
        }
        private static void tablazatban(char[] tomb) {
            for (int i = 0; i < tomb.length; i++) {
                if (i!=0 and i%3 ==0) {
                    kimenet += "\n";                   
                }
            kimenet += tomb[i]+ " ";

            }
        
        }
         
     }
    
     
     
     
    
}
