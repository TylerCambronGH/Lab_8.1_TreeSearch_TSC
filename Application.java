public class Application {
    public static void main(String[] args) {
        System.out.println("Creating a tree of height " + args[0] + ".");
        Tree tree = new Tree();
        int treeHeight = Integer.parseInt(args[0]);
        Node n = tree.generatePracticeTree(treeHeight);
        DepthFirstSearch dfs = new DepthFirstSearch();
        dfs.DFS(n, 1);
        System.out.println("Traversed " + dfs.getNodesTraversed() + " nodes.");
        System.out.println("Traversed " + dfs.getTreeHeight() + " levels. (height)");
    }
}
