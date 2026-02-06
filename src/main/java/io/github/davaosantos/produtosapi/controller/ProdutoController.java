package io.github.davaosantos.produtosapi.controller;


import io.github.davaosantos.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Classe vai receber requisicoes REST
@RequestMapping("produtos") //URL Base
public class ProdutoController {

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        System.out.println("Produto recebido : " + produto);
        return produto;
    }
}
