package br.com.fiap.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.conexao.Conexao;
import br.com.fiap.model.vo.Veiculo;

public class VeiculoDAO {
	
public Connection minhaConexao;
	
	public VeiculoDAO(){
		this.minhaConexao = new Conexao().abrirConexao();
	}
		
	
	
	// Insert 
	public void inserir (Veiculo veiculo){
		
		String sql = "INSERT INTO veiculo VALUES (?, ?, ?, ?)";
		try {
			PreparedStatement stmt = minhaConexao.prepareStatement(sql);
			stmt.setString(1, veiculo.getPlaca_veic());
			stmt.setString(2, veiculo.getMarca_veic());
			stmt.setString(3, veiculo.getModelo_veic());
			stmt.setInt(4, veiculo.getAno_veic());
			stmt.execute();
			stmt.close();	
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
	}
	
	
	
	// Delete
	public void deletar(String placa) {
		
		String sql = "DELETE FROM veiculo WHERE placa_veic = ?";
		try {
			PreparedStatement stmt = minhaConexao.prepareStatement (sql);
			stmt.setString(1, placa);
			stmt.execute();
			stmt.close();	
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
	}
	
	
	
	// UpDate 
	public void atualizar(Veiculo veiculo) {
		
		String sql = " UPDATE veiculo SET marca_veic = ?, modelo_veic = ?, ano_veic = ?  where placa_veic = ?";		
		try {
			PreparedStatement stmt = minhaConexao.prepareStatement(sql);
			stmt.setString(1, veiculo.getMarca_veic());
			stmt.setString(2, veiculo.getModelo_veic());
			stmt.setInt(3, veiculo.getAno_veic());
			stmt.setString(4, veiculo.getPlaca_veic());
			stmt.executeUpdate();
			stmt.close();	
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
	}
	
	
	
	// Select 
	public List<Veiculo> listar(){
		
		List<Veiculo> listaVeiculo = new ArrayList<Veiculo>();
		String sql = "SELECT * FROM veiculo";
		 
		try {
			PreparedStatement stmt = minhaConexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Veiculo veiculo = new Veiculo();
				veiculo.setPlaca_veic(rs.getString("placa_veic"));
				veiculo.setMarca_veic(rs.getString("marca_veic"));
				veiculo.setModelo_veic(rs.getString("modelo_veic"));
				veiculo.setAno_veic(rs.getInt("ano_veic"));
				listaVeiculo.add(veiculo);
			}		
			return listaVeiculo;		
		
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
			
	}
	
}