package Presentacion;

import Negocio.ArbolMViasBusqueda;
import Negocio.Excepcion.ExcepcionOrdenArbolInvalido;
import Negocio.Palabra;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 */
public class Formulario extends javax.swing.JFrame {
    
    private ArbolMViasBusqueda<Palabra> arbol;
    private File words;
    private int cantDatos;
    private int orden;

    /**
     * Creates new form Formulario
     *
     * @throws java.io.FileNotFoundException
     */
    public Formulario() throws FileNotFoundException {
        initComponents();
        this.setTitle("Dictionary");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        this.orden = 3;
        this.words = new File("C:/Margarita/Proyecto ED2/ProyectoDictionaryIngles-Espanol/src/Datos/words.txt");
      try {
            this.arbol = new ArbolMViasBusqueda<>(this.orden);
        } catch (ExcepcionOrdenArbolInvalido ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.cantDatos = cargarDatosAlArbol();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        btnMore = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        lbSize = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setIconImages(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mas.png"))); // NOI18N
        btnMore.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoreActionPerformed(evt);
            }
        });
        getContentPane().add(btnMore, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 50, 60));

        txtOutput.setColumns(20);
        txtOutput.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        txtOutput.setForeground(new java.awt.Color(0, 153, 204));
        txtOutput.setRows(5);
        jScrollPane1.setViewportView(txtOutput);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 500, 120));

        lbSize.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        getContentPane().add(lbSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 40, 31));

        jLabel6.setBackground(new java.awt.Color(204, 0, 51));
        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DICCTIONARY");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 160, 30));

        jLabel7.setBackground(new java.awt.Color(204, 0, 51));
        jLabel7.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 51));
        jLabel7.setText("DICCIONARIO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 260, 70));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Resultado:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 130, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconDel.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconAdd.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconSea.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo5.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, 0, 860, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private int cargarDatosAlArbol() throws FileNotFoundException {
        
        int linea = 0;
        if (words.exists() && words.canRead()) {
            Scanner leerLinea = new Scanner(words);
            String lineaActual, word, traslate;
            while (leerLinea.hasNextLine()) {
                linea++;
                lineaActual = leerLinea.nextLine();
                word = lineaActual.substring(0, lineaActual.indexOf(":"));
                traslate = lineaActual.substring(lineaActual.indexOf(" ") + 1);
                Palabra palabraActual = new Palabra(word, traslate);
                this.arbol.insertar(palabraActual);
            }
            leerLinea.close();
        }
        return linea;
    }

    private int arbolEscogido() {
       
            return 2;
       
    }
    private void btnMoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoreActionPerformed
        if (arbolEscogido() > -1) {
        
            MasOpciones opcion = new MasOpciones(this, true);
            opcion.setVisible(true);
            int opcionEscogida = opcion.opcionEscogida;
            switch (opcionEscogida) {
                case 0:
                    this.arbol.vaciar();
                     {
                        try {
                            vaciar();
                        } catch (IOException ex) {
                            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                     this.cantDatos=0;
                    break;
                case 1:
                    this.arbol.recorridoEnInOrden();
                    txtOutput.setText(arbol.recorridoEnInOrden().toString());
                    break;
                case 2:
                    this.arbol.recorridoEnPreOrden();
                    txtOutput.setText(arbol.recorridoEnPreOrden().toString());
                    break;
                case 3:
                    this.arbol.recorridoEnPostOrden();
                    txtOutput.setText(arbol.recorridoEnPostOrden().toString());
                    break;
                case 4:
                    this.arbol.recorridoPorNiveles();
                    txtOutput.setText(arbol.recorridoPorNiveles().toString());
                    break;
                case 5:
                    txtOutput.setText(Integer.toString(this.arbol.nivel()));
                    break;
            }
           lbSize.setText(Integer.toString(this.cantDatos));
        } else { 
            JOptionPane.showMessageDialog(null, "Escoja un Arbol !", "Advertencia !", 2);
        }
    }//GEN-LAST:event_btnMoreActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
            String word = JOptionPane.showInputDialog("Palabra a buscar");
            word = word.toLowerCase();
            Palabra palabra = arbol.getDatoEnNodo(new Palabra(word, ""));
            if (palabra != null) {
                txtOutput.setText(palabra.getDefinition());
            } else {
                JOptionPane.showMessageDialog(null, "Palabra no encontrada");
            }             

    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
                if (arbolEscogido() > -1) {
            try {
                String word = JOptionPane.showInputDialog("Palabra: ");
                String traslate = JOptionPane.showInputDialog("Traduccion: ");
                word = word.toLowerCase();
                traslate.toLowerCase();
                boolean b = this.arbol.insertar(new Palabra(word, traslate));
                if (b) {
                    insertarAlFinalDelArchivo(word, traslate);
                    this.cantDatos++;
                     lbSize.setText(Integer.toString(this.cantDatos));
                    JOptionPane.showMessageDialog(null, "Palabra insertada correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Palabra ya existente");
                }
            } catch (IOException ex) {
                Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Escoja un Arbol !", "Advertencia !", 2);
        }

    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        String word = JOptionPane.showInputDialog("Ingrese la palabra a eliminar");
            boolean b = this.arbol.eliminar(new Palabra(word, ""));
            if (b) {
                JOptionPane.showMessageDialog(null, "Palabra eliminada correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "La palabra no existe");
            }
            List<Palabra> recorridoPorNiveles = this.arbol.recorridoPorNiveles();
            try {
                cargarAlArchivo(recorridoPorNiveles);
            } catch (IOException ex) {
                Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.cantDatos--;
             lbSize.setText(Integer.toString(this.cantDatos));
    }//GEN-LAST:event_jLabel2MouseClicked
    
    private void insertarAlFinalDelArchivo(String word, String traslate) throws IOException {
        if (words.exists() && words.canWrite()) {
            FileWriter lineaActual = new FileWriter(words, true);
            lineaActual.write("\n" + word + ": " + traslate);
            lineaActual.close();
        }
    }
    
    private void cargarAlArchivo(List<Palabra> recorridoPorNiveles) throws IOException {
        String nuevoContenidoDeArchivo = "";
        if (words.exists() && words.canWrite()) {
            for (int i = 0; i < recorridoPorNiveles.size(); i++) {
                nuevoContenidoDeArchivo = nuevoContenidoDeArchivo + recorridoPorNiveles.get(i).toString() + '\n';
            }
            nuevoContenidoDeArchivo = nuevoContenidoDeArchivo.substring(0, nuevoContenidoDeArchivo.length() - 1);
            FileWriter f = new FileWriter(words);
            f.write(nuevoContenidoDeArchivo);
            f.close();
        }
        
    }
    
    private void vaciar() throws IOException {
        FileWriter a = new FileWriter(words);
        a.write("");
        a.close();
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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Formulario().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnMore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbSize;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables

}
