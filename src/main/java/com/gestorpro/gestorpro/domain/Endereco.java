package com.gestorpro.gestorpro.domain;

import com.gestorpro.gestorpro.application.api.EnderecoRequest;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.ToString;
import java.util.UUID;


@Entity
@Getter
@ToString
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idEndereco;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;


    public Endereco(EnderecoRequest enderecoRequest) {
        this.logradouro = enderecoRequest.getLogradouro();
        this.numero = enderecoRequest.getNumero();
        this.complemento = enderecoRequest.getComplemento();
        this.bairro = enderecoRequest.getBairro();
        this.cidade = enderecoRequest.getCidade();
        this.estado = enderecoRequest.getEstado();
        this.cep = enderecoRequest.getCep();
    }
}
