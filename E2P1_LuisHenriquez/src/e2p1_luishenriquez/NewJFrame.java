package e2p1_luishenriquez;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.util.Random;
//import Scanner
import java.util.Scanner;

public class NewJFrame extends javax.swing.JFrame {

    public String residuo;
    public int div;
    public int res;
    public int base;
    public int num;
    static Scanner leer = new Scanner(System.in);
    static public List<Numero> numeros = new ArrayList<>();

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
        return (ArrayList) numeros;
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

    public NewJFrame(int base, int num) {
        this.base = base;
        this.num = num;
    }

    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 51, 51));

        jButton1.setText("Numeros");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Operaciones");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Examen ll");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel1)))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Scanner leer = new Scanner(System.in);

        int numero;
        int bas;
        Numero help;

        boolean OPC = false;
        int opc = 0;

        while (OPC == false) {
            System.out.println("1.Agregar numero");
            System.out.println("2.Eliminar Numero");

            opc = leer.nextInt();

            if (opc == 1 || opc == 2) {
                OPC = true;
            }
        }
        switch (opc) {

            case 1:
                System.out.println("Ingrese el numero: ");
                numero = leer.nextInt();
                System.out.println("Ingrese la base: ");
                bas = leer.nextInt();
                while (bas < 2 || bas > 35) {
                    System.out.println("LA BASE TIENE QUE SER MAYOR QUE 2 Y MENOR QUE 35");
                    System.out.println("Ingrese la base: ");
                    bas = leer.nextInt();
                }
                System.out.println("NO PUDE HACER QUE DIERA LOS VALORES CORRECTOS, NO LE ENTENDI");
                help = new Numero(bas, numero);
                String residuo = help.decToBase(bas, numero);
                numeros.add(help);
                break;

            case 2:
                Numero ayuda = new Numero();
                ayuda.eliminar();
                break;

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Scanner leer = new Scanner(System.in);

        System.out.println(" SELECCIONE");

        for (int i = 0; i < numeros.size(); i++) {
            Numero num = numeros.get(i);
            String bas = "BASE " + num.getBase();
            String resultado = num.decToBase(num.getBase(), num.getNum());
            System.out.println((i + 1) + ". " + num.getNum() + "__ " + bas + "__" + resultado);
        }

        System.out.println("PRIMERO");
        int N1 = leer.nextInt();

        System.out.println("Seleccione el segundo número:");
        int N2 = leer.nextInt();

        Numero num1 = numeros.get(N1 - 1);
        Numero num2 = numeros.get(N2 - 1);

        System.out.println("Seleccione");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
   
        int seleccionar = leer.nextInt();
        while (seleccionar < 1 || seleccionar > 4) {
            System.out.println("Seleccione");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            seleccionar = leer.nextInt();

            Numero help = new Numero();
            switch (seleccionar) {
                case 1:
                    int suma = num1.getNum() + num2.getNum();
                    System.out.println("SUMA");
                    System.out.println("Resultado : " + suma);
                    break;
                case 2:
                    int resta = num1.getNum() - num2.getNum();
                    System.out.println("RESTA");
                    System.out.println("Resultado: " + resta);
                    break;
                case 3:
                    int multiplicacion = num1.getNum() * num2.getNum();
                    System.out.println("MULTIPLICACION");
                    System.out.println("Resultado : " + multiplicacion);
                    break;

            }

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
