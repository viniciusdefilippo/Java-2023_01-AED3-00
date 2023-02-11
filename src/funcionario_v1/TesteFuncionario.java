package funcionario_v1;

public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario f = new Funcionario(50);

        // 1. Cadastre o nome e o salário de 5 funcionários
        f.adiciona(new Funcionario("Gustavo Gomes Cavalcanti", 1500.00));
        f.adiciona(new Funcionario("Pedro Paulo Santos", 5500.75));
        f.adiciona(new Funcionario("Mariana Silva Souza", 2500.5));
        f.adiciona(new Funcionario("André Câmara Ferreira", 1850.2));
        f.adiciona(new Funcionario("Mariana Pereira Ramos", 2870.00));

        // 2. liste todos os dados dos funcionários
        f.imprimeLista();

        // 3. Pesquise por nome um funcionário existente
        System.out.println(f.contem("mariana SILVA SouZa"));

        // 4. Pesquise por nome um funcionário que não existe
        System.out.println(f.contem("Mariana Souza"));

        // 5. Busque um funcionário por sua posição
        System.out.println(f.busca(1).getNome());

        // 6. Busque um funcionário com uma posição inválida
        System.out.println(f.busca(100).getNome());

        // 7. Liste todos os funcionários em ordem alfabética
        f.ordenaPorNome();
        f.imprimeLista();

        // 8. Realizar uma remoção de um registro existente
        System.out.println("\nRegistro existente removido:");
        f.remove(4);
        f.imprimeLista();

        // 9. Tentar uma remoção de um registro não existente
        System.out.println("\nTentativa de registro não existente:");
        f.remove(-1);
        f.imprimeLista();
    }
}