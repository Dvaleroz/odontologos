package vista_Agenda;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class Vista_Agenda extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textFieldOdontologo;
    private JTextField textFieldCodigoCita;
    private JComboBox<String> comboBoxMes;
    private JComboBox<String> comboBoxDia;
    private JComboBox<String> comboBoxHora;
    private JButton btnAgregar;
    private JButton btnEliminar;
    private JLabel lblNewLabel;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Vista_Agenda frame = new Vista_Agenda();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Vista_Agenda() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblOdontologo = new JLabel("Odontologo");
        lblOdontologo.setBounds(10, 10, 70, 26);
        contentPane.add(lblOdontologo);
        
        textFieldOdontologo = new JTextField();
        textFieldOdontologo.setBounds(90, 10, 96, 19);
        contentPane.add(textFieldOdontologo);
        textFieldOdontologo.setColumns(10);
        
        JLabel lblMes = new JLabel("Mes");
        lblMes.setBounds(10, 50, 70, 19);
        contentPane.add(lblMes);
        
        comboBoxMes = new JComboBox<>();
        comboBoxMes.setModel(new DefaultComboBoxModel<>(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
        comboBoxMes.setBounds(90, 50, 96, 20);
        contentPane.add(comboBoxMes);
        
        JLabel lblDia = new JLabel("Dia");
        lblDia.setBounds(200, 50, 40, 13);
        contentPane.add(lblDia);
        
        comboBoxDia = new JComboBox<>();
        comboBoxDia.setModel(new DefaultComboBoxModel<>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
        comboBoxDia.setBounds(240, 50, 60, 20);
        contentPane.add(comboBoxDia);
        
        JLabel lblHora = new JLabel("Hora");
        lblHora.setBounds(310, 50, 40, 13);
        contentPane.add(lblHora);
        
        comboBoxHora = new JComboBox<>();
        comboBoxHora.setModel(new DefaultComboBoxModel<>(new String[] {"7", "8", "9", "10", "11"}));
        comboBoxHora.setBounds(350, 50, 45, 20);
        contentPane.add(comboBoxHora);
        
        JLabel lblCodigoCita = new JLabel("Codigo Cita");
        lblCodigoCita.setBounds(10, 80, 70, 19);
        contentPane.add(lblCodigoCita);
        
        textFieldCodigoCita = new JTextField();
        textFieldCodigoCita.setBounds(90, 80, 96, 19);
        contentPane.add(textFieldCodigoCita);
        textFieldCodigoCita.setColumns(10);
        
        // Botones
        btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(10, 150, 100, 25);
        contentPane.add(btnAgregar);
        
        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(120, 150, 100, 25);
        contentPane.add(btnEliminar);
        
        lblNewLabel = new JLabel("am");
        lblNewLabel.setBounds(401, 53, 45, 13);
        contentPane.add(lblNewLabel);
    }

    // Métodos para obtener los valores de los campos
    public String getOdontologo() {
        return textFieldOdontologo.getText();
    }

    public String getMes() {
        return (String) comboBoxMes.getSelectedItem();
    }

    public String getDia() {
        return (String) comboBoxDia.getSelectedItem();
    }

    public String getHora() {
        return (String) comboBoxHora.getSelectedItem();
    }

    public String getCodigoCita() {
        return textFieldCodigoCita.getText();
    }

    // Métodos para obtener los botones
    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }
}
