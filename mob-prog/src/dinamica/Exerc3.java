package dinamica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exerc3 extends JFrame {

	private JPanel contentPane;
	private JTextField Peixe;
	private JTextField TxtNome;
	private JTextField TxtModelo;
	private JTextField Ano;
	private JTextField Fabricante;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exerc3 frame = new Exerc3();
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
	public Exerc3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(25, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(25, 44, 46, 14);
		contentPane.add(lblModelo);
		
		JLabel lblNewLabel_1 = new JLabel("Ano:");
		lblNewLabel_1.setBounds(25, 80, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fabricante:");
		lblNewLabel_2.setBounds(21, 113, 61, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Veículo cadastrado:");
		lblNewLabel_3.setBounds(22, 165, 94, 14);
		contentPane.add(lblNewLabel_3);
		
		Peixe = new JTextField();
		Peixe.setBounds(25, 190, 390, 20);
		contentPane.add(Peixe);
		Peixe.setColumns(10);
		Peixe.setEditable(false);
		
		
		TxtNome = new JTextField();
		TxtNome.setBounds(67, 8, 294, 20);
		contentPane.add(TxtNome);
		TxtNome.setColumns(10);
		
		TxtModelo = new JTextField();
		TxtModelo.setColumns(10);
		TxtModelo.setBounds(77, 41, 294, 20);
		contentPane.add(TxtModelo);
		
		Ano = new JTextField();
		Ano.setColumns(10);
		Ano.setBounds(67, 77, 104, 20);
		contentPane.add(Ano);
		
		Fabricante = new JTextField();
		Fabricante.setColumns(10);
		Fabricante.setBounds(77, 110, 294, 20);
		contentPane.add(Fabricante);
		
		btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = TxtNome.getText();
				String b = TxtModelo.getText();
				String c = Ano.getText();
				String d = Fabricante.getText();
				String soma = a + b + c + d;
				Peixe.setText(soma);
			}
		});
		btnNewButton.setBounds(25, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			TxtNome.setText(null);
			TxtModelo.setText(null);
			Ano.setText(null);
			Fabricante.setText(null);
			Peixe.setText(null);
			}
		});
		btnNewButton_1.setBounds(326, 227, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
