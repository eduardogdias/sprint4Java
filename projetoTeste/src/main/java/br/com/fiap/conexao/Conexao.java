package br.com.fiap.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public Connection abrirConexao() {
    	
    	
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", Credenciais.user, Credenciais.pwd);
        } catch (ClassNotFoundException e) {
            System.out.println("Classe JDBC não encontrada");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Erro ao retornar a conexão");
            e.printStackTrace();
        }

        return null;
    }

    
    
    
    
}
