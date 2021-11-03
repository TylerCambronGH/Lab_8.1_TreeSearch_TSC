public class DepthFirstSearch {
    private int nodesTraversed;
    private int treeHeight;

    public DepthFirstSearch() {
        nodesTraversed = 0; treeHeight = 0;
    }

    public void DFS(Node node, int level) {
        System.out.println("Traversing node " + node.getData());
        //System.out.println("On level " + level);
        // L
        if (node.getlChild() != null) {
            //System.out.println("Node " + node.getData() + ": Traveling to left child.");
            DFS(node.getlChild(), level + 1);
            //System.out.println("Node " + node.getData() + ": Left child traversed.");
        } else {
            //System.out.println("Node " + node.getData() + ": No left child.");
        }
        // R
        if (node.getrChild() != null) {
            //System.out.println("Node " + node.getData() + ": Traveling to right child.");
            DFS(node.getrChild(), level + 1);
            //System.out.println("Node " + node.getData() + ": Right child traversed.");
        } else {
            //System.out.println("Node " + node.getData() + ": No right child.");
        } 
        if (level > treeHeight) { 
            treeHeight = level;
        }
        nodesTraversed += 1;
        //System.out.println("Node " + node.getData() + ": Traversed.");
        return;
    }

    public int getNodesTraversed() {
        return nodesTraversed;
    }

    public int getTreeHeight() {
        return treeHeight;
    }
}
