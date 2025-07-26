package JavaPW.assingment;

import java.util.Scanner;

public class ElectricGrid {

    // Union-Find (Disjoint Set) class to efficiently track connected components
    static class UnionFind {
        int[] parent;

        // Constructor: initialize each node as its own parent
        public UnionFind(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        // Find with path compression
        public int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        // Union two sets, returns false if a cycle is detected
        public boolean union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) {
                return false; // Cycle detected
            }
            parent[rootY] = rootX; // Merge sets
            return true;
        }
    }

    // Function to check for cycles in an undirected graph
    public static boolean hasCycle(int V, int[][] edges) {
        UnionFind uf = new UnionFind(V);
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            if (!uf.union(u, v)) {
                return true; // Cycle detected
            }
        }
        return false; // No cycle detected
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of nodes
        System.out.print("Enter the number of nodes in the grid: ");
        int V = sc.nextInt();

        // Input: number of edges
        System.out.print("Enter the number of edges in the grid: ");
        int E = sc.nextInt();

        int[][] edges = new int[E][2];

        // Input: each edge
        System.out.println("Enter each edge in the format: u v");
        for (int i = 0; i < E; i++) {
            System.out.print("Edge " + (i + 1) + ": ");
            edges[i][0] = sc.nextInt(); // node u
            edges[i][1] = sc.nextInt(); // node v
        }

        // Check for cycle
        if (hasCycle(V, edges)) {
            System.out.println("Cycle Detected in the Power Grid.");
        } else {
            System.out.println("No Cycle in the Power Grid.");
        }

        sc.close();
    }
}
