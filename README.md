# Revisão Algoritmos e Estruturas de dados II

## Exercício 1 - Lista: package funcionarios_v1
Elaborar um código em Java para que seja possível efetuar o controle de funcionários de uma empresa.

## Requisitos:

### Classe Funcionário
1. Criar uma classe Funcionário que deverá conter como atributos o nome e o salário do funcionário;
2. Criar um construtor e os métodos get e set para todos os atributos da classe;

### Tipo Abstrato de Dados (TAD) Lista
1. Criar um vetor chamado: ***funcionarios***, com capacidade para armazenar até 100 posições, como estrutura para armazenamento de objetos do tipo **Funcionario**. Não devem ser utilizadas classes já prontas do Java como ArrayList, Vector, etc.;
2. Implementar os seguintes métodos com suas respectivas assinaturas:
````JAVA
public void adiciona(Funcionario func) {}
public Funcionario busca(int posicao) {}
private boolean posicaoOcupada(int posicao) {}
public void remove(int posicao) {}
public boolean contem(String nome) {}
public int tamanho() {}
public void imprimeLista() {}
public void ordenaPorNome() {}
````
**Obs.:** Se necessário, podem ser implementados outros métodos auxiliares além dos acima citados.

### Classe de Teste (Main)

Desenvolva um código Java para testar as classes Funcionário e Lista que realize as seguintes tarefas:

1. Cadastre o nome e o salário de 5 funcionários
2. liste todos os dados dos funcionários
3. Pesquise por nome um funcionário existente
4. Pesquise por nome um funcionário que não existe
5. Busque um funcionário por sua posição
6. Busque um funcionário com uma posição inválida
7. Liste todos os funcionários em ordem alfabética
8. Realizar uma remoção de um registro existente
9. Tentar uma remoção de um registro não existente

### Conceitos Revisados:

- Orientação a Objetos:
    - Classe
    - Métodos
    - Encapsulamento - Visibilidade
    - Tratamento de exceções - throw/Try/Catch
- Tipos Abstratos de Dados (TAD)
    - Lista simples
    - Array (Vetor unidimensional)
- Método de Ordenação - Bubble Sort
- Método de Pesquisa Simples

## Exercício 2 - Pilha: package funcionarios_v2

**PROCEDIMENTO:** Aproveitando a classe Funcionário, utilizada no exercício anterior, crie uma nova classe **Pilha.java** e implemente o Tipo Abstrato de Dados **(TAD) PILHA**.

**DEFINIÇÕES:** Uma Pilha é um conjunto de elementos no qual o único elemento acessível é o elemento inserido há menos tempo, denominado topo. Ao se retirar um elemento de uma pilha, retira-se sempre o elemento do topo.

**OPERAÇÕES MÍNIMAS A SEREM IMPLEMENTADAS:**
```JAVA
// Verifica se a Pilha está vazia
public boolean isEmpty( ) {}
// Insere um funcionário no topo da pilha
public void push(Funcionario f) {}
// Retira o elemento que está no topo da pilha
public Funcionario pop( ) {}
// verifica se existe um funcionário pelo nome
public boolean contain(String nome) {}
// Mostra (imprime) o conteúdo da pilha
public void print( ) {}
// Retorna a quantidade de itens úteis da pilha
public int size( ) {}
```

### Classe de Teste (Main)

Desenvolva um código Java para testar as classes Funcionário e Pilha que realize as seguintes tarefas:

1. Cadastre o nome e o salário de 5 funcionários
2. liste todos os dados dos funcionários. Lembrando que a impressão dos valores deve iniciar no topo da pilha
3. Pesquise por nome um funcionário existente
4. Pesquise por nome um funcionário que não existe
5. Retire todos os funcionários da pilha
6. Preencha novamente a pilha e liste os funcionários em ordem invertida.
7. Preencha novamente a pilha e remova um dos funcionários sem criar novos métodos na classe Pilha
8. Tente remover um elemento de uma pilha vazia

## Exercício 3 - Fila: package funcionarios_v3

**PROCEDIMENTO:** Aproveitando a classe Funcionário, utilizada no exercício anterior, crie uma nova classe **Fila.java** e implemente o Tipo Abstrato de Dados **(TAD) FILA**.

**DEFINIÇÕES:** Uma Fila é um conjunto de elementos no qual o único elemento acessível é o elemento inserido há mais tempo, denominado frente. A fila utiliza a política FIFO: Ao se retirar um elemento de uma fila, retira-se sempre o elemento da frente.

**OPERAÇÕES MÍNIMAS A SEREM IMPLEMENTADAS:**
```JAVA
// Verifica se a Fila está vazia
public boolean isEmpty( ) {}
// Insere um funcionário no fim da fila
public void enqueue(Funcionario f) {}
// Retira o elemento que está no início da fila
public Funcionario dequeue( ) {}
// verifica se existe um funcionário pelo nome
public boolean contain(String nome) {}
// Mostra (imprime) o conteúdo da fila
public void print( ) {}
// Retorna a quantidade de itens úteis da fila
public int size( ) {}
```

### Classe de Teste (Main)

Desenvolva um código Java para testar as classes Funcionário e Fila que realize as seguintes tarefas:

1. Cadastre o nome e o salário de 5 funcionários
2. liste todos os dados dos funcionários. Lembrando que a impressão dos valores deve iniciar no início da fila
3. Pesquise por nome um funcionário existente
4. Pesquise por nome um funcionário que não existe
5. Retire todos os funcionários da fila
6. Preencha novamente a fila e remova um dos funcionários sem criar novos métodos na classe Fila
7. Tente remover um elemento de uma fila vazia




