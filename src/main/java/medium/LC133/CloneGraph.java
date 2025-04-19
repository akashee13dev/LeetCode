package medium.LC133;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class CloneGraph {

    public Node cloneGraph(Node node) {
        if(Objects.isNull(node)){
            return null;
        }
        HashMap<Node,Node> mapping = new HashMap<>();
        return cloneNode(node , mapping);

    }

    private Node cloneNode(Node oldNode, HashMap<Node , Node> mapping){
        Node newNode = new Node(oldNode.val);
        mapping.put(oldNode , newNode);
        for (Node neighborNode : oldNode.neighbors){
            if(mapping.containsKey(neighborNode)){
                newNode.neighbors.add(mapping.get(neighborNode));
            }
            else {
                newNode.neighbors.add(cloneNode(neighborNode , mapping));
            }
        }
        return newNode;
    }


}

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}