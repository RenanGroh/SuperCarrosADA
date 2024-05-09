import java.util.ArrayList;
import java.util.Objects;

public class Pessoa {
    private String nome;
    private Integer idade;
    private ArrayList<Carro> carros;

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
        this.carros = new ArrayList<>();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }
    public void addCarros(Carro carro) {
        this.carros.add(carro);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) && Objects.equals(idade, pessoa.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }
}
