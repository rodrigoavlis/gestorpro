package com.gestorpro.gestorpro.domain;

import com.gestorpro.gestorpro.application.api.FuncionarioAlteracaoRequest;
import com.gestorpro.gestorpro.application.api.FuncionarioRequest;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idfuncionario", updatable = false, unique = true, nullable = false)
    private UUID idFuncionario;
    private String nomeCompleto;
    private String designacaoFuncionario;
    private double salarioFuncionario;
    private String telefone;
    private String endereco;
    private String cpf;


    public Funcionario(FuncionarioRequest funcionarioRequest) {
        this.nomeCompleto = funcionarioRequest.getNomeCompleto();
        this.designacaoFuncionario = funcionarioRequest.getDesignacaoFuncionario();
        this.salarioFuncionario = funcionarioRequest.getSalarioFuncionario();
        this.telefone = funcionarioRequest.getTelefone();
        this.endereco = funcionarioRequest.getEndereco();
        this.cpf = funcionarioRequest.getCpf();
    }

    public void altera(FuncionarioAlteracaoRequest funcionarioRequest) {
        this.nomeCompleto = funcionarioRequest.getNomeCompleto();
        this.designacaoFuncionario = funcionarioRequest.getDesignacaoFuncionario();
        this.salarioFuncionario = funcionarioRequest.getSalarioFuncionario();
        this.telefone = funcionarioRequest.getTelefone();
        this.endereco = funcionarioRequest.getEndereco();
        this.cpf = funcionarioRequest.getCpf();
    }
}
