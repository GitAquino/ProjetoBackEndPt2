package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class OpcoesMenu {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Produto> listaProdutos = new ArrayList<>();
    private static int proximoId = 1;

    public static void cadastrarProduto() {
        System.out.println("* * * * Cadastrar Produto * * * *");
        System.out.print("* Informe o nome do Produto: ");
        String nome = scanner.next();
        System.out.print("* Informe a quantidade do Produto: ");
        Integer quantidade = scanner.nextInt();
        System.out.print("* Informe o valor do Produto: ");
        Double valor = scanner.nextDouble();
        scanner.nextLine();

        LocalDate dataAtual = LocalDate.now();
        Produto novoProduto = new Produto(proximoId, nome, quantidade, valor, dataAtual);
        listaProdutos.add(novoProduto);
        proximoId++;

        System.out.println("Produto cadastrado com sucesso!");
    }

    public void editarProduto() {
        System.out.println("* * * * Editar Produto * * * *");
        System.out.print("Digite o ID do produto que deseja editar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Produto produtoEncontrado = null;
        for (Produto produto : listaProdutos) {
            if (produto.getId().equals(id)) {
                produtoEncontrado = produto;
                break;
            }
        }

        if (produtoEncontrado != null) {
            System.out.println("Produto encontrado:");
            System.out.println(produtoEncontrado);

            System.out.println("* Informe o campo que deseja editar:");
            System.out.println("* Opção 1: Nome");
            System.out.println("* Opção 2: Quantidade");
            System.out.println("* Opção 3: Valor");
            System.out.println("* Opção 4: Data de cadastro");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o novo nome do Produto: ");
                    String novoNome = scanner.nextLine();
                    produtoEncontrado.setNome(novoNome);
                    break;
                case 2:
                    System.out.print("Informe a nova quantidade do Produto: ");
                    int novaQuantidade = scanner.nextInt();
                    scanner.nextLine();
                    produtoEncontrado.setQuantidade(novaQuantidade);
                    break;
                case 3:
                    System.out.print("Informe o novo valor do Produto: ");
                    double novoValor = scanner.nextDouble();
                    scanner.nextLine();
                    produtoEncontrado.setValor(novoValor);
                    break;
                case 4:
                    System.out.println("A data de cadastro não pode ser alterada diretamente.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

            System.out.println("Produto editado com sucesso!");
        } else {
            System.out.println("Produto não encontrado com o ID informado.");
        }
    }

    public static void deletarProduto() {
        System.out.println("* * * * Deletar Produto * * * *");
        System.out.print("* Digite o ID do produto que deseja excluir: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        boolean removido = false;
        for (int i = 0; i < listaProdutos.size(); i++) {
            if (listaProdutos.get(i).getId().equals(id)) {
                listaProdutos.remove(i);
                removido = true;
                System.out.println("* Produto removido com sucesso!");
                break;
            }
        }

        if (!removido) {
            System.out.println("* Produto não encontrado com o ID informado.");
        }
    }

    public static void visualizarProdutos() {
        System.out.println("* * * * Visualizar Produtos * * * *");
        if (listaProdutos.isEmpty()) {
            System.out.println("* Nenhum produto cadastrado.");
        } else {
            for (Produto produto : listaProdutos) {
                System.out.println(produto);
            }
        }
    }
}
