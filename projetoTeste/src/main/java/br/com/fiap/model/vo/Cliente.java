package br.com.fiap.model.vo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cliente {
	
	private int cpf_clie;
	private String nome_clie;
	private String sobrenome_clie;
	private String email_clie;
	private int tel_clie;
	private String estado_clie;
	
	public Cliente() {
		
	}
	
	public Cliente(int cpf_clie, String nome_clie, String sobrenome_clie, String email_clie, int tel_clie, String estado_clie) {
		this.cpf_clie = cpf_clie;
		this.nome_clie = nome_clie;
		this.sobrenome_clie = sobrenome_clie;
		this.email_clie = email_clie;
		this.tel_clie = tel_clie;
		this.estado_clie = estado_clie;
	}

	public int getCpf_clie() {
		return cpf_clie;
	}

	public void setCpf_clie(int cpf_clie) {
		this.cpf_clie = cpf_clie;
	}

	public String getNome_clie() {
		return nome_clie;
	}

	public void setNome_clie(String nome_clie) {
		this.nome_clie = nome_clie;
	}

	public String getSobrenome_clie() {
		return sobrenome_clie;
	}

	public void setSobrenome_clie(String sobrenome_clie) {
		this.sobrenome_clie = sobrenome_clie;
	}

	public String getEmail_clie() {
		return email_clie;
	}

	public void setEmail_clie(String email_clie) {
		this.email_clie = email_clie;
	}

	public int getTel_clie() {
		return tel_clie;
	}

	public void setTel_clie(int tel_clie) {
		this.tel_clie = tel_clie;
	}

	public String getEstado_clie() {
		return estado_clie;
	}

	public void setEstado_clie(String estado_clie) {
		this.estado_clie = estado_clie;
	}
	
	

}
