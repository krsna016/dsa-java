package _9_Trees;

public class BinaryTreeNodeCreation {
    public static class BinaryTreeNode{
        public int data;
        public BinaryTreeNode leftNode;
        public BinaryTreeNode rightNode;

        public BinaryTreeNode(int data){
            this.data = data;
        }

        @Override
        public String toString() {
            String leftNodeData = (leftNode != null) ? Integer.toString(leftNode.data) : "null";
            String rightNodeData = (rightNode != null) ? Integer.toString(rightNode.data) : "null";
            return "Data: " + this.data + ", Left Node: " + leftNodeData + ", Right Node: " + rightNodeData;
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode rootNode = new BinaryTreeNode(10);
        BinaryTreeNode n1 = new BinaryTreeNode(20);
        BinaryTreeNode n2 = new BinaryTreeNode(30);
        rootNode.leftNode = n1;
        rootNode.rightNode = n2;
    }
}