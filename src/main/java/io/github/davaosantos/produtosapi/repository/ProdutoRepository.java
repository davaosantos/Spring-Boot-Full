package io.github.davaosantos.produtosapi.repository;

import io.github.davaosantos.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

}
