package br.com.modelagem.services;

import static br.com.modelagem.util.ModelagemConstants.STATUS_PREGAO_ENDPOINT;

import org.springframework.http.HttpMethod;

import com.google.gson.JsonObject;

import br.com.modelagem.connection.util.ConnectionUtil;

public class ModelagemService
{
	public boolean consultarStatusPregao()
	{
		final ConnectionUtil connection = new ConnectionUtil();
		
		final JsonObject response = connection.request(STATUS_PREGAO_ENDPOINT, HttpMethod.GET);
		
		return response != null ? response.get("status").getAsBoolean() : false;
	}
}
