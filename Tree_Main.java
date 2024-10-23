public class Tree_Main {
    public static void main(String[] args) {
        
        BinaryTree tree = new  BinaryTree();

        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);

        tree.inorder();
        tree.preorder();
        tree.postorder();

    }
}

class BinaryTree{
    class Node{
        int data;
        Node left;
        Node right;
        
        public Node(int data){ // constructor
            this.data = data;
        }
    }

    Node root;

    public void insert(int data){
        root = insertRec(root, data);
    }

    public Node insertRec(Node root, int data){
            if(root == null)
                root = new Node(data);
            else if(data < root.data)
                root.left = insertRec(root.left,data);
            else if(data > root.data)
                root.right = insertRec(root.right,data);

            return root;
    }

    public void inorder(){
            System.out.println("InOrder :");
            inorderRec(root);
            System.out.println();
    }

    public void inorderRec(Node root){
        if(root != null){
            inorderRec(root.left);
            System.out.print(root.data+" ");
            inorderRec(root.right);
        }
    }

    public void preorder(){
            System.out.println("PreOrder :");
            preorderRec(root);
            System.out.println();
    }

    public void preorderRec(Node root){
        if(root != null){
            System.out.print(root.data+" ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    public void postorder(){
        System.out.println("PostOrder :");
            postorderRec(root);
    }

    public void postorderRec(Node root){
        if(root != null){
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data+" ");
        }
    }
}