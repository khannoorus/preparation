package com.hackerearth;

import java.util.InputMismatchException;

import java.util.LinkedList;

import java.util.Queue;

import java.util.Scanner;

public class TestClass

{

	private Queue<Integer> queue;

	public TestClass()

	{

		queue = new LinkedList<Integer>();

	}

	public void bfs(int adjacency_matrix[][], int source)

	{

		int number_of_nodes = adjacency_matrix[source].length - 1;

		int[] visited = new int[number_of_nodes + 1];

		int i, element;

		visited[source] = 1;

		queue.add(source);

		while (!queue.isEmpty())

		{

			element = queue.remove();

			i = element;

			while (i <= number_of_nodes)

			{

				if (adjacency_matrix[element][i] == 1 && visited[i] == 0)

				{

					queue.add(i);

					visited[i] = 1;

				}

				i++;

			}

		}

		boolean connected = false;

		for (int vertex = 1; vertex <= number_of_nodes; vertex++)

		{

			if (visited[vertex] == 1)

			{

				connected = true;

			} else

			{

				connected = false;

				break;

			}

		}

		if (connected)

		{

			System.out.println("The graph is connected");

		} else

		{

			System.out.println("The graph is disconnected");

		}

	}

	public static void main(String... arg)

	{

		int n, m;

		Scanner scanner = null;

		try

		{

			System.out.println("Enter the number of nodes in the graph");

			scanner = new Scanner(System.in);

			n = scanner.nextInt();

			int adjacency_matrix[][] = new int[n + 1][n + 1];

			System.out.println("Enter the adjacency matrix");

			for (int i = 1; i <= n; i++)

				for (int j = 1; j <= n; j++)

					adjacency_matrix[i][j] = scanner.nextInt();

			for (int i = 1; i <= n; i++)

			{

				for (int j = 1; j <= n; j++)

				{

					if (adjacency_matrix[i][j] == 1 && adjacency_matrix[j][i] == 0)

					{

						adjacency_matrix[j][i] = 1;

					}

				}

			}

			System.out.println("Enter the m for the graph");

			m = scanner.nextInt();

			TestClass undirectedConnectivity = new TestClass();

			undirectedConnectivity.bfs(adjacency_matrix, m);

		} catch (InputMismatchException inputMismatch)

		{

			System.out.println("Wrong Input Format");

		}

		scanner.close();

	}

}