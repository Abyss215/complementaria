    
/**
 * Write a description of class clase20_10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class clase20_10
{
    private clase20_10(){}
    public static void main(String[] argsa){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(clase20_10.primo(n));
    }
    public static String primo(int numero){
        int x=2;
        boolean prim=true;
        while(x<numero){
            if(numero%x==0){
                prim=false;
                break;
            }
            x++;
        }
        if(prim) return "es primo";
        else return "no es primo";
    }
}
