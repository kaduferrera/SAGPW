package br.edu.ifms.sagp.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifms.sagp.model.Funcionario;

@Repository
public interface FuncionarioRepositorio extends JpaRepository<Funcionario, Long> {

}
