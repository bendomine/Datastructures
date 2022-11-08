import java.util.HashSet;

public class AdjMain {
	public static void main(String[] args) {
		int pass = 0;
		int total = 0;

		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Edge e1 = new Edge(n1, n2);
		Edge e2 = new Edge(n2, n1);
		Edge e3 = new Edge(n1, n1);
		Edge e4 = new Edge(n2, n2);
		HashSet<Node> nodes = new HashSet<Node>();
		HashSet<Edge> edges = new HashSet<Edge>();
		nodes.add(n1);
		nodes.add(n2);
		edges.add(e1);
		edges.add(e2);
		edges.add(e3);
		edges.add(e4);
		AdjGraph graph = new AdjGraph(nodes, edges);
		Node[] order = graph.getOrder();
		Edge[][] matrix = graph.getAdjMatrix();
		// This is necessary because sets are unordered, and it's possible that either of these could be true
		if (order[0].equals(n1)){
			if (matrix[0][0].equals(e3)) pass ++;
			if (matrix[1][1].equals(e4)) pass ++;
			if (matrix[0][1].equals(e2)) pass ++;
			if (matrix[1][0].equals(e1)) pass ++;
		}
		else{
			if (matrix[1][1].equals(e3)) pass ++;
			if (matrix[0][0].equals(e4)) pass ++;
			if (matrix[1][0].equals(e2)) pass ++;
			if (matrix[0][1].equals(e1)) pass ++;
		}
		total += 4;

		Node n3 = new Node(3);
		Edge e5 = new Edge(n2, n3);
		nodes.add(n3);
		edges.add(e5);
		graph = new AdjGraph(nodes, edges);
		HashSet<Node> aN1 = graph.getAdjacent(n1);
		if (aN1.contains(n1)) pass ++;
		if (aN1.contains(n2)) pass ++;
		if (!aN1.contains(n3)) pass ++;
		total += 3;
		HashSet<Node> aN2 = graph.getAdjacent(n2);
		if (aN2.contains(n2)) pass ++;
		if (aN2.contains(n1)) pass ++;
		if (aN2.contains(n3)) pass ++;
		total += 3;
		HashSet<Node> aN3 = graph.getAdjacent(n3);
		if (aN3.contains(n2)) pass ++;
		if (!aN3.contains(n3)) pass ++;
		if (!aN3.contains(n1)) pass ++;
		total += 3;

		System.out.println("Passed " + pass + "/" + total + " tests.");
	}
}
