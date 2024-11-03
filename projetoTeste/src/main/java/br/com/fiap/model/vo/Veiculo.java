package br.com.fiap.model.vo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Veiculo {
	
	private String placa_veic;
	private String marca_veic;
	private String modelo_veic;
	private int ano_veic;
	
	public Veiculo() {
		
	}
	
	public Veiculo(String placa_veic, String marca_veic, String modelo_veic, int ano_veic) {
		this.placa_veic = placa_veic;
		this.marca_veic = marca_veic;
		this.modelo_veic = modelo_veic;
		this.ano_veic = ano_veic;
	}

	public String getPlaca_veic() {
		return placa_veic;
	}

	public void setPlaca_veic(String placa_veic) {
		this.placa_veic = placa_veic;
	}

	public String getMarca_veic() {
		return marca_veic;
	}

	public void setMarca_veic(String marca_veic) {
		this.marca_veic = marca_veic;
	}

	public String getModelo_veic() {
		return modelo_veic;
	}

	public void setModelo_veic(String modelo_veic) {
		this.modelo_veic = modelo_veic;
	}

	public int getAno_veic() {
		return ano_veic;
	}

	public void setAno_veic(int ano_veic) {
		this.ano_veic = ano_veic;
	}

	
}
