import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Ventana extends javax.swing.JFrame {
  public Ventana() {
    initComponents();

        ImageIcon imagen = new ImageIcon("src/Imagenes/TeatroMunicipal.jpg");
        Image imagenEscalada = imagen.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH);
        jLabel2.setIcon(new ImageIcon(imagenEscalada));
    }
  @SuppressWarnings("unchecked")
  private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if (jCheckBox1.isSelected()) {
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jTextField2.setEnabled(false);
        }
    }
  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try {
            int numero = Integer.parseInt(jTextField1.getText());
            int dias = jTextField2.isEnabled() && !jTextField2.getText().isEmpty()
                    ? Integer.parseInt(jTextField2.getText()) : 0;

            Boleto boleto = null;

            if (jCheckBox1.isSelected()) {
                boleto = new Palco(numero);
            } else if (jCheckBox2.isSelected()) {
                boleto = new Platea(numero, dias);
            } else if (jCheckBox3.isSelected()) {
                boleto = new Galeria(numero, dias);
            } else {
                jLabel5.setText("<html><center>Seleccione un tipo de boleto</center></html>");
                return;
            }

            jLabel5.setText("<html><center>" + boleto.toString().replace("\n", "<br>") + "</center></html>");

        } catch (NumberFormatException e) {
            jLabel5.setText("<html><center>Error: Ingrese valores numéricos válidos</center></html>");
        }
    }
    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if (jCheckBox2.isSelected()) {
            jCheckBox1.setSelected(false);
            jCheckBox3.setSelected(false);
            jTextField2.setEnabled(true);
        }
    }
  private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if (jCheckBox3.isSelected()) {
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
            jTextField2.setEnabled(true);
        }
    }
  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int respuesta = JOptionPane.showConfirmDialog(
                this,
                "¿Está seguro que desea salir?",
                "Confirmar salida",
                JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }  
public static void main(String args[]) {
  java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
}
