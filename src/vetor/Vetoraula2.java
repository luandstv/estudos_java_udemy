package vetor;

import entities.Product;

import java.util.Scanner;

public class Vetoraula2 {

    public void precoMedio() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();

            vect[i] =  new Product(name,price);
            // por se tratar de um vetor onde temos duas informações por posição criamos uma classe que é o nosso objeto produto
            // para cada posição do vetor precisamos instanciar a classe produto por isso ao passar para o nosso vetor utilizmaos o new Product
        }

        double sum = 0.0;
        for (Product product : vect) { // maneira mais simples de percorrer o nosso vetor e buscar o dado que precisamos para somar que é o preço de cada produto
            // Product = tipo de dado buscado
            // product = nome da variavel
            // : = operador
            // vect = o nosso vetor onde estão os dados
            sum += product.getPrice();
        }

        double avg = sum / vect.length;

        System.out.printf("A media de preços é: %.2f%n", avg);


        sc.close();
    }
}
