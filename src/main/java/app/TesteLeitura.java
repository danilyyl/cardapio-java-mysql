package app;

import dao.ItemCardapioDAO;
import java.util.Scanner;

public class TesteLeitura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ItemCardapioDAO dao = new ItemCardapioDAO();

        System.out.println("=== CARDÁPIO ===");
        System.out.println("1 - Pratos");
        System.out.println("2 - Bebidas");
        System.out.print("Escolha a categoria: ");

        int opcao = sc.nextInt();

        if (opcao == 1) {
            dao.listarPorCategoria(1);
        } else if (opcao == 2) {
            dao.listarPorCategoria(2);
        } else {
            System.out.println("Opção inválida.");
        }

        sc.close();
    }
}

