import java.util.Scanner;

public class Formula_General {

  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("ingrese el valor de a");
    double a=sc.nextDouble();
    System.out.println("ingrese el valor de b");
    double b=sc.nextDouble();
    System.out.println("ingrese el valor de c");
    double c=sc.nextDouble();
    double x1=FormulaG1(a,b,c);
    System.out.println("x1="+x1);
    double x2=FormulaG2(a,b,c);
    System.out.println("x2="+x2);
  }
  public static double FormulaG1(double a,double b,double c){
    double x=((-1)*b+(Math.sqrt(b*b-4*a*c)))/(2*a);
    return x;
  }
  public static double FormulaG2(double a,double b,double c){
    double x=((-1)*b-(Math.sqrt(b*b-4*a*c)))/(2*a);
    return x;
  }
}

