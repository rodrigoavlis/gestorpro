package com.gestorpro.gestorpro.application.api;

import com.gestorpro.gestorpro.domain.Funcionario;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.UUID;
@Value
public class FuncionarioDetalhadoResponse {
    private UUID idFuncionario;
    private String nomeCompleto;
    private String designacaoFuncionario;
    private double salarioFuncionario;
    private String telefone;
    private String endereco;
    private String cpf;
    private LocalDateTime dataHoraDoCadastro;

    public FuncionarioDetalhadoResponse(Funcionario funcionario) {
        this.idFuncionario = getIdFuncionario();
        this.nomeCompleto = getNomeCompleto();
        this.designacaoFuncionario = getDesignacaoFuncionario();
        this.salarioFuncionario = getSalarioFuncionario();
        this.telefone = getTelefone();
        this.endereco = getEndereco();
        this.cpf = getCpf();
        this.dataHoraDoCadastro = getDataHoraDoCadastro();
    }
}
