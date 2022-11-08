import java.util.Set;
import java.util.HashSet;

public class AdjGraph {
	private Edge[][] graph;
	private Node[] order;

	/**
	 * Constructor: given the set of nodes and edges, creates the adjacency graph.
	 * Note that the graph is directional.
	 * @param nodes the set of nodes the set should assume
	 * @param edges the set of edges the set should assume
	 */
	public AdjGraph(Set<Node> nodes, Set<Edge> edges){
		graph = new Edge[nodes.size()][nodes.size()];
		order = new Node[nodes.size()];
		int i = 0;
		for (Node node:nodes){
			order[i++] = node;
		}
		for (Edge e:edges){
			int from = -1;
			int to = -1;
			for (int n = 0; n < order.length; ++n){
				if (order[n].equals(e.getFrom())) from = n;
				if (order[n].equals(e.getTo())) to = n;
			}
			graph[to][from] = e;
		}
	}

	/**
	 * Returns a set of all nodes adjacent to the one provided.
	 * Note that this does not distinguish with the direction of the edge connected to the node.
	 * All nodes connected in any way are returned.
	 * @param node the node to use
	 * @return a HashSet of the adjacent nodes
	 */
	public HashSet<Node> getAdjacent(Node node){
		HashSet<Node> nodes = new HashSet<Node>();
		int idx = -1;
		for (int n = 0; n < order.length; ++n){
			if (order[n].equals(node)){
				idx = n;
				break;
			}
		}
		for (int i = 0; i < graph.length; ++i){
			if (graph[i][idx] != null) nodes.add(graph[i][idx].getTo());
			if (graph[idx][i] != null) nodes.add(graph[idx][i].getFrom());
		}

		return nodes;
	}

	public String toString(){
		String out = "Nodes: ";
		for (Node node:order){
			out += node + ", ";
		}
		out = out.substring(0, out.length() - 2) + "\nGraph: \n";
		for (Edge[] et:graph){
			out += "  ";
			for (Edge ef:et){
				out += ef + ", ";
			}
			out += "\n";
		}
		return out.substring(0, out.length() - 3);
	}

	/**
	 * Gets the adjacency matrix of this graph
	 * @return the adjacency matrix of this graph
	 */
	public Edge[][] getAdjMatrix() {return graph;}
	/**
	 * Gets the 'key' or order of nodes for use with the adjacency matrix
	 * @return the order of nodes in the adjacency matrix
	 */
	public Node[] getOrder() {return order;}
}