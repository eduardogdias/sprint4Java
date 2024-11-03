package br.com.fiap.main;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.http.client.ClientProtocolException;

import br.com.fiap.model.Endereco;
import br.com.fiap.services.ViacepService;

public class TesteViacepApi {
	public static void main(String[] args) throws ClientProtocolException, IOException {
		
		//Instanciar os objetos
		ViacepService viaCep = new ViacepService();
		
		String cep = JOptionPane.showInputDialog("Informe o CEP: ");
		
		Endereco endereco = viaCep.getEndereco(cep);
		
		JOptionPane.showMessageDialog(null, endereco, null, JOptionPane.ERROR_MESSAGE);
		
		System.out.println(endereco);
		
	}
}
