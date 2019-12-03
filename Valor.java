
/**
 * Write a description of class Valor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Valor
{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese numero");
        int num=sc.nextInt();
        System.out.println("ingrese posicion");
        int x=sc.nextInt();
        Obtener(num,x);
    }
    private static void Obtener(int num,int x){
        String numer=""+num;
        if(x<=numer.length()){
            System.out.print(numer.charAt(numer.length()-x));
            for(int i=(numer.length()-x)+1;i<numer.length();i++)
                System.out.print("0");
        }else
            System.out.println("posicion fuera de rando");
    }
}
