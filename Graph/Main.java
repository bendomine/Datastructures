import java.util.HashSet;

public class Main {
	public static void main(String[] args){
		int pass = 0;
		int total = 0;

		Node n1 = new Node(5);
		if (n1.getId() == 5) pass ++;
		total ++;

		vNode v1 = new vNode("Look, I made a vNode");
		if (v1.getVal().equals("Look, I made a vNode")) pass ++;
		total ++;

		Node n2 = new Node(2);
		Edge e1 = new Edge(n1, n2);
		if (e1.getFrom().equals(n1)) pass ++;
		if (e1.getTo().equals(n2)) pass ++;
		total += 2;

		n1 = new Node(1);
		n2 = new Node(2);
		v1 = new vNode("v1");
		vNode v2 = new vNode("v2");
		e1 = new Edge(n1, n2);
		Edge e2 = new Edge(n1, v1);
		Edge e3 = new Edge(n2, v2);
		HashSet<Node> nodes = new HashSet<Node>();
		nodes.add(n1);
		nodes.add(n2);
		nodes.add(v1);
		nodes.add(v2);
		HashSet<Edge> edges = new HashSet<Edge>();
		edges.add(e1);
		edges.add(e2);
		edges.add(e3);
		Graph g1 = new Graph(nodes, edges);
		if (g1.getNodes().equals(nodes)) pass ++;
		if (g1.getEdges().equals(edges)) pass ++;
		total += 2;

		System.out.println("Passed " + pass + "/" + total + " tests.");
		
	}
}
