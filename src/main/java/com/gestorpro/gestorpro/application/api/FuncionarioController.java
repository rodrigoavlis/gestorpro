package com.gestorpro.gestorpro.application.api;

import com.gestorpro.gestorpro.application.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequiredArgsConstructor
public class FuncionarioController implements FuncionarioAPI {
    private final FuncionarioService funcionarioService;

    @Override

    public FuncionarioResponse postFuncionario(FuncionarioRequest funcionarioRequest) {
        log.info("[inicia] FuncionarioController - postFuncionario");
        FuncionarioResponse funcionarioCriado = funcionarioService.criaFuncionario(funcionarioRequest);
        log.info("[finaliza] FuncionarioController - postFuncionario");
        return funcionarioCriado;
    }
}
