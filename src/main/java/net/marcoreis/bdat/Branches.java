package net.marcoreis.bdat;

import java.util.ArrayList;
import java.util.List;

public class Branches {

	public static int count(int[] tree) {
		List<Node> nodes = new ArrayList<Node>();
		for (int i = 0; i < tree.length; i++) {
			for (int j = 0; j < 2; j++) {
				Node e = new Node(tree[i]);
				i++;
				Node el = e.addChild(new Node(tree[i]));
				i++;
				Node er = e.addChild(new Node(tree[i]));
				nodes.add(e);
				nodes.add(el);
				nodes.add(er);

			}
		}
		int total = 0;
		for (Node node : nodes) {
			if (node.getChildren().size() > 0) {
				total++;
			}
		}
		return total;
	}

	public static void main(String[] args) {
		System.out.println(
				Branches.count(new int[] { 1, 3, 1, -1, 3 }));
	}
}

class Node {

	private int data = 0;

	private List<Node> children = new ArrayList<>();

	private Node parent = null;

	public Node(int data) {
		this.data = data;
	}

	public Node addChild(Node child) {
		child.setParent(this);
		this.children.add(child);
		return child;
	}

	public List<Node> getChildren() {
		return children;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	private void setParent(Node parent) {
		this.parent = parent;
	}

	public Node getParent() {
		return parent;
	}

}
