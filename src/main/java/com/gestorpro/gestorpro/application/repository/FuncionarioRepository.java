package com.gestorpro.gestorpro.application.repository;

import com.gestorpro.gestorpro.domain.Funcionario;

import java.util.List;
import java.util.UUID;

public interface FuncionarioRepository {
    Funcionario salva(Funcionario funcionario);
    List<Funcionario> listaTodosFuncionarios();
    Funcionario buscaTodosFuncionariosPorId(UUID idFuncionario);
    void deletaFuncionarioPorId(Funcionario funcionario);
}
