
/**
 * programa dque dado un numero n determine si es positivo, negativo o nulo.
 * 
 * @criss_215
 * @version 1.0
 */
import java.util.Scanner;
public class Numero
{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese un numero");
        double n=sc.nextDouble();
        if(n<0){
            System.out.println("es negativo");
        }else if(n>0){
                System.out.println("es positivo");
            }else{
                System.out.println("es nulo");
            }
    }
}
