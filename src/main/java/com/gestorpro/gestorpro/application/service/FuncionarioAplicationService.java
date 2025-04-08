package com.gestorpro.gestorpro.application.service;

import com.gestorpro.gestorpro.application.api.FuncionarioDetalhadoResponse;
import com.gestorpro.gestorpro.application.api.FuncionarioListResponse;
import com.gestorpro.gestorpro.application.api.FuncionarioRequest;
import com.gestorpro.gestorpro.application.api.FuncionarioResponse;
import com.gestorpro.gestorpro.domain.Funcionario;
import com.gestorpro.gestorpro.application.repository.FuncionarioRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class FuncionarioAplicationService implements FuncionarioService {
    private final FuncionarioRepository funcionarioRepository;
    @Override
    public FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest) {
        log.info("[inicia] FuncionarioAplicationService - criaFuncionario");
        Funcionario funcionario = funcionarioRepository.salva(new Funcionario(funcionarioRequest));
        log.info("[finaliza] FuncionarioAplicationService - criaFuncionario");
        return FuncionarioResponse.builder()
                .idFuncionario(funcionario.getIdFuncionario())
                .build();
    }

    @Override
    public List<FuncionarioListResponse> listarFuncionario() {
        log.info("[inicia] FuncionarioAplicationService - criaFuncionario");
        List<Funcionario> funcionarios = funcionarioRepository.listaTodosFuncionarios();
        log.info("[inicia] FuncionarioAplicationService - criaFuncionario");
        return FuncionarioListResponse.converte(funcionarios);
    }

    @Override
    public FuncionarioDetalhadoResponse buscaFuncionarioAtravesId(UUID idFuncionario) {
        return null;
    }

    ;
    }

