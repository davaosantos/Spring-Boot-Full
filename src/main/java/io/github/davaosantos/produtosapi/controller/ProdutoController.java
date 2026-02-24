package io.github.davaosantos.produtosapi.controller;


import io.github.davaosantos.produtosapi.model.Produto;
import io.github.davaosantos.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController //Classe vai receber requisicoes REST
@RequestMapping("produtos") //URL Base
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        System.out.println("Produto recebido : " + produto);
        var id = UUID.randomUUID().toString();
        produto.setId(id);
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping(name = "/{id}")
    public Produto obterProduto(@PathVariable("id") String id){
//        Optional<Produto> produtoOpt = produtoRepository.findById(id);
        return produtoRepository.findById(id).orElse(null);
    };

    @DeleteMapping("/{id}")
    public void deleteProduto(@PathVariable("id") String id){
        produtoRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void atualizarProduto(
            @PathVariable("id") String id,
            @RequestBody Produto produto){
        produto.setId(id);
        produtoRepository.save(produto);
    }

}
