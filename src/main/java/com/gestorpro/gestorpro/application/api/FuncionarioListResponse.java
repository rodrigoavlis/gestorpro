package com.gestorpro.gestorpro.application.api;

import com.gestorpro.gestorpro.domain.Funcionario;

import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class FuncionarioListResponse {
    private UUID idFuncionario;
    private String nomeCompleto;
    private String designacaoFuncionario;
    private double salarioFuncionario;
    private String telefone;
    private String cpf;
    public static List<FuncionarioListResponse> converte(List<Funcionario> funcionarios) {
        return funcionarios.stream()
                .map(FuncionarioListResponse::new)
                .collect(Collectors.toList());
    }

    public FuncionarioListResponse(Funcionario funcionario) {
        this.idFuncionario = funcionario.getIdFuncionario();
        this.nomeCompleto = funcionario.getNomeCompleto();
        this.designacaoFuncionario = funcionario.getDesignacaoFuncionario();
        this.salarioFuncionario = funcionario.getSalarioFuncionario();
        this.telefone = funcionario.getTelefone();
        this.cpf = funcionario.getCpf();
    }
}
