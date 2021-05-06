package ASD_BinaryTree;

public class Node {
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        left = right = null;
    }

    public void sisipData(int input){
        if(input < this.data){
            if(this.left == null){
                this.left = new Node(input);
            }else{
                this.left.sisipData(input);
            }
        }else if(input > this.data){
            if(this.right == null){
                this.right = new Node(input);
            }else{
                this.right.sisipData(input);
            }
        }
    }
}
