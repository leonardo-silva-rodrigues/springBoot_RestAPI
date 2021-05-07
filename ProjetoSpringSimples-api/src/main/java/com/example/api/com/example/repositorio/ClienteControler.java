package com.example.api.com.example.repositorio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteControler {
	
	@Autowired
	private ClienteRepositorio clienterepositorio;
		
	@GetMapping
	public List<Cliente> listar() {
		return clienterepositorio.findAll();
		
	}
	
	@PostMapping
	@ResponseStatus
	public Cliente adicionar( @RequestBody Cliente cliente) {
		
	return clienterepositorio.save(cliente);
	}

}
