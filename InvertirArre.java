
/**
 * Write a description of class InvertirArre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class InvertirArre
{
    /*public static void main(String [] args){
        InvertirArre arr=new InvertirArre();
        Scanner sc=new Scanner(System.in);
        System.out.println("T del arreglo");
        int t=sc.nextInt();
        String [] text=new String [t];
        System.out.println(t);
        for(int i=0;i<t;i++){
            System.out.println("poc:"+i);
            text[i]=sc.nextLine();}
            System.out.println("no invertido");
        for(int i=0;i<t;i++)
            System.out.println(text[i]);
        text=arr.invertir(text);
        System.out.println("invertido");
        for(int i=0;i<t;i++)
            System.out.println(text[i]);
    }*/
    public String [] invertir(String arre []){
        int x=arre.length-1;
        for(int i=0;(i<arre.length&&i<x);i++){
            String aux=arre[i];
            arre[i]=arre[x];
            arre[x]=aux;
            x--;
        }
        return arre;
    }
}
