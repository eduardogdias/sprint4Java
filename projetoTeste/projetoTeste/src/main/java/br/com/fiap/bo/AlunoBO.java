package br.com.fiap.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.beans.Aluno;
import br.com.fiap.dao.AlunoDAO;

public class AlunoBO {

	AlunoDAO alunoDAO = null;
	
	//inserir
	public void inserirBO(Aluno aluno) throws ClassNotFoundException, SQLException {
		
		AlunoDAO alunoDAO = new AlunoDAO();
		
		//Aplicação de regras de negócio... (se houver)
		
		alunoDAO.inserir(aluno);
		
	}
	
	//atualizar
	public void atualizarBO(Aluno aluno) throws ClassNotFoundException, SQLException {
		
		AlunoDAO alunoDAO = new AlunoDAO();
		
		//Aplicação de regra de negócio... (se houver)
		
		alunoDAO.atualizar(aluno);
		
	}
	
	//deletar
	public void deletarBO(int rm) throws ClassNotFoundException, SQLException {
		
		AlunoDAO alunoDAO = new AlunoDAO();
		
		//Aplicação de regra de negócio... (se houver)
		
		alunoDAO.deletar(rm);
	}
	
	
	//selecionar
	public ArrayList<Aluno> selecionarBO() throws ClassNotFoundException, SQLException{
		
		AlunoDAO alunoDAO = new AlunoDAO();
		return (ArrayList<Aluno>) alunoDAO.selecionar();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
