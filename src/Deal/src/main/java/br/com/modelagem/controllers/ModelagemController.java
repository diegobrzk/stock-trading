package br.com.modelagem.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

@Controller
public class ModelagemController
{
	@RequestMapping("/status-pregao")
	@ResponseBody
	public String pregaoStatus()
	{
		JsonObject json = new JsonObject();
		json.addProperty("status", true);
		
		Gson gson = new Gson();
		
		return gson.toJson(json);
	}
	
	@RequestMapping(value = "/comprar-ordem", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<String> comprarOrdem(@RequestBody final String request)
	{
		System.out.println(request);
		
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
}
