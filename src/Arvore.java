public class Arvore {
    Galho root;

    public Arvore() {
        root = null;
    }

    // Método para adicionar um novo valor na árvore
    public void add(int value) {
        root = addRecursive(root, value);
    }

    // Método recursivo que encontra a posição correta para inserir um novo valor
    private Galho addRecursive(Galho current, int value) {
        if (current == null) {
            return new Galho(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        }
        return current;
    }

    // Travessia em pré-ordem (raiz, esquerda, direita)
    public void preOrderTraversal(Galho node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    // Travessia em-ordem (esquerda, raiz, direita)
    public void inOrderTraversal(Galho node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.value + " ");
        inOrderTraversal(node.right);
    }

    // Travessia em pós-ordem (esquerda, direita, raiz)
    public void postOrderTraversal(Galho node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.value + " ");
    }
}
