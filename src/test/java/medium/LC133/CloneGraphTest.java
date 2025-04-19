package medium.LC133;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.*;

class CloneGraphTest {

    private final CloneGraph obj = new CloneGraph();

    private List<List<Integer>> toAdjList(Node node) {
        if (node == null) return new ArrayList<>();
        Map<Integer, List<Integer>> adjMap = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            if (visited.contains(curr.val)) continue;
            visited.add(curr.val);
            adjMap.putIfAbsent(curr.val, new ArrayList<>());
            for (Node neighbor : curr.neighbors) {
                adjMap.get(curr.val).add(neighbor.val);
                if (!visited.contains(neighbor.val)) {
                    queue.offer(neighbor);
                }
            }
        }

        int n = adjMap.size();
        List<List<Integer>> adjList = new ArrayList<>(Collections.nCopies(n, null));
        for (int i = 0; i < n; i++) {
            adjList.set(i, adjMap.getOrDefault(i + 1, new ArrayList<>()));
        }
        return adjList;
    }

    private Node createGraph(List<List<Integer>> adjList) {
        if (adjList.isEmpty()) return null;

        Map<Integer, Node> map = new HashMap<>();
        for (int i = 1; i <= adjList.size(); i++) {
            map.put(i, new Node(i));
        }
        for (int i = 1; i <= adjList.size(); i++) {
            for (int neighbor : adjList.get(i - 1)) {
                map.get(i).neighbors.add(map.get(neighbor));
            }
        }
        return map.get(1);
    }

    @Test
    @DisplayName("Test Case 1: Input: adjList = [[2,4],[1,3],[2,4],[1,3]]")
    void example1() {
        List<List<Integer>> adjList = Arrays.asList(
                Arrays.asList(2, 4),
                Arrays.asList(1, 3),
                Arrays.asList(2, 4),
                Arrays.asList(1, 3)
        );
        Node inputGraph = createGraph(adjList);
        Node clonedGraph = obj.cloneGraph(inputGraph);
        Assertions.assertEquals(adjList, toAdjList(clonedGraph));
    }

    @Test
    @DisplayName("Test Case 2: Input: adjList = [[]]")
    void example2() {
        List<List<Integer>> adjList = Arrays.asList(
                new ArrayList<>()
        );
        Node inputGraph = createGraph(adjList);
        Node clonedGraph = obj.cloneGraph(inputGraph);
        Assertions.assertEquals(adjList, toAdjList(clonedGraph));
    }

    @Test
    @DisplayName("Test Case 3: Input: adjList = []")
    void example3() {
        List<List<Integer>> adjList = new ArrayList<>();
        Node inputGraph = createGraph(adjList);
        Node clonedGraph = obj.cloneGraph(inputGraph);
        Assertions.assertEquals(adjList, toAdjList(clonedGraph));
    }
}
