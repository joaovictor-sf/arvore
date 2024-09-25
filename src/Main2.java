import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
            Tree tree = new Tree();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite a quantidade de nós que deseja inserir na árvore:");
            int n = scanner.nextInt();

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

            scanner.close();
    }
}
