package main;

import java.util.Arrays;

public class Graph {
	int nNodes;
	double distances[][];
	
	public Graph(int nNodes)
	{
		this.nNodes = nNodes;
		distances = new double[nNodes][nNodes];
		for (int i = 0; i < nNodes; i++)
		{
			for (int j = 0; j < nNodes; j++)
			{
				distances[i][j] = -1;
			}
		}
		
	}
	
	public double getEdge(int vertexIndex1, int vertexIndex2)
	{
		return distances[vertexIndex1][vertexIndex2];
	}

	public void setEdge(double distance, int vertexIndex1, int vertexIndex2)
	{
		distances[vertexIndex1][vertexIndex2] = distance;
	}
	
	public void setEdgeBidirectional(double distance, int vertexIndex1, int vertexIndex2)
	{
		distances[vertexIndex2][vertexIndex1] = distance;
		distances[vertexIndex1][vertexIndex2] = distance;
	}
	
	public double shortestDistanceBetween(int source, int target)
	{
		double[] distance = new double[nNodes];
		Arrays.fill(distance, Double.MAX_VALUE);
		distance[source] = 0;
		
		PriorityQueue pq = new PriorityQueue();
		pq.enqueue(source, 0);
		pq.blockInFuture(source);
		
		for (int i = 0; i < nNodes; i++)
		{
			if (distances[source][i] >0)
			{
				if (!pq.contains(i))
				{
				pq.enqueue(i, distances[source][i]);
				}
				else
				{
					pq.update(i, distance[i]);
				}
			}
		}
		return 0;
	}
}
