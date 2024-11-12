package graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private final String label;
    private final List<Vertex> neighbors;

    public Vertex(String label) {
        this.label = label;
        this.neighbors = new ArrayList<>();
    }

    public void addNeighbour(Vertex other) {
        this.neighbors.add(other);
    }

    public List<Vertex> getNeighbours() {
        return neighbors;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return label + " (" + neighbors.size() + ")";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Vertex && ((Vertex) obj).label.equals(this.label);
    }

    @Override
    public int hashCode() {
        return label.hashCode();
    }

}