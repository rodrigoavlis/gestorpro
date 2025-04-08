package com.gestorpro.gestorpro.application.service;

import com.gestorpro.gestorpro.application.api.FuncionarioRequest;
import com.gestorpro.gestorpro.application.api.FuncionarioResponse;

public interface FuncionarioService {


    FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest);
}
