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

    @GetMapping
    @ResponseStatus(value = HttpStatus.OK)
    FuncionarioDetalhadoResponse buscaFuncionarioPorId(@PathVariable UUID idFuncionario);

}
