package funcoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import funcoes.conexao;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;
import java.text.ParseException;
import java.awt.Container;
import java.awt.Font;
import java.security.PublicKey;

import javax.swing.SwingConstants;

public class funcoes {
	public static String variavelaux = "";
	public static boolean validar = false;
	private static JPanel menu;
	public static void cadastroAluno( String CPF,String RG,String Nome,String data_nasc, String sexo, String endereco,String escolaridade,String nome_mae, String nome_pai, String telefone, String email) {

	        //Passo 1 - Qual comando SQL?
	        String sql = "INSERT INTO aluno " + "(CPF,RG, Nome, Data_Nascimento, Sexo, endereco, escolaridade, nome_mae, nome_pai, telefone, email)" + "VALUES (?,?,?,?, ?, ?, ?,?,?,?,?)";
	       
	        //Passo 2 - Preparar a conexão
	        conexao novaConexao = new conexao();
	        Connection conectar = novaConexao.getConexao();
	        PreparedStatement preparar = null;
	        ResultSet resultados = null;

	        //Passo 3 - Tentar executar o SQL
	        try {
	            preparar = conectar.prepareStatement(sql);
	            preparar.setString(1, CPF);
	            preparar.setString(2, RG);
	            preparar.setString(3, Nome);
	            preparar.setString(4, data_nasc);
	            preparar.setString(5, sexo);
	            preparar.setString(6, endereco);
	            preparar.setString(7, escolaridade);
	            preparar.setString(8, nome_mae);
	            preparar.setString(9, nome_pai);
	            preparar.setString(10, telefone);
	            preparar.setString(11, email);
	            preparar.execute();
	            
	            JOptionPane.showMessageDialog(null,"Aluno cadastrado");
	        }catch(Exception erro) {
	        	System.out.println("Falha ao realizar cadastro do Aluno");
	            System.err.println(erro.getMessage());
	        }
	       
	       
	    }
	  public static void cadastroProduto(String Descricao,String categoria,String marca,String Valor) {

	        //Passo 1 - Qual comando SQL?
	        String sql = "INSERT INTO produto " + "( Descricao, categoria, marca, valor)" + "VALUES (?,?,?, ?)";
	       
	        //Passo 2 - Preparar a conexão
	        conexao novaConexao = new conexao();
	        Connection conectar = novaConexao.getConexao();
	        PreparedStatement preparar = null;
	        ResultSet resultados = null;

	        //Passo 3 - Tentar executar o SQL
	        try {
	            preparar = conectar.prepareStatement(sql);
	            preparar.setString(1, Descricao);
	            preparar.setString(2, categoria);
	            preparar.setString(3, marca);
	            preparar.setString(4, Valor);
	            preparar.execute();
	            
	            JOptionPane.showMessageDialog(null,"Produto Cadastrado");
	        }catch(Exception erro) {
	        	System.out.println("Falha ao realizar cadastro do produto");
	            System.err.println(erro.getMessage());
	        }
	       
	       
	    }
	  public static void cadastroVendedor( String CPF,String RG,String nome, String data_nasc, String sexo, String CTPS, String Endereco) {

	        //Passo 1 - Qual comando SQL?
	        String sql = "INSERT INTO vendedor " + "(CPF, RG,nome, data_nasc, sexo,CTPS, Endereco)" + "VALUES (?,?,?,?,?, ?, ?)";
	       
	        //Passo 2 - Preparar a conexão
	        conexao novaConexao = new conexao();
	        Connection conectar = novaConexao.getConexao();
	        PreparedStatement preparar = null;
	        ResultSet resultados = null;

	        //Passo 3 - Tentar executar o SQL
	        try {
	            preparar = conectar.prepareStatement(sql);
	            preparar.setString(1, CPF);
	            preparar.setString(2, RG);
	            preparar.setString(3, nome);
	            preparar.setString(4, data_nasc);
	            preparar.setString(5, sexo);
	            preparar.setString(6, CTPS);
	            preparar.setString(7, Endereco);
	            preparar.execute();
	            
	            JOptionPane.showMessageDialog(null,"Vendedor Cadastrado");
	        }catch(Exception erro) {
	        	System.out.println("Falha ao realizar cadastro do Vendedor");
	            System.err.println(erro.getMessage());
	        }
	       
	       
	    }
	  public static void cadastroVenda( String COD_VENDA,String Data,String Vendedor,String cliente, String produtos, String valor, String pagamento_Forma) {

	        //Passo 1 - Qual comando SQL?
	        String sql = "INSERT INTO venda " + "(COD_VENDA,Data, Vendedor, cliente, Produto, valor, pagamento_Forma)" + "VALUES (?,?,?,?, ?, ?, ?)";
	       
	        //Passo 2 - Preparar a conexão
	        conexao novaConexao = new conexao();
	        Connection conectar = novaConexao.getConexao();
	        PreparedStatement preparar = null;
	        ResultSet resultados = null;

	        //Passo 3 - Tentar executar o SQL
	        try {
	            preparar = conectar.prepareStatement(sql);
	            preparar.setString(1, COD_VENDA);
	            preparar.setString(2, Data);
	            preparar.setString(3, Vendedor);
	            preparar.setString(4, cliente);
	            preparar.setString(5, produtos);
	            preparar.setString(6, valor);
	            preparar.setString(7, pagamento_Forma);
	            preparar.execute();
	            
	            JOptionPane.showMessageDialog(null,"Venda cadastrada");
	        }catch(Exception erro) {
	        	System.out.println("Falha ao realizar cadastro da venda");
	            System.err.println(erro.getMessage());
	        }
	        /*Data date primary key,
		    Vendedor bigint not null,
		    cliente bigint not null,
		    produtos int not null,
		    valor decimal(10.2) not null,
		    pagamento_Forma varchar(60) not null,
		*/  
	       
	    }
	  public static void deletarCadastro( String CPF) {

	        //Passo 1 - Qual comando SQL?
	        String sql = "DELETE FROM cliente " + "WHERE CPF = " + "(?)";
	       
	        //Passo 2 - Preparar a conexão
	        conexao novaConexao = new conexao();
	        Connection conectar = novaConexao.getConexao();
	        PreparedStatement preparar = null;
	        ResultSet resultados = null;

	        //Passo 3 - Tentar executar o SQL
	        try {
	            preparar = conectar.prepareStatement(sql);
	            preparar.setString(1, CPF);
	            preparar.execute();
	            
	            JOptionPane.showMessageDialog(null,"Cliente excluido");
	        }catch(Exception erro) {
	        	System.out.println("Falha ao realizar a exclusão de cliente");
	            System.err.println(erro.getMessage());
	        }
	       
	       
	    }
	  private Container layeredPane;
	  public MaskFormatter Mascara(String Mascara){
          
          MaskFormatter F_Mascara = new MaskFormatter();
          try{
              F_Mascara.setMask(Mascara); //Atribui a mascara
              F_Mascara.setPlaceholderCharacter('#'); //Caracter para preencimento
          }
          catch (Exception excecao) {
          excecao.printStackTrace();
          }
          return F_Mascara;
   }
	  public static void deletarVendedor( String CPF) {

	        //Passo 1 - Qual comando SQL?
	        String sql = "DELETE FROM vendedor " + "WHERE CPF = " + "(?)";
	       
	        //Passo 2 - Preparar a conexão
	        conexao novaConexao = new conexao();
	        Connection conectar = novaConexao.getConexao();
	        PreparedStatement preparar = null;
	        ResultSet resultados = null;

	        //Passo 3 - Tentar executar o SQL
	        try {
	            preparar = conectar.prepareStatement(sql);
	            preparar.setString(1, CPF);
	            preparar.execute();
	            
	            JOptionPane.showMessageDialog(null,"Vendedor excluido");
	        }catch(Exception erro) {
	        	System.out.println("Falha ao realizar a exclusão de vendedor");
	            System.err.println(erro.getMessage());
	        }
	       
	       
	    }
	  public static void deletarProduto( String COD) {

	        //Passo 1 - Qual comando SQL?
	        String sql = "DELETE FROM produto " + "WHERE COD = " + "(?)";
	       
	        //Passo 2 - Preparar a conexão
	        conexao novaConexao = new conexao();
	        Connection conectar = novaConexao.getConexao();
	        PreparedStatement preparar = null;
	        ResultSet resultados = null;

	        //Passo 3 - Tentar executar o SQL
	        try {
	            preparar = conectar.prepareStatement(sql);
	            preparar.setString(1, COD);
	            preparar.execute();
	            
	            JOptionPane.showMessageDialog(null,"Produto excluido");
	        }catch(Exception erro) {
	        	System.out.println("Falha ao realizar a exclusão de produto");
	            System.err.println(erro.getMessage());
	        }
	       
	       
	    }
	  public static void checkProduto(String COD) {
	       
	        //Passo 1 - Comando SQL
	        String sql = "SELECT Descricao FROM produto " + "WHERE COD=?";
	       
	        //Passo 2 - Preparar a conexão
	        conexao novaConexao = new conexao();
	        Connection conectar = novaConexao.getConexao();
	        PreparedStatement preparar = null;
	        ResultSet resultados = null;
	       
	        //Passo 3 - Tentar executar o SQL
	        try {
	            preparar = conectar.prepareStatement(sql);
	            preparar.setString(1, COD);
	            resultados = preparar.executeQuery();
	        }catch(Exception erro) {
	            JOptionPane.showMessageDialog(null,"Falha ao consultar");
	            System.err.println(erro.getMessage());
	        }
	     
	        //Passo 4 - Tentar mostrar os resultados
	        try {
	            if(resultados.next()) {
	                JOptionPane.showMessageDialog(null,"Produto existente");
	            }else {
	                JOptionPane.showMessageDialog(null,"Dados incorretos");
	            }
	        }catch(Exception erro) {
	            JOptionPane.showMessageDialog(null,"Falha, não há resultados");
	            System.err.println(erro.getMessage());
	        }
	       
	       
	       
	    }
	  public static void cadastroUsuario( String UsuarioC,String SenhaC) {

	        //Passo 1 - Qual comando SQL?
	        String sql = "INSERT INTO usuario " + "(Usuario, Senha)" + "VALUES (?,?)";
	       
	        //Passo 2 - Preparar a conexão
	        conexao novaConexao = new conexao();
	        Connection conectar = novaConexao.getConexao();
	        PreparedStatement preparar = null;
	        ResultSet resultados = null;

	        //Passo 3 - Tentar executar o SQL
	        try {
	            preparar = conectar.prepareStatement(sql);
	            preparar.setString(1, UsuarioC);
	            preparar.setString(2, SenhaC);
	            preparar.execute();
	            
	            JOptionPane.showMessageDialog(null,"Usuario cadastrado");
	        }catch(Exception erro) {
	        	System.out.println("Falha ao realizar cadastro");
	            System.err.println(erro.getMessage());
	        }
	       
	       
	    }
	  public static void fazerLogin(String Usuario,String Senha) {
	       
	        //Passo 1 - Comando SQL
	        String sql = "SELECT * FROM usuario " + "WHERE Usuario=? AND Senha=?";
	       
	        //Passo 2 - Preparar a conexão
	        conexao novaConexao = new conexao();
	        Connection conectar = novaConexao.getConexao();
	        PreparedStatement preparar = null;
	        ResultSet resultados = null;
	       
	        //Passo 3 - Tentar executar o SQL
	        try {
	            preparar = conectar.prepareStatement(sql);
	            preparar.setString(1, Usuario);
	            preparar.setString(2, Senha);
	            resultados = preparar.executeQuery();
	        }catch(Exception erro) {
	            JOptionPane.showMessageDialog(null,"Falha ao consultar");
	            System.err.println(erro.getMessage());
	        }
	       
	        //Passo 4 - Tentar mostrar os resultados
	        try {
	            if(resultados.next()) {
	                JOptionPane.showMessageDialog(null,"Acesso Garantido");
	                validar = true;
	                //System.out.println(validar);
	            }else {
	                JOptionPane.showMessageDialog(null,"Usuário ou Senha incorretos");
	                validar = false;
	               // System.out.println(validar);
	            }
	        }catch(Exception erro) {
	            JOptionPane.showMessageDialog(null,"Falha, não há resultados");
	            System.err.println(erro.getMessage());
	        }
	       
	       
	       
	    }
	  public static void atualizarAluno(String CPF,String RG,String Nome,String data_nasc, String sexo, String endereco,String escolaridade,String nome_mae, String nome_pai, String telefone, String email, String registro) {

	        //Passo 1 - Qual comando SQL?
	        String sql = "UPDATE aluno SET CPF= " + "?" +
	                                    ", RG=" + "?" +
	                                    ", Nome=" + "?" +
	                                    ", Data_Nascimento=" + "?" +
	                                    ", Sexo=" + "?" +
	                                    ", endereco=" + "?" +
	                                    ", escolaridade=" + "?" +
	                                    ", nome_mae=" + "?" +
	                                    ", nome_pai=" + "?" +
	                                    ", telefone=" + "?" +
	                                    ", email=" + "?" +
	                                    "WHERE registro=" + "?";
	       
	        //Passo 2 - Preparar a conexão
	        conexao novaConexao = new conexao();
	        Connection conectar = novaConexao.getConexao();
	        PreparedStatement preparar = null;
	        ResultSet resultados = null;
	       
	        //Passo 3 - Tentar executar o SQL
	        try {
	            preparar = conectar.prepareStatement(sql);
	            preparar.setString(1, CPF);
	            preparar.setString(2, RG);
	            preparar.setString(3, Nome);
	            preparar.setString(4, data_nasc);
	            preparar.setString(5, sexo);
	            preparar.setString(6, endereco);
	            preparar.setString(7, escolaridade);
	            preparar.setString(8, nome_mae);
	            preparar.setString(9, nome_pai);
	            preparar.setString(10, telefone);
	            preparar.setString(11, email);
	            preparar.setString(12, registro);
	            preparar.execute();
	            JOptionPane.showMessageDialog(null,
	            "Aluno atualizado.");
	        }catch(Exception erro) {
	            JOptionPane.showMessageDialog(null,"Falha ao atualizar!");
	            System.err.println(erro.getMessage());
	        }
	  }
	  public static void deletarAluno( String registro) {

	        //Passo 1 - Qual comando SQL?
	        String sql = "DELETE FROM aluno " + "WHERE registro = " + "(?)";
	       
	        //Passo 2 - Preparar a conexão
	        conexao novaConexao = new conexao();
	        Connection conectar = novaConexao.getConexao();
	        PreparedStatement preparar = null;
	        ResultSet resultados = null;

	        //Passo 3 - Tentar executar o SQL
	        try {
	            preparar = conectar.prepareStatement(sql);
	            preparar.setString(1, registro);
	            preparar.execute();
	            
	            JOptionPane.showMessageDialog(null,"Aluno excluido");
	        }catch(Exception erro) {
	        	System.out.println("Falha ao realizar a exclusão de aluno");
	            System.err.println(erro.getMessage());
	        }
	       
	       
	    }
	  public static void cadastroCargo( String Titulo,String Descricao,String Salario) {

	        //Passo 1 - Qual comando SQL?
	        String sql = "INSERT INTO cargo " + "(titulo,descricao, salario)" + "VALUES (?,?,?)";
	       
	        //Passo 2 - Preparar a conexão
	        conexao novaConexao = new conexao();
	        Connection conectar = novaConexao.getConexao();
	        PreparedStatement preparar = null;
	        ResultSet resultados = null;

	        //Passo 3 - Tentar executar o SQL
	        try {
	            preparar = conectar.prepareStatement(sql);
	            preparar.setString(1, Titulo);
	            preparar.setString(2, Descricao);
	            preparar.setString(3, Salario);
	            preparar.execute();
	            
	            JOptionPane.showMessageDialog(null,"Cargo cadastrado");
	        }catch(Exception erro) {
	        	System.out.println("Falha ao realizar cadastro do cargo");
	            System.err.println(erro.getMessage());
	        }
	       
	       
	    }
	  public static void deletarCargo( String cod) {

	        //Passo 1 - Qual comando SQL?
	        String sql = "DELETE FROM cargo " + "WHERE cod = " + "(?)";
	       
	        //Passo 2 - Preparar a conexão
	        conexao novaConexao = new conexao();
	        Connection conectar = novaConexao.getConexao();
	        PreparedStatement preparar = null;
	        ResultSet resultados = null;

	        //Passo 3 - Tentar executar o SQL
	        try {
	            preparar = conectar.prepareStatement(sql);
	            preparar.setString(1, cod);
	            preparar.execute();
	            
	            JOptionPane.showMessageDialog(null,"Cargo excluido");
	        }catch(Exception erro) {
	        	System.out.println("Falha ao realizar a exclusão de cargo");
	            System.err.println(erro.getMessage());
	        }
	       
	       
	    }
	  public static void atualizarCargo(String titulo,String descricao,String salario, String cod) {

	        //Passo 1 - Qual comando SQL?
	        String sql = "UPDATE cargo SET titulo= " + "?" +
	                                    ", descricao=" + "?" +
	                                    ", salario=" + "?" +
	                                    "WHERE cod=" + "?";
	       
	        //Passo 2 - Preparar a conexão
	        conexao novaConexao = new conexao();
	        Connection conectar = novaConexao.getConexao();
	        PreparedStatement preparar = null;
	        ResultSet resultados = null;
	       
	        //Passo 3 - Tentar executar o SQL
	        try {
	            preparar = conectar.prepareStatement(sql);
	            preparar.setString(1, titulo);
	            preparar.setString(2, descricao);
	            preparar.setString(3, salario);
	            preparar.setString(4, cod);
	            preparar.execute();
	            JOptionPane.showMessageDialog(null,
	            "Cargo atualizado.");
	        }catch(Exception erro) {
	            JOptionPane.showMessageDialog(null,"Falha ao atualizar!");
	            System.err.println(erro.getMessage());
	        }
	  }
	  public static void ReceberDadoscargo(String cod) {
		  
		  //Passo 1 - Comando SQL
	        String sql = "SELECT * FROM cargo " + "WHERE cod=?";
	       
	        //Passo 2 - Preparar a conexão
	        conexao novaConexao = new conexao();
	        Connection conectar = novaConexao.getConexao();
	        PreparedStatement preparar = null;
	        ResultSet resultados = null;
	       String variavel = "";
	        //Passo 3 - Tentar executar o SQL
	        try {
	            preparar = conectar.prepareStatement(sql);
	            preparar.setString(1, cod);
	            
	            resultados = preparar.executeQuery();
	        }catch(Exception erro) {
	            JOptionPane.showMessageDialog(null,"Falha ao consultar");
	            System.err.println(erro.getMessage());
	        }
	       
	        //Passo 4 - Tentar mostrar os resultados
	        try {
	            if(resultados.next()) {
	            	 variavel = resultados.getString("Titulo");
	                JOptionPane.showMessageDialog(null,"Sucesso!");
	                
	                //System.out.println(validar);
	            }else {
	                JOptionPane.showMessageDialog(null,"cod incorreto");
	                validar = false;
	               // System.out.println(validar);
	            }
	        }catch(Exception erro) {
	            JOptionPane.showMessageDialog(null,"Falha, não há resultados");
	            System.err.println(erro.getMessage());
	        }
		  
	      
		          variavelaux = variavel;         
		          
			
		  
	  }
	  public static void cadastroColaborador( String CPF,String RG,String Nome,String data_nasc, String sexo, String endereco,String escolaridade,String cargo, String telefone, String email, String cargoTitulo) {

	        //Passo 1 - Qual comando SQL?
	        String sql = "INSERT INTO colaborador " + "(CPF,RG, Nome, Data_Nasci, Sexo, endereco, escolaridade,cargo, telefone, email, cargoTitulo)" + "VALUES (?,?,?, ?, ?, ?,?,?,?,?,?)";
	       
	        //Passo 2 - Preparar a conexão
	        conexao novaConexao = new conexao();
	        Connection conectar = novaConexao.getConexao();
	        PreparedStatement preparar = null;
	        ResultSet resultados = null;

	        //Passo 3 - Tentar executar o SQL
	        try {
	            preparar = conectar.prepareStatement(sql);
	            preparar.setString(1, CPF);
	            preparar.setString(2, RG);
	            preparar.setString(3, Nome);
	            preparar.setString(4, data_nasc);
	            preparar.setString(5, sexo);
	            preparar.setString(6, endereco);
	            preparar.setString(7, escolaridade);
	            preparar.setString(8, cargo);
	            preparar.setString(9, telefone);
	            preparar.setString(10, email);
	            preparar.setString(11, cargoTitulo);
	            preparar.execute();
	            
	            JOptionPane.showMessageDialog(null,"Colaborador cadastrado");
	        }catch(Exception erro) {
	        	System.out.println("Falha ao realizar cadastro do colaborador");
	            System.err.println(erro.getMessage());
	        }
	       
	       
	    }
	  public static void atualizarColaborador(String RG,String Nome,String data_nasc, String sexo, String endereco,String escolaridade,String cargo, String telefone, String email, String cargoTitulo, String CPF) {

	        //Passo 1 - Qual comando SQL?
	        String sql = "UPDATE colaborador SET RG= " + "?" +
	                                    ", Nome=" + "?" +
	                                    ", Data_Nasci=" + "?" +
	                                    ", Sexo=" + "?" +
	                                    ", endereco=" + "?" +
	                                    ", escolaridade=" + "?" +
	                                    ", cargo=" + "?" +
	                                    ", telefone=" + "?" +
	                                    ", email=" + "?" +
	                                    ", cargoTitulo=" + "?" +
	                                    "WHERE CPF=" + "?";
	       
	        //Passo 2 - Preparar a conexão
	        conexao novaConexao = new conexao();
	        Connection conectar = novaConexao.getConexao();
	        PreparedStatement preparar = null;
	        ResultSet resultados = null;
	       
	        //Passo 3 - Tentar executar o SQL
	        try {
	            preparar = conectar.prepareStatement(sql);
	            preparar.setString(1, RG);
	            preparar.setString(2, Nome);
	            preparar.setString(3, data_nasc);
	            preparar.setString(4, sexo);
	            preparar.setString(5, endereco);
	            preparar.setString(6, escolaridade);
	            preparar.setString(7, cargo);
	            preparar.setString(8, telefone);
	            preparar.setString(9, email);
	            preparar.setString(10, cargoTitulo);
	            preparar.setString(11, CPF);
	            preparar.execute();
	            JOptionPane.showMessageDialog(null,
	            "Colaborador atualizado.");
	        }catch(Exception erro) {
	            JOptionPane.showMessageDialog(null,"Falha ao atualizar!");
	            System.err.println(erro.getMessage());
	        }
	  }
	  public static void cadastroProfessor( String CPF,String Area_atuacao, String especializacao) {

	        //Passo 1 - Qual comando SQL?
	        String sql = "INSERT INTO professor " + "(CPF,Area_atuacao,especializacao)" + "VALUES (?,?,?)";
	       
	        //Passo 2 - Preparar a conexão
	        conexao novaConexao = new conexao();
	        Connection conectar = novaConexao.getConexao();
	        PreparedStatement preparar = null;
	        ResultSet resultados = null;

	        //Passo 3 - Tentar executar o SQL
	        try {
	            preparar = conectar.prepareStatement(sql);
	            preparar.setString(1, CPF);
	            preparar.setString(2, Area_atuacao);
	            preparar.setString(3, especializacao);
	          
	            preparar.execute();
	            
	            JOptionPane.showMessageDialog(null,"Professor cadastrado");
	        }catch(Exception erro) {
	        	System.out.println("Falha ao realizar cadastro do professor");
	            System.err.println(erro.getMessage());
	        }
	       
	       
	    }
	  public static void atualizarProfessor(String Area_atuacao, String especializacao, String CPF) {

	        //Passo 1 - Qual comando SQL?
	        String sql = "UPDATE professor SET Area_atuacao= " + "?" +
	                                    ", especializacao=" + "?" +
	                                    "WHERE CPF=" + "?";
	       
	        //Passo 2 - Preparar a conexão
	        conexao novaConexao = new conexao();
	        Connection conectar = novaConexao.getConexao();
	        PreparedStatement preparar = null;
	        ResultSet resultados = null;
	       
	        //Passo 3 - Tentar executar o SQL
	        try {
	            preparar = conectar.prepareStatement(sql);
	            preparar.setString(1, Area_atuacao);
	            preparar.setString(2, especializacao);
	            preparar.setString(3, CPF);
	          
	            preparar.execute();
	            JOptionPane.showMessageDialog(null,
	            "Professor atualizado.");
	        }catch(Exception erro) {
	            JOptionPane.showMessageDialog(null,"Falha ao atualizar!");
	            System.err.println(erro.getMessage());
	        }
	  }
	  public static void deletarProfessor( String CPF) {

	        //Passo 1 - Qual comando SQL?
	        String sql = "DELETE FROM Professor " + "WHERE CPF= " + "(?)";
	       
	        //Passo 2 - Preparar a conexão
	        conexao novaConexao = new conexao();
	        Connection conectar = novaConexao.getConexao();
	        PreparedStatement preparar = null;
	        ResultSet resultados = null;

	        //Passo 3 - Tentar executar o SQL
	        try {
	            preparar = conectar.prepareStatement(sql);
	            preparar.setString(1, CPF);
	            preparar.execute();
	            
	            JOptionPane.showMessageDialog(null,"Professor excluido");
	        }catch(Exception erro) {
	        	System.out.println("Falha ao realizar a exclusão de professor");
	            System.err.println(erro.getMessage());
	        }
	       
	       
	    }
	  public static void cadastroCurso(String Titulo, String descricao,String area_tecnologica, String carga_horaria, String conteudo,String  nivel) {

	        //Passo 1 - Qual comando SQL?
	        String sql = "INSERT INTO curso " + "(Titulo, descricao,area_tecnologica, carga_horaria, conteudo, nivel)" + "VALUES (?,?,?,?,?,?)";
	       
	        //Passo 2 - Preparar a conexão
	        conexao novaConexao = new conexao();
	        Connection conectar = novaConexao.getConexao();
	        PreparedStatement preparar = null;
	        ResultSet resultados = null;

	        //Passo 3 - Tentar executar o SQL
	        try {
	            preparar = conectar.prepareStatement(sql);
	            preparar.setString(1, Titulo);
	            preparar.setString(2, descricao);
	            preparar.setString(3, area_tecnologica);
	            preparar.setString(4, carga_horaria);
	            preparar.setString(5, conteudo);
	            preparar.setString(6,  nivel);
	          
	            preparar.execute();
	            
	            JOptionPane.showMessageDialog(null,"Curso cadastrado");
	        }catch(Exception erro) {
	        	System.out.println("Falha ao realizar cadastro do curso");
	            System.err.println(erro.getMessage());
	        }
	       
	       
	    }
	  public static void atualizarCurso(String Titulo, String descricao,String area_tecnologica, String carga_horaria, String conteudo,String  nivel, String cod) {


	        //Passo 1 - Qual comando SQL?
	        String sql = "UPDATE curso SET Titulo= " + "?" +
	        							", descricao=" + "?" +
	                                    ", area_tecnologica=" + "?" +
	                                    ", carga_horaria=" + "?" +
	                                    ", conteudo=" + "?" +
	                                    ", nivel=" + "?" +
	                                    "WHERE cod=" + "?";
	       
	        //Passo 2 - Preparar a conexão
	        conexao novaConexao = new conexao();
	        Connection conectar = novaConexao.getConexao();
	        PreparedStatement preparar = null;
	        ResultSet resultados = null;
	       
	        //Passo 3 - Tentar executar o SQL
	        try {
	            preparar = conectar.prepareStatement(sql);
	            preparar.setString(1, Titulo);
	            preparar.setString(2, descricao);
	            preparar.setString(3, area_tecnologica);
	            preparar.setString(4, carga_horaria);
	            preparar.setString(5, conteudo);
	            preparar.setString(6, nivel);
	            preparar.setString(7, cod);
	          
	            preparar.execute();
	            JOptionPane.showMessageDialog(null,
	            "Curso atualizado.");
	        }catch(Exception erro) {
	            JOptionPane.showMessageDialog(null,"Falha ao atualizar!");
	            System.err.println(erro.getMessage());
	        }
	        
	  }
	  
