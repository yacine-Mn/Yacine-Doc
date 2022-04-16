
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.LinkedList;

class flot {
	static final int n = 12; 

	
	boolean b(int Graph[][], int s, int t, int parent[])
	{
		
		
		boolean vis[] = new boolean[n];
		for (int i = 0; i < n; ++i)
			vis[i] = false;

		
		LinkedList<Integer> queue
			= new LinkedList<Integer>();
		queue.add(s);
		vis[s] = true;
		parent[s] = -1;

		
		while (queue.size() != 0) {
			int u = queue.poll();

			for (int v = 0; v < n; v++) {
				if (vis[v] == false
					&& Graph[u][v] > 0) {
					if (v == t) {
						parent[v] = u;
						return true;
					}
					queue.add(v);
					parent[v] = u;
					vis[v] = true;
				}
			}
		}

		
		return false;
	}

int function(int graph[][], int s, int t)
{
int z, x;
		
		
int Graph[][] = new int[n][n];

	for (z = 0; z< n; z++)
	for (x = 0; x < n; x++)
        Graph[z][x] = graph[z][x];

		
int parent[] = new int[n];

int f = 0; 

		while (b(Graph, s, t, parent)) {
			
			
	int patt = Integer.MAX_VALUE;
	for (x = t; x != s; x = parent[x]) {
	z = parent[x];
	patt= Math.min(patt, Graph[z][x]);
	}

			
for (x = t; x != s; x = parent[x]) {
	z = parent[x];
Graph[z][x] -= patt;
Graph[x][z] += patt;
}

		
f += patt;
		}

		return f;
        }

	
	public static void main(String[] args)
		throws java.lang.Exception
	{
		
		int graph[][] = new int[][] {
	
                    
                    
  { 0, 35, 25, 0, 0, 0,0,0,0,0,0,0 }, { 0, 0, 0, 20, 0,15,12,0,0,0,0,0 },  { 0, 0, 0, 0,0, 6, 22,0,0,0,0,0 },   { 0,0, 0, 0, 15, 10, 0,0,0,0,0,0 },   { 0,0, 0, 0, 0, 4, 0,0,7,10,0,0 },   { 0,0, 0, 0, 0, 0, 0 ,0,10,15,15,0},   { 0,0, 0, 0, 0, 0, 0,2,0,0,0,0 },   { 0,0, 0, 0, 0, 0, 0,0,0,10,10,0 }, { 0,0, 0, 0, 0, 0, 0,0,0,0,0,18 },   { 0, 0, 0, 0, 0, 0,0,0,0,0,0,15 },   { 0, 0, 0, 0, 0, 0,0,0,0,0,0,20 }, { 0, 0, 0, 0, 0, 0,0,0,0,0,0,0 }  
	              
                        
                         
		};
		flot maxi = new flot();
                
                

		System.out.println("Le flot maximum est "+ maxi.function(graph, 2,11 ));
	
        }
}