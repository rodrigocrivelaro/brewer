package com.algaworks.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.algaworks.brewer.model.Cerveja;

@Controller
public class CervejasController {
	
	@RequestMapping("/cervejas/novo")
	public String novo() {
		return "cervejas/CadastroCerveja";
	}
	
	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
	public String cadastrar(@Valid Cerveja cerveja, BindingResult result) {
		
		if (result.hasErrors()) {
			System.out.println(">>> Opa tem erro aqui...");
		}
		
		System.out.println(">>>>>> SKU.." + cerveja.getSku() + " e o nome..: " + cerveja.getNome());
		return "cervejas/CadastroCerveja";
	}
	
}
