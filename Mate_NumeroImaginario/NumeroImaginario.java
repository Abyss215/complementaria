package Mate_NumeroImaginario;


/**
 * Write a description of class NumeroImaginario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumeroImaginario{
    //Atributos
    private double parteReal;
    private double parteImaginaria;
    
    //Metodo constructor
    public NumeroImaginario(){
    }
    
    public NumeroImaginario(double real,double imaginario){
        this.parteReal=real;
        this.parteImaginaria=imaginario;
    }
    
    //gets
    public double getParteReal(){
        return this.parteReal;
    }
    public double getParteImaginaria(){
        return this.parteImaginaria;
    }
    
    //sets
    public void setParteReal(double real){
        this.parteReal=real;
    }
    public void setParteImaginaria(double imaginaria){
        this.parteImaginaria=imaginaria;
    }
    
    //toString
    
    public String toString(){
        return parteReal+" "+parteImaginaria+" i";
    }
    
    //metodos
    public void imcrementarR(double imcremento){
        this.parteReal += imcremento;
    }
    
    
}