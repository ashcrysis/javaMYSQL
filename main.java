package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;

import funcoes.funcoes;

import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Component;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import javax.swing.JSeparator;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JMenuBar;
import java.awt.Canvas;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.JScrollBar;
import javax.swing.JToggleButton;


public class main {

	JFrame frame;
	private JPanel menu;
	private JLayeredPane layeredPane;
	private JPanel barraUTI_1;
	private JTextField tf_usuario;
	private JPasswordField pf_pass;
	private JPanel aluno;
	private JTextField tf_nome;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField tf_endereco;
	private JTextField tf_escolaridade;
	private JTextField tf_pai;
	private JTextField tf_mae;
	private JTextField tf_email;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_1();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField tf_titulo;
	private JTextField tf_salario;
	private JTextField tf_COD;
	private JTextField tf_Nome;
	private JTextField tf_ender;
	private JTextField tf_escolaridadee;
	private JTextField tf_email_;
	private Component csStatusImage;
	public static String variavel = "";
	private JTable tabela;
	private JTable table;
	private JTextField tf_areaAtuacao;
	private JTextField tf_especializacao;
	private JTextField tf_ccod;
	private JTextField tf_ctitulo;
	private JTextField tf_cdescricao;
	private JTextField tf_carea;
	private JTextField tf_choraria;
	private JTextField tf_cconteudo;
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private JTextField tf_codTurma;
	private JTextField tf_curso;
	private JTextField tf_Turno;
	private JTextField tf_datai;
	private JTextField tf_dataT;
	private JTextField tf_cpfProf;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		funcoes Mascara = new funcoes();
		boolean	validar = funcoes.validar;
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 827, 563);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBackground(SystemColor.activeCaption);
		layeredPane.setBounds(0, 1, 811, 523);
		frame.getContentPane().add(layeredPane);
		layeredPane.setLayout(null);
		
		menu = new JPanel();
		menu.setBackground(SystemColor.menu);
		layeredPane.setLayer(menu, 1);
		menu.setBounds(90, 0, 727, 524);
		layeredPane.add(menu);
		menu.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SISTEMA DE GESTÃO ESCOLAR - SENAI AREIAS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 23, 707, 14);
		menu.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuário:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(265, 157, 169, 14);
		menu.add(lblNewLabel_1);
		
		tf_usuario = new JTextField();
		tf_usuario.setBounds(265, 182, 169, 20);
		menu.add(tf_usuario);
		tf_usuario.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Senha:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(265, 213, 169, 14);
		menu.add(lblNewLabel_1_1);
		
		pf_pass = new JPasswordField();
		pf_pass.setBounds(264, 238, 170, 20);
		menu.add(pf_pass);
		
		JButton btnEsqueci = new JButton("Esqueci minha senha");
		btnEsqueci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,"TIP: A senha padrão do usuário admin começa com S e termina com 22!");
			}
			
			
			
		});
		
		aluno = new JPanel();
		layeredPane.setLayer(aluno, 0);
		aluno.setBackground(SystemColor.menu);
		aluno.setBounds(90, 0, 727, 524);
		layeredPane.add(aluno);
		aluno.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("SISTEMA DE GESTÃO DE ALUNO");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 23, 707, 14);
		aluno.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CPF:");
		lblNewLabel_3.setBounds(27, 163, 46, 14);
		aluno.add(lblNewLabel_3);
		
		JFormattedTextField ftf_cpf = new JFormattedTextField(Mascara.Mascara("###.###.###-##"));
		ftf_cpf.setBounds(27, 181, 105, 20);
		aluno.add(ftf_cpf);
		
		JLabel lblNewLabel_4 = new JLabel("RG:");
		lblNewLabel_4.setBounds(27, 212, 46, 14);
		aluno.add(lblNewLabel_4);
		
		JFormattedTextField ftf_rg = new JFormattedTextField(Mascara.Mascara("##.###.###"));
		ftf_rg.setBounds(27, 237, 105, 20);
		aluno.add(ftf_rg);
		
		JLabel lblNewLabel_5 = new JLabel("Nome Completo:");
		lblNewLabel_5.setBounds(27, 109, 105, 14);
		aluno.add(lblNewLabel_5);
		
		tf_nome = new JTextField();
		tf_nome.setBounds(27, 132, 157, 20);
		aluno.add(tf_nome);
		tf_nome.setColumns(10);
		
		JFormattedTextField ftf_nascimento = new JFormattedTextField(Mascara.Mascara("##/##/####"));
		ftf_nascimento.setBounds(27, 290, 105, 20);
		aluno.add(ftf_nascimento);
		
		JLabel lblNewLabel_6 = new JLabel("Data de Nascimento:");
		lblNewLabel_6.setBounds(27, 268, 141, 14);
		aluno.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Sexo:");
		lblNewLabel_7.setBounds(27, 325, 46, 14);
		aluno.add(lblNewLabel_7);
		
		JRadioButton rdbmasc = new JRadioButton("Masculino");
		buttonGroup.add(rdbmasc);
		rdbmasc.setBounds(23, 348, 109, 23);
		aluno.add(rdbmasc);
		
		JRadioButton rdbfem = new JRadioButton("Feminino");
		buttonGroup.add(rdbfem);
		rdbfem.setBounds(23, 374, 109, 23);
		aluno.add(rdbfem);
		
		JRadioButton rdbnao = new JRadioButton("Não desejo informar");
		buttonGroup.add(rdbnao);
		rdbnao.setBounds(23, 400, 175, 23);
		aluno.add(rdbnao);
		
		JLabel lblNewLabel_8 = new JLabel("Endereço:");
		lblNewLabel_8.setBounds(27, 431, 105, 14);
		aluno.add(lblNewLabel_8);
		
		tf_endereco = new JTextField();
		tf_endereco.setBounds(27, 456, 230, 20);
		aluno.add(tf_endereco);
		tf_endereco.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Escolaridade:");
		lblNewLabel_9.setBounds(316, 83, 87, 14);
		aluno.add(lblNewLabel_9);
		
		tf_escolaridade = new JTextField();
		tf_escolaridade.setBounds(317, 106, 194, 20);
		aluno.add(tf_escolaridade);
		tf_escolaridade.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Nome pai:");
		lblNewLabel_10.setBounds(316, 137, 128, 14);
		aluno.add(lblNewLabel_10);
		
		tf_pai = new JTextField();
		tf_pai.setBounds(317, 162, 194, 20);
		aluno.add(tf_pai);
		tf_pai.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Nome mãe:");
		lblNewLabel_11.setBounds(316, 193, 128, 14);
		aluno.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Telefone:");
		lblNewLabel_12.setBounds(316, 299, 87, 14);
		aluno.add(lblNewLabel_12);
		
		JFormattedTextField ftf_telefone = new JFormattedTextField(Mascara.Mascara("(##)# ####-####"));
		ftf_telefone.setBounds(316, 320, 128, 20);
		aluno.add(ftf_telefone);
		
		tf_mae = new JTextField();
		tf_mae.setBounds(316, 211, 194, 20);
		aluno.add(tf_mae);
		tf_mae.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Email:");
		lblNewLabel_13.setBounds(316, 242, 74, 14);
		aluno.add(lblNewLabel_13);
		
		tf_email = new JTextField();
		tf_email.setBounds(317, 267, 194, 20);
		aluno.add(tf_email);
		tf_email.setColumns(10);
		
		JButton btnCad = new JButton("Cadastrar");
		btnCad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String CPF,RG,Nome,data_nasc,Sexo,endereco,escolaridade,nome_mae,nome_pai,telefone,email;
			
			CPF = ftf_cpf.getText();
			RG = ftf_rg.getText();
			Nome = tf_nome.getText();
			data_nasc = ftf_nascimento.getText();
			Sexo = "";
			
			if (rdbmasc.isSelected()){
				
				Sexo = "Masculino";
			}else if (rdbfem.isSelected()) {
				
				Sexo = "Feminino";
			}else if(rdbnao.isSelected()) {
				
				Sexo = "Não informado";
				
			}
			endereco = tf_endereco.getText();
			escolaridade = tf_escolaridade.getText();
			nome_mae = tf_mae.getText();
			nome_pai = tf_pai.getText();
			telefone = ftf_telefone.getText();
			email = tf_email.getText();
			
			funcoes.cadastroAluno(CPF, RG, Nome, data_nasc, Sexo, endereco, escolaridade, nome_mae, nome_pai, telefone, email);
			}
		});
		btnCad.setBounds(316, 392, 195, 23);
		aluno.add(btnCad);
		
		JFormattedTextField ftf_registro = new JFormattedTextField(Mascara.Mascara("#####"));
		ftf_registro.setBounds(27, 83, 60, 20);
		aluno.add(ftf_registro);
		
		
		JButton btnNewButton_2 = new JButton("Deletar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String registro;
			
			registro = ftf_registro.getText();
			
			funcoes.deletarAluno(registro);
			}
		});
		btnNewButton_2.setBounds(314, 453, 197, 23);
		aluno.add(btnNewButton_2);
		
	
		JButton btnNewButton_3 = new JButton("Atualizar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String registro, CPF,RG,Nome,data_nasc,Sexo,endereco,escolaridade,nome_mae,nome_pai,telefone,email;
				
				CPF = ftf_cpf.getText();
				RG = ftf_rg.getText();
				Nome = tf_nome.getText();
				data_nasc = ftf_nascimento.getText();
				Sexo = "";
				
				if (rdbmasc.isSelected()){
					
					Sexo = "Masculino";
				}else if (rdbfem.isSelected()) {
					
					Sexo = "Feminino";
				}else if(rdbnao.isSelected()) {
					
					Sexo = "Não informado";
					
				}
				endereco = tf_endereco.getText();
				escolaridade = tf_escolaridade.getText();
				nome_mae = tf_mae.getText();
				nome_pai = tf_pai.getText();
				telefone = ftf_telefone.getText();
				email = tf_email.getText();
				registro = ftf_registro.getText();
				funcoes.atualizarAluno(CPF, RG, Nome, data_nasc, Sexo, endereco, escolaridade, nome_mae, nome_pai, telefone, email, registro);
			
			
			
			
			}
		});
		btnNewButton_3.setBounds(314, 421, 197, 23);
		aluno.add(btnNewButton_3);
		
		JLabel lblNewLabel_14 = new JLabel("DD/MM/AAAA");
		lblNewLabel_14.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_14.setBounds(136, 293, 76, 14);
		aluno.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Registro:");
		lblNewLabel_15.setBounds(27, 68, 46, 14);
		aluno.add(lblNewLabel_15);
		
		
		
		btnEsqueci.setBounds(548, 490, 169, 23);
		menu.add(btnEsqueci);
	
		JPanel escolha = new JPanel();
		layeredPane.setLayer(escolha, 0);
		escolha.setBounds(90, 0, 727, 524);
		layeredPane.add(escolha);
		escolha.setLayout(null);
		
		JLabel lblNewLabel_30 = new JLabel("SISTEMA DE GESTÃO ESCOLAR - SENAI AREIAS");
		lblNewLabel_30.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_30.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_30.setBounds(10, 23, 707, 14);
		escolha.add(lblNewLabel_30);
		
		JLabel lblNewLabel_31 = new JLabel("Para prosseguir com o sistema, escolha uma das opções à sua esquerda!");
		lblNewLabel_31.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_31.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_31.setBounds(10, 222, 707, 33);
		escolha.add(lblNewLabel_31);

		
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean validar = false;
				String usuario, senha;
				
				usuario = tf_usuario.getText();
				senha = pf_pass.getText();
				
				funcoes.fazerLogin(usuario, senha);
				validar = funcoes.validar;
				
				if (validar == true) {
					
					
					Switch_screens(escolha);
				
					tf_usuario.setText("");
					pf_pass.setText("");
				}
				
				
				
				
				}
			}
		);
		btnLogin.setBounds(255, 269, 100, 23);
		menu.add(btnLogin);
		
		JButton btnCadUser = new JButton("Cadastrar");
		btnCadUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String Usuario, Senha;
			
			Usuario = tf_usuario.getText();
			Senha = pf_pass.getText();
			
			funcoes funcoes = new funcoes();
			
			funcoes.cadastroUsuario(Usuario, Senha);
		
		}});
		btnCadUser.setBounds(352, 269, 100, 23);
		menu.add(btnCadUser);
		
		JLabel lblAcessoAdministrativo = new JLabel("ACESSO ADMINISTRATIVO");
		lblAcessoAdministrativo.setHorizontalAlignment(SwingConstants.CENTER);
		lblAcessoAdministrativo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAcessoAdministrativo.setBounds(10, 48, 707, 14);
		menu.add(lblAcessoAdministrativo);
		
	
		
		JPanel cargos = new JPanel();
		layeredPane.setLayer(cargos, 0);
		cargos.setBounds(90, 0, 727, 523);
		layeredPane.add(cargos);
		cargos.setLayout(null);
		
		JLabel lblNewLabel_16 = new JLabel("SISTEMA DE GESTÃO ESCOLAR - SENAI AREIAS");
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_16.setBounds(10, 24, 707, 14);
		cargos.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("GESTÃO DE CARGOS");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17.setBounds(10, 49, 707, 14);
		cargos.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Título:");
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18.setBounds(312, 165, 101, 14);
		cargos.add(lblNewLabel_18);
		
		tf_titulo = new JTextField();
		tf_titulo.setBounds(264, 190, 200, 20);
		cargos.add(tf_titulo);
		tf_titulo.setColumns(10);
		
		JLabel lblNewLabel_18_1 = new JLabel("Descrição:");
		lblNewLabel_18_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18_1.setBounds(312, 221, 101, 14);
		cargos.add(lblNewLabel_18_1);
		
		JTextField tf_descricao = new JTextField();
		tf_descricao.setColumns(10);
		tf_descricao.setBounds(213, 246, 306, 20);
		cargos.add(tf_descricao);
		
		JLabel lblNewLabel_18_1_1 = new JLabel("Salário:");
		lblNewLabel_18_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18_1_1.setBounds(312, 277, 101, 14);
		cargos.add(lblNewLabel_18_1_1);
		
		tf_salario = new JTextField();
		tf_salario.setColumns(10);
		tf_salario.setBounds(312, 302, 101, 20);
		cargos.add(tf_salario);
		
		JButton btnNewButton = new JButton("Atualizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String cod, titulo, descricao, salario;
			
			cod = tf_COD.getText();
			titulo = tf_titulo.getText();
			descricao = tf_descricao.getText();
			salario = tf_salario.getText();
			
			funcoes.atualizarCargo(titulo, descricao, salario, cod);
			
			tf_COD.setText("");
			tf_titulo.setText("");
			tf_salario.setText("");
			tf_COD.setText("");
			}
		});
		btnNewButton.setBounds(312, 372, 101, 23);
		cargos.add(btnNewButton);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Titulo, Descricao, Salario;
				
				Titulo = tf_titulo.getText();
				Descricao = tf_descricao.getText();
				Salario = tf_salario.getText();
				
				funcoes.cadastroCargo(Titulo, Descricao, Salario);
				
				tf_COD.setText("");
				tf_titulo.setText("");
				tf_salario.setText("");
				tf_COD.setText("");
			}
		});
		btnCadastrar.setBounds(312, 338, 101, 23);
		cargos.add(btnCadastrar);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String cod;
				
				cod = tf_COD.getText();
			
				funcoes.deletarCargo(cod);
				
				tf_COD.setText("");
				tf_titulo.setText("");
				tf_salario.setText("");
				tf_COD.setText("");
			}
		});
		btnDeletar.setBounds(312, 406, 101, 23);
		cargos.add(btnDeletar);
		
		JLabel lblNewLabel_18_2 = new JLabel("COD:");
		lblNewLabel_18_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18_2.setBounds(312, 109, 101, 14);
		cargos.add(lblNewLabel_18_2);
		
		tf_COD = new JFormattedTextField(Mascara.Mascara("###"));
		tf_COD.setHorizontalAlignment(SwingConstants.CENTER);
		tf_COD.setColumns(10);
		tf_COD.setBounds(342, 134, 35, 20);
		cargos.add(tf_COD);
		
		JPanel colaboradores = new JPanel();
		layeredPane.setLayer(colaboradores, 0);
		colaboradores.setBounds(90, 0, 727, 524);
		layeredPane.add(colaboradores);
		colaboradores.setLayout(null);
		
		JLabel lblNewLabel_19 = new JLabel("SISTEMA DE GESTÃO ESCOLAR - SENAI AREIAS");
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_19.setBounds(10, 23, 707, 14);
		colaboradores.add(lblNewLabel_19);
		
		JLabel lblNewLabel_19_1 = new JLabel("GESTÃO DE COLABORADORES");
		lblNewLabel_19_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_19_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_19_1.setBounds(10, 45, 707, 14);
		colaboradores.add(lblNewLabel_19_1);
		
		JLabel lblNewLabel_20 = new JLabel("CPF:");
		lblNewLabel_20.setBounds(37, 163, 46, 14);
		colaboradores.add(lblNewLabel_20);
		
		JFormattedTextField ftf_CPF = new JFormattedTextField(Mascara.Mascara("###.###.###-##"));
		ftf_CPF.setBounds(37, 188, 131, 20);
		colaboradores.add(ftf_CPF);
		
		JLabel lblNewLabel_21 = new JLabel("RG:");
		lblNewLabel_21.setBounds(363, 112, 46, 14);
		colaboradores.add(lblNewLabel_21);
		
		JFormattedTextField ftf_RG = new JFormattedTextField(Mascara.Mascara("##.###.###"));
		ftf_RG.setBounds(363, 137, 113, 20);
		colaboradores.add(ftf_RG);
		
		JLabel lblNewLabel_22 = new JLabel("Nome");
		lblNewLabel_22.setBounds(37, 112, 46, 14);
		colaboradores.add(lblNewLabel_22);
		
		tf_Nome = new JTextField();
		tf_Nome.setBounds(37, 137, 175, 20);
		colaboradores.add(tf_Nome);
		tf_Nome.setColumns(10);
		
		JLabel lblNewLabel_23 = new JLabel("Data de Nascimento:");
		lblNewLabel_23.setBounds(363, 163, 119, 14);
		colaboradores.add(lblNewLabel_23);
		
		JFormattedTextField ftf_nasc = new JFormattedTextField(Mascara.Mascara("##/##/####"));
		ftf_nasc.setBounds(363, 188, 76, 20);
		colaboradores.add(ftf_nasc);
		
		JLabel lblNewLabel_24 = new JLabel("Endereço:");
		lblNewLabel_24.setBounds(37, 219, 131, 14);
		colaboradores.add(lblNewLabel_24);
		
		tf_ender = new JTextField();
		tf_ender.setBounds(37, 244, 175, 20);
		colaboradores.add(tf_ender);
		tf_ender.setColumns(10);
		
		JLabel lblNewLabel_25 = new JLabel("Sexo:");
		lblNewLabel_25.setBounds(363, 219, 46, 14);
		colaboradores.add(lblNewLabel_25);
		
		JRadioButton rdbFem = new JRadioButton("Feminino");
		buttonGroup.add(rdbFem);
		rdbFem.setBounds(363, 240, 109, 23);
		colaboradores.add(rdbFem);
		
		JRadioButton rdbMasc = new JRadioButton("Masculino");
		buttonGroup.add(rdbMasc);
		rdbMasc.setBounds(363, 260, 109, 23);
		colaboradores.add(rdbMasc);
		
		JRadioButton rdbNaoinf = new JRadioButton("Não informado");
		buttonGroup.add(rdbNaoinf);
		rdbNaoinf.setBounds(363, 278, 109, 23);
		colaboradores.add(rdbNaoinf);
		
		JLabel lblNewLabel_26 = new JLabel("Escolaridade:");
		lblNewLabel_26.setBounds(37, 275, 109, 14);
		colaboradores.add(lblNewLabel_26);
		
		tf_escolaridadee = new JTextField();
		tf_escolaridadee.setBounds(37, 300, 175, 20);
		colaboradores.add(tf_escolaridadee);
		tf_escolaridadee.setColumns(10);
		
		JLabel lblNewLabel_27 = new JLabel("Cargo:");
		lblNewLabel_27.setBounds(37, 331, 46, 14);
		colaboradores.add(lblNewLabel_27);
		
		JFormattedTextField ftf_cargo = new JFormattedTextField(Mascara.Mascara("###"));
		ftf_cargo.setBounds(37, 356, 46, 20);
		colaboradores.add(ftf_cargo);
		
		JLabel lblNewLabel_28 = new JLabel("Telefone:");
		lblNewLabel_28.setBounds(363, 331, 92, 14);
		colaboradores.add(lblNewLabel_28);
		
		JFormattedTextField ftf_telefone_ = new JFormattedTextField(Mascara.Mascara("(##)# ####-####"));
		ftf_telefone_.setBounds(363, 356, 119, 20);
		colaboradores.add(ftf_telefone_);
		
		JLabel lblNewLabel_29 = new JLabel("Email:");
		lblNewLabel_29.setBounds(37, 387, 76, 14);
		colaboradores.add(lblNewLabel_29);
		
		tf_email_ = new JTextField();
		tf_email_.setBounds(37, 411, 200, 20);
		colaboradores.add(tf_email_);
		tf_email_.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Cadastrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String CPF,cod, RG, Nome, Data_Nasci, Sexo, endereco, escolaridade, cargo, telefone, email;
			
			Nome = tf_Nome.getText();
			CPF = ftf_CPF.getText();
			RG = ftf_RG.getText();
			Data_Nasci = ftf_nasc.getText();
			endereco = tf_ender.getText();
			escolaridade = tf_escolaridadee.getText();
			cargo = ftf_cargo.getText();
			email = tf_email_.getText();
			telefone = ftf_telefone_.getText();
			Sexo = "";
			
			if (rdbMasc.isSelected()){
				
				Sexo = "Masculino";
			}else if (rdbFem.isSelected()) {
				
				Sexo = "Feminino";
			}else if(rdbNaoinf.isSelected()) {
				
				Sexo = "Não informado";
				
			}
			
			
			cod = cargo;
			funcoes.ReceberDadoscargo(cod);
			
			String cargo_aux = funcoes.variavelaux;
			
			//System.out.println(cargo_aux);
			funcoes.cadastroColaborador(CPF, RG, Nome, Data_Nasci, Sexo, endereco, escolaridade, cod, telefone, email, cargo_aux);
			
			}
		});
		btnNewButton_1.setBounds(371, 408, 105, 23);
		colaboradores.add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("Atualizar");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String CPF,cod, RG, Nome, Data_Nasci, Sexo, endereco, escolaridade, cargo, telefone, email;
				
				Nome = tf_Nome.getText();
				CPF = ftf_CPF.getText();
				RG = ftf_RG.getText();
				Data_Nasci = ftf_nasc.getText();
				endereco = tf_ender.getText();
				escolaridade = tf_escolaridadee.getText();
				cargo = ftf_cargo.getText();
				email = tf_email_.getText();
				telefone = ftf_telefone_.getText();
				Sexo = "";
				if (rdbMasc.isSelected()){
					
					Sexo = "Masculino";
				}else if (rdbFem.isSelected()) {
					
					Sexo = "Feminino";
				}else if(rdbNaoinf.isSelected()) {
					
					Sexo = "Não informado";
					
				}
				
				
				cod = ftf_cargo.getText();
				funcoes.ReceberDadoscargo(cod);
				
				String cargo_aux = funcoes.variavelaux;
				
				funcoes.atualizarColaborador( RG, Nome, Data_Nasci, Sexo, endereco, escolaridade, cod, telefone, email, cargo_aux,CPF);
			
			}
		});
		btnNewButton_4.setBounds(371, 442, 105, 23);
		colaboradores.add(btnNewButton_4);
		
		JPanel visualizacao = new JPanel();
		layeredPane.setLayer(visualizacao, 0);
		visualizacao.setBounds(90, 0, 727, 524);
		layeredPane.add(visualizacao);
		visualizacao.setLayout(null);
		
		JLabel lblNewLabel_32 = new JLabel("SISTEMA DE GESTÃO ESCOLAR - SENAI AREIAS");
		lblNewLabel_32.setBounds(10, 23, 707, 19);
		lblNewLabel_32.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_32.setFont(new Font("Tahoma", Font.BOLD, 15));
		visualizacao.add(lblNewLabel_32);
		
		JLabel lblNewLabel_32_1 = new JLabel("VISUALIZAÇÃO DE DADOS");
		lblNewLabel_32_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_32_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_32_1.setBounds(10, 53, 707, 19);
		visualizacao.add(lblNewLabel_32_1);
		
		JPanel CONTROLE = new JPanel();
		CONTROLE.setBackground(SystemColor.activeCaptionBorder);
		CONTROLE.setBounds(10, 83, 695, 33);
		visualizacao.add(CONTROLE);
		

		JPanel container = new JPanel();
		container.setBorder(new LineBorder(new Color(128, 128, 128)));
		container.setBackground(SystemColor.activeCaption);
		container.setBounds(0, 121, 717, 380);
		visualizacao.add(container);
		container.setLayout(null);
		container.setLayout(null);
		
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setSize(717, 17);
		scrollBar.setLocation(0, 363);
		scrollBar.setOrientation(JScrollBar.HORIZONTAL);
		container.add(scrollBar);
		
		
		JButton btnNewButton_5 = new JButton("Alunos");
		btnNewButton_5.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				  
				container.removeAll();  
				  
				  table = new JTable();
				  
				  DefaultTableModel modelo = (DefaultTableModel) table.getModel();
			        
			        
			       table.setBounds(0, 0, 859, 392);
			        container.add(table);
			       
			        modelo.addColumn("registro");
			        modelo.addColumn("CPF");
			        modelo.addColumn("RG");
			        modelo.addColumn("Nome");
			        modelo.addColumn("Data_Nascimento");
			        modelo.addColumn("Sexo");
			        modelo.addColumn("endereco");
			        modelo.addColumn("escolaridade");
			        modelo.addColumn("nome_mae");
			        modelo.addColumn("nome_pai");
			        modelo.addColumn("telefone");
			        modelo.addColumn("email");
			       
			       
			        table.setPreferredScrollableViewportSize(new Dimension(650, 180));
			         
			        Container c = container;
			      c.setLayout(new FlowLayout());
			      JScrollPane scrollPane = new JScrollPane(table);
			        c.add(scrollPane);
			             
			        scrollPane.setSize(600, 300);
			        scrollPane.setVisible(true);  
			        // exibe os dados da tabela MySQL
			        try{
			          Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			          Connection conn = DriverManager.getConnection("jdbc:mysql://172.19.14.223/asherPro?user=senai&password=abc123");
			               
			          // procedimentos para obter os dados de uma tabela
			          Statement stmt = conn.createStatement();
			          String query = "SELECT * FROM aluno";
			          ResultSet rs = stmt.executeQuery(query);
			          
			          while(rs.next()){ 
			            String registro = rs.getString("registro");
			            String CPF = rs.getString("CPF");
			            String RG = rs.getString("RG");
			            String Nome = rs.getString("Nome");
			            String Data_Nascimento = rs.getString("Data_Nascimento");
			            String Sexo = rs.getString("Sexo");
			            String endereco = rs.getString("endereco");
			            String escolaridade = rs.getString("escolaridade");
			            String nome_mae = rs.getString("nome_mae");
			            String nome_pai = rs.getString("nome_pai");
			            String telefone = rs.getString("telefone");
			            String email = rs.getString("email");
			            
			            modelo.addRow(new Object[]{new String(registro),CPF,RG,Nome,Data_Nascimento,Sexo,endereco,escolaridade,nome_mae,nome_pai,telefone,email});
			          }
			               
			          // fim procedimento para obter os dados
			          } 
			          catch(SQLException ex){
			               System.out.println("SQLException: " + ex.getMessage());
			               System.out.println("SQLState: " + ex.getSQLState());
			               System.out.println("VendorError: " + ex.getErrorCode());
			          }
			          catch(Exception e1){
			            System.out.println("Problemas ao tentar conectar com o banco de dados");	
			        }
			        // fim MySQL
				
				
				
			}
		});
		CONTROLE.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Cargos");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				  container.removeAll();  
					table = new JTable();
					
					DefaultTableModel modelo = (DefaultTableModel) table.getModel();
					
					
					table.setBounds(0, 164, 1050, 348);
			        container.add(table);
			       
			        modelo.addColumn("cod");
			        modelo.addColumn("Titulo");
			        modelo.addColumn("Descricao");
			        modelo.addColumn("Salario");
			       
			       
			        table.setPreferredScrollableViewportSize(new Dimension(650, 180));
			         
			        Container c = container;
			      c.setLayout(new FlowLayout());
			      JScrollPane scrollPane = new JScrollPane(table);
			        c.add(scrollPane);
			             
			        scrollPane.setSize(600, 300);
			        scrollPane.setVisible(true);  
			        
			        // exibe os dados da tabela MySQL
			        try{
			          Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			          Connection conn = DriverManager.getConnection("jdbc:mysql://172.19.14.223/asherPro?user=senai&password=abc123");
			               
			          // procedimentos para obter os dados de uma tabela
			          Statement stmt = conn.createStatement();
			          String query = "SELECT * FROM cargo";
			          ResultSet rs = stmt.executeQuery(query);
			          
			          while(rs.next()){ 
			            String cod = rs.getString("cod");
			            String titulo = rs.getString("titulo");
			            String descricao = rs.getString("descricao");
			            String salario = rs.getString("salario");
			           
			            
			            modelo.addRow(new Object[]{new String(cod),titulo,descricao,salario});
			          }
			               
			          // fim procedimento para obter os dados
			          } 
			          catch(SQLException ex){
			               System.out.println("SQLException: " + ex.getMessage());
			               System.out.println("SQLState: " + ex.getSQLState());
			               System.out.println("VendorError: " + ex.getErrorCode());
			          }
			          catch(Exception e1){
			            System.out.println("Problemas ao tentar conectar com o banco de dados");	
			        }
			        // fim MySQL
				
				
			}
		});
		CONTROLE.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Cursos");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				 container.removeAll();  
					table = new JTable();
					
					DefaultTableModel modelo = (DefaultTableModel) table.getModel();
					
					
					table.setBounds(0, 164, 1050, 348);
			        container.add(table);
			       
			        modelo.addColumn("cod");
			        modelo.addColumn("Titulo");
			        modelo.addColumn("Descricao");
			        modelo.addColumn("area_tecnologica");
			        modelo.addColumn("carga_horaria");
			        modelo.addColumn("conteudo");
			        modelo.addColumn("nivel");
			       
			       
			        table.setPreferredScrollableViewportSize(new Dimension(650, 180));
			         
			        Container c = container;
			      c.setLayout(new FlowLayout());
			      JScrollPane scrollPane = new JScrollPane(table);
			        c.add(scrollPane);
			             
			        scrollPane.setSize(600, 300);
			        scrollPane.setVisible(true);  
			        
			        // exibe os dados da tabela MySQL
			        try{
			          Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			          Connection conn = DriverManager.getConnection("jdbc:mysql://172.19.14.223/asherPro?user=senai&password=abc123");
			               
			          // procedimentos para obter os dados de uma tabela
			          Statement stmt = conn.createStatement();
			          String query = "SELECT * FROM curso";
			          ResultSet rs = stmt.executeQuery(query);
			          
			          while(rs.next()){ 
			            String cod = rs.getString("cod");
			            String titulo = rs.getString("titulo");
			            String descricao = rs.getString("descricao");
			            String area_tecnologica = rs.getString("area_tecnologica");
			            String carga_horaria = rs.getString("carga_horaria");
			            String conteudo = rs.getString("conteudo");
			            String nivel = rs.getString("nivel");
			           
			            
			            modelo.addRow(new Object[]{new String(cod),titulo,descricao,area_tecnologica, carga_horaria, conteudo, nivel});
			          }
			               
			          // fim procedimento para obter os dados
			          } 
			          catch(SQLException ex){
			               System.out.println("SQLException: " + ex.getMessage());
			               System.out.println("SQLState: " + ex.getSQLState());
			               System.out.println("VendorError: " + ex.getErrorCode());
			          }
			          catch(Exception e1){
			            System.out.println("Problemas ao tentar conectar com o banco de dados");	
			        }
			        // fim MySQL
				
				
				
			}
		});
		CONTROLE.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Professores");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				

				 container.removeAll();  
					table = new JTable();
					
					DefaultTableModel modelo = (DefaultTableModel) table.getModel();
					
					
					table.setBounds(0, 164, 1050, 348);
			        container.add(table);
			       
			        modelo.addColumn("CPF");
			        modelo.addColumn("Area_atuacao");
			        modelo.addColumn("especializacao");

			        table.setPreferredScrollableViewportSize(new Dimension(650, 180));
			         
			        Container c = container;
			      c.setLayout(new FlowLayout());
			      JScrollPane scrollPane = new JScrollPane(table);
			        c.add(scrollPane);
			             
			        scrollPane.setSize(600, 300);
			        scrollPane.setVisible(true);  
			        
			        // exibe os dados da tabela MySQL
			        try{
			          Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			          Connection conn = DriverManager.getConnection("jdbc:mysql://172.19.14.223/asherPro?user=senai&password=abc123");
			          
			          // procedimentos para obter os dados de uma tabela
			          Statement stmt = conn.createStatement();
			          String query = "SELECT * FROM professor";
			          ResultSet rs = stmt.executeQuery(query);
			          
			          while(rs.next()){ 
			            String CPF = rs.getString("CPF");
			            String Area_atuacao = rs.getString("Area_atuacao");
			            String especializacao = rs.getString("especializacao");

			            modelo.addRow(new Object[]{new String(CPF),Area_atuacao,especializacao});
			          }
			               
			          // fim procedimento para obter os dados
			          } 
			          catch(SQLException ex){
			               System.out.println("SQLException: " + ex.getMessage());
			               System.out.println("SQLState: " + ex.getSQLState());
			               System.out.println("VendorError: " + ex.getErrorCode());
			          }
			          catch(Exception e1){
			            System.out.println("Problemas ao tentar conectar com o banco de dados");	
			        }
			        // fim MySQL
				
				
				
				
			}
		});
		CONTROLE.add(btnNewButton_8);
		
		JButton btnNewButton_8_1 = new JButton("Colaboradores");
		btnNewButton_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				

				 container.removeAll();  
					table = new JTable();
					
					DefaultTableModel modelo = (DefaultTableModel) table.getModel();
					
					
					table.setBounds(0, 164, 1050, 348);
			        container.add(table);
			       
			        modelo.addColumn("CPF");
			        modelo.addColumn("RG");
			        modelo.addColumn("Nome");
			        modelo.addColumn("Data de Nascimento");
			        modelo.addColumn("Sexo");
			        modelo.addColumn("Cargo");
			        modelo.addColumn("Telefone");
			        modelo.addColumn("Email");
			        

			        table.setPreferredScrollableViewportSize(new Dimension(650, 180));
			         
			        Container c = container;
			      c.setLayout(new FlowLayout());
			      JScrollPane scrollPane = new JScrollPane(table);
			        c.add(scrollPane);
			             
			        scrollPane.setSize(600, 300);
			        scrollPane.setVisible(true);  
			        
			        // exibe os dados da tabela MySQL
			        try{
			          Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			          Connection conn = DriverManager.getConnection("jdbc:mysql://172.19.14.223/asherPro?user=senai&password=abc123");
			               
			          // procedimentos para obter os dados de uma tabela
			          Statement stmt = conn.createStatement();
			          String query = "SELECT * FROM colaborador";
			          ResultSet rs = stmt.executeQuery(query);
			          
			          while(rs.next()){ 
			        	String RG = rs.getString("RG"); 
			            String CPF = rs.getString("CPF");
			            String Nome = rs.getString("Nome"); 
			            String DN = rs.getString("Data_Nasci"); 
			            String Sexo = rs.getString("Sexo"); 
			            String Cargo = rs.getString("cargoTitulo"); 
			            String Telefone = rs.getString("telefone"); 
			            String email = rs.getString("email"); 
			            

			            modelo.addRow(new Object[]{new String(CPF),RG,Nome,DN,Sexo,Cargo,Telefone,email});
			          }
			               
			          // fim procedimento para obter os dados
			          } 
			          catch(SQLException ex){
			               System.out.println("SQLException: " + ex.getMessage());
			               System.out.println("SQLState: " + ex.getSQLState());
			               System.out.println("VendorError: " + ex.getErrorCode());
			          }
			          catch(Exception e1){
			            System.out.println("Problemas ao tentar conectar com o banco de dados");	
			        }
			        // fim MySQL
				
				
				
			
			}
		});
		CONTROLE.add(btnNewButton_8_1);
		
		JPanel professores = new JPanel();
		layeredPane.setLayer(professores, 0);
		professores.setBounds(90, 0, 727, 524);
		layeredPane.add(professores);
		professores.setLayout(null);
		
		JLabel lblNewLabel_32_2 = new JLabel("SISTEMA DE GESTÃO ESCOLAR - SENAI AREIAS");
		lblNewLabel_32_2.setBounds(10, 23, 707, 19);
		lblNewLabel_32_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_32_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		professores.add(lblNewLabel_32_2);
		
		JLabel lblNewLabel_33 = new JLabel("CPF:");
		lblNewLabel_33.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_33.setBounds(272, 91, 150, 14);
		professores.add(lblNewLabel_33);
		
		JFormattedTextField ftf_pCPF = new JFormattedTextField(Mascara.Mascara("###.###.###-##"));
		ftf_pCPF.setBounds(272, 116, 150, 20);
		professores.add(ftf_pCPF);
		
		JLabel lblNewLabel_34 = new JLabel("Area de atuação:");
		lblNewLabel_34.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_34.setBounds(272, 147, 150, 14);
		professores.add(lblNewLabel_34);
		
		tf_areaAtuacao = new JTextField();
		tf_areaAtuacao.setBounds(272, 172, 150, 20);
		professores.add(tf_areaAtuacao);
		tf_areaAtuacao.setColumns(10);
		
		JLabel lblNewLabel_33_1 = new JLabel("Especialização:");
		lblNewLabel_33_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_33_1.setBounds(272, 203, 150, 14);
		professores.add(lblNewLabel_33_1);
		
		tf_especializacao = new JTextField();
		tf_especializacao.setColumns(10);
		tf_especializacao.setBounds(272, 228, 150, 20);
		professores.add(tf_especializacao);
		
		JButton btnpCad = new JButton("Cadastrar");
		btnpCad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String CPF, area_atuacao, especializacao;
			
			CPF = ftf_pCPF.getText();
			area_atuacao = tf_areaAtuacao.getText();
			especializacao = tf_especializacao.getText();
			
			funcoes.cadastroProfessor(CPF, area_atuacao, especializacao);
			
			
			
			}
		});
		btnpCad.setBounds(272, 269, 150, 23);
		professores.add(btnpCad);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			

				String CPF, area_atuacao, especializacao;
				
				CPF = ftf_pCPF.getText();
				area_atuacao = tf_areaAtuacao.getText();
				especializacao = tf_especializacao.getText();
				
				funcoes.atualizarProfessor(area_atuacao, especializacao, CPF);
			
			}
		});
		btnAtualizar.setBounds(272, 304, 150, 23);
		professores.add(btnAtualizar);
		
		JButton btnDeletar_1 = new JButton("Deletar");
		btnDeletar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			

				String CPF;
				
				CPF = ftf_pCPF.getText();
			
				
				funcoes.deletarProfessor( CPF);
			
			}
		});
		btnDeletar_1.setBounds(272, 338, 150, 23);
		professores.add(btnDeletar_1);
		
		JLabel lblNewLabel_32_2_1 = new JLabel("GESTÃO DE PROFESSORES");
		lblNewLabel_32_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_32_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_32_2_1.setBounds(10, 42, 707, 19);
		professores.add(lblNewLabel_32_2_1);
		
		JPanel cursos = new JPanel();
		layeredPane.setLayer(cursos, 0);
		cursos.setBounds(90, 0, 727, 523);
		layeredPane.add(cursos);
		cursos.setLayout(null);
		
		JLabel lblNewLabel_35 = new JLabel("SISTEMA DE GESTÃO ESCOLAR - SENAI AREIAS");
		lblNewLabel_35.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_35.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_35.setBounds(10, 23, 707, 14);
		cursos.add(lblNewLabel_35);
		
		JLabel lblNewLabel_35_1 = new JLabel("GESTÃO DE CURSOS");
		lblNewLabel_35_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_35_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_35_1.setBounds(10, 43, 707, 14);
		cursos.add(lblNewLabel_35_1);
		
		JLabel lblNewLabel_36 = new JLabel("COD:");
		lblNewLabel_36.setBounds(20, 68, 46, 14);
		cursos.add(lblNewLabel_36);
		
		tf_ccod = new JFormattedTextField(Mascara.Mascara("###"));
		tf_ccod.setBounds(10, 91, 55, 20);
		cursos.add(tf_ccod);
		tf_ccod.setColumns(10);
		
		JLabel lblNewLabel_37 = new JLabel("Titulo:");
		lblNewLabel_37.setBounds(386, 68, 46, 14);
		cursos.add(lblNewLabel_37);
		
		tf_ctitulo = new JTextField();
		tf_ctitulo.setColumns(10);
		tf_ctitulo.setBounds(386, 91, 157, 20);
		cursos.add(tf_ctitulo);
		
		JLabel lblNewLabel_38 = new JLabel("Descrição:");
		lblNewLabel_38.setBounds(10, 142, 86, 14);
		cursos.add(lblNewLabel_38);
		
		tf_cdescricao = new JTextField();
		tf_cdescricao.setColumns(10);
		tf_cdescricao.setBounds(10, 167, 293, 20);
		cursos.add(tf_cdescricao);
		
		JLabel lblNewLabel_39 = new JLabel("Area tecnologica:");
		lblNewLabel_39.setBounds(10, 201, 157, 14);
		cursos.add(lblNewLabel_39);
		
		tf_carea = new JTextField();
		tf_carea.setColumns(10);
		tf_carea.setBounds(10, 233, 157, 20);
		cursos.add(tf_carea);
		
		JLabel lblNewLabel_40 = new JLabel("Carga horária: ");
		lblNewLabel_40.setBounds(10, 264, 105, 14);
		cursos.add(lblNewLabel_40);
		
		tf_choraria = new JTextField();
		tf_choraria.setBounds(13, 289, 86, 20);
		cursos.add(tf_choraria);
		tf_choraria.setColumns(10);
		
		JLabel lblNewLabel_41 = new JLabel("Conteudo:");
		lblNewLabel_41.setBounds(388, 142, 132, 14);
		cursos.add(lblNewLabel_41);
		
		tf_cconteudo = new JTextField();
		tf_cconteudo.setColumns(10);
		tf_cconteudo.setBounds(386, 167, 243, 20);
		cursos.add(tf_cconteudo);
		
		JLabel lblNewLabel_41_1 = new JLabel("Nível:");
		lblNewLabel_41_1.setBounds(16, 319, 132, 14);
		cursos.add(lblNewLabel_41_1);
		
		JRadioButton rdbap = new JRadioButton("Aperfeiçoamento");
		buttonGroup_2.add(rdbap);
		rdbap.setBounds(10, 340, 148, 23);
		cursos.add(rdbap);
		
		JRadioButton rdbq = new JRadioButton("Qualificação Profissional");
		buttonGroup_2.add(rdbq);
		rdbq.setBounds(10, 366, 176, 23);
		cursos.add(rdbq);
		
		JRadioButton rdbt = new JRadioButton("Técnico");
		buttonGroup_2.add(rdbt);
		rdbt.setBounds(10, 392, 176, 23);
		cursos.add(rdbt);
		
		JButton btnccad = new JButton("Cadastrar");
		btnccad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String cod,titulo,area_tec,carga_h,conteudo,nivel,descricao;
			
			cod = tf_ccod.getText();
			titulo = tf_ctitulo.getText();
			area_tec = tf_carea.getText();
			carga_h = tf_choraria.getText();
			conteudo = tf_cconteudo.getText();
			descricao = tf_cdescricao.getText();
			nivel = "";
			
			if (rdbap.isSelected()) {
				
				nivel = "Aperfeiçoamento";
				
			}else if (rdbq.isSelected()) {
				
				nivel = "Qualificação Profissional";
				
			}else if (rdbt.isSelected()) {
				
				nivel = "Técnico";
				
			}
			
			funcoes.cadastroCurso( titulo, descricao, area_tec, carga_h, conteudo, nivel);
			
			}
		});
		btnccad.setBounds(497, 329, 132, 23);
		cursos.add(btnccad);
		
		JButton btncat = new JButton("Atualizar");
		btncat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				String cod,titulo,area_tec,carga_h,conteudo,nivel, descricao;
				
				cod = tf_ccod.getText();
				titulo = tf_ctitulo.getText();
				area_tec = tf_carea.getText();
				carga_h = tf_choraria.getText();
				conteudo = tf_cconteudo.getText();
				descricao = tf_cdescricao.getText();
				nivel = "";
				
				if (rdbap.isSelected()) {
					
					nivel = "Aperfeiçoamento";
					
				}else if (rdbq.isSelected()) {
					
					nivel = "Qualificação Profissional";
					
				}else if (rdbt.isSelected()) {
					
					nivel = "Técnico";
					
				}funcoes.atualizarCurso(titulo, descricao,area_tec, carga_h, conteudo, nivel, cod);
				
			}
		});
		btncat.setBounds(497, 364, 132, 23);
		cursos.add(btncat);
		
		JButton btncdel = new JButton("Deletar");
		btncdel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String cod;
				
				cod = tf_ccod.getText();
				funcoes.deletarCurso(cod);
				
				
				
			}
		});
		btncdel.setBounds(497, 396, 132, 23);
		cursos.add(btncdel);
		
		JPanel matriculas = new JPanel();
		layeredPane.setLayer(matriculas, 0);
		matriculas.setBounds(90, 0, 727, 524);
		layeredPane.add(matriculas);
		matriculas.setLayout(null);
		
		JLabel lblNewLabel_35_2 = new JLabel("SISTEMA DE GESTÃO ESCOLAR - SENAI AREIAS");
		lblNewLabel_35_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_35_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_35_2.setBounds(10, 23, 707, 14);
		matriculas.add(lblNewLabel_35_2);
		
		JLabel lblNewLabel_35_1_1 = new JLabel("GESTÃO DE MÁTRICULAS");
		lblNewLabel_35_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_35_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_35_1_1.setBounds(10, 45, 707, 14);
		matriculas.add(lblNewLabel_35_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 70, 727, 2);
		matriculas.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 329, 727, 2);
		matriculas.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(191, 70, 10, 259);
		matriculas.add(separator_2);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1.setBounds(439, 70, 10, 259);
		matriculas.add(separator_2_1);
		
		JPanel container2 = new JPanel();
		container2.setBackground(SystemColor.activeCaption);
		container2.setBounds(10, 329, 708, 184);
		matriculas.add(container2);
		
		JLabel lblNewLabel_42 = new JLabel("Cadastro de turmas");
		lblNewLabel_42.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_42.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_42.setBounds(440, 80, 287, 14);
		matriculas.add(lblNewLabel_42);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 105, 727, 2);
		matriculas.add(separator_3);
		
		JLabel lblNewLabel_42_1 = new JLabel("Cadastro de alunos nas turmas");
		lblNewLabel_42_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_42_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_42_1.setBounds(211, 83, 228, 14);
		matriculas.add(lblNewLabel_42_1);
		
		JLabel lblNewLabel_42_1_1 = new JLabel("Dados das turmas");
		lblNewLabel_42_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_42_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_42_1_1.setBounds(0, 83, 201, 14);
		matriculas.add(lblNewLabel_42_1_1);
		
		JLabel lblNewLabel_43 = new JLabel("COD:");
		lblNewLabel_43.setBounds(459, 108, 46, 14);
		matriculas.add(lblNewLabel_43);
		
		tf_codTurma = new JFormattedTextField(Mascara.Mascara("###"));
		tf_codTurma.setBounds(459, 133, 56, 20);
		matriculas.add(tf_codTurma);
		tf_codTurma.setColumns(10);
		
		JLabel lblNewLabel_44 = new JLabel("Curso:");
		lblNewLabel_44.setBounds(459, 164, 46, 14);
		matriculas.add(lblNewLabel_44);
		
		tf_curso = new JFormattedTextField(Mascara.Mascara("###"));
		tf_curso.setBounds(459, 181, 46, 20);
		matriculas.add(tf_curso);
		tf_curso.setColumns(10);
		
		JLabel lblNewLabel_45 = new JLabel("Turno:");
		lblNewLabel_45.setBounds(459, 212, 46, 14);
		matriculas.add(lblNewLabel_45);
		
		tf_Turno = new JTextField();
		tf_Turno.setBounds(459, 231, 86, 20);
		matriculas.add(tf_Turno);
		tf_Turno.setColumns(10);
		
		JLabel lblNewLabel_46 = new JLabel("Data de ínicio");
		lblNewLabel_46.setBounds(614, 108, 86, 14);
		matriculas.add(lblNewLabel_46);
		
		tf_datai = new JFormattedTextField(Mascara.Mascara("##/##/####"));
		tf_datai.setBounds(614, 133, 86, 20);
		matriculas.add(tf_datai);
		tf_datai.setColumns(10);
		
		JLabel lblNewLabel_46_1 = new JLabel("Data de término:");
		lblNewLabel_46_1.setBounds(614, 164, 86, 14);
		matriculas.add(lblNewLabel_46_1);
		
		tf_dataT = new JFormattedTextField(Mascara.Mascara("##/##/####"));
		tf_dataT.setColumns(10);
		tf_dataT.setBounds(614, 181, 86, 20);
		matriculas.add(tf_dataT);
		
		tf_cpfProf = new JFormattedTextField(Mascara.Mascara("###.###.###-##"));
		tf_cpfProf.setBounds(458, 280, 108, 20);
		matriculas.add(tf_cpfProf);
		tf_cpfProf.setColumns(10);
		
		JLabel lblNewLabel_47 = new JLabel("CPF do Professor:");
		lblNewLabel_47.setBounds(458, 257, 108, 14);
		matriculas.add(lblNewLabel_47);
		
		JButton btnCadTurma = new JButton("Cadastrar");
		btnCadTurma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String curso,turno, data_inicio,data_termino, professor;
			
			curso = tf_curso.getText();
			turno = tf_Turno.getText();
			data_inicio = tf_datai.getText();
			data_termino = tf_dataT.getText();
			professor = tf_cpfProf.getText();
			
			funcoes.cadastroTurma(curso,turno, data_inicio, data_termino, professor);
			}
		});
		btnCadTurma.setBounds(604, 231, 96, 23);
		matriculas.add(btnCadTurma);
		
		JButton btnDeletar_2 = new JButton("Deletar");
		btnDeletar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String cod;
				cod = tf_codTurma.getText();
				
				funcoes.deletarTurma(cod);
				
			}
		});
		btnDeletar_2.setBounds(604, 257, 96, 23);
		matriculas.add(btnDeletar_2);
		
		JLabel lblNewLabel_48 = new JLabel("COD TURMA:");
		lblNewLabel_48.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_48.setBounds(257, 108, 101, 14);
		matriculas.add(lblNewLabel_48);
		
		JFormattedTextField ftf_CODTURMA = new JFormattedTextField(Mascara.Mascara("###"));
		ftf_CODTURMA.setBounds(286, 133, 38, 20);
		matriculas.add(ftf_CODTURMA);
		
		JLabel lblNewLabel_49 = new JLabel("Registro Aluno:");
		lblNewLabel_49.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_49.setBounds(257, 164, 101, 14);
		matriculas.add(lblNewLabel_49);
		
		JFormattedTextField ftf_regA = new JFormattedTextField(Mascara.Mascara("#####"));
		ftf_regA.setHorizontalAlignment(SwingConstants.CENTER);
		ftf_regA.setBounds(278, 181, 56, 20);
		matriculas.add(ftf_regA);
		
		JButton btnCadTurma_1 = new JButton("Cadastrar");
		btnCadTurma_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String cod, RA;
			
			cod = ftf_CODTURMA.getText();
			RA = ftf_regA.getText();
			
			funcoes.cadastroTurmaA(cod, RA);
			
			}
		});
		btnCadTurma_1.setBounds(257, 231, 105, 23);
		matriculas.add(btnCadTurma_1);
		
		JButton btnDeletar_2_1 = new JButton("Deletar");
		btnDeletar_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String cod, RA;
				
				cod = ftf_CODTURMA.getText();
				RA = ftf_regA.getText();
				
				funcoes.deletarTurmaA(cod,RA);
			}
		});
		btnDeletar_2_1.setBounds(257, 257, 105, 23);
		matriculas.add(btnDeletar_2_1);
		
		JLabel lblNewLabel_50 = new JLabel("COD TURMA:");
		lblNewLabel_50.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_50.setBounds(39, 118, 114, 14);
		matriculas.add(lblNewLabel_50);
		
		JFormattedTextField ftf_codturmadados = new JFormattedTextField((Mascara.Mascara("###")));
		ftf_codturmadados.setBounds(74, 143, 31, 20);
		matriculas.add(ftf_codturmadados);
		
		JButton btnverificar = new JButton("Checar Turma");
		btnverificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					container2.removeAll();  
					container2.revalidate();
					container2.repaint();
					String cod;
					cod = ftf_codturmadados.getText();
					table = new JTable();
				  
					DefaultTableModel modelo = (DefaultTableModel) table.getModel();
			        
			        
					table.setBounds(0, 0, 859, 392);
			        container2.add(table);
			       
			        modelo.addColumn("curso");
			        modelo.addColumn("turno");
			        modelo.addColumn("data_inicio");
			        modelo.addColumn("data_termino");
			        modelo.addColumn("professor");
			       
			        table.setPreferredScrollableViewportSize(new Dimension(560, 180));
			         
			        Container c = container2;
			      c.setLayout(new FlowLayout());
			      JScrollPane scrollPane = new JScrollPane(table);
			        c.add(scrollPane);
			             
			        scrollPane.setSize(600, 300);
			        scrollPane.setVisible(true);  
			        // exibe os dados da tabela MySQL
			        try{
			          Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			          Connection conn = DriverManager.getConnection("jdbc:mysql://172.19.14.223/asherPro?user=senai&password=abc123");
			         
			          // procedimentos para obter os dados de uma tabela
			          Statement stmt = conn.createStatement();
			          String query = "SELECT * FROM turma " + "WHERE cod=" + cod;
			          ResultSet rs = stmt.executeQuery(query);
			        
			          while(rs.next()){ 
			        	    String curso = rs.getString("curso");
					        String turno = rs.getString("turno");
					        String data_inicio = rs.getString("data_inicio");
					        String data_termino = rs.getString("data_termino");
					        String professor = rs.getString("professor");
					  
					       modelo.addRow(new Object[]{new String(curso),turno,data_inicio,data_termino,professor});

				          }
			            //modelo.addRow(new Object[]{new String(cod),Registro_Aluno});
			          }
			        
			
			          catch(SQLException ex){
			               System.out.println("SQLException: " + ex.getMessage());
			               System.out.println("SQLState: " + ex.getSQLState());
			               System.out.println("VendorError: " + ex.getErrorCode());
			          }
			          catch(Exception e1){
			            System.out.println("Problemas ao tentar conectar com o banco de dados");	
			        }
			        // fim MySQL
				
				
			}
		});
		
		btnverificar.setBounds(28, 230, 137, 23);
		matriculas.add(btnverificar);
		
		JButton btnChecarAlunosNa = new JButton("Lista de alunos");
		btnChecarAlunosNa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			


				container2.removeAll();  
				container2.revalidate();
				container2.repaint();
				String cod;
				cod = ftf_codturmadados.getText();
				table = new JTable();
			  
				DefaultTableModel modelo = (DefaultTableModel) table.getModel();
		        
		        
				table.setBounds(0, 0, 859, 392);
		        container2.add(table);
		       
		        modelo.addColumn("Código da turma");
		        modelo.addColumn("Registro do Aluno");
		        modelo.addColumn("Nome Aluno");
		        String registro;
		        registro = "00000";
		        
		       
		        table.setPreferredScrollableViewportSize(new Dimension(550, 180));
		         
		        Container c = container2;
		      c.setLayout(new FlowLayout());
		      JScrollPane scrollPane = new JScrollPane(table);
		        c.add(scrollPane);
		             
		        scrollPane.setSize(600, 300);
		        scrollPane.setVisible(true);  
		       // funcoes.ReceberDadosAluno(registro);
		       
		        
		        // exibe os dados da tabela MySQL
		        try{
		          Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		          Connection conn = DriverManager.getConnection("jdbc:mysql://172.19.14.223/asherPro?user=senai&password=abc123");
		         
		          // procedimentos para obter os dados de uma tabela
		          Statement stmt = conn.createStatement();
		          String query = "SELECT * FROM turma_aux WHERE cod=" + cod;
		          ResultSet rs = stmt.executeQuery(query);
		        
		          while(rs.next()){ 
		        	  
		        	  	String Nome_aluno = rs.getString("Nome");
		        	    String cod1 = rs.getString("cod");
				        String RA = rs.getString("Registro_Aluno");
				        funcoes.ReceberDadosAluno(RA);
				        Nome_aluno =  funcoes.variavelaux;
				       modelo.addRow(new Object[]{new String(cod1),RA,Nome_aluno});

			          }
		            //modelo.addRow(new Object[]{new String(cod),Registro_Aluno});
		          }
		        
		
		          catch(SQLException ex){
		               System.out.println("SQLException: " + ex.getMessage());
		               System.out.println("SQLState: " + ex.getSQLState());
		               System.out.println("VendorError: " + ex.getErrorCode());
		          }
		          catch(Exception e1){
		            System.out.println("Problemas ao tentar conectar com o banco de dados");	
		        }
		        // fim MySQL
			
			
			
			
			}
		});
		btnChecarAlunosNa.setBounds(28, 257, 137, 23);
		matriculas.add(btnChecarAlunosNa);
		
		barraUTI_1 = new JPanel();
		barraUTI_1.setBackground(SystemColor.activeCaptionBorder);
		barraUTI_1.setBounds(0, 0, 90, 524);
		//if (funcoes.validar == true) {
		frame.getContentPane().add(barraUTI_1);
		barraUTI_1.setLayout(null);
	//	}
		JButton btnAluno_1 = new JButton("Aluno");
		btnAluno_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			boolean validar = funcoes.validar;
			if (validar == true) {
			Switch_screens(aluno);
			}
			}
		});
		btnAluno_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnAluno_1.setBackground(SystemColor.activeCaptionBorder);
		btnAluno_1.setForeground(SystemColor.textHighlightText);
		btnAluno_1.setBounds(-10, 10, 107, 23);
		barraUTI_1.add(btnAluno_1);
		
		JButton btnColaborador_1 = new JButton("Colaborador");
		btnColaborador_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean validar = funcoes.validar;
				if (validar == true) {
			Switch_screens(colaboradores);
				}
			}
		});
		btnColaborador_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnColaborador_1.setBackground(SystemColor.activeCaptionBorder);
		btnColaborador_1.setForeground(SystemColor.textHighlightText);
		btnColaborador_1.setBounds(-10, 70, 107, 23);
		barraUTI_1.add(btnColaborador_1);
		
		JButton btnProf_1 = new JButton("Professor");
		btnProf_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean validar = funcoes.validar;
				if (validar == true) {
			Switch_screens(professores);
				}
			}
		});
		btnProf_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnProf_1.setBackground(SystemColor.activeCaptionBorder);
		btnProf_1.setForeground(SystemColor.textHighlightText);
		btnProf_1.setBounds(-10, 100, 107, 23);
		barraUTI_1.add(btnProf_1);
		
		JButton btnCursos_1 = new JButton("Curso");
		btnCursos_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean validar = funcoes.validar;
				if (validar == true) {
				Switch_screens(cursos)
				;
				}
			}
		});
		btnCursos_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnCursos_1.setBackground(SystemColor.activeCaptionBorder);
		btnCursos_1.setForeground(SystemColor.textHighlightText);
		btnCursos_1.setBounds(-10, 130, 107, 23);
		barraUTI_1.add(btnCursos_1);
		
		JButton btnDesconectar = new JButton("Desconectar");
		btnDesconectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			Switch_screens(menu);
			funcoes.validar = false;
			}
		});
		btnDesconectar.setHorizontalAlignment(SwingConstants.LEFT);
		btnDesconectar.setForeground(Color.WHITE);
		btnDesconectar.setBackground(SystemColor.textInactiveText);
		btnDesconectar.setBounds(-10, 501, 119, 23);
		barraUTI_1.add(btnDesconectar);
		
		JButton btnCargos = new JButton("Cargos");
		btnCargos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean validar = funcoes.validar;
				if (validar == true) {
			Switch_screens(cargos);
				}
			}
		});
		btnCargos.setBackground(SystemColor.activeCaptionBorder);
		btnCargos.setForeground(new Color(255, 255, 255));
		btnCargos.setHorizontalAlignment(SwingConstants.LEFT);
		btnCargos.setBounds(-10, 40, 119, 23);
		barraUTI_1.add(btnCargos);
		
		JButton btnVisualizacao = new JButton("Visualização");
		btnVisualizacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean validar = funcoes.validar;
				if (validar == true) {
			Switch_screens(visualizacao);
				}
			}
		});
		btnVisualizacao.setHorizontalAlignment(SwingConstants.LEFT);
		btnVisualizacao.setForeground(Color.WHITE);
		btnVisualizacao.setBackground(SystemColor.activeCaptionBorder);
		btnVisualizacao.setBounds(-10, 470, 107, 23);
		barraUTI_1.add(btnVisualizacao);
		
		JButton btnMatriculas = new JButton("Matriculas");
		btnMatriculas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean validar = funcoes.validar;
				if (validar == true) {
			Switch_screens(matriculas);
				}
			}
		});
		btnMatriculas.setHorizontalAlignment(SwingConstants.LEFT);
		btnMatriculas.setForeground(Color.WHITE);
		btnMatriculas.setBackground(SystemColor.activeCaptionBorder);
		btnMatriculas.setBounds(-10, 160, 107, 23);
		barraUTI_1.add(btnMatriculas);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Debug");
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (funcoes.validar == false) {
					
					funcoes.validar = true;
					
					}else if (funcoes.validar == true) {
						
						funcoes.validar = false;
						
					}
			
			}
		});
		tglbtnNewToggleButton.setHorizontalAlignment(SwingConstants.LEFT);
		tglbtnNewToggleButton.setForeground(Color.WHITE);
		tglbtnNewToggleButton.setBackground(SystemColor.activeCaptionBorder);
		tglbtnNewToggleButton.setBounds(-10, 440, 121, 23);
		barraUTI_1.add(tglbtnNewToggleButton);
	}
	
	public void Switch_screens(JPanel p) {

        layeredPane.removeAll();
        layeredPane.add(p);
        layeredPane.repaint();
        layeredPane.revalidate();
    }
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Opções");
			putValue(SHORT_DESCRIPTION, "");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}

	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Deslogar");
			putValue(SHORT_DESCRIPTION, "");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
