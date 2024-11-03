package br.com.fiap.model.bo;

import java.util.ArrayList;

import br.com.fiap.model.dao.ClienteDAO;
import br.com.fiap.model.vo.Cliente;

public class ClienteBO {
	
	ClienteDAO clienteDAO = null;
	
	//inserir
	public void inserirBO(Cliente cliente) {
		
		ClienteDAO clienteDAO = new ClienteDAO();
		
		//O cliente tem que inserir um Estado válido
		String[] estados = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", 
                "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", 
                "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};
		
		String estadoClienteUp = cliente.getEstado_clie().toUpperCase();
		
		for (String estado : estados) {
			if(estadoClienteUp.equals(estado)) {
				cliente.setEstado_clie(estadoClienteUp); // passa a sigla mauícula para ser inserida no bd 
				clienteDAO.inserir(cliente);
				break;
			}
		}
				
	}
	
	//atualizar
	public void atualizarBO(Cliente cliente) {
		
		ClienteDAO alunoDAO = new ClienteDAO();		
		alunoDAO.atualizar(cliente);
		
	}
	
	//deletar
	public void deletarBO(int cpf) {
		
		ClienteDAO clienteDAO = new ClienteDAO();		
		clienteDAO.deletar(cpf);
	}
	
	
	//selecionar
	public ArrayList<Cliente> selecionarBO() {
		
		ClienteDAO clienteDAO = new ClienteDAO();
		return (ArrayList<Cliente>) clienteDAO.listar();
		
	}

}