	  public static void deletarCurso( String cod) {

	        //Passo 1 - Qual comando SQL?
	        String sql = "DELETE FROM curso " + "WHERE cod= " + "(?)";
	       
	        //Passo 2 - Preparar a conexão
	        conexao novaConexao = new conexao();
	        Connection conectar = novaConexao.getConexao();
	        PreparedStatement preparar = null;
	        ResultSet resultados = null;

	        //Passo 3 - Tentar executar o SQL
	        try {
	            preparar = conectar.prepareStatement(sql);
	            preparar.setString(1, cod);
	            preparar.execute();
	            
	            JOptionPane.showMessageDialog(null,"Curso excluido");
	        }catch(Exception erro) {
	        	System.out.println("Falha ao realizar a exclusão de curso");
	            System.err.println(erro.getMessage());
	        }
	       
	       
	    
}
	  public static void cadastroTurma( String curso, String turno,String data_inicio, String data_termino,String professor) {

    //Passo 1 - Qual comando SQL?
    String sql = "INSERT INTO turma " + "( curso,turno,data_inicio, data_termino, professor)" + "VALUES (?,?,?,?,?)";
   
    //Passo 2 - Preparar a conexão
    conexao novaConexao = new conexao();
    Connection conectar = novaConexao.getConexao();
    PreparedStatement preparar = null;
    ResultSet resultados = null;

    //Passo 3 - Tentar executar o SQL
    try {
        preparar = conectar.prepareStatement(sql);
        preparar.setString(1, curso);
        preparar.setString(2, turno);
        preparar.setString(3, data_inicio);
        preparar.setString(4, data_termino);
        preparar.setString(5, professor);
      
        preparar.execute();
        
        JOptionPane.showMessageDialog(null,"Turma cadastrada");
    }catch(Exception erro) {
    	System.out.println("Falha ao realizar cadastro da Turma");
        System.err.println(erro.getMessage());
    }
   
   
}
	  public static void deletarTurma( String cod) {

	        //Passo 1 - Qual comando SQL?
	        String sql = "DELETE FROM turma " + "WHERE cod= " + "(?)";
	       
	        //Passo 2 - Preparar a conexão
	        conexao novaConexao = new conexao();
	        Connection conectar = novaConexao.getConexao();
	        PreparedStatement preparar = null;
	        ResultSet resultados = null;

	        //Passo 3 - Tentar executar o SQL
	        try {
	            preparar = conectar.prepareStatement(sql);
	            preparar.setString(1, cod);
	            preparar.execute();
	            
	            JOptionPane.showMessageDialog(null,"Turma excluida");
	        }catch(Exception erro) {
	        	System.out.println("Falha ao realizar a exclusão de turma");
	            System.err.println(erro.getMessage());
	        }
	       
	       
	    }
	  public static void cadastroTurmaA( String cod,String Registro_Aluno) {

		    //Passo 1 - Qual comando SQL?
		    String sql = "INSERT INTO turma_aux " + "( cod, Registro_Aluno, Nome)" + "VALUES (?,?,?)";
		   
		    //Passo 2 - Preparar a conexão
		    conexao novaConexao = new conexao();
		    Connection conectar = novaConexao.getConexao();
		    PreparedStatement preparar = null;
		    ResultSet resultados = null;
		    
		    //Passo 3 - Tentar executar o SQL
		    try {
		        preparar = conectar.prepareStatement(sql);
		        preparar.setString(1, cod);
		        preparar.setString(2, Registro_Aluno);
		        funcoes.ReceberDadosAluno(Registro_Aluno);
		        preparar.setString(3, funcoes.variavelaux);
		        preparar.execute();
		        
		        JOptionPane.showMessageDialog(null,"Aluno cadastrado na turma");
		    }catch(Exception erro) {
		    	System.out.println("Falha ao realizar cadastro");
		        System.err.println(erro.getMessage());
		    }
		   
		   
		}
	  public static void deletarTurmaA( String cod, String Registro_Aluno) {

	        //Passo 1 - Qual comando SQL?
	        String sql = "DELETE FROM turma_aux " + "WHERE cod= " + "(?)" + "AND Registro_Aluno= " + "(?)";;
	       
	        //Passo 2 - Preparar a conexão
	        conexao novaConexao = new conexao();
	        Connection conectar = novaConexao.getConexao();
	        PreparedStatement preparar = null;
	        ResultSet resultados = null;

	        //Passo 3 - Tentar executar o SQL
	        try {
	            preparar = conectar.prepareStatement(sql);
	            preparar.setString(1, cod);
	            preparar.setString(2, Registro_Aluno);
	            preparar.execute();
	            
	            JOptionPane.showMessageDialog(null,"Aluno removido da turma");
	        }catch(Exception erro) {
	        	System.out.println("Falha ao realizar a exclusão do aluno");
	            System.err.println(erro.getMessage());
	        }
	       
	  }
	  public static void ReceberDadosAluno(String registro) {
		  
		  //Passo 1 - Comando SQL
	        String sql = "SELECT * FROM aluno " + "WHERE registro=?";
	       
	        //Passo 2 - Preparar a conexão
	        conexao novaConexao = new conexao();
	        Connection conectar = novaConexao.getConexao();
	        PreparedStatement preparar = null;
	        ResultSet resultados = null;
	       String variavel = "";
	        //Passo 3 - Tentar executar o SQL
	        try {
	            preparar = conectar.prepareStatement(sql);
	            preparar.setString(1, registro);
	            
	            resultados = preparar.executeQuery();
	        }catch(Exception erro) {
	            JOptionPane.showMessageDialog(null,"Falha ao consultar");
	            System.err.println(erro.getMessage());
	        }
	       
	        //Passo 4 - Tentar mostrar os resultados
	        try {
	            if(resultados.next()) {
	            	 variavelaux = resultados.getString("Nome");
	                //JOptionPane.showMessageDialog(null,"Sucesso!");
	                
	                //System.out.println(validar);
	            }else {
	                JOptionPane.showMessageDialog(null,"cod incorreto");
	                validar = false;
	               // System.out.println(validar);
	            }
	        }catch(Exception erro) {
	            JOptionPane.showMessageDialog(null,"Falha, não há resultados");
	            System.err.println(erro.getMessage());
	        }
		  
	      
		             
		          
			
		  
	  }
	  }
	  



