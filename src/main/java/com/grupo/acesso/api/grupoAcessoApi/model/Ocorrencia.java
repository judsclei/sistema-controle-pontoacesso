package com.grupo.acesso.api.grupoAcessoApi.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter //substitui gets
@Setter // substitui sets
@AllArgsConstructor // substitui o construtor padrao
@NoArgsConstructor // substitui o construtor em branco
@EqualsAndHashCode // adiciona hashcode e equals
@Builder // ajuda nos testes e criaçao de objeto DTO (Sao anotaçoes do plugin lombok)
@Entity
public class Ocorrencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    private String descricao;
}
