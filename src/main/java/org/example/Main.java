package org.example;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static OpcoesMenu opcoesMenu = new OpcoesMenu();

    private static void menuPrincipal() {
        System.out.println("* * * * * * * MENU * * * * * * *");
        System.out.println("* Opção 1: Cadastrar Produto");
        System.out.println("* Opção 2: Editar Produto");
        System.out.println("* Opção 3: Deletar Produto");
        System.out.println("* Opção 4: Visualizar Produtos");
        System.out.println("* Opção 0: Sair do Sistema");
        System.out.println("* * * * Escolha uma opção * * * *");
    }

    public static void main(String[] args) {
        int opcao;

        do {
            menuPrincipal();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    opcoesMenu.cadastrarProduto();
                    break;
                case 2:
                    opcoesMenu.editarProduto();
                    break;
                case 3:
                    opcoesMenu.deletarProduto();
                    break;
                case 4:
                    opcoesMenu.visualizarProdutos();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...\n");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.\n");
            }

        } while (opcao != 0);
    }
}
