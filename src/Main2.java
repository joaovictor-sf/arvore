import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
            Tree tree = new Tree();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite a quantidade de nós que deseja inserir na árvore, se o número for maior que 10, os valores serão randomicos:");
            int n = scanner.nextInt();

            if(n <= 10) {
                System.out.println("Digite os valores dos nós:");
                for (int i = 0; i < n; i++) {
                    int value = scanner.nextInt();
                    tree.add(value);
                }

                System.out.println("\nPré-ordem:");
                tree.preOrderTraversal(tree.root);

                System.out.println("\nEm-ordem:");
                tree.inOrderTraversal(tree.root);

                System.out.println("\nPós-ordem:");
                tree.postOrderTraversal(tree.root);
            }else {
                Random random = new Random();
                int value;
                long startTime, endTime, duration;

                for (int i = 0; i < n; i++) {
                    value = random.nextInt(n);
                    tree.add(value);
                }

                startTime = System.nanoTime();
                System.out.println("\nPré-ordem:");
                tree.preOrderTraversal(tree.root);
                endTime = System.nanoTime();
                duration = (endTime - startTime) / 1000000;
                System.out.println("\nTempo de execução da pré-ordem: " + duration + " ms");

                startTime = System.nanoTime();
                System.out.println("\nEm-ordem:");
                tree.inOrderTraversal(tree.root);
                endTime = System.nanoTime();
                duration = (endTime - startTime) / 1000000;
                System.out.println("\nTempo de execução da em-ordem: " + duration + " ms");

                startTime = System.nanoTime();
                System.out.println("\nPós-ordem:");
                tree.postOrderTraversal(tree.root);
                endTime = System.nanoTime();
                duration = (endTime - startTime) / 1000000;
                System.out.println("\nTempo de execução da pós-ordem: " + duration + " ms");
            }

            scanner.close();
    }
}
