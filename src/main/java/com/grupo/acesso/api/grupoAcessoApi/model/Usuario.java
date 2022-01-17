package com.grupo.acesso.api.grupoAcessoApi.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter //substitui gets
@Setter // substitui sets
@AllArgsConstructor // substitui o construtor padrao
@NoArgsConstructor // substitui o construtor em branco
@EqualsAndHashCode // adiciona hashcode e equals
@Builder // ajuda nos testes e criaçao de objeto DTO (Sao anotaçoes do plugin lombok)
@Entity
@Audited
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    private CategoriaUsuario categoriaUsuario;
    private String nome;
    @ManyToOne
    private Empresa empresa;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    @ManyToOne
    private JornadaTrabalho jornadaTrabalho;
    private BigDecimal tolerancia;
    private LocalDateTime horaInicioJornada;
    private LocalDateTime horaFinalJornada;
}
