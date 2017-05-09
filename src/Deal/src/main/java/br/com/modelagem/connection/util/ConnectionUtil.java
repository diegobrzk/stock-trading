package br.com.modelagem.connection.util;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ConnectionUtil
{
	private static final int CONNECTION_TIMEOUT = 1000;
	
	public JsonObject request(final String endpoint, final HttpMethod method)
	{
		final SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
		factory.setConnectTimeout(CONNECTION_TIMEOUT);
		
		final RestTemplate restTemplate = new RestTemplate(factory);
		
		final HttpHeaders headers = new HttpHeaders();
		
		final HttpEntity<String> entity = new HttpEntity<String>(null, headers);
		
		try
		{	
			final ResponseEntity<String> response = restTemplate.exchange(endpoint, method, entity, String.class);
			
			JsonParser parser = new JsonParser();
			return parser.parse(response.getBody()).getAsJsonObject();
		}
		catch (final ResourceAccessException e)
		{
			System.out.println("Falha ao tentar conexao com endpoint:" + endpoint + ". " + e);
		}
		catch (final HttpClientErrorException e)
		{
			System.out.println("Falha ao tentar conexao com endpoint:" + endpoint + ". " + e);
		}
		
		return null;
	}
}
