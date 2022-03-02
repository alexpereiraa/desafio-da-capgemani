package br.com.capgemini.desafio.testes;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import br.com.capgemini.desafio.funcoes.QuestaoUm;

public class QuestaoUmTeste {

	@Test
	public void escadaTamanhoTres() {

		String respostaEsperada = "  *\n **\n***\n";

		String escada;
		escada = QuestaoUm.montaEscada(3);

		Assert.assertNotNull(escada);
		Assert.assertEquals(respostaEsperada, escada);

	}

	@Test
	public void escadaTamanhoUm() {

		String respostaEsperada = "*\n";

		String escada;
		escada = QuestaoUm.montaEscada(1);

		Assert.assertEquals(respostaEsperada, escada);

	}

}