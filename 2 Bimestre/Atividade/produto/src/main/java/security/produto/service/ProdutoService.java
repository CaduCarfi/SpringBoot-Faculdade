package security.produto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import security.produto.models.ProdutoModel;
import security.produto.repository.ProdutoRepository;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public List<ProdutoModel> findAll(){
        return  produtoRepository.findAll();
    }

    public ProdutoModel criarProduto(ProdutoModel produtoModel){
        return  produtoRepository.save(produtoModel);
    }


}