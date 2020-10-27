package PPuzzle;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class NPuzzle1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					NPuzzle1 frame = new NPuzzle1();
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
	public NPuzzle1() {
		setTitle("Puzzle Game> Luis Francisco Hernandez Yepez");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 3, 0, 0));
JButton btn7 = new JButton("7");
		JButton btn4 = new JButton("4");
		JButton btn8 = new JButton("8");
		JButton btn6 = new JButton("6");
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn9 = new JButton("9");
		JButton btn5 = new JButton("5");
		
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn8.isVisible()==false) {
					btn8.setText(btn7.getText());
					btn8.setIcon(btn7.getIcon());
					btn7.setVisible(false);
					btn8.setVisible(true);
				}
				if(btn4.isVisible()==false) {
					btn4.setText(btn7.getText());
					btn4.setIcon(btn7.getIcon());
					btn7.setVisible(false);
					btn4.setVisible(true);
				}
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn7.isVisible()==false) {
					btn7.setText(btn4.getText());
					btn7.setIcon(btn4.getIcon());
					btn4.setVisible(false);
					btn7.setVisible(true);
				}
				if(btn1.isVisible()==false) {
					btn1.setText(btn4.getText());
					btn1.setIcon(btn4.getIcon());
					btn4.setVisible(false);
					btn1.setVisible(true);
				}
				if(btn5.isVisible()==false) {
					btn5.setText(btn4.getText());
					btn5.setIcon(btn4.getIcon());
					btn4.setVisible(false);
					btn5.setVisible(true);
				}
				
			}
		});
		
		
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn4.isVisible()==false) {
					btn4.setText(btn1.getText());
					btn4.setIcon(btn1.getIcon());
					btn1.setVisible(false);
					btn4.setVisible(true);
				}
				if(btn2.isVisible()==false) {
					btn2.setText(btn2.getText());
					btn2.setIcon(btn2.getIcon());
					btn1.setVisible(false);
					btn2.setVisible(true);
				}
			}
		});
		contentPane.add(btn1);
		
		
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn1.isVisible()==false) {
					btn1.setText(btn2.getText());
					btn1.setIcon(btn2.getIcon());
					btn2.setVisible(false);
					btn1.setVisible(true);
				}
				if(btn3.isVisible()==false) {
					btn3.setText(btn2.getText());
					btn3.setIcon(btn2.getIcon());
					btn2.setVisible(false);
					btn3.setVisible(true);
				}
				if(btn5.isVisible()==false) {
					btn5.setText(btn2.getText());
					btn5.setIcon(btn2.getIcon());
					btn2.setVisible(false);
					btn5.setVisible(true);
				}
			}
		});
		
		
		contentPane.add(btn2);
		
		
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn2.isVisible()==false) {
					btn2.setText(btn3.getText());
					btn2.setIcon(btn3.getIcon());
					btn3.setVisible(false);
					btn2.setVisible(true);
				}
				if(btn6.isVisible()==false) {
					btn6.setText(btn3.getText());
					btn6.setIcon(btn3.getIcon());
					btn3.setVisible(false);
					btn6.setVisible(true);
				}
			}
		});
		contentPane.add(btn3);
		
		
		contentPane.add(btn4);
		
		
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn8.isVisible()==false) {
					btn8.setText(btn5.getText());
					btn8.setIcon(btn5.getIcon());
					btn5.setVisible(false);
					btn8.setVisible(true);
				}
				if(btn6.isVisible()==false) {
					btn6.setText(btn5.getText());
					btn6.setIcon(btn5.getIcon());
					btn5.setVisible(false);
					btn6.setVisible(true);
				}
				if(btn4.isVisible()==false) {
					btn4.setText(btn5.getText());
					btn4.setIcon(btn5.getIcon());
					btn5.setVisible(false);
					btn4.setVisible(true);
				}
				if(btn2.isVisible()==false) {
					btn2.setText(btn5.getText());
					btn2.setIcon(btn5.getIcon());
					btn5.setVisible(false);
					btn2.setVisible(true);
				}
			}
		});
		
		
		contentPane.add(btn5);
		
		
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn9.isVisible()==false) {
					btn9.setText(btn6.getText());
					btn9.setIcon(btn6.getIcon());
					btn6.setVisible(false);
					btn9.setVisible(true);
				}
				if(btn3.isVisible()==false) {
					btn3.setText(btn6.getText());
					btn3.setIcon(btn6.getIcon());
					btn6.setVisible(false);
					btn3.setVisible(true);
				}
				if(btn5.isVisible()==false) {
					btn5.setText(btn6.getText());
					btn5.setIcon(btn6.getIcon());
					btn6.setVisible(false);
					btn5.setVisible(true);
				}
			}
		});
		contentPane.add(btn6);
		
		
		contentPane.add(btn7);
		
		
		
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn6.isVisible()==false) {
					btn6.setText(btn9.getText());
					btn6.setIcon(btn9.getIcon());
					btn9.setVisible(false);
					btn6.setVisible(true);
				}
				if(btn8.isVisible()==false) {
					btn8.setText(btn9.getText());
					btn8.setIcon(btn9.getIcon());
					btn9.setVisible(false);
					btn8.setVisible(true);
				}
			}
		});
		
		
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn9.isVisible()==false) {
					btn9.setText(btn8.getText());
					btn9.setIcon(btn8.getIcon());
					btn8.setVisible(false);
					btn9.setVisible(true);
				}
				if(btn7.isVisible()==false) {
					btn7.setText(btn8.getText());
					btn7.setIcon(btn8.getIcon());
					btn8.setVisible(false);
					btn7.setVisible(true);
				}
				if(btn5.isVisible()==false) {
					btn5.setText(btn8.getText());
					btn5.setIcon(btn8.getIcon());
					btn8.setVisible(false);
					btn5.setVisible(true);
				}
			}
		});
		
		
		contentPane.add(btn8);
		
		
		contentPane.add(btn9);
		btn9.setVisible(false);
	}
}
