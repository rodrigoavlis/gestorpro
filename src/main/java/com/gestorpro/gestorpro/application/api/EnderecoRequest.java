package com.gestorpro.gestorpro.application.api;

import lombok.Value;

@Value
public class EnderecoRequest {
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
}
