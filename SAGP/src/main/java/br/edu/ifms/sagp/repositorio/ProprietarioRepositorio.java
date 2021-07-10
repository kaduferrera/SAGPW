package br.edu.ifms.sagp.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.edu.ifms.sagp.model.Proprietario;

@Repository
public interface ProprietarioRepositorio extends JpaRepository<Proprietario, Long>{
	
	Proprietario findByCpf(String cpf);
}
