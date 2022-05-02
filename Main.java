public class Main {
    public static void main(String[] args){
        int counter1 = 0;
        int counter2 = 0;
        BST bst = new BST(5);
        AVLTree avlTree = new AVLTree();
        BST bst1 = new BST(5);
        AVLTree avlTree1 = new AVLTree();
        long timeToInsert1 = System.nanoTime();
        while(counter1 < 10000){
            avlTree.root = avlTree.insert(avlTree.root, counter1+7);
            counter1++;
        }
        System.out.println("Time to insert in Balanced BST with consecutive elements: " +
                (System.nanoTime() - timeToInsert1) + "ns");
        long timeToInsert2 = System.nanoTime();
        while(counter2 < 10000){
            bst.insert(counter2+7);
            counter2++;
        }
        System.out.println("Time to insert in Unbalanced BST with consecutive elements: " +
                (System.nanoTime() - timeToInsert2) + "ns");
        long timeToSearch1 = System.nanoTime();
        while(counter1 > 0){
            avlTree.containsNode((int) (Math.random() * 10000));
            counter1--;
        }
        System.out.println("Time to search in Balanced BST with consecutive elements: " +
                (System.nanoTime() - timeToSearch1) + "ns");
        long timeToSearch2 = System.nanoTime();
        while (counter2 > 0){
            bst.containsNode((int) (Math.random() * 10000));
            counter2--;
        }
        System.out.println("Time to search in Unbalanced BST with consecutive elements: " +
                (System.nanoTime() - timeToSearch2) + "ns");
        long timeToDelete1 = System.nanoTime();
        while (counter1 < 10000){
            avlTree.deleteNode(avlTree.root, (int) (Math.random() * 10000));
            counter1++;
        }
        System.out.println("Time to delete in Balanced BST with consecutive elements: " +
                (System.nanoTime() - timeToDelete1) + "ns");
        long timeToDelete2 = System.nanoTime();
        while (counter2 < 10000){
            bst.delete((int) (Math.random() * 1000));
            counter2++;
        }
        System.out.println("Time to delete in Unbalanced BST with consecutive elements: " +
                (System.nanoTime() - timeToDelete2) + "ns");
        avlTree.preOrder(avlTree.root);
        System.out.println();
        long toInsert1 = System.nanoTime();
        while(counter1 > 0){
            avlTree1.root= avlTree1.insert(avlTree1.root,(int) (Math.random() * 1000000));
            counter1--;
        }
        System.out.println("Time to insert in Balanced BST with random elements: " +
                (System.nanoTime() - toInsert1) + "ns");
        long toInsert2 = System.nanoTime();
        while(counter2 > 0){
            bst1.insert((int) (Math.random() * 1000000));
            counter2--;
        }
        System.out.println("Time to insert in Unbalanced BST with random elements: " +
                (System.nanoTime() - toInsert2) + "ns");
        long toSearch1 = System.nanoTime();
        while(counter1 < 10000){
            avlTree1.containsNode((int) (Math.random() * 1000000));
            counter1++;
        }
        System.out.println("Time to search in Balanced BST with random elements: " +
                (System.nanoTime() - toSearch1) + "ns");
        long toSeacrh2 = System.nanoTime();
        while(counter2 < 10000){
            bst1.containsNode((int) (Math.random() * 1000000));
            counter2++;
        }
        System.out.println("Time to search in Unbalanced BST with random elements: " +
                (System.nanoTime() - toSeacrh2) + "ns");
        long toDelete1 = System.nanoTime();
        while(counter1 > 0){
            avlTree1.deleteNode(avlTree1.root,(int) (Math.random() * 1000000));
            counter1--;
        }
        System.out.println("Time to delete in Balanced BST with random elements: " +
                (System.nanoTime() - toDelete1) + "ns");
        long toDelete2 = System.nanoTime();
        while(counter2 > 0){
            bst1.delete((int) (Math.random() * 1000000));
            counter2--;
        }
        System.out.println("Time to delete in Unbalanced BST with random elements: " +
                (System.nanoTime() - toDelete2) + "ns");
        avlTree1.preOrder(avlTree1.root);
    }
}
