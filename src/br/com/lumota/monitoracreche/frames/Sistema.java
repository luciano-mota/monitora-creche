package br.com.lumota.monitoracreche.frames;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import br.com.lumota.monitoracreche.model.Crianca;
import br.com.lumota.monitoracreche.model.Turma;
import br.com.lumota.monitoracreche.model.Turno;
import br.com.lumota.monitoracreche.table.CriancaTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Sistema extends JFrame {

	private JPanel contentPane;
	private JTextField txtPai;
	private JTextField txtMae;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtEndereco;
	private JTextField txtBairro;
	private JTextField txtCep;
	private JTextField txtTelefone;
	private JTextField txtCelular;
	private JTable table;
	private CriancaTableModel criancaTableModel;
	private List<Crianca> criancas = new ArrayList<Crianca>();
	private JTextField txtCpfPai;
	private JTextField txtCpfMae;
	private JComboBox comboBoxTurma, comboBoxTurno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sistema frame = new Sistema();
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
	public Sistema() {
		setTitle("Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 814, 670);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panelResponsaveis = new JPanel();
		panelResponsaveis.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Respons\u00E1veis", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
		
		JLabel lblPai = new JLabel("Pai");
		
		txtPai = new JTextField();
		txtPai.setColumns(10);
		
		JLabel lblMae = new JLabel("Mãe");
		
		txtMae = new JTextField();
		txtMae.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endereço");
		
		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro");
		
		txtBairro = new JTextField();
		txtBairro.setText("");
		txtBairro.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP");
		
		txtCep = new JTextField();
		txtCep.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone");
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		
		JLabel lblCelular = new JLabel("Celular");
		
		txtCelular = new JTextField();
		txtCelular.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF Pai");
		
		txtCpfPai = new JTextField();
		txtCpfPai.setColumns(10);
		
		JLabel lblCpfMe = new JLabel("CPF Mãe");
		
		txtCpfMae = new JTextField();
		txtCpfMae.setColumns(10);
		GroupLayout gl_panelResponsaveis = new GroupLayout(panelResponsaveis);
		gl_panelResponsaveis.setHorizontalGroup(
			gl_panelResponsaveis.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelResponsaveis.createSequentialGroup()
					.addGap(7)
					.addGroup(gl_panelResponsaveis.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelResponsaveis.createSequentialGroup()
							.addComponent(lblPai, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addGap(308)
							.addComponent(lblMae, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelResponsaveis.createSequentialGroup()
							.addComponent(txtPai, GroupLayout.PREFERRED_SIZE, 343, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(txtMae, GroupLayout.PREFERRED_SIZE, 343, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelResponsaveis.createSequentialGroup()
							.addComponent(lblCpf, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addGap(288)
							.addComponent(lblCpfMe, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelResponsaveis.createSequentialGroup()
							.addComponent(txtCpfPai, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
							.addGap(159)
							.addComponent(txtCpfMae, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblEndereo, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtEndereco, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelResponsaveis.createSequentialGroup()
							.addComponent(lblTelefone, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addGap(115)
							.addComponent(lblCelular, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addGap(84)
							.addComponent(lblBairro, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addGap(77)
							.addComponent(lblCep, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelResponsaveis.createSequentialGroup()
							.addComponent(txtTelefone, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
							.addGap(19)
							.addComponent(txtCelular, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(22)
							.addComponent(txtBairro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(23)
							.addComponent(txtCep, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE))))
		);
		gl_panelResponsaveis.setVerticalGroup(
			gl_panelResponsaveis.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelResponsaveis.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panelResponsaveis.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPai)
						.addComponent(lblMae))
					.addGap(1)
					.addGroup(gl_panelResponsaveis.createParallelGroup(Alignment.LEADING)
						.addComponent(txtPai, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtMae, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(2)
					.addGroup(gl_panelResponsaveis.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCpf)
						.addComponent(lblCpfMe))
					.addGroup(gl_panelResponsaveis.createParallelGroup(Alignment.LEADING)
						.addComponent(txtCpfPai, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCpfMae, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addComponent(lblEndereo)
					.addGap(1)
					.addComponent(txtEndereco, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addGroup(gl_panelResponsaveis.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTelefone)
						.addComponent(lblCelular)
						.addComponent(lblBairro)
						.addComponent(lblCep))
					.addGap(2)
					.addGroup(gl_panelResponsaveis.createParallelGroup(Alignment.LEADING)
						.addComponent(txtTelefone, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCelular, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtBairro, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCep, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
		);
		panelResponsaveis.setLayout(gl_panelResponsaveis);
		
		JPanel panelCrianca = new JPanel();
		panelCrianca.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Filho", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblNome = new JLabel("Nome");
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade");
		
		txtIdade = new JTextField();
		txtIdade.setColumns(10);
		
		JLabel lblTurma = new JLabel("Turma");
		
		comboBoxTurma = new JComboBox();
		comboBoxTurma.setModel(new DefaultComboBoxModel(new String[] {"", "0 à 1 Ano", "1 à 2 anos", "2 à 3 Anos"}));
		
		JLabel lblTurno = new JLabel("Turno");
		
		comboBoxTurno = new JComboBox();
		comboBoxTurno.setModel(new DefaultComboBoxModel(new String[] {"", "Manhã", "Tarde"}));
		GroupLayout gl_panelCrianca = new GroupLayout(panelCrianca);
		gl_panelCrianca.setHorizontalGroup(
			gl_panelCrianca.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCrianca.createSequentialGroup()
					.addGap(7)
					.addGroup(gl_panelCrianca.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelCrianca.createSequentialGroup()
							.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addGap(326)
							.addComponent(lblIdade, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelCrianca.createSequentialGroup()
							.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(txtIdade, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelCrianca.createSequentialGroup()
							.addComponent(lblTurma, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addGap(75)
							.addComponent(lblTurno, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelCrianca.createSequentialGroup()
							.addComponent(comboBoxTurma, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
							.addGap(22)
							.addComponent(comboBoxTurno, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))))
		);
		gl_panelCrianca.setVerticalGroup(
			gl_panelCrianca.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCrianca.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panelCrianca.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNome)
						.addGroup(gl_panelCrianca.createSequentialGroup()
							.addGap(2)
							.addComponent(lblIdade)))
					.addGap(10)
					.addGroup(gl_panelCrianca.createParallelGroup(Alignment.LEADING)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtIdade, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_panelCrianca.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTurma)
						.addComponent(lblTurno))
					.addGap(6)
					.addGroup(gl_panelCrianca.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBoxTurma, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxTurno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		);
		panelCrianca.setLayout(gl_panelCrianca);
		
		JPanel panel = new JPanel();
		
		JScrollPane scrollPane = new JScrollPane();
		
		table = new JTable();
		criancaTableModel = new CriancaTableModel(criancas);
		table.setModel(criancaTableModel);
		scrollPane.setViewportView(table);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(60, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Crianca crianca = new Crianca();
				
				crianca.setPai(txtPai.getText());
				crianca.setCpfPai(txtCpfPai.getText());
				crianca.setMae(txtMae.getText());
				crianca.setCpfMae(txtCpfMae.getText());
				crianca.setEndereco(txtEndereco.getText());
				crianca.setTelefone(txtTelefone.getText());
				crianca.setCelular(txtCelular.getText());
				crianca.setBairro(txtBairro.getText());
				crianca.setCep(txtCep.getText());
				crianca.setNome(txtNome.getText());
				crianca.setIdade(txtIdade.getText());
				
				Turma turma = new Turma();
				turma.setProfessor("");
				
				
				//condicionais do combobox turma
				if(comboBoxTurma.getSelectedIndex() == 1) {
					turma.setTurma(comboBoxTurma.getSelectedItem().toString());
				}else if(comboBoxTurma.getSelectedIndex() == 2) {
					turma.setTurma(comboBoxTurma.getSelectedItem().toString());
				}else if(comboBoxTurma.getSelectedIndex() == 3) {
					turma.setTurma(comboBoxTurma.getSelectedItem().toString());
				}
				
				//condicionais do combobox turno
				
				
				if(comboBoxTurno.getSelectedIndex() == 1) {
					
					turma.setTurno(Turno.MANHA);
				} else if (comboBoxTurno.getSelectedIndex() == 2) {
					turma.setTurno(Turno.TARDE);
				}
						
						
				
				crianca.setTurma(turma);
				
				table.setModel(new CriancaTableModel(addCrianca(crianca)));
				limpaCampos();
				
				
				
				
		
		
	
			
		}
	});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addComponent(panelResponsaveis, GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addContainerGap(674, Short.MAX_VALUE)
							.addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addComponent(panelCrianca, GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panelResponsaveis, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panelCrianca, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(btnSalvar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
					.addGap(20))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	//Adiciona Crianca
	public List<Crianca> addCrianca(Crianca crianca){
		criancas.add(crianca);
		return criancas;
	}
	
	//limpra os campos do formulario
	public void limpaCampos() {
		txtPai.setText("");
		txtCpfPai.setText("");
		txtMae.setText("");
		txtCpfMae.setText("");
		txtEndereco.setText("");
		txtTelefone.setText("");
		txtCelular.setText("");
		txtBairro.setText("");
		txtCep.setText("");
		txtNome.setText("");
		txtIdade.setText("");
		comboBoxTurma.setSelectedIndex(0);
		comboBoxTurno.setSelectedIndex(0);
	}
}
