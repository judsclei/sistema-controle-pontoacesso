package com.grupo.acesso.api.grupoAcessoApi.Services;

import com.grupo.acesso.api.grupoAcessoApi.Repository.JornadaTrabalhoRepository;
import com.grupo.acesso.api.grupoAcessoApi.model.JornadaTrabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaTrabalhoService {

    @Autowired
    JornadaTrabalhoRepository jornadaTrabalhoRepository;

    public List<JornadaTrabalho> ObterJornadas()
    {
        return jornadaTrabalhoRepository.findAll();
    }

    public Optional<JornadaTrabalho> ObterJornadaPorId(Long id)
    {
        return jornadaTrabalhoRepository.findById(id);
    }

    public JornadaTrabalho Cadastrar(JornadaTrabalho jornadaTrabalho)
    {
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public JornadaTrabalho Atualizar(JornadaTrabalho jornadaTrabalho)
    {
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public void Exlcluir(Long id)
    {
       jornadaTrabalhoRepository.deleteById(id);
    }
}
