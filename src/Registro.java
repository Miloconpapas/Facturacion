import javax.swing.*;
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
    private JComboBox <String> comboBox1;
    private JButton confirmarButton;
    private JLabel PRUEBA;

    public Registro(){
        List<String> ciudades = Arrays.asList("Adolfo Gonzales Chaves","Adrogué","Alberti","Alejandro Korn","América Arrecifes", "Avellaneda", "Ayacucho", "Azul", "Bahía Blanca", "Balcarce", "Banfield", "Baradero", "Batán", "Béccar", "Bella Vista", "Benavídez", "Benito Juárez", "Berazategui", "Bernal", "Bolívar", "Bosques", "Boulogne Sur Mer", "Bragado", "Brandsen", "Burzaco", "Campana", "Cañuelas", "Capilla del Señor", "Capitán Sarmiento","Carhué", "Carlos Casares", "Carlos Spegazzini", "Carlos Tejedor", "Carmen de Areco", "Carmen de Patagones", "Casbas", "Caseros", "Castelar", "Castelli", "Chacabuco", "Chivilcoy", "Claypole", "Colón", "Comandante Nicanor Otamendi", "Coronel Dorrego", "Coronel Pringles", "Coronel Suárez", "Coronel Vidal", "Daireaux", "Dock Sud");
        for (String ciudad : ciudades) {  // es más conveniente utilizar un bucle para agregar los elementos
            comboBox1.addItem(ciudad); // la lista de ciudades se almacena en una variable ciudades y se utiliza un
                                       // bucle for-each para iterar sobre cada elemento y agregarlo al JComboBox.
        }
    }



    public void setVisible(boolean b) {  //Esto es para que se conecte al otro form y sea visible
        JFrame frame = new JFrame("Registro");
        frame.setContentPane(new Registro().PanelRegistro);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
