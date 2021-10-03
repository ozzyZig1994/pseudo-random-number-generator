package algoritmosimulacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author abraham
 */
public class congruencialMultiplicativo extends javax.swing.JFrame {

    double x0, k, g, a, m, xi, r;
    int i= 1;
    double periodo_vida;
    Object []fila= new Object[3];
    DefaultTableModel modelo;
    Funciones redondea= new Funciones();
    
    public congruencialMultiplicativo() {
        initComponents();
        this.setLocationRelativeTo(null);
        jTextField4.setEnabled(false);
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton5.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("SEMILLA (X0):");

        jLabel2.setText("VALOR DE K:");

        jLabel3.setText("VALOR DE G:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Iteracion", "Xi+1", "Ri+1"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton3.setText("Calcular");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cerrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setText("PROMEDIO DE VIDA MAXIMO:");

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Prueba uniformidad");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setText("Prueba independencia");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(51, 51, 51)
                                .addComponent(jButton4))
                            .addComponent(jButton5))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jButton1))
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        try {
            calculaNum_pseudoaleatorios();
        } catch (IOException ex) {
            Logger.getLogger(congruencialMultiplicativo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
        System.exit(0);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        for (int j = 0; j < jTable1.getRowCount(); j++) 
        {
           modelo.removeRow(j);
           j-=1;
        }
        
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        
        x0= 0;
        k= 0;
        g= 0;
        m= 0;
        a= 0;
        xi= 0;
        i= 0;
        r= 0;
        periodo_vida= 0;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
            prueba_uniformidad();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
        try {
            prueba_independencia();
        } catch (IOException ex) {
            Logger.getLogger(congruencialMultiplicativo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed
    
    void calculaNum_pseudoaleatorios() throws IOException
    {
        String num;
        modelo=(DefaultTableModel) jTable1.getModel();
        BufferedWriter numeros = new BufferedWriter(new FileWriter("src/algoritmosimulacion/numeros", true));
        
        x0= Double.parseDouble(jTextField1.getText());
        k= Double.parseDouble(jTextField2.getText());
        g= Double.parseDouble(jTextField3.getText());
        
        m= Math.pow(2, g);
        a= 5 + 8 * k;
        periodo_vida= Math.pow(2, (g - 2));
        
        jTextField4.setText(""+(int)(periodo_vida));
        
        if((x0 % 1 == 0) && (x0 % 2 != 0) && (x0 > 0) && (g % 1 == 0) && (g > 0 && (k > 0) && (k % 1 == 0)))
        {
            do
            {
                xi= (a * x0) % m;
                r= redondea.redondeaNumero(xi / (m - 1));
                
                fila[0]= (int)(i);
                fila[1]= (int)(xi);
                fila[2]= r;
                num= ""+r;
                numeros.write(num);
                numeros.newLine();
                x0= xi;
                i++;
                
                modelo.addRow(fila);
                jTable1.setModel(modelo);
                
            }while(i <= periodo_vida);
          numeros.close();
          jButton1.setEnabled(true);
          jButton2.setEnabled(true);
          jButton5.setEnabled(true);
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Has tecleado valores incorrectos para realizar el calculo"
                    + ", enseguida se borrarán los campos incorrectos e intentalo de nuevo");
            if((x0 % 1 != 0) || (x0 % 2 == 0) || (x0 < 0))
                jTextField1.setText("");
            else
                if((g % 1 != 0) || (g < 0))
                    jTextField3.setText("");
            else
                    if(k < 0 || (k % 1 != 0))
                        jTextField2.setText("");
        }
    }
    
    void prueba_uniformidad() 
    {
        double num_intervalos, ancho_clase, cont= 0, sumatoria= 0, X2, probabilidad;
        int Ei, j, k, l;
        
        num_intervalos= (int)redondea.redondeaNumero(Math.sqrt(periodo_vida));
        ancho_clase= redondea.redondeaNumero(1 / num_intervalos);
        Ei= (int)(periodo_vida /  num_intervalos);
        double intervalos[]= new double[(int)num_intervalos+1];
        int Oi[]= new int[(int)num_intervalos];
        double Xo2[]= new double[(int)num_intervalos];
        
        JOptionPane.showMessageDialog(null, "Numero de intervalos: " + num_intervalos + "\nAncho de clase: " + 
                ancho_clase + "\nFrecuencia esperada: " + Ei);
        
        for(j= 0; j < (int)num_intervalos+1; j++)
        {
            intervalos[j]= redondea.redondeaNumero(cont);
            cont+= ancho_clase;
            System.out.println(""+intervalos[j]);
        }
        
        for(k= 0;k < (int)num_intervalos; k++)
            Oi[k]= Integer.parseInt(JOptionPane.showInputDialog("Cantidad de numeros en el intervalo de:\n"+ intervalos[k] +
                    " a " + intervalos[k+1]));
        
        for(l= 0; l < (int)num_intervalos; l++)
            Xo2[l]= (Math.pow((Ei - Oi[l]), 2))/Ei;
        
        for(j= 0; j < (int)num_intervalos; j++)
            sumatoria+= Xo2[j];
        
        probabilidad= Double.parseDouble(JOptionPane.showInputDialog("Ingresa probabilidad"));
        X2= Double.parseDouble(JOptionPane.showInputDialog("Ingresa valor en tablas para una chi cuadrada de "+probabilidad+
                " con "+num_intervalos+" grados de libertad"));
        
        if(X2 < sumatoria)
            JOptionPane.showMessageDialog(rootPane, "Los numeros pseudoaleatorios no son uniformes");
        else
            JOptionPane.showMessageDialog(rootPane, "Los numeros pseudoaleatorios estan distribuidos uniformemente");
        
    }
    
    void prueba_independencia() throws FileNotFoundException, IOException
    {
        BufferedReader br = null;
        double media, varianza, desviacion, probabilidad, Zo, Z2;
        int c= 0, h= 0, a= 0, no_corridas= 0;
        double n[]= new double[(int)periodo_vida];
        String Linea;
        String Linea2[];
        br = new BufferedReader(new FileReader("src/algoritmosimulacion/numeros"));
        Linea= br.readLine();
        while(Linea != null)
        {
            Linea2= Linea.split("\t\t\t");
            n[c]= Double.parseDouble(Linea2[0]);
            Linea= br.readLine();
            c++;
        }
        
        BufferedWriter corridas = new BufferedWriter(new FileWriter("src/algoritmosimulacion/corridas", true));
        while(a < n.length-1)
        {
            if(n[a+1] > n[a])
            {
                corridas.write("1");
                corridas.newLine();
            }
            else
            {
                corridas.write("0");
                corridas.newLine();
            }
            a++;
        }
        corridas.close();
        
        br = new BufferedReader(new FileReader("src/algoritmosimulacion/corridas"));
        int s[]= new int[a];
        Linea= br.readLine();
        while(Linea != null)
        {
            Linea2= Linea.split("\t\t\t");
            s[h]= Integer.parseInt(Linea2[0]);
            h++;
            Linea= br.readLine();
        }
        br.close();
        
        for(h= 0; h < s.length-1; h++)
            if(s[h] == s[h+1])
                no_corridas++;
            else
                no_corridas++;
        
        media= ((2 * i) - 1) / 3;
        varianza= ((16 * i) - 29) / 90;
        desviacion= Math.sqrt(Math.pow(varianza, 2));
        Zo= Math.abs((no_corridas - media) / desviacion);
        
        probabilidad= Double.parseDouble(JOptionPane.showInputDialog("Ingresa probabilidad"));
        Z2= Double.parseDouble(JOptionPane.showInputDialog("Ingresa valor de Z en "+probabilidad));
        
       if(Zo > Z2)
           JOptionPane.showMessageDialog(rootPane, "Los numeros pseudoaleatorios no son independientes");
       else
           JOptionPane.showMessageDialog(rootPane, "Los numeros pseudoaleatorios son independientes");
    }
    
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
            java.util.logging.Logger.getLogger(congruencialMultiplicativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(congruencialMultiplicativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(congruencialMultiplicativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(congruencialMultiplicativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new congruencialMultiplicativo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
