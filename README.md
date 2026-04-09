SimpleClustering (Java - Unsupervised Learning)

This is a basic Java program I created to understand the concept of unsupervised learning, especially clustering.

What this program does

- Takes some sample data (numbers)
- Assigns them into two clusters
- Groups data based on distance from cluster centers

Concept used

This program is based on a simple idea of clustering (similar to K-Means).
There are no labels given to the data, and grouping is done based on similarity.

Tools used

- Java
- VS Code

How it works

- First, two initial cluster centers are selected
- Then each data point is compared with both clusters
- The point is assigned to the nearest cluster using distance

Sample Output

Initial Clusters:
Cluster1 Center: 2
Cluster2 Center: 4

Assigning data points:
2 -> Cluster 1
4 -> Cluster 2
10 -> Cluster 2
12 -> Cluster 2
20 -> Cluster 2
25 -> Cluster 2

Why I made this

I made this program to get a basic idea of how unsupervised learning works without using any external libraries.

File name

SimpleClustering.java
