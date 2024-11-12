package graph;

import java.util.*;

public class Graph {
    private final List<Vertex> vertices;
    private final String name;

    public Graph(String name) {
        vertices = new LinkedList<>();
        this.name = name;
    }

    public void addVertex(Vertex v) {
        vertices.add(v);
    }

    public List<Vertex> depthFirstSearch() {
        List<Vertex> visited = new ArrayList<>();
        Set<Vertex> visitedSet = new HashSet<>();

        // Projdeme všechny vrcholy v grafu
        for (Vertex vertex : vertices) {
            // Pokud jsme vrchol ještě nenavštívili, spustíme DFS z něj
            if (!visitedSet.contains(vertex)) {
                dfsRecursive(vertex, visited, visitedSet);
            }
        }

        return visited;
    }

    private void dfsRecursive(Vertex vertex, List<Vertex> visited, Set<Vertex> visitedSet) {
        visited.add(vertex);
        visitedSet.add(vertex);

        for (Vertex neighbor : vertex.getNeighbours()) {
            if (!visitedSet.contains(neighbor)) {
                dfsRecursive(neighbor, visited, visitedSet);
            }
        }
    }
}