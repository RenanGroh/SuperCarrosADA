import java.util.Objects;

public class Carro {
    private Boolean ligado;
    private Integer velocidadeAtual;
    private String modelo;
    private Pessoa dono;
    private int anoDeFabricacao;
    private double quantidadeDeCombustivel;

    public Carro(String modelo, int anoDeFabricacao) {
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.quantidadeDeCombustivel = 0;
        this.velocidadeAtual = 0;
    }

    public void acelerar() {
        this.velocidadeAtual += 10;
    }

    public void ligarCarro() {
        this.ligado = true;
    }

    public void desligarCarro() {
        this.ligado = false;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public Integer getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(Integer velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void setQuantidadeDeCombustivel(double quantidadeDeCombustivel) {
        this.quantidadeDeCombustivel = quantidadeDeCombustivel;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public double getQuantidadeDeCombustivel() {
        return quantidadeDeCombustivel;
    }

    public boolean verificaEstaNaReserva() {
        if (this.quantidadeDeCombustivel < 20)
            return true;
        else
            return false;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return anoDeFabricacao == carro.anoDeFabricacao && Objects.equals(modelo, carro.modelo) && Objects.equals(dono, carro.dono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, dono, anoDeFabricacao);
    }
}
