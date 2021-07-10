package br.edu.ifms.sagp.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.edu.ifms.sagp.model.Propriedade;

@Repository
public interface PropriedadeRepositorio extends JpaRepository<Propriedade, Long> {
	
	@Query("Select p from Propriedade p join p.proprietario pp where pp.cpf = cpf")
	List<Propriedade> findAllByUsuario(@Param ("cpf") String cpf);

}
