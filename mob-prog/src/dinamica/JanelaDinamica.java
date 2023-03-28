package dinamica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaDinamica extends JFrame {

	private JPanel contentPane;
	private JTextField textAno;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaDinamica frame = new JanelaDinamica();
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
	public JanelaDinamica() {
		setTitle("gerador de senha");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 358, 157);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("senha:");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
	
		
		
		
		JButton btnNewButton_1 = new JButton("gerar proxima senha");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				Double a = Math.random();
				Double b = Math.random();
				Double c = Math.random();
				Math.floor(a);
				Math.floor(b);
				Math.floor(c);
			}
		});
		btnNewButton_1.setBounds(84, 69, 167, 23);
		contentPane.add(btnNewButton_1);
		
		textAno = new JTextField();
		textAno.setBounds(52, 8, 37, 20);
		contentPane.add(textAno);
		textAno.setColumns(10);
		textAno.setEditable(false);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(112, 8, 37, 20);
		contentPane.add(textField);
		
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(172, 8, 37, 20);
		contentPane.add(textField_1);
	}
}
// Long a = Math.round(5.0);
//txtNum.setText(String.valueOf(a));

//Double m = Math.random();
//textNum.setText(String.valueOf(m));
