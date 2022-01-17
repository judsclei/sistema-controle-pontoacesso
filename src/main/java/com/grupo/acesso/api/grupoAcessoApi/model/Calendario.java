package com.grupo.acesso.api.grupoAcessoApi.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter //substitui gets
@Setter // substitui sets
@AllArgsConstructor // substitui o construtor padrao
@NoArgsConstructor // substitui o construtor em branco
@EqualsAndHashCode // adiciona hashcode e equals
@Builder // ajuda nos testes e criaçao de objeto DTO (Sao anotaçoes do plugin lombok)
@Entity
public class Calendario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "tipo_data_id")
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;
}
