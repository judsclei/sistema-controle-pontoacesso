package com.grupo.acesso.api.grupoAcessoApi.model;

import lombok.*;

import javax.persistence.*;

@Getter //substitui gets
@Setter // substitui sets
@AllArgsConstructor // substitui o construtor padrao
@NoArgsConstructor // substitui o construtor em branco
@EqualsAndHashCode // adiciona hashcode e equals
@Builder // ajuda nos testes e criaçao de objeto DTO (Sao anotaçoes do plugin lombok)
@Entity
public class Localidade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne // relacionamento 1 para n onde uma localidade pode ter n niveis de acesso
    private NivelAcesso nivelAcesso;
    private String descricao;
}
