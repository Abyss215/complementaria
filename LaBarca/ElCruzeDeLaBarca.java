package LaBarca;
/*   numero++; primero dar y lugo cambiar
 *   ++numero; primero incrementar y luego dar
 */

/**
 * Write a description of class ElCruzeDeLaBarca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ElCruzeDeLaBarca
{
    
    ///variables globales
    boolean personasE[]={false,true,true,true,false,true,false,true};
    String personasN[]={"policia","ladron","padre","madre","hijoA","hijoB","hijaA","hijaB"};
    /*      posiciones
     * 0    policia
     * 1    ladron  
     * 2    padre
     * 3    madre
     * 4    hijoA
     * 5    hijoB
     * 6    hijaA
     * 7    hijaB
     */
    String barca[]={"",""};
    boolean direccion=true;
    /*  direccion
     * true  --->   (derecha)
     * false <---   (izquierda)
     */
 
    /**inicio del juego xd*/
    public static void star(){
        ;
        /*
         * determine si un numero es feliz o no
         * 
         * como leeer datos del teclado pero sin Scanner ni JOptionPane
         * leeer una palabra/una cadena y determinar segun la cantidad de letras q tenga cuantas veces se va a repetir
         */
        
        
    }
    /**metodos*/
    public void reiniciar(){
        for(int i=0;i<8;i++){
            this.personasE[i]=true;
        }
        this.barca[0]="";
        this.barca[1]="";
        this.direccion=true;
    }
    //selecciona a los q van a subir a la barca 
    public void lista(){
            String listaPI="";
            for(int x=0;x<8;x++){
                if(this.personasE[x]==true){
                    listaPI+=personasN[x]+"\n";
                }else{
                    listaPI+="\t \t"+personasN[x]+"\n";
                }
            }
            System.out.println(listaPI);
    }
    
}
