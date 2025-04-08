package com.gestorpro.gestorpro.infra;

import com.gestorpro.gestorpro.domain.Funcionario;
import handler.APIException;
import com.gestorpro.gestorpro.application.repository.FuncionarioRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

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
}
