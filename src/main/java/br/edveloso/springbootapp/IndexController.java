package br.edveloso.springbootapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edveloso.springbootapp.modelo.Cliente;
import br.edveloso.springbootapp.persistencia.ClienteRepository;

public class IndexController {

	public ClienteRepository getClienteRepository() {
		return clienteRepository;
	}

	public void setClienteRepository(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	@Autowired
	@Qualifier(value="ClienteRepository")
	private ClienteRepository clienteRepository;

    @RequestMapping(value="/clientes")
    public List<Cliente> error() {
        return (List<Cliente>) clienteRepository.findAll();
    }

}