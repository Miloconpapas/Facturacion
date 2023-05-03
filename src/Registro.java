import javax.swing.*;

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
    private JComboBox <String> comboBox1;
    private JButton confirmarButton;
    private JLabel PRUEBA;

    public void setVisible(boolean b) {  //Esto es para que se conecte al otro form y sea visible
        JFrame frame = new JFrame("Registro");
        frame.setContentPane(new Registro().PanelRegistro);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
