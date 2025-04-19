package com.gestorpro.gestorpro.application.service;

import com.gestorpro.gestorpro.application.api.*;

import java.util.List;
import java.util.UUID;

public interface FuncionarioService {


    FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest);
    List<FuncionarioListResponse> listarFuncionario();
    FuncionarioDetalhadoResponse buscaFuncionarioAtravesId(UUID idFuncionario);
    void deletaFuncionarioPorId(UUID idFuncionario);
    void alteraFuncionarioPorId(UUID idFuncionario, FuncionarioAlteracaoRequest funcionarioAlteracaoRequest);
}
