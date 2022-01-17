package com.grupo.acesso.api.grupoAcessoApi.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter //substitui gets
@Setter // substitui sets
@AllArgsConstructor // substitui o construtor padrao
@NoArgsConstructor // substitui o construtor em branco
@EqualsAndHashCode // adiciona hashcode e equals
@Builder // ajuda nos testes e criaçao de objeto DTO (Sao anotaçoes do plugin lombok)
@Entity
public class BancoHoras {
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class BancoHorasId implements Serializable { //Criaçao chave composta
        private long idBancoHoras;
        private long idMovimentacao;
        private long idUsuario;
    }
    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BancoHorasId id;
    private LocalDateTime dataTrabalhada;
    private BigDecimal quantidadeHoras;
    private BigDecimal saldoHoras;
}
