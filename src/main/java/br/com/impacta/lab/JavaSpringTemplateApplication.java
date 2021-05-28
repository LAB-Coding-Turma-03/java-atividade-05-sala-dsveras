package br.com.impacta.lab;

import br.com.impacta.models.*;

public class JavaSpringTemplateApplication {

	public static void main(String[] args) {
		/*
		 * Transforme a tabela produto em uma classe separadas
		 * no pacote br.com.impacta.models
		 * 
		 *  
		 *  Tabela de produto
		 *  
		 *  CodigoProduto	descrição do Produto		Valor do Produto
		 * 	1				Camisa						70.00
		 * 	2				Shorts						57.50
		 * 	3				Meia						9.99
		 * 	4				Toca						35.00
		 * 	5				Luvas						19.50
		 * 
		 * -----------------------------------------------------------------
		 * 
		 * Em seguida crie um método na classe Produto onde o mesmo tenho o nome de montarResumo
		 * Exemplo de um método:
		 * public String falar(String palavra) {
		 * 	System.out.println(palavra);
		 * }
		 * 
		 * receba como parametro um Produto e devolva uma String
		 * 
		 * O retorno deve ser no seguinte formato
		 * 
		 * "codigo: <produto.codigo>, descricao: <produto.descricao>, valor: <produto.valor>"
		 * 
		 * 
		 */
		
		Produto camisa = new Produto(1, "camisa", 70.00);
		Produto shorts = new Produto(2, "shorts", 57.50);
		Produto meia = new Produto(3, "meia", 9.99);
		Produto toca = new Produto(4, "toca", 35.00);
		Produto luvas = new Produto(5, "toca", 19.50);

		String resumo = camisa.montarResumo();
		System.out.println(resumo);

		resumo = shorts.montarResumo();
		System.out.println(resumo);
		
		resumo = meia.montarResumo();
		System.out.println(resumo);

		resumo = toca.montarResumo();
		System.out.println(resumo);

		resumo = luvas.montarResumo();
		System.out.println(resumo);

		//String resumo = produto.montarResumo(produto);
		//System.out.println(resumo);
	}

}
