package funcionario_v1;

public class Funcionario {

    private Funcionario funcionarios[];
    private int pos;
    private String nome;
    private double salario;

    public Funcionario(int tam) {
        this.funcionarios = new Funcionario[tam];
        this.pos = 0;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    private boolean posicaoOcupada(int posicao) {
        return (posicao >= 0 && posicao < this.funcionarios.length
                && this.funcionarios[posicao] != null);
    }

    public void adiciona(Funcionario func) {
        if (this.pos < this.funcionarios.length) {
            funcionarios[pos] = func;
            pos++;
        } else {
            System.out.println("Não foi possível adicionar o registro.");
        }
    }

    public void imprimeLista() {
        for (int i = 0; i <= this.pos - 1; i++) {
            System.out.println(funcionarios[i].nome + " - " + funcionarios[i].salario);
        }
    }

    public Funcionario busca(int posicao) {
        if (posicao >= 0 && posicao < this.pos) return this.funcionarios[posicao];
        else System.out.println("Posição vazia ou inválida.");
        return new Funcionario("", 0);
    }

    public int tamanho() {
        return this.pos;
    }

    public boolean contem(String nome) {
        for (int i = 0; i <= this.pos - 1; i++)
            if (funcionarios[i].nome.toLowerCase().equals(nome.toLowerCase())) return true;
        return false;
    }

    public void remove(int posicao) {
        if (posicao >= 0 && posicao < this.pos) {
            for (int i = 0; i <= this.pos - 1; i++) {
                this.funcionarios[posicao] = this.funcionarios[posicao + 1];
                posicao++;
            }
            pos--;
        } else System.out.println("Posição vazia ou inválida.");
    }

    public void ordenaPorNome() {
        Funcionario temp;
        for (int i = 0; i < this.pos; i++) {
            for (int j = i + 1; j < this.pos; j++) {
                if (this.funcionarios[i].nome.compareTo(this.funcionarios[j].nome) > 0) {
                    temp = this.funcionarios[i];
                    this.funcionarios[i] = this.funcionarios[j];
                    this.funcionarios[j] = temp;
                }
            }
        }
    }
}

