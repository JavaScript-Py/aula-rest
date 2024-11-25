package com.uva.aularest.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.uva.aularest.domain.model.Produto;
import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
