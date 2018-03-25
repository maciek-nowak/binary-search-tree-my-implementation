public class Node {
    private Node left;
    private Node right;
    private int value;

    public Node(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void insert(int data) {

        if (data < this.value) {
            if (this.left == null) {
                this.left = new Node(data);
            } else {
                this.left.insert(data);
            }
        } else {
            if (this.right == null) {
                this.right = new Node(data);
            } else {
                this.right.insert(data);
            }
        }
    }

    public boolean contains(int data) {
        if (this.value == data) {
            return true;
        }

        if (data < this.value) {
            if (this.left == null) {
                return false;
            }

            return this.left.contains(data);
        } else {
            if (this.right == null) {
                return false;
            }

            return this.right.contains(data);
        }
    }

    public void printInOrder() {
        if (this.left != null) {
            this.left.printInOrder();
        }
        System.out.println(this.value);
        if (this.right != null) {
            this.right.printInOrder();
        }
    }
}
