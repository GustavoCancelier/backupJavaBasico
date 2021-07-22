package br.com.gustavo.sunset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Programa {
    // [[ytftyfty][tftft][ygygy]]
    public static void main(String[] args_) {
        String[] args = { "explicar", "2", "8" };
        System.out.println("Ligou");
        if (Objects.nonNull(args) && args.length > 0) {
            if ("soma".equals(args[0])) {
               soma(args);
            } else if ("add".equals(args[0])) {
                add(args);
            } else if ("listar".equals(args[0])) {
                listar(args);
            } else {
                explicar();
            }
        } else {
            System.out.println("nao veio nada :(");
        }
    }

    private static void listar(String[] args) {
        for (String item : args) {
            System.out.println(item);
        }
    }

    private static void soma(String[] args) {
        Integer soma = 0;
        for (int i = 1; i < args.length; i++) { // i = i + 1 
            soma += Integer.valueOf(args[i]);
        }
        System.out.println("A soma dos valores: " + soma);
    }

    private static void add(String[] args) {
        List<String> compras = new ArrayList<>();
        Integer i = 1;
        while (i < args.length) {
            compras.add(args[i]);
            ++i;
        }
        System.out.println(Arrays.toString(compras.toArray()));
    }

    private static void explicar() {
        System.out.println("A atribuição i++ retorna o valor inicial de i e depois realiza o incremento");
        System.out.println("A atribuição ++i já realiza o incremento antes de retornar o valor inicial");

        Integer i = 0;
        Integer j = 0;
        System.out.println(i++);
        System.out.println(++j);

        System.out.println("Variável i após o incremento com i++: " + i);
        System.out.println("Variável i após o incremento com ++i: " + j);
    }
}