package br.com.modelagem.dto;

import java.util.Date;

public class Ordem
{
	private Double valor;
	private Date data;
	private Cliente cliente;
	
	public Double getValor()
	{
		return valor;
	}
	
	public void setValor(Double valor)
	{
		this.valor = valor;
	}
	
	public Date getData()
	{
		return data;
	}
	
	public void setData(Date data)
	{
		this.data = data;
	}
	
	public Cliente getCliente()
	{
		return cliente;
	}
	
	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}
	
}
