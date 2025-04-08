package com.gestorpro.gestorpro.infra;

import com.gestorpro.gestorpro.domain.Funcionario;
import handler.APIException;
import com.gestorpro.gestorpro.application.repository.FuncionarioRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Log4j2
@Repository
@RequiredArgsConstructor
public class FuncionarioInfraRepository implements FuncionarioRepository {
    private final FuncionarioSpringDataJPARepository funcionarioSpringDataJPARepository;
    @Override
    public Funcionario salva(Funcionario funcionario) {
        log.info("[inicia] - FuncionarioInfraRepository - salva");
        try{
        funcionarioSpringDataJPARepository.save(funcionario);
        } catch (DataIntegrityViolationException e) {
            throw APIException.build(HttpStatus.BAD_REQUEST,"Existem dados duplicados", e);
        }
        log.info("[finaliza] - FuncionarioInfraRepository - salva");
        return funcionario;
    }

    @Override
    public List<Funcionario> listaTodosFuncionarios() {
        log.info("[inicia] - FuncionarioInfraRepository - listaTodosFuncionarios");
        List<Funcionario> todosFuncionarios = funcionarioSpringDataJPARepository.findAll();
        log.info("[finaliza] - FuncionarioInfraRepository - listaTodosFuncionarios");
        return todosFuncionarios;
    }

    @Override
    public Funcionario buscaTodosFuncionariosPorId(UUID idFuncionario) {

        return null;
    }
}
