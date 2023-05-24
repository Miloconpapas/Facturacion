import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;


public class Registro {

    private JPanel PanelRegistro;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JPasswordField passwordField1;
    private JCheckBox empleadoCheckBox;
    private JCheckBox proovedorCheckBox;
    private JCheckBox clienteCheckBox;
    private JComboBox<String> comboBox1;
    private JButton confirmarButton;
    private JLabel PRUEBA;
    private JLabel Tarjetita;

    public Registro() {
        List<String> ciudades = Arrays.asList("Adolfo Gonzales Chaves", "Adrogué", "Alberti", "Alejandro Korn", "América Arrecifes", "Avellaneda", "Ayacucho", "Azul", "Bahía Blanca", "Balcarce", "Banfield", "Baradero", "Batán", "Béccar", "Bella Vista", "Benavídez", "Benito Juárez", "Berazategui", "Bernal", "Bolívar", "Bosques", "Boulogne Sur Mer", "Bragado", "Brandsen", "Burzaco", "Campana", "Cañuelas", "Capilla del Señor", "Capitán Sarmiento", "Carhué", "Carlos Casares", "Carlos Spegazzini", "Carlos Tejedor", "Carmen de Areco", "Carmen de Patagones", "Casbas", "Caseros", "Castelar", "Castelli", "Chacabuco", "Chivilcoy", "Claypole", "Colón", "Comandante Nicanor Otamendi", "Coronel Dorrego", "Coronel Pringles", "Coronel Suárez", "Coronel Vidal", "Daireaux", "Dock Sud");
        for (String ciudad : ciudades) {
            comboBox1.addItem(ciudad);
        }
        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    String[] datos = {
                            textField1.getText(),
                            textField2.getText(),
                            textField4.getText(),
                            textField5.getText(),
                            textField6.getText(),
                            new String(passwordField1.getPassword()),
                            empleadoCheckBox.isSelected() ? "Empleado" : "",
                            proovedorCheckBox.isSelected() ? "Proveedor" : "",
                            clienteCheckBox.isSelected() ? "Cliente" : "",
                            comboBox1.getSelectedItem().toString(),
                            Tarjetita.getText()
                    };

                    Usuarios usuarios = new Usuarios();
                    usuarios.addUsuario(datos);
                    usuarios.setVisible(true);
                }

        });
    }

    public void redimensionarIcono() {
        // Obtener el icono actual del JLabel
        Icon iconoActual = Tarjetita.getIcon();

        if (iconoActual instanceof ImageIcon) {
            // Obtener la imagen del icono
            Image imagenOriginal = ((ImageIcon) iconoActual).getImage();

            // Definir las nuevas dimensiones deseadas
            int nuevoAncho = 100;
            int nuevoAlto = 100;

            // Redimensionar la imagen del icono
            Image imagenRedimensionada = imagenOriginal.getScaledInstance(nuevoAncho, nuevoAlto, Image.SCALE_SMOOTH);

            // Crear un nuevo ImageIcon con la imagen redimensionada
            ImageIcon iconoRedimensionado = new ImageIcon(imagenRedimensionada);

            // Establecer el nuevo icono en el JLabel
            Tarjetita.setIcon(iconoRedimensionado);
        }
    }

    public void setVisible(boolean b) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Registro");
                frame.setContentPane(PanelRegistro);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);

                // Llamar al método para redimensionar el icono
                redimensionarIcono();
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Registro registro = new Registro();
                registro.setVisible(true);
            }
        });
    }
}
