// node creating sublass
public class Node {
    int key, height;
    Node left, right;

    Node(int d) {
        key = d;
        height = 1;
    }

    public int getKey() {
        return key;
    }

    public int getHeight() {
        return height;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}

