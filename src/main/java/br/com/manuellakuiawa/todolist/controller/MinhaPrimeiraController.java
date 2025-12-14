package br.com.manuellakuiawa.todolist.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/primeiraRota")
public class MinhaPrimeiraController {

    /**
     * Métodos de acesso HTTP
     * GET - Buscar uma informação
     * POST - Adicionar um dado/informação
     * PUT - Alterar um dado/info
     * DELETE - Remover um dado
     * PATCH - Alterar somente uma parte do info/dado
     */

    //Método (funcionalidade) de uma classe
    @GetMapping("/primeiroMetodo")
    public String primeiraMensagem() { 
        return "Funcionou";
    }
}
