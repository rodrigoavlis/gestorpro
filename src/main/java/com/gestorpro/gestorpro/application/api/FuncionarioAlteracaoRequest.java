package com.gestorpro.gestorpro.application.api;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FuncionarioAlteracaoRequest {

    @NotBlank(message = "Nome completo obrigatório")
    private String nomeCompleto;

    private String designacaoFuncionario;

    private double salarioFuncionario;

    private String telefone;

    private EnderecoRequest endereco;

    @NotNull(message = "CPF obrigatorio")

    private String cpf;
}

