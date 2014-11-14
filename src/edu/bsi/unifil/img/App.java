package edu.bsi.unifil.img;

import java.awt.Cursor;
import javax.swing.ImageIcon;

public class App extends javax.swing.JFrame {

    private Core imagem;
    
    public App() {
        initComponents();
        this.setTitle("BSI . 4 ano . 4 . bi");
        this.setResizable(false);
        this.setAlwaysOnTop(true);
        this.setAutoRequestFocus(true);
        this.imagem = new Core();
    }
    
    private void loadCursor()
    {
        Cursor cursor = new Cursor(Cursor.WAIT_CURSOR);
        setCursor(cursor);
    }
    
    private void normalCursor()
    {
        Cursor cursor = new Cursor(Cursor.DEFAULT_CURSOR);
        setCursor(cursor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btPanel = new javax.swing.JPanel();
        btHistograma = new javax.swing.JButton();
        btMedia = new javax.swing.JButton();
        btMediana = new javax.swing.JButton();
        btSobel = new javax.swing.JButton();
        imgPanel = new javax.swing.JPanel();
        imgShow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btHistograma.setText("Histograma");
        btHistograma.setEnabled(false);
        btHistograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHistogramaActionPerformed(evt);
            }
        });

        btMedia.setText("Média");
        btMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMediaActionPerformed(evt);
            }
        });

        btMediana.setText("Mediana");
        btMediana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMedianaActionPerformed(evt);
            }
        });

        btSobel.setText("Sobel");
        btSobel.setEnabled(false);

        javax.swing.GroupLayout btPanelLayout = new javax.swing.GroupLayout(btPanel);
        btPanel.setLayout(btPanelLayout);
        btPanelLayout.setHorizontalGroup(
            btPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btHistograma, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btMediana, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSobel, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addContainerGap())
        );
        btPanelLayout.setVerticalGroup(
            btPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btMedia, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(btHistograma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSobel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btMediana, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout imgPanelLayout = new javax.swing.GroupLayout(imgPanel);
        imgPanel.setLayout(imgPanelLayout);
        imgPanelLayout.setHorizontalGroup(
            imgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgShow)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        imgPanelLayout.setVerticalGroup(
            imgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgShow)
                .addContainerGap(313, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(imgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btHistogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHistogramaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btHistogramaActionPerformed

    private void btMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMediaActionPerformed
        // TODO add your handling code here:
        this.loadCursor();
        this.imagem.loadImage("src/img/imagem2.jpg");
        this.imagem.media();
        try{
            ImageIcon icon = new ImageIcon("src/saida/media.jpg");
            this.setSize(580, icon.getIconHeight()+110);
            this.imgShow.setIcon(icon);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        this.normalCursor();
    }//GEN-LAST:event_btMediaActionPerformed

    private void btMedianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMedianaActionPerformed
        // TODO add your handling code here:
        this.loadCursor();
        this.imagem.loadImage("src/img/imagem2.jpg");
        this.imagem.mediana();
        try{
            ImageIcon icon = new ImageIcon("src/saida/mediana.jpg");
            this.setSize(580, icon.getIconHeight()+110);
            this.imgShow.setIcon(icon);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        this.normalCursor();
    }//GEN-LAST:event_btMedianaActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new App().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btHistograma;
    private javax.swing.JButton btMedia;
    private javax.swing.JButton btMediana;
    private javax.swing.JPanel btPanel;
    private javax.swing.JButton btSobel;
    private javax.swing.JPanel imgPanel;
    private javax.swing.JLabel imgShow;
    // End of variables declaration//GEN-END:variables
}
