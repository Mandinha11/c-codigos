package ex1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Cadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textCpf;
	private JTextField textPnome;
	private JTextField textSobrenome;
	private JTextField textData;
	private JTextField textCadastrado;

	private ArrayList<Pessoa> listaCadastro = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
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
	public Cadastro() {
		setTitle("Cadastro de pessoa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textCpf = new JTextField();
		textCpf.setBounds(233, 37, 86, 20);
		contentPane.add(textCpf);
		textCpf.setColumns(10);

		textPnome = new JTextField();
		textPnome.setColumns(10);
		textPnome.setBounds(233, 68, 86, 20);
		contentPane.add(textPnome);

		textSobrenome = new JTextField();
		textSobrenome.setColumns(10);
		textSobrenome.setBounds(233, 99, 86, 20);
		contentPane.add(textSobrenome);

		textData = new JTextField();
		textData.setColumns(10);
		textData.setBounds(233, 130, 86, 20);
		contentPane.add(textData);

		textCadastrado = new JTextField();
		textCadastrado.setEnabled(false);
		textCadastrado.setEditable(false);
		textCadastrado.setColumns(10);
		textCadastrado.setBounds(233, 161, 86, 20);
		contentPane.add(textCadastrado);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(56, 40, 46, 14);
		contentPane.add(lblCpf);

		JLabel lblPrimeiroNome = new JLabel("Primeiro Nome: ");
		lblPrimeiroNome.setBounds(56, 71, 107, 14);
		contentPane.add(lblPrimeiroNome);

		JLabel lblSobrenome = new JLabel("Sobrenome: ");
		lblSobrenome.setBounds(56, 102, 107, 14);
		contentPane.add(lblSobrenome);

		JLabel lblDataDeNascimento = new JLabel("Data de nascimento: ");
		lblDataDeNascimento.setBounds(56, 133, 121, 14);
		contentPane.add(lblDataDeNascimento);

		JLabel lblPessoaCadastrada = new JLabel("Pessoa Cadastrada: ");
		lblPessoaCadastrada.setBounds(56, 164, 121, 14);
		contentPane.add(lblPessoaCadastrada);

		JButton btnCadastro = new JButton("Cadastrar");
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cpf = textCpf.getText();
				String pNome = textPnome.getText();
				String sobrenome = textSobrenome.getText();
				String data = textData.getText();

				Pessoa pessoa = new Pessoa();
				pessoa.setCpf(cpf);
				pessoa.setData(data);
				pessoa.setpNome(pNome);
				pessoa.setSobrenome(sobrenome);

				listaCadastro.add(pessoa);

			}
		});
		btnCadastro.setBounds(233, 194, 89, 23);
		contentPane.add(btnCadastro);

		JButton Exibir = new JButton("Exibir");
		Exibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textCadastrado.setText(listaCadastro.toString());
			}
		});
		Exibir.setBounds(233, 227, 89, 23);
		contentPane.add(Exibir);
	}
}
