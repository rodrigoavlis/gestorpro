package com.gestorpro.gestorpro.application.api;

import com.gestorpro.gestorpro.domain.Funcionario;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.util.List;
import java.util.stream.Collectors;

@Value
public class FuncionarioListResponse {
    private String nomeCompleto;
    private String designacaoFuncionario;
    private double salarioFuncionario;
    private String telefone;
    private String endereco;
    private String cpf;
    public static List<FuncionarioListResponse> converte(List<Funcionario> funcionarios) {
        return funcionarios.stream()
                .map(FuncionarioListResponse::new)
                .collect(Collectors.toList());
    }

    public FuncionarioListResponse(Funcionario funcionario) {
        this.nomeCompleto = funcionario.getNomeCompleto();
        this.designacaoFuncionario = funcionario.getDesignacaoFuncionario();
        this.salarioFuncionario = funcionario.getSalarioFuncionario();
        this.telefone = funcionario.getTelefone();
        this.endereco = funcionario.getEndereco();
        this.cpf = funcionario.getCpf();
    }
}
