/**
 * Find_Center_of_StarGraph
 */
public class Find_Center_of_StarGraph {

    public int findCenter(int[][] edges) {
        int n = edges.length + 1; // Number of nodes
        int[] degree = new int[n + 1]; // Degree array to store count of connections
        
        // Iterate over each edge and update the degree of connected nodes
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            degree[u]++;
            degree[v]++;
        }
        
        // Find the node with degree n - 1 (center node)
        for (int i = 1; i <= n; i++) {
            if (degree[i] == n - 1) {
                return i;
            }
        }
        
        return -1; // In case no center node found (which shouldn't happen as per problem statement)
    }
}