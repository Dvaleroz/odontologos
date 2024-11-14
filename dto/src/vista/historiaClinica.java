package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToggleButton;

public class historiaClinica extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					historiaClinica frame = new historiaClinica();
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
	public historiaClinica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(137, 11, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("numero consecutivo");
		lblNewLabel.setBounds(25, 14, 102, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("odontologo");
		lblNewLabel_1.setBounds(233, 14, 62, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"odontologo1", "odontologo2", "odontologo3", "odontologo4"}));
		comboBox.setBounds(305, 10, 99, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Auxiliar odontologo");
		lblNewLabel_2.setBounds(10, 46, 94, 14);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"auxiliar1", "auxiliar2", "auxiliar3"}));
		comboBox_1.setBounds(114, 42, 74, 22);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_3 = new JLabel("Paciente");
		lblNewLabel_3.setBounds(236, 46, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(307, 43, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Fecha apertura");
		lblNewLabel_4.setBounds(20, 75, 84, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("antecedentes");
		lblNewLabel_5.setBounds(236, 71, 74, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("evaluacion");
		lblNewLabel_6.setBounds(10, 100, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		textField_2 = new JTextField();
		textField_2.setBounds(102, 97, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(318, 96, 86, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_6_1 = new JLabel("observaciones");
		lblNewLabel_6_1.setBounds(226, 99, 46, 14);
		contentPane.add(lblNewLabel_6_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(102, 130, 86, 20);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_6_2 = new JLabel("ocupacion Paciente");
		lblNewLabel_6_2.setBounds(10, 133, 46, 14);
		contentPane.add(lblNewLabel_6_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(318, 130, 86, 20);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_6_3 = new JLabel("acompañante");
		lblNewLabel_6_3.setBounds(226, 133, 46, 14);
		contentPane.add(lblNewLabel_6_3);
		
		JLabel lblNewLabel_7 = new JLabel("telefono acompañante");
		lblNewLabel_7.setBounds(10, 158, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(102, 161, 86, 20);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_7_1 = new JLabel("direccion acompañante");
		lblNewLabel_7_1.setBounds(226, 158, 46, 14);
		contentPane.add(lblNewLabel_7_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(318, 155, 86, 20);
		contentPane.add(textField_7);
	}
}
