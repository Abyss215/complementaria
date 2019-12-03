package Mate_NumeroImaginario;


/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal{
    public static void main(String [] args){
        NumeroImaginario numeroIma1= new NumeroImaginario(-2,7);
        NumeroImaginario numeroIma2= new NumeroImaginario(0,-4);
        System.out.println(numeroIma1.toString());
        System.out.println(numeroIma1);
        System.out.println(numeroIma2.toString());
        System.out.println(numeroIma2);
    }
}