
package fernandovillavieja;

import java.util.Scanner;
public class FernandoVillavieja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        boolean sosTrolo = true;
        System.out.println("hola tonto");

        System.out.println("Escribi bien boludito.");

        System.out.println("Sos un tarado bárbaro");

        System.out.println("Callate pedazo de salamín mal cortado");
        
        System.out.println("Sos trolo?:");
        String opc = leer.nextLine();
        if (sosTrolo) {
            System.out.println("Confirmado. Sos trolo. :P");
        }else System.out.println("No sos trolo.");
            
        
    }
    
}
