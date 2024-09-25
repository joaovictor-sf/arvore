public class Main {
    public static void main(String[] args) {
        Arvore tree = new Arvore();

        // Criando nós da árvore binária
        tree.root = new Galho(1);
        tree.root.left = new Galho(2);
        tree.root.right = new Galho(3);
        tree.root.left.left = new Galho(4);
        tree.root.left.right = new Galho(5);
        tree.root.right.left = new Galho(6);
        tree.root.right.right = new Galho(7);

        // Testando a travessia em pré-ordem
        System.out.println("Pré-ordem:");
        tree.preOrderTraversal(tree.root);

        // Testando a travessia em-ordem
        System.out.println("\nEm-ordem:");
        tree.inOrderTraversal(tree.root);

        // Testando a travessia em pós-ordem
        System.out.println("\nPós-ordem:");
        tree.postOrderTraversal(tree.root);
    }
}