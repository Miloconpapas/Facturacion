import javax.swing.*;

public class Registro {

    private JPanel PanelRegistro;

    public void setVisible(boolean b) {  //Esto es para que se conecte al otro form y sea visible
        JFrame frame = new JFrame("Registro");
        frame.setContentPane(new Registro().PanelRegistro);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
