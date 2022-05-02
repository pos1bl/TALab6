public class BST implements Tree {
    BST_Element root;

    public BST(int root) {
        this.root = new BST_Element(root);
    }

    private BST_Element addRecursive(BST_Element current, int value) {
        if (current == null) {
            return new BST_Element(value);
        }

        if (value < current.getData()) {
            current.setLeft(addRecursive(current.getLeft(), value));
        } else if (value > current.getData()) {
            current.setRight(addRecursive(current.getRight(), value));
        } else {

            return current;
        }

        return current;
    }

    public void insert(int value) {
        root = addRecursive(root, value);
    }


    private boolean containsNodeRecursive(BST_Element current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.getData()) {
            return true;
        }
        return value < current.getData()
                ? containsNodeRecursive(current.getLeft(), value)
                : containsNodeRecursive(current.getRight(), value);
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    private BST_Element deleteRecursive(BST_Element current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.getData()) {
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }
            int smallestValue = findSmallestValue(current.right);
            current.setData(smallestValue);
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }
        if (value < current.getData()) {
            current.left = deleteRecursive(current.getLeft(), value);
            return current;
        }
        current.right = deleteRecursive(current.getRight(), value);
        return current;
    }

    private int findSmallestValue(BST_Element root) {
        return root.left == null ? root.data : findSmallestValue(root.left);
    }

    public void delete(int value) {
        root = deleteRecursive(root, value);
    }
}
