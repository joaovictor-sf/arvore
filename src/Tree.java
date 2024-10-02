public class Tree {
    No root;

    public Tree() {
        root = null;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private static No addRecursive(No current, int value) {
        if (current == null) {
            return new No(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        }
        return current;
    }

    /**
     * raiz, esquerda, direita
     * @param no
     */
    public void preOrderTraversal(No no) {
        if (no == null) {
            return;
        }
        System.out.print(no.value + " ");
        preOrderTraversal(no.left);
        preOrderTraversal(no.right);
    }

    /**
     * esquerda, raiz, direita
     * @param no
     */
    public void inOrderTraversal(No no) {
        if (no == null) {
            return;
        }
        inOrderTraversal(no.left);
        System.out.print(no.value + " ");
        inOrderTraversal(no.right);
    }

    /**
     * esquerda, direita, raiz
     * @param no
     */
    public void postOrderTraversal(No no) {
        if (no == null) {
            return;
        }
        postOrderTraversal(no.left);
        postOrderTraversal(no.right);
        System.out.print(no.value + " ");
    }
}
