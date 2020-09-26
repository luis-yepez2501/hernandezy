package tarea3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class fibonacci extends JFrame {

	private JPanel contentPane;
	private JTextField txtnum1;
	private JTextField txtnum2;
	private JTextField txtIteraciones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fibonacci frame = new fibonacci();
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
	public fibonacci() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numero 1");
		lblNewLabel.setBounds(10, 41, 81, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Numero 2");
		lblNewLabel_1.setBounds(10, 66, 81, 14);
		contentPane.add(lblNewLabel_1);
		
		txtnum1 = new JTextField();
		txtnum1.setBounds(101, 38, 52, 20);
		contentPane.add(txtnum1);
		txtnum1.setColumns(10);
		
		txtnum2 = new JTextField();
		txtnum2.setBounds(101, 63, 52, 20);
		contentPane.add(txtnum2);
		txtnum2.setColumns(10);
		
		JList list = new JList();
		DefaultListModel Numeros = new DefaultListModel();
		list.setBounds(168, 66, 256, 184);
		contentPane.add(list);
		
		JButton btnNewButton = new JButton("Calcular Funcion");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1;
				int num2;
				int num3;
				int itera;
				int cont=0;
				
				num1 = Integer.parseInt(txtnum1.getText());
				num2 = Integer.parseInt(txtnum2.getText());		
				itera = Integer.parseInt(txtIteraciones.getText());
				
				do
				{
					num3 = num1 +num2;
					Numeros.addElement("interacion "+cont+"  "+" "+num3);
					num1 = num2;
					num2 = num3;
					cont +=1;
				}while(cont<itera);
				list.setModel(Numeros);			
			}
		});
		btnNewButton.setBounds(10, 112, 142, 23);
		contentPane.add(btnNewButton);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("Iteraciones");
		lblNewLabel_3.setBounds(170, 41, 74, 14);
		contentPane.add(lblNewLabel_3);
		txtIteraciones = new JTextField();
		txtIteraciones.setBounds(254, 38, 46, 20);
		contentPane.add(txtIteraciones);
		txtIteraciones.setColumns(10);
	}

	
}
