package com.example.bar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.bar.model.cliente.Cliente;
import com.example.bar.repository.ClienteRepository;


@Controller
public class ClienteController {
    @Autowired
    private ClienteRepository clienterepositoty;


    @GetMapping("/")
    public String CadastraCliente(Model model){
        model.addAttribute("clientes", clienterepositoty.findAll());
        return "";
    }

    @GetMapping("/cadastro")
    public String mostrarFormulario(Model model){
        model.addAttribute("cliente", new Cliente(null, null, null, null));
        return "cadastro";
    }

    public String cadastroCliente(Cliente cliente, Object Cliente){
        ClienteRepository.Save(Cliente);
        return "redirect:/";
    }
}
