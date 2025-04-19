package com.gestorpro.gestorpro.application.api;

import com.gestorpro.gestorpro.application.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;


@RestController
@Log4j2
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

    @Override
    public List<FuncionarioListResponse> listarTodosFuncionarios() {
        log.info("[inicia] FuncionarioController - listarTodosFuncionarios");
        List<FuncionarioListResponse> funcionarios = funcionarioService.listarFuncionario();
        log.info("[finaliza] FuncionarioController - listarTodosFuncionarios");
        return funcionarios;
    }

    @Override
    public FuncionarioDetalhadoResponse buscaFuncionarioPorId(UUID idFuncionario) {
        log.info("[inicia] FuncionarioController - buscaFuncionarioPorId");
        log.info("[idFuncionario] {} ", idFuncionario);
        FuncionarioDetalhadoResponse funcionarioDetalhadoResponse = funcionarioService.buscaFuncionarioAtravesId(idFuncionario);
        log.info("[finaliza] FuncionarioController - buscaFuncionarioPorId");
        return funcionarioDetalhadoResponse;
    }

    @Override
    public void deleteFuncionarioPorId(UUID idFuncionario) {
        log.info("[inicia] FuncionarioController - deleteFuncionarioPorId");
        log.info("[idFuncionario] {} ", idFuncionario);
        funcionarioService.deletaFuncionarioPorId(idFuncionario);
        log.info("[finaliza] FuncionarioController - deleteFuncionarioPorId");

    }

    @Override
    public void alteraFuncionario(UUID idFuncionario, FuncionarioAlteracaoRequest funcionarioAlteracaoRequest) {
        log.info("[inicia] FuncionarioController - alteraFuncionario");
        log.info("[idFuncionario] {} ", idFuncionario);
        funcionarioService.alteraFuncionarioPorId(idFuncionario, funcionarioAlteracaoRequest);
        log.info("[finaliza] FuncionarioController - alteraFuncionario");


    }
}
