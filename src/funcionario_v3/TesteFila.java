package funcionario_v3;

public class TesteFila {
    public static void main(String[] args) {

        // 1. Cadastre o nome e o sal�rio de 5 funcion�rios
        Fila f = preencheFila();
        System.out.println("\n1. Cadastre o nome e o sal�rio de 5 funcion�rios");

        // 2. liste todos os dados dos funcion�rios. Lembrando que a impress�o dos valores deve iniciar no in�cio da fila
        f.print();

        // 3. Pesquise por nome um funcion�rio existente
        System.out.println("\n3. Pesquise por nome um funcion�rio existente");
        System.out.println(f.contain("mariana SILVA SouZa"));

        // 4. Pesquise por nome um funcion�rio que n�o existe
        System.out.println("\n4. Pesquise por nome um funcion�rio que n�o existe");
        System.out.println(f.contain("Mariana Souza"));

        // 5. Retire todos os funcion�rios da fila
        System.out.println("\n5. Retire todos os funcion�rios da fila");
        while (!f.isEmpty()) {
            System.out.println(f.dequeue().getNome());
        }
        f.print();

        // 6. Preencha novamente a pilha e remova um dos funcion�rios sem criar novos m�todos na classe Fila
        System.out.println("\n6. Preencha novamente a pilha e remova um dos funcion�rios sem criar novos m�todos na classe Fila");
        f = preencheFila();
        Fila f2 = new Fila();

        while (!f.isEmpty()) {
            Funcionario aux = f.dequeue();
            if (!aux.getNome().equalsIgnoreCase("Mariana Silva Souza")) {
                f2.enqueue(aux);
            }
        }

        // Tratamento de exce��o - Tentar remo��o em fila vazia
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
        f.enqueue(new Funcionario("Andr� C�mara Ferreira", 1850.2));
        f.enqueue(new Funcionario("Mariana Pereira Ramos", 2870.00));
        return f;
    }
}
