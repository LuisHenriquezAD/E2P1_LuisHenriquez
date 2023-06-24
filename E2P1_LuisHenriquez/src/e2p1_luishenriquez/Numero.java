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

        StringBuilder residuo = new StringBuilder();
        int resi;

        while (numero > 0) {
            resi = numero % base;
            numero = numero / base;
            residuo.append(resi);
        }

        return residuo.reverse().toString();
    }

    public int decToBase() {

        int dku = 0;
        int poder = 1;
        
        for (int i = residuo.length() - 1; i >= 0; i--) {
            int num = Character.getNumericValue(residuo.charAt(i));
            int res = num * (int) Math.pow(base, dku);
            poder *= res;
            dku++;
            System.out.println(res);
        }
        return poder;
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

    public char numToChar(int num) {
        if (num >= 0 && num <= 9) {
            return (char) ('0' + num); // Caracteres del '0' al '9'
        } else if (num == 10) {
            return 'a';
        } else if (num == 11) {
            return 'b';
        } else if (num == 12) {
            return 'c';
        } else if (num == 13) {
            return 'd';
        } else if (num == 14) {
            return 'e';
        } else if (num == 15) {
            return 'f';
        } else if (num == 16) {
            return 'g';
        } else if (num == 17) {
            return 'h';
        } else if (num == 18) {
            return 'i';
        } else if (num == 19) {
            return 'j';
        } else if (num == 20) {
            return 'k';
        } else if (num == 21) {
            return 'l';
        } else if (num == 22) {
            return 'm';
        } else if (num == 23) {
            return 'n';
        } else if (num == 24) {
            return 'o';
        } else if (num == 25) {
            return 'p';
        } else if (num == 26) {
            return 'q';
        } else if (num == 27) {
            return 'r';
        } else if (num == 28) {
            return 's';
        } else if (num == 29) {
            return 't';
        } else if (num == 30) {
            return 'u';
        } else if (num == 31) {
            return 'v';
        } else if (num == 32) {
            return 'w';
        } else if (num == 33) {
            return 'x';
        } else if (num == 34) {
            return 'y';
        } else if (num == 35) {
            return 'z';
        } else {
            return 'X';
        }
    }

}
