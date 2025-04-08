package com.gestorpro.gestorpro.application.service;

import com.gestorpro.gestorpro.application.api.FuncionarioListResponse;
import com.gestorpro.gestorpro.application.api.FuncionarioRequest;
import com.gestorpro.gestorpro.application.api.FuncionarioResponse;

import java.util.List;

public interface FuncionarioService {


    FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest);

    List<FuncionarioListResponse> listarFuncionario();
}
