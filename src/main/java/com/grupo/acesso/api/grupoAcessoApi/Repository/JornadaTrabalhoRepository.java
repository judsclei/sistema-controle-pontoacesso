package com.grupo.acesso.api.grupoAcessoApi.Repository;

import com.grupo.acesso.api.grupoAcessoApi.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaTrabalhoRepository extends JpaRepository<JornadaTrabalho,Long>
{
}
