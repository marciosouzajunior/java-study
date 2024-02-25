package MyTree;

public class DFS {

    public static void main(String[] args) {

        //      1
        //    /   \
        //   2     9
        //  / \     \
        // 7   3     0
        //      \
        //       5

        // Create nodes
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(7);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(9);
        TreeNode node7 = new TreeNode(0);

        // Create left side
        node1.setLeft(node2);
        node2.setLeft(node3);
        node2.setRight(node4);
        node4.setRight(node5);

        // Create right side
        node1.setRight(node6);
        node6.setRight(node7);

        boolean result = depthFirstSearch(node1, 3);
        System.out.println("Value is found: " + result);

    }

    public static boolean depthFirstSearch(TreeNode node, int searchValue){

        if (node == null){
            return false;
        }

        if (node.getValue() == searchValue){
            return true;
        }

        // Search left
        boolean result = depthFirstSearch(node.getLeft(), searchValue);

        // Search right
        if (!result) {
            result = depthFirstSearch(node.getRight(), searchValue);
        }

        return result;

    }


}

