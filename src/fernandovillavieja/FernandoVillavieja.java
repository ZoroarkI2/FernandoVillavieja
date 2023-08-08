
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
            
        System.out.println("que tan gei sos, puntuate en una escala de 1 a 5");
        int num=0;
        num = leer.nextInt(num);
        int puntuacion = num;
        switch(num){
            case 1:
                System.out.println("un poquito gei");
                break;
                case 2:
                System.out.println("un poquito muy gei");
                break;
                case 3:
                System.out.println("medianamente gei");
                break;
                case 4:
                System.out.println("muy gei");
                break;
                case 5:
                System.out.println("trolazo");
                break;
        }
    }
    
}
