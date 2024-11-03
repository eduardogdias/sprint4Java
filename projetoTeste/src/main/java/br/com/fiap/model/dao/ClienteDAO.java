package br.com.fiap.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.conexao.Conexao;
import br.com.fiap.model.vo.Cliente;

public class ClienteDAO {
	
public Connection minhaConexao;
	
	public ClienteDAO(){
		this.minhaConexao = new Conexao().abrirConexao();
	}
		
	
	
	// Insert 
	public void inserir (Cliente cliente){
		
		String sql = "INSERT INTO cliente VALUES (?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = minhaConexao.prepareStatement(sql);
			stmt.setInt(1, cliente.getCpf_clie());
			stmt.setString(2, cliente.getNome_clie());
			stmt.setString(3, cliente.getSobrenome_clie());
			stmt.setString(4, cliente.getEmail_clie());
			stmt.setInt(5, cliente.getTel_clie());
			stmt.setString(6, cliente.getEstado_clie());
			stmt.execute();
			stmt.close();			
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
	}
	
	
	
	// Delete
	public void deletar(int cpf) {
		
		String sql = "DELETE FROM cliente WHERE cpf_clie = ?";
		try {
			PreparedStatement stmt = minhaConexao.prepareStatement (sql);
			stmt.setInt(1, cpf);
			stmt.execute();
			stmt.close();	
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
	}
	
	
	
	// UpDate 
	public void atualizar(Cliente cliente) {
		
		String sql = " UPDATE cliente SET nome_clie = ?, sobrenome_clie = ?, email_clie = ?, tel_clie = ? , estado_clie = ?  where cpf_clie = ?";		
		try {
			PreparedStatement stmt = minhaConexao.prepareStatement(sql);
			stmt.setString(1, cliente.getNome_clie());
			stmt.setString(2, cliente.getSobrenome_clie());
			stmt.setString(3, cliente.getEmail_clie());
			stmt.setInt(4, cliente.getTel_clie());
			stmt.setString(5, cliente.getEstado_clie());
			stmt.setInt(6, cliente.getCpf_clie());
			stmt.executeUpdate();
			stmt.close();	
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
	}
	
	
	
	// Select 
	public List<Cliente> listar(){
		
		List<Cliente> listaCliente = new ArrayList<Cliente>();
		String sql = "SELECT * FROM cliente";
		 
		try {
			PreparedStatement stmt = minhaConexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setCpf_clie(rs.getInt("cpf_clie"));
				cliente.setNome_clie(rs.getString("nome_clie"));
				cliente.setSobrenome_clie(rs.getString("sobrenome_clie"));
				cliente.setEmail_clie(rs.getString("email_clie"));
				cliente.setTel_clie(rs.getInt("tel_clie"));
				cliente.setEstado_clie(rs.getString("estado_clie"));
				listaCliente.add(cliente);
			}		
			return listaCliente;		
		
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
			
	}
	
}