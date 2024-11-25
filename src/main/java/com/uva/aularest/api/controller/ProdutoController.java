package com.uva.aularest.api.controller;
import com.uva.aularest.domain.model.Produto;
import com.uva.aularest.domain.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;

	@GetMapping("/produtos")
	public List<Produto> listarAll() {

		return produtoRepository.findAll();

	}

	@GetMapping("/produtos/{codigo}")
	public ResponseEntity<Produto> listarCodigo(@PathVariable Integer codigo) {
		Optional<Produto> produto = produtoRepository.findById(codigo);
        return produto.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }


	@PostMapping("/produtos")
	@ResponseStatus(HttpStatus.CREATED)
	public Produto incluirProduto(@RequestBody Produto produto){
		return produtoRepository.save(produto);

	}

	@PutMapping("/produtos/atualizar/{codigo}")
	public ResponseEntity<Produto> atualizarProduto(@PathVariable Integer codigo, @RequestBody Produto produtoAtualizado){

		Optional<Produto> produto = produtoRepository.findById(codigo);

		if(produto.isEmpty()){
			return ResponseEntity.notFound().build();
		}

		produtoAtualizado.setCodigo(codigo);
		produtoRepository.save(produtoAtualizado);

		return ResponseEntity.ok(produtoAtualizado);


	}

	@DeleteMapping("produtos/{codigo}")
	public ResponseEntity<Produto> excluirProduto(@PathVariable Integer codigo){
		Optional<Produto> produto = produtoRepository.findById(codigo);

		if (produto.isEmpty()){

			return ResponseEntity.notFound().build();
		}

		produtoRepository.deleteById(codigo);

		Produto produtoDeletado = produto.get();
		produtoDeletado.setNome(produtoDeletado.getNome() + " DELETED");

		return ResponseEntity.ok().body(produtoDeletado);
	}

}
