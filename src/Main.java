public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.root = new No(1);
        tree.root.left = new No(2);
        tree.root.right = new No(3);
        tree.root.left.left = new No(4);
        tree.root.left.right = new No(5);
        tree.root.right.left = new No(6);
        tree.root.right.right = new No(7);

        System.out.println("Pré-ordem:");
        tree.preOrderTraversal(tree.root);

        System.out.println("\nEm-ordem:");
        tree.inOrderTraversal(tree.root);

        System.out.println("\nPós-ordem:");
        tree.postOrderTraversal(tree.root);

    }
}