package com.gestorpro.gestorpro.application.service;

import com.gestorpro.gestorpro.application.api.FuncionarioDetalhadoResponse;
import com.gestorpro.gestorpro.application.api.FuncionarioListResponse;
import com.gestorpro.gestorpro.application.api.FuncionarioRequest;
import com.gestorpro.gestorpro.application.api.FuncionarioResponse;

import java.util.List;
import java.util.UUID;

public interface FuncionarioService {


    FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest);
    List<FuncionarioListResponse> listarFuncionario();
    FuncionarioDetalhadoResponse buscaFuncionarioAtravesId(UUID idFuncionario);
}
