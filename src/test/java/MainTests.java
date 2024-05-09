import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class MainTests {

    // TestEngine -> DiscoverTest

    @Test
    public void testeDeveLigarCorretamente() {
        // Teste 01 - Validar se o carro liga corretamente
        // Given
        Carro carro = new Carro("fusca", 1978);
        // When
        carro.ligarCarro();
        // Then
        Assert.assertTrue(carro.getLigado());
    }

    @Test
    public void testeCarroEstaNaReserva() {
        Carro carro = new Carro("fusca", 1978);

        carro.setQuantidadeDeCombustivel(30);

        Assert.assertFalse(carro.verificaEstaNaReserva());
    }

    @Test
    public void testeCarroNaoEstaNaReserva() {
        Carro carro = new Carro("fusca", 1978);

        carro.setQuantidadeDeCombustivel(10);

        Assert.assertTrue(carro.verificaEstaNaReserva());
    }

    @Test
    public void testeCarroEstaEmMovimento() {
        Carro carro = new Carro("fusca", 1978);

        carro.acelerar();

        Assert.assertFalse(carro.getVelocidadeAtual() == 0);
    }

    @Test
    public void testeCarroNaoTemDono() {
        Carro carro = new Carro("fusca", 1978);

        Assert.assertNull(carro.getDono());
    }

    @Test
    public void testePessoaTemNome() {
        Pessoa pessoa = new Pessoa("Ana", 20);

        Assert.assertNotNull(pessoa.getNome());
    }

    @Test
    public void testeCarrosMesmoAno() {
        Carro carro = new Carro("fusca", 1978);
        Carro carro2 = new Carro("chevette", 1978);

        Assert.assertEquals(carro.getAnoDeFabricacao(),carro2.getAnoDeFabricacao());
    }

    @Test
    public void testeCarroTanqueCheio() {
        Carro carro = new Carro("fusca", 1978);

        carro.setQuantidadeDeCombustivel(100);

        Assert.assertEquals(carro.getQuantidadeDeCombustivel(),100, 0);
    }

    @Test
    public void testeCarrosIguais() {
        Pessoa pessoa = new Pessoa("Ana", 20);
        Carro carro = new Carro("fusca", 1978);
        Carro carro2 = new Carro("fusca", 1978);

        carro.setDono(pessoa);
        carro2.setDono(pessoa);

        Assert.assertEquals(carro,carro2);
    }

    @Test
    public void testePessoasIguais() {
        Pessoa pessoa = new Pessoa("Ana", 20);
        Pessoa pessoa2 = new Pessoa("Ana", 20);

        Assert.assertEquals(pessoa,pessoa2);
    }

    @Test
    public void testeCarrosMesmoDono() {
        Pessoa pessoa = new Pessoa("Ana", 20);
        Carro carro = new Carro("fusca", 1978);
        Carro carro2 = new Carro("Kombi", 1984);

        carro.setDono(pessoa);
        carro2.setDono(pessoa);

        Assert.assertSame(carro.getDono(),carro2.getDono());
    }

    @Test
    public void testeMesmoCarros() {
        Carro carro = new Carro("fusca", 1978);
        Carro carro2 = new Carro("fusca", 1978);

        Assert.assertNotSame(carro,carro2);
    }

    @Test
    public void testeListaCarros() {
        Carro carro = new Carro("fusca", 1978);
        Carro carro2 = new Carro("Kombi", 1984);
        Carro carro3 = new Carro("chovette", 1986);
        Pessoa pessoa = new Pessoa("Ana", 20);
        Pessoa pessoa2 = new Pessoa("Joao", 30);

        pessoa.addCarros(carro);
        pessoa.addCarros(carro2);
        pessoa.addCarros(carro3);

        pessoa2.addCarros(carro);
        pessoa2.addCarros(carro2);
        pessoa2.addCarros(carro3);

        Assert.assertArrayEquals(pessoa.getCarros().toArray(), pessoa2.getCarros().toArray());


    }
}
