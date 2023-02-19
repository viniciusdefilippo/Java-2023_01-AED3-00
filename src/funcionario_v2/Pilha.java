package funcionario_v2;

public class Pilha {

    private Funcionario[] funcionarios = new Funcionario[100];

    private int totalDeFuncionarios = 0;

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void push(Funcionario f) {
        if (size() < funcionarios.length) {
            this.funcionarios[this.totalDeFuncionarios] = f;
            this.totalDeFuncionarios++;
        } else {
            System.out.println("A pilha está cheia");
        }
    }

    public Funcionario pop() {
        try {
            this.totalDeFuncionarios--;
            return this.funcionarios[totalDeFuncionarios];
        } catch (Exception e) {
            this.totalDeFuncionarios = 0;
            System.out.println("Pilha Vazia!");
        }
        return null;
    }

    public boolean contain(String nome) {
        for (int i = 0; i < this.totalDeFuncionarios; i++) {
            if (funcionarios[i].getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    public void print() {

        System.out.println("\n=================================================");
        System.out.println(" RELATÓRIO DE FUNCIONÁRIOS");
        System.out.println("=================================================");
        if (!isEmpty()) {
            for (int i = this.totalDeFuncionarios - 1; i >= 0; i--) {
                System.out.printf("%d - %s - R$ %.2f\n",
                        (totalDeFuncionarios - i),
                        funcionarios[i].getNome(),
                        funcionarios[i].getSalario());
            }

        } else {
            System.out.println("Não existem funcionários cadastrados.");
        }
        System.out.println("=================================================\n");
    }

    public int size() {
        return this.totalDeFuncionarios;
    }
}
