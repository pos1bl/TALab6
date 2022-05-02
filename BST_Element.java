public class BST_Element {
    int data;
    BST_Element left;
    BST_Element right;

    public BST_Element(int data){
        this.data = data;
        left =null;
        right = null;
    }


    public int getData(){
        return data;
    }

    public BST_Element getLeft() {
        return left;
    }

    public BST_Element getRight() {
        return right;
    }

    public void setData(int data){
        this.data = data;
    }

    public void setLeft(BST_Element left){
        this.left = left;
    }

    public void setRight(BST_Element right){
        this.right = right;
    }
}
