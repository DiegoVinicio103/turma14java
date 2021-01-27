package br.com.farmacode.farmaCode.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.farmacode.farmaCode.model.Produto;

@Repository
	public interface ProdutoRepository extends JpaRepository<Produto, Long>{
		public List<Produto> findAllByNomeContainingIgnoreCase (String nome);
	}


