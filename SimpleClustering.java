public class SimpleClustering {

    public static void main(String[] args) {

        // Sample data (1D points)
        int data[] = {2, 4, 10, 12, 20, 25};

        // Initial cluster centers
        int cluster1 = data[0];
        int cluster2 = data[1];

        System.out.println("Initial Clusters:");
        System.out.println("Cluster1 Center: " + cluster1);
        System.out.println("Cluster2 Center: " + cluster2);

        // Assign points to nearest cluster
        System.out.println("\nAssigning data points:");

        for (int i = 0; i < data.length; i++) {

            int dist1 = Math.abs(data[i] - cluster1);
            int dist2 = Math.abs(data[i] - cluster2);

            if (dist1 < dist2) {
                System.out.println(data[i] + " -> Cluster 1");
            } else {
                System.out.println(data[i] + " -> Cluster 2");
            }
        }
    }
}