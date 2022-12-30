package br.com.alura.bytebank;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteBiblioteca {

	public static void main(String[] args) {
		Conta c = new ContaCorrente(123, 321);
		c.deposita(200);
		System.out.println(c.getSaldo());
	}
	
}

//Só copiar o arquivo JAR para a biblioteca não é o suficiente, para ele ser visto pelo compilador é necessário selecionar o arquivo, ir em "Build Path" e então clicar em "Add to Build Path" que irá adicionar uma pasta "Referenced Libraries" onde sempre que se referenciar uma classe de lá em um código o compilador irá pedir para fazer os imports automaticamente como em uma situação normal
//Além de criar um arquivo JAR para mandar de um dev para outro também é possível criar um JAR para mandar a um usuário, ao criar um arquivo JAR você pode mexer nas suas configurações e dizer que aquele arquivo vai ter um ponto de entrada em uma classe que tenha o método main para que assim o usuario possa ter acesso a algum tipo de retorno do código