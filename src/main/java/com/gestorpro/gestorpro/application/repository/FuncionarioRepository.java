package com.gestorpro.gestorpro.application.repository;

import com.gestorpro.gestorpro.domain.Funcionario;

import java.util.List;

public interface FuncionarioRepository {
    Funcionario salva(Funcionario funcionario);
    List<Funcionario> listaTodosFuncionarios();
}
