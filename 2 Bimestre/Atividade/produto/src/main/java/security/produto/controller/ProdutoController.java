package security.produto.controller;

import security.produto.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import security.produto.models.ProdutoModel;

import java.util.List;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<ProdutoModel> findAll(){
        return  produtoService.findAll();
    }
    @PostMapping
    public ProdutoModel criarProduto(@RequestBody ProdutoModel produtoModel){
        return  produtoService.criarProduto(produtoModel);
    }




}