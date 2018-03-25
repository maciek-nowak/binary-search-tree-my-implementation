public class MyBinaryTree {
    private Node root;

    public void insert(int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            root.insert(data);
        }
    }

    public boolean contains(int data) {
        if (root == null) {
            return false;
        } else {
            return root.contains(data);
        }
    }

    public void printInOrder() {
        if (root != null) {
            root.printInOrder();
        } else {
            System.out.println("Tree empty!");
        }
    }

    public static void main(String[] args) {
        MyBinaryTree tree = new MyBinaryTree();
        tree.insert(10);
        tree.insert(50);
        tree.insert(7);
        System.out.println(tree.contains(5));

        tree.printInOrder();
    }
}
