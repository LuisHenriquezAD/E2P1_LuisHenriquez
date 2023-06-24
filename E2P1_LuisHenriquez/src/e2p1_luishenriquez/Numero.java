package e2p1_luishenriquez;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Numero {

    public String residuo;
    public String residuoCOM;
    public int div;
    public int res;
    public int base;
    public int num;

    public void setResiduo(String residuo) {
        this.residuo = residuo;
    }

    public void setResiduoCOM(String residuoCOM) {
        this.residuoCOM = residuoCOM;
    }

    public void setDiv(int div) {
        this.div = div;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getResiduo() {
        return residuo;
    }

    public String getResiduoCOM() {
        return residuoCOM;
    }

    public int getDiv() {
        return div;
    }

    public int getRes() {
        return res;
    }

    public int getBase() {
        return base;
    }

    public int getNum() {
        return num;
    }

    public Numero() {
    }

    public Numero(int base, int num) {
        this.base = base;
        this.num = num;
    }

    public String decToBase(int base, int numero) {
        String residuo = "";

        while (numero > 0) {
            int res = numero % base;
            numero = numero / base;
            residuo = res + residuo;
        }

        return residuo;
    }

    public void eliminar() {
        Scanner lea = new Scanner(System.in);

        System.out.println("¿Cuál número desea borrar?");
        for (int i = 0; i < NewJFrame.numeros.size(); i++) {
            Numero num = NewJFrame.numeros.get(i);
            String baseS = "base " + num.getBase();
            String resultado = num.decToBase(num.getBase(), num.getNum());
            System.out.println((i + 1) + ". " + num.getNum() + " " + baseS + ": " + resultado);
        }

        int OPC = lea.nextInt();
        lea.nextLine();

        if (OPC >= 1 && OPC <= NewJFrame.numeros.size()) {
            NewJFrame.numeros.remove(OPC - 1);
            System.out.println("El número ha sido eliminado.");
        } else {
            System.out.println("El número ingresado no es válido.");
        }
    }

    public void agregar() {
        NewJFrame.numeros.add(this);
    }

    @Override
    public String toString() {
        return num + " base " + base + ": " + decToBase(base, num);
    }

    
      
       
}
