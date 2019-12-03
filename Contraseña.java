
/**
 * establecer una contraseña escrita por nosotros
 * si al ingresar la contraseña esta correcta mostrar mensaje
 * si no solo cuetan con 3 intentos y se sale.
 * 
 * @criss_215
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class Contraseña
{
    public static void main(String [] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("establesca contraseña/pin");
        String contra=sc.nextLine();
        for(int i=1;i<=3;i++){
            System.out.println("ingrese contraseña \n numero de intentos restantes: "+(3-i));
            String pin=sc.nextLine();
            if(pin.equals(contra)){
                System.out.println("ingresado");
                break;
            }
            else{
                System.out.println("contraseña incorrecta");
            }
        }
    }
}
