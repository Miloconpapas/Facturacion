import javax.swing.*;

public class Usuarios {
    private JPanel panelUsuarios;
    private JList<String> listaUsuarios;

    private DefaultListModel<String> usuariosModel;
    private JPanel panel1;
    private JList list1;

    public Usuarios() {
        usuariosModel = new DefaultListModel<>();
        listaUsuarios.setModel(usuariosModel);
    }

    public void addUsuario(String[] datos) {
        StringBuilder usuario = new StringBuilder();
        for (String dato : datos) {
            if (!dato.isEmpty()) {
                usuario.append(dato).append(" | ");
            }
        }

        usuariosModel.addElement(usuario.toString());
    }

    public void setVisible(boolean b) {
        JFrame frame = new JFrame("Usuarios");
        frame.setContentPane(panelUsuarios);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
