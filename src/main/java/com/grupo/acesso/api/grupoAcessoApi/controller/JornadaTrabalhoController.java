package com.grupo.acesso.api.grupoAcessoApi.controller;

import com.grupo.acesso.api.grupoAcessoApi.Services.JornadaTrabalhoService;
import com.grupo.acesso.api.grupoAcessoApi.model.JornadaTrabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping ("/jornada")
public class JornadaTrabalhoController {
    @Autowired
    JornadaTrabalhoService jornadaTrabalhoService;

    @GetMapping("/")
    public List <JornadaTrabalho> obterJornadas()
    {
        return jornadaTrabalhoService.ObterJornadas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<JornadaTrabalho> obterJornadaPorId(@PathVariable("id") Long id) throws Exception
    {
        return ResponseEntity.ok(jornadaTrabalhoService.ObterJornadaPorId(id).orElseThrow(() -> new NoSuchElementException("Jornada não encontrada.")));
    }

    @PostMapping("/")
    public JornadaTrabalho cadastrarJornada(@RequestBody JornadaTrabalho jornadaTrabalho)
    {
        return jornadaTrabalhoService.Cadastrar(jornadaTrabalho);
    }

    @PutMapping("/")
    public JornadaTrabalho alterarJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {

        return jornadaTrabalhoService.Atualizar(jornadaTrabalho);
    }

    @DeleteMapping("/{id}")
    public HttpStatus excluirJornada(@PathVariable("id") Long id) throws Exception
    {
        try{
            this.jornadaTrabalhoService.Exlcluir(id);
        }catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            HttpStatus badRequest = HttpStatus.BAD_REQUEST;
            return badRequest;

        }
        HttpStatus accepted = HttpStatus.ACCEPTED;
        return accepted;
    }
}
