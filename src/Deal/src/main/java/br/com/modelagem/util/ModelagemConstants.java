package br.com.modelagem.util;

public class ModelagemConstants
{
	// BROKERS ENDPOINTS
	public static final String BROKER1_ENDPOINT = "http://10.72.102.102:8181/Broker";
	
	// ENDPOINTS GERAIS
	public static final String STATUS_PREGAO_ENDPOINT = BROKER1_ENDPOINT + "/status-pregao";
	
	// ENDPOINTS ORDEM
	public static final String COMPRAR_ORDEM_ENDPOINT = BROKER1_ENDPOINT + "/comprar-ordem";
	public static final String VENDER_ORDEM_ENDPOINT = BROKER1_ENDPOINT + "/vender-ordem";
	public static final String LISTA_ORDEM_ENDPOINT = BROKER1_ENDPOINT + "/lista-ordem";
	public static final String ORDEM_STATUS_ENDPOINT = BROKER1_ENDPOINT + "/ordem-status";
	
	// ENDPOINTS RELATORIO
	public static final String RELATORIO_PREGAO_ENDPOINT = BROKER1_ENDPOINT + "/relatorio-pregao";
	public static final String RELATORIO_USUARIO_ENDPOINT = BROKER1_ENDPOINT + "/relatorio-usuario";
}
