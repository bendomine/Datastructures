import java.util.Set;
import java.util.HashSet;

public class Graph {
	private HashSet<Node> nodes;
	private HashSet<Edge> edges;
	
	/**
	 * Constructor, initializes this graph with the specified set of nodes and edges
	 * @param nodes the set of nodes this graph should contain
	 * @param edges the set of edges this graph should contain
	 */
	public Graph (Set<Node> nodes, Set<Edge> edges){
		this.nodes = new HashSet<Node>();
		this.edges = new HashSet<Edge>();

		for (Node node:nodes){
			this.nodes.add(node);
		}
		for (Edge edge:edges){
			this.edges.add(edge);
		}
	}

	/**
	 * toString method
	 * @return a string displaying each edge and node in the graph
	 */
	public String toString(){
		String out = "Nodes: ";
		for (Node node:this.nodes){
			out += node + ", ";
		}
		out = out.substring(0, out.length() - 2) + "\nEdges: ";
		for (Edge edge:this.edges){
			out += edge + ", ";
		}
		return out.substring(0, out.length() - 2);
	}
	
	/**
	 * Gets the nodes in this graph
	 * @return a HashSet containing the nodes in this graph
	 */
	public HashSet<Node> getNodes() {return this.nodes;}

	/**
	 * Gets the edges in this graph
	 * @return a HashSet containing the edges in this graph
	 */
	public HashSet<Edge> getEdges() {return this.edges;}
}
