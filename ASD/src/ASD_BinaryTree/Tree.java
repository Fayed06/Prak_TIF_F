package ASD_BinaryTree;

public class Tree {
    public Node root;

    public Tree(){
        root = null;
    }

    public void sisipDataNode(int input){
        if(root == null){
            root = new Node(input);
        }else{
            root.sisipData(input);
        }
    }

    public void preorderTraversal(){
        preorder(root);
    }

    private void preorder(Node node) {
        if(node == null){
            return;
        }

        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }

    public void inorderTraversal(){
        inorder(root);
    }

    private void inorder(Node node) {
        if(node == null){
            return;
        }

        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }

    public void postorderTraversal(){
        postorder(root);
    }

    private void postorder(Node node) {
        if(node == null){
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+" ");
    }
}