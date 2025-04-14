package com.gestorpro.gestorpro.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/funcionario")
public interface FuncionarioAPI {

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    FuncionarioResponse postFuncionario(@Valid @RequestBody FuncionarioRequest funcionarioRequest);

    @GetMapping
    @ResponseStatus(value = HttpStatus.OK)
    List<FuncionarioListResponse> listarTodosFuncionarios();

    @GetMapping(value = "/buscar/{idFuncionario}")
    @ResponseStatus(value = HttpStatus.OK)
    FuncionarioDetalhadoResponse buscaFuncionarioPorId(@PathVariable UUID idFuncionario);

    @DeleteMapping(value = "/deleta/{idFuncionario}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    void deleteFuncionarioPorId(@PathVariable UUID idFuncionario);

    @PatchMapping(value = "/altera/{idFuncionario}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    void alteraFuncionario(@PathVariable UUID idFuncionario,
            @Valid @RequestBody FuncionarioAlteracaoRequest funcionarioAlteracaoRequest);

    }
