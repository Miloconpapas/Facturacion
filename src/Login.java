import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Login {
    private JButton OKButton;
    private JTextField textField1;
    private JPanel panelLogin;
    private JPasswordField passwordField1;
    private JButton BotonRegistro;
    private JLabel iconoJlabel;

    public Login() {
        // ACCION DEL BOTON PARA INGRESAR LOS DATOS
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a, b;
                a = textField1.getText();
                b = passwordField1.getText();
                if (a.equals("") && b.equals("")) {
                    Stock stk = new Stock();
                    stk.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña incorrectos");
                }
            }
        });
        // LINEAS PARA QUE LA TECLA ENTER HAGA FOCUS EN EL OKBUTTON Y LO CLICKEE
        passwordField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
                    OKButton.requestFocus();
                    OKButton.doClick();
                }
            }
        });
        textField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
                    passwordField1.requestFocus();
                }
            }
        });
        BotonRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { // Esto es para que se conecte al otro form y sea visible
                Registro RE = new Registro();
                RE.setVisible(true);
            }
        });
    }

    public void redimensionarIcono() {
        // Obtener el icono actual del JLabel
        ImageIcon iconoActual = (ImageIcon) iconoJlabel.getIcon();

        // Obtener la imagen del icono
        Image imagenOriginal = iconoActual.getImage();

        // Definir las nuevas dimensiones deseadas
        int nuevoAncho = 100;
        int nuevoAlto = 100;

        // Redimensionar la imagen del icono
        Image imagenRedimensionada = imagenOriginal.getScaledInstance(nuevoAncho, nuevoAlto, Image.SCALE_SMOOTH);

        // Crear un nuevo ImageIcon con la imagen redimensionada
        ImageIcon iconoRedimensionado = new ImageIcon(imagenRedimensionada);

        // Establecer el nuevo icono en el JLabel
        iconoJlabel.setIcon(iconoRedimensionado);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Login login = new Login();
                JFrame frame = new JFrame("Login");
                frame.setContentPane(login.panelLogin);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);

                // Llamar al método para redimensionar el icono
                login.redimensionarIcono();
            }
        });
    }
}
