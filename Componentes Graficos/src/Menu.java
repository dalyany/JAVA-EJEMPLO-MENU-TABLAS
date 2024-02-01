
import java.awt.Dimension;

public class Menu extends javax.swing.JFrame {

  
    public Menu() {
        initComponents();
        this.setSize(new Dimension(425, 350));
        this.setMinimumSize(new Dimension(200, 200));
        setLocationRelativeTo(null);

        this.mn_ICheckAutoguardado.setSelected(false);
        this.btnradio_menuModoDev.setSelected(false);
        this.btnradio_menuModoUuario.setSelected(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menubar_aplicacion = new javax.swing.JMenuBar();
        menuContextualArchivo = new javax.swing.JMenu();
        mnItemAbrir = new javax.swing.JMenuItem();
        mnItemCerrar = new javax.swing.JMenuItem();
        mnItemMoverU = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        btnradio_menuModoDev = new javax.swing.JRadioButtonMenuItem();
        btnradio_menuModoUuario = new javax.swing.JRadioButtonMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mn_ICheckAutoguardado = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 310, 260));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 280));

        menuContextualArchivo.setText("Archivo");

        mnItemAbrir.setText("Abrir");
        mnItemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemAbrirActionPerformed(evt);
            }
        });
        menuContextualArchivo.add(mnItemAbrir);

        mnItemCerrar.setText("Cerrar Carpeta");
        menuContextualArchivo.add(mnItemCerrar);

        mnItemMoverU.setText("Mover Unidad");
        menuContextualArchivo.add(mnItemMoverU);
        menuContextualArchivo.add(jSeparator1);

        btnradio_menuModoDev.setSelected(true);
        btnradio_menuModoDev.setText("Modo DEV");
        menuContextualArchivo.add(btnradio_menuModoDev);

        btnradio_menuModoUuario.setSelected(true);
        btnradio_menuModoUuario.setText("Modo Usuario");
        menuContextualArchivo.add(btnradio_menuModoUuario);
        menuContextualArchivo.add(jSeparator2);

        mn_ICheckAutoguardado.setSelected(true);
        mn_ICheckAutoguardado.setText("Autoguardado");
        mn_ICheckAutoguardado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_ICheckAutoguardadoActionPerformed(evt);
            }
        });
        menuContextualArchivo.add(mn_ICheckAutoguardado);

        menubar_aplicacion.add(menuContextualArchivo);

        jMenu2.setText("Opciones");
        menubar_aplicacion.add(jMenu2);

        setJMenuBar(menubar_aplicacion);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnItemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemAbrirActionPerformed
        
    }//GEN-LAST:event_mnItemAbrirActionPerformed

    private void mn_ICheckAutoguardadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_ICheckAutoguardadoActionPerformed
     //AQUI SE EJECUTA TODO METODO MIENTRAS LA ACCION DEL CHECK O SELECCION ESTÉ ACTIVADO , CASO CONTRARIO
     //NO HARÁ NADA
    }//GEN-LAST:event_mn_ICheckAutoguardadoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButtonMenuItem btnradio_menuModoDev;
    private javax.swing.JRadioButtonMenuItem btnradio_menuModoUuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu menuContextualArchivo;
    private javax.swing.JMenuBar menubar_aplicacion;
    private javax.swing.JMenuItem mnItemAbrir;
    private javax.swing.JMenuItem mnItemCerrar;
    private javax.swing.JMenuItem mnItemMoverU;
    private javax.swing.JCheckBoxMenuItem mn_ICheckAutoguardado;
    // End of variables declaration//GEN-END:variables
}
