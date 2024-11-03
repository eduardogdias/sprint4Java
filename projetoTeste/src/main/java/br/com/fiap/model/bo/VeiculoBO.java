package br.com.fiap.model.bo;

import java.util.ArrayList;

import br.com.fiap.model.dao.VeiculoDAO;
import br.com.fiap.model.vo.Veiculo;

public class VeiculoBO {
	
	VeiculoDAO veiculoDAO = null;
	
	//inserir
	public void inserirBO(Veiculo veiculo) {
		
		VeiculoDAO veiculoDAO = new VeiculoDAO();
		
		if(veiculo.getAno_veic() >= 1950 && veiculo.getAno_veic() <= 2024) {
			veiculoDAO.inserir(veiculo);
		}
	}
	
	//atualizar
	public void atualizarBO(Veiculo veiculo) {
		
		VeiculoDAO veiculoDAO = new VeiculoDAO();		
		veiculoDAO.atualizar(veiculo);
		
	}
	
	//deletar
	public void deletarBO(String placa) {
		
		VeiculoDAO veiculoDAO = new VeiculoDAO();		
		veiculoDAO.deletar(placa);
	}
	
	
	//selecionar
	public ArrayList<Veiculo> selecionarBO() {
		
		VeiculoDAO veiculoDAO = new VeiculoDAO();
		return (ArrayList<Veiculo>) veiculoDAO.listar();
		
	}

}