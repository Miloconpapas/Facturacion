import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class facturacion {
    private JPanel panelFacturas;
    private JPanel panelFacturacion2;
    private JButton stockButton;
    private JButton proveedoresButton;
    private JButton clientesButton1;
    private JButton agregarButton;
    private JButton modificarButton;
    private JTextField productotextField1;
    private JTextField CantidadtextField2;
    private JTextField PreciotextField3;
    private JTextField DescuentotextField4;
    private JTable table1;
    private JButton empleadosButton;
    private JButton eliminarButton;
    private JButton facturarButton;
    private JLabel TotalLabel;
    private JLabel Subtotal;
    private JLabel DescAplicadotextField;

    public facturacion() {
        // boton agregar PARTE1
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Producto");
        tbl.addColumn("cantidad");
        tbl.addColumn("Precio");
        tbl.addColumn("Descuento Aplicado");
        tbl.addColumn("Total");
        table1.setModel(tbl); // establecer el modelo de la tabla

        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        agregarButton.addActionListener(new ActionListener() {
            @Override // boton agregar PARTE2
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel tbl = (DefaultTableModel) table1.getModel();
                Object[] fila = new Object[5];
                fila[0] = productotextField1.getText();
                fila[1] = CantidadtextField2.getText();
                fila[2] = PreciotextField3. getText();
                fila[3] = DescuentotextField4.getText();
                fila[4] = TotalLabel.getText();
                tbl.addRow(fila);
            }
        });
        facturarButton.addActionListener(new ActionListener() {
            @Override // boton facturar
            public void actionPerformed(ActionEvent e) {
                Calculo CA = new Calculo(); //CA es mi Constructor (Creo que se decia asi)
                String a,b,d;
                a=PreciotextField3.getText();
                b=CantidadtextField2.getText();
                d=DescuentotextField4.getText();
                Double.parseDouble(a);
                Double.parseDouble(b);
                CA.Ina(a);      //instancio la funcion Ina de la clase calculo.java
                CA.Inb(b);      //instancio la funcion Inb de la clase calculo.java
                CA.Calcular(); //instancio la funcion calcular de la clase calculo.java
                String gg;
                gg=String.valueOf(CA.Calcular()); //igualo gg a la funcion calcular en la clase calculo.java
                Subtotal.setText(gg); //hago que se muestre gg en el j label subtotal.

                Double.parseDouble(d);
                CA.InDesc(d);
                String dd;
                dd=String.valueOf(CA.Descuento());//igualo dd a la funcion Descuento en la clase calculo.java
                DescAplicadotextField.setText(dd); //hago que se muestre gg en el j label Descuento

                CA.Total();
                String tt;
                tt=String.valueOf(CA.Total());
                TotalLabel.setText(tt);


            }
        });
    }

    public void setVisible(boolean b) {
        JFrame frame = new JFrame("Facturacion  ");
        frame.setContentPane(new facturacion().panelFacturas);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
