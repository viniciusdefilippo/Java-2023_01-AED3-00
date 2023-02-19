package funcionario_v3;

public class TesteFila {
    public static void main(String[] args) {

        // 1. Cadastre o nome e o salário de 5 funcionários
        Fila f = preencheFila();
        System.out.println("\n1. Cadastre o nome e o salário de 5 funcionários");

        // 2. liste todos os dados dos funcionários. Lembrando que a impressão dos valores deve iniciar no início da fila
        f.print();

        // 3. Pesquise por nome um funcionário existente
        System.out.println("\n3. Pesquise por nome um funcionário existente");
        System.out.println(f.contain("mariana SILVA SouZa"));

        // 4. Pesquise por nome um funcionário que não existe
        System.out.println("\n4. Pesquise por nome um funcionário que não existe");
        System.out.println(f.contain("Mariana Souza"));

        // 5. Retire todos os funcionários da fila
        System.out.println("\n5. Retire todos os funcionários da fila");
        while (!f.isEmpty()) {
            System.out.println(f.dequeue().getNome());
        }
        f.print();

        // 6. Preencha novamente a pilha e remova um dos funcionários sem criar novos métodos na classe Fila
        System.out.println("\n6. Preencha novamente a pilha e remova um dos funcionários sem criar novos métodos na classe Fila");
        f = preencheFila();
        Fila f2 = new Fila();

        while (!f.isEmpty()) {
            Funcionario aux = f.dequeue();
            if (!aux.getNome().equalsIgnoreCase("Mariana Silva Souza")) {
                f2.enqueue(aux);
            }
        }

        // Tratamento de exceção - Tentar remoção em fila vazia
        // 7. Tente remover um elemento de uma fila vazia
        System.out.println("7. Tente remover um elemento de uma fila vazia");

        try {
            f.dequeue();
        } catch (Exception e) {
            System.out.print("\nErro ao tentar acessar a Fila: " + e.getMessage() + "\n");
        }

    }

    public static Fila preencheFila() {
        Fila f = new Fila();
        f.enqueue(new Funcionario("Gustavo Gomes Cavalcanti", 1500.00));
        f.enqueue(new Funcionario("Pedro Paulo Santos", 5500.75));
        f.enqueue(new Funcionario("Mariana Silva Souza", 2500.5));
        f.enqueue(new Funcionario("André Câmara Ferreira", 1850.2));
        f.enqueue(new Funcionario("Mariana Pereira Ramos", 2870.00));
        return f;
    }
}
