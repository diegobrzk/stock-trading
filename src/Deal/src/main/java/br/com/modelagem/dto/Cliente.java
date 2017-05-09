package br.com.modelagem.dto;

public class Cliente 
{
	private String nome;
	private Double saldo;

	public Cliente()
	{
		setNome("Ford");
		setSaldo(100D);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
}
