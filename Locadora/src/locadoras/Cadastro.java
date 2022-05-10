package locadoras;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Cadastro extends JFrame {

	private JPanel contentPane;
	private JTextField Cliente;
	private JTextField RG;
	private JTextField Nascimento;
	private JTextField Carro;
	private JTextField Marca;
	private JTextField Valor;
	private JTable table;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 628);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.setBounds(10, 11, 67, 14);
		contentPane.add(lblCadastro);
		
		JLabel lbldadoscliente = new JLabel("Dados do Cliente");
		lbldadoscliente.setBounds(10, 153, 104, 14);
		contentPane.add(lbldadoscliente);
		
		JLabel lblNewLabel_2 = new JLabel("Digite o nome do cliente:");
		lblNewLabel_2.setBounds(10, 188, 181, 14);
		contentPane.add(lblNewLabel_2);
		
		Cliente = new JTextField();
		Cliente.setBounds(10, 213, 244, 20);
		contentPane.add(Cliente);
		Cliente.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Digite o RG do cliente:");
		lblNewLabel_3.setBounds(10, 244, 130, 14);
		contentPane.add(lblNewLabel_3);
		
		RG = new JTextField();
		RG.setBounds(10, 269, 244, 20);
		contentPane.add(RG);
		RG.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Digite a data de Nascimento do cliente:");
		lblNewLabel_4.setBounds(359, 188, 244, 14);
		contentPane.add(lblNewLabel_4);
		
		Nascimento = new JTextField();
		Nascimento.setBounds(359, 213, 244, 20);
		contentPane.add(Nascimento);
		Nascimento.setColumns(10);
		
		JLabel lbldadoscarro = new JLabel("Dados do carro");
		lbldadoscarro.setBounds(10, 328, 89, 14);
		contentPane.add(lbldadoscarro);
		
		JLabel lblNewLabel_6 = new JLabel("Digite o Carro a ser alugado:");
		lblNewLabel_6.setBounds(10, 373, 244, 14);
		contentPane.add(lblNewLabel_6);
		
		Carro = new JTextField();
		Carro.setBounds(10, 398, 244, 20);
		contentPane.add(Carro);
		Carro.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Digite a marca do Carro a ser alugado:");
		lblNewLabel_7.setBounds(359, 373, 244, 14);
		contentPane.add(lblNewLabel_7);
		
		Marca = new JTextField();
		Marca.setBounds(359, 398, 244, 20);
		contentPane.add(Marca);
		Marca.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Digite o Preço do Carro a ser alugado:");
		lblNewLabel_10.setBounds(10, 429, 244, 14);
		contentPane.add(lblNewLabel_10);
		
		Valor = new JTextField();
		Valor.setBounds(10, 454, 244, 20);
		contentPane.add(Valor);
		Valor.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 36, 564, 106);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Cliente", "RG", "Carro", "Valor"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_1 = new JButton("Excluir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				((DefaultTableModel) table.getModel()).removeRow(table.getSelectedRow());
				
				 JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso!");
				
			}
		});
		btnNewButton_1.setBounds(354, 555, 104, 23);
		contentPane.add(btnNewButton_1);
		
		JButton Cadastrar = new JButton("Cadastrar");
		Cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String cliente = Cliente.getText().trim();
				String rg = RG.getText().trim();
				String nasc = Nascimento.getText().trim();
				
				String carro = Carro.getText().trim();
				String valor = Valor.getText().trim();
				String marca = Marca.getText().trim();
				
				DefaultTableModel tabela = (DefaultTableModel) table.getModel();
				tabela.addRow(new String[] {cliente, rg, carro, valor});
				
				JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
				
				Cliente.setText("");
				RG.setText("");
				Nascimento.setText("");
				Carro.setText("");
				Valor.setText("");
				Marca.setText("");
				
				Cliente.requestFocus();
				
			}
		});
		Cadastrar.setBounds(170, 555, 104, 23);
		contentPane.add(Cadastrar);
	}
}
