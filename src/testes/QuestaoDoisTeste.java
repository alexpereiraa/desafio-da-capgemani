package testes;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import br.com.capgemini.desafio.funcoes.QuestaoDois;

public class QuestaoDoisTeste {

	@Test
	public void padraoSenhaForte() {

		int respostaEsperada = 0;
		int padrao;
		padrao = QuestaoDois.validaSenha("01@Mne");

		Assert.assertNotNull(padrao);
		Assert.assertEquals(respostaEsperada, padrao);

	}

	@Test
	public void padraoSenhaExemplo() {

		int respostaEsperada = 3;
		int padrao;
		padrao = QuestaoDois.validaSenha("Ya3");

		Assert.assertEquals(respostaEsperada, padrao);

	}

	@Test
	public void padraoSenhaMenosTamanho() {

		int respostaEsperada = 2;
		int padrao;
		padrao = QuestaoDois.validaSenha("Ab!2");

		Assert.assertEquals(respostaEsperada, padrao);

	}

	@Test
	public void padraoSenhaSoMinuscula() {

		int respostaEsperada = 3;
		int padrao;
		padrao = QuestaoDois.validaSenha("abcdef");

		Assert.assertEquals(respostaEsperada, padrao);

	}

	@Test
	public void padraoSenhaSoMaiuscula() {

		int respostaEsperada = 3;
		int padrao;
		padrao = QuestaoDois.validaSenha("ABCDEF");

		Assert.assertEquals(respostaEsperada, padrao);

	}

	@Test
	public void padraoSenhaSoEspecial() {

		int respostaEsperada = 3;
		int padrao;
		padrao = QuestaoDois.validaSenha("!@#$%");

		Assert.assertEquals(respostaEsperada, padrao);

	}

	@Test
	public void padraoSenhaSoDigito() {

		int respostaEsperada = 3;
		int padrao;
		padrao = QuestaoDois.validaSenha("123456");

		Assert.assertEquals(respostaEsperada, padrao);

	}

}
