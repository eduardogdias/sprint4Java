package br.com.fiap.model;

public class Endereco {
	
	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String uf;
	
	public Endereco() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Endereco(String cep, String logradouro, String complemento, String bairro, String uf) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", logradouro=" + logradouro + ", complemento=" + complemento + ", bairro="
				+ bairro + ", uf=" + uf + "]";
	}	
}
