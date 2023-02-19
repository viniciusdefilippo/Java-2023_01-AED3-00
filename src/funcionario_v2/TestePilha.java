package funcionario_v2;

public class TestePilha {
    public static void main(String[] args) {

        // 1. Cadastre o nome e o salário de 5 funcionários
        Pilha p = preenchePilha();
        System.out.println("\n1. Cadastre o nome e o salário de 5 funcionários");

        // 2. liste todos os dados dos funcionários. Lembrando que a impressão dos valores deve iniciar no topo da pilha
        System.out.println("\n2. liste todos os dados dos funcionários. Lembrando que a impressão dos valores deve iniciar no topo da pilha");
        p.print();

        // 3. Pesquise por nome um funcionário existente
        System.out.println("\n3. Pesquise por nome um funcionário existente");
        System.out.println(p.contain("mariana SILVA SouZa"));

        // 4. Pesquise por nome um funcionário que não existe
        System.out.println("\n4. Pesquise por nome um funcionário que não existe");
        System.out.println(p.contain("Mariana Souza"));

        // 5. Retire todos os funcionários da pilha
        System.out.println("\n5. Retire todos os funcionários da pilha");
        while (!p.isEmpty()) System.out.println(p.pop().getNome());

        // 6. Preencha novamente a pilha e liste os funcionários em ordem invertida.
        System.out.println("\n6. Preencha novamente a pilha e liste os funcionários em ordem invertida.");
        p = preenchePilha();

        Pilha p2 = new Pilha();

        while (!p.isEmpty()) p2.push(p.pop());
        p2.print();

        // 7. Preencha novamente a pilha e remova um dos funcionários sem criar novos métodos na classe Pilha
        System.out.println("\n7. Preencha novamente a pilha e remova um dos funcionários sem criar novos métodos na classe Pilha");
        p = preenchePilha();

        Pilha p3 = new Pilha();

        while (!p.isEmpty()) {
            Funcionario f = p.pop();
            if (!f.getNome().equalsIgnoreCase("Mariana Silva Souza")) p3.push(f);
        }

        while (!p3.isEmpty()) p.push(p3.pop());
        p.print();

    }

    public static Pilha preenchePilha() {
        Pilha p = new Pilha();
        p.push(new Funcionario("Gustavo Gomes Cavalcanti", 1500.00));
        p.push(new Funcionario("Pedro Paulo Santos", 5500.75));
        p.push(new Funcionario("Mariana Silva Souza", 2500.5));
        p.push(new Funcionario("André Câmara Ferreira", 1850.2));
        p.push(new Funcionario("Mariana Pereira Ramos", 2870.00));
        return p;
    }
}
