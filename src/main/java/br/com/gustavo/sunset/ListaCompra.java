package br.com.gustavo.sunset;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaCompra {
    public static void main(String[] args) {
        List<String> produtos = new ArrayList<>();
        try (Scanner ler = new Scanner(System.in)) {
            while (produtos.size() < 5) {
                System.out.println("Informe o que deseja adicionar na lista de compras: ");
                produtos.add(ler.nextLine());
            }
            System.out.println("Produtos na lista de compras: ");
            for (String itens : produtos) {
                System.out.println(itens);
            }
        }
    }
}
