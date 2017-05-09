package br.com.modelagem.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.modelagem.services.ModelagemService;
import br.com.modelagem.util.ModelagemConstants;

@Controller
public class ModelagemController
{
	@RequestMapping(value = "/ordem", method = RequestMethod.GET)
	public ModelAndView getStockList()
	{
		final ModelagemService service = new ModelagemService();
		
		final Map<String, Object> model = new HashMap<String, Object>();
		model.put("comprarOrdemUrl", ModelagemConstants.COMPRAR_ORDEM_ENDPOINT);
		model.put("venderOrdemUrl", ModelagemConstants.VENDER_ORDEM_ENDPOINT);
		model.put("statusPregao", service.consultarStatusPregao());
		
		return new ModelAndView("ordem", model);
	}
	
}
