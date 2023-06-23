package e2p1_luishenriquez;

import java.util.ArrayList;
import java.util.Scanner;

public class Numero {

    public String residuo;
    public String residuoCOM;
    public int div ;
    public int res ;
    public int base;
    public int num;
    static Scanner leer = new Scanner(System.in);
    static public ArrayList<Numero> numeros = new ArrayList();

    public String getResiduo() {
        return residuo;
    }

    public void setResiduo(String residuo) {
        this.residuo = residuo;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }
    
    
    
    public int getDiv() {
        return div;
    }

    public void setDiv(int div) {
        this.div = div;
    }

    public int getBase() {

        return base;
    }

    public int getNum() {
        return num;
    }

    public ArrayList getNumeros() {
        return numeros;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setNumeros(ArrayList numeros) {
        this.numeros = numeros;
    }

    public Numero(int base, int num) {
        this.base = base;
        this.num = num;
    }

    

    public String decToBase(int base, int numero) {
    
        
        
    div = base + 10;    
    while(div> base){
        div = numero / base;
        res = numero % base;
        numero = div;
        residuo += res;
    }
        System.out.println(residuo);
        
        for(int i = residuo.length(); i < 0; i--){
           residuoCOM += residuo.charAt(i);  
        }
        System.out.printf("%s",residuoCOM);
    return residuoCOM;
    }
    
    
    
    
            /*

    public String numToChar(int restotal){
    String digitos = " ";
    //Aqui planeo colocar los if o los ASCCI para ver los caracteres
    // EJEMPLO 1515 = ff
    return digitos;    
    }
    
    public int charToNum(String digitos){
    Aqui hare los if con un for que lea todas las letras del string y se agregue a un entero
    que va a imprimir los valores 
    }
    
    
    
     public static void eliminar() {
        Scanner Lea = new Scanner(System.in);
        System.out.println("Cual quiere borrar??");
        for (int i = 0; i < .size(); i++) {
            System.out.println
        }

        int num = Lea.nextInt();
        Lea.nextLine();

        
            System.out.println("Ya se borro el numero");
            

            .remove();

        } else {
            System.out.println("El numero que ingreso no es valido");
        }

    }
*/
        
}
