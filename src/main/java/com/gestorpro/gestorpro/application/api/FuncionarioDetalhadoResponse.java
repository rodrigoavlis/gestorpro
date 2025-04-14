package com.gestorpro.gestorpro.application.api;

import com.gestorpro.gestorpro.domain.Endereco;
import com.gestorpro.gestorpro.domain.Funcionario;
import lombok.Value;

import java.util.List;
import java.util.UUID;
@Value
public class FuncionarioDetalhadoResponse {
    private UUID idFuncionario;
    private String nomeCompleto;
    private String designacaoFuncionario;
    private double salarioFuncionario;
    private String telefone;
    private String cpf;

    public FuncionarioDetalhadoResponse(Funcionario funcionario) {
        this.idFuncionario = funcionario.getIdFuncionario();
        this.nomeCompleto = funcionario.getNomeCompleto();
        this.designacaoFuncionario = funcionario.getDesignacaoFuncionario();
        this.salarioFuncionario = funcionario.getSalarioFuncionario();
        this.telefone = funcionario.getTelefone();
        this.cpf = funcionario.getCpf();
    }
}
