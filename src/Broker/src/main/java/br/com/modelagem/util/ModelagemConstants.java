package br.com.modelagem.util;

public class ModelagemConstants
{
	// DEAL BROKER ENDPOINT
	public static final String DEAL_BROKER_ENDPOINT = "http://10.72.102.102:8181/Deal";
	
	// ENDPOINTS GERAIS
	public static final String STATUS_PREGAO_ENDPOINT = DEAL_BROKER_ENDPOINT + "/status-pregao";
	
	// ENDPOINTS ORDEM
	public static final String COMPRAR_ORDEM_ENDPOINT = DEAL_BROKER_ENDPOINT + "/comprar-ordem";
	public static final String VENDER_ORDEM_ENDPOINT = DEAL_BROKER_ENDPOINT + "/vender-ordem";
	public static final String LISTA_ORDEM_ENDPOINT = DEAL_BROKER_ENDPOINT + "/lista-ordem";
	public static final String ORDEM_STATUS_ENDPOINT = DEAL_BROKER_ENDPOINT + "/ordem-status";
	
	// ENDPOINTS RELATORIO
	public static final String RELATORIO_PREGAO_ENDPOINT = DEAL_BROKER_ENDPOINT + "/relatorio-pregao";
	public static final String RELATORIO_USUARIO_ENDPOINT = DEAL_BROKER_ENDPOINT + "/relatorio-usuario";
}
