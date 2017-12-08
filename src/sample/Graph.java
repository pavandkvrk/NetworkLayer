package sample;

/**
 * Created by Pavand on 11/23/17.
 */

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<Vertex> vertices;
    private List<Edge> edges;

    public List<Vertex> getVertices() {
        return vertices;
    }



    public List<Edge> getEdges() {
        return edges;
    }



    public void setVertices() {
        vertices = new ArrayList<Vertex>();
        for (int i = 1; i < 9; i++) {
            Vertex v = new Vertex("R" + i);
            vertices.add(v);
        }
    }



    public void setEdges(int[] weights) {
        edges = new ArrayList<Edge>();
        Edge e1 = new Edge(vertices.get(0), vertices.get(1), weights[0]);
        edges.add(e1);
        Edge e2 = new Edge(vertices.get(0), vertices.get(6), weights[1]);
        edges.add(e2);
        Edge e3 = new Edge(vertices.get(1), vertices.get(4), weights[2]);
        edges.add(e3);
        Edge e31 = new Edge(vertices.get(4), vertices.get(1), weights[2]);
        edges.add(e31);
        Edge e4 = new Edge(vertices.get(6), vertices.get(4), weights[3]);
        edges.add(e4);
        Edge e41 = new Edge(vertices.get(4), vertices.get(6), weights[3]);
        edges.add(e41);
        Edge e5 = new Edge(vertices.get(1), vertices.get(2), weights[4]);
        edges.add(e5);
        Edge e6 = new Edge(vertices.get(4), vertices.get(5), weights[5]);
        edges.add(e6);
        Edge e7 = new Edge(vertices.get(6), vertices.get(7), weights[6]);
        edges.add(e7);
        Edge e8 = new Edge(vertices.get(5), vertices.get(2), weights[7]);
        edges.add(e8);
        Edge e81 = new Edge(vertices.get(2), vertices.get(5), weights[7]);
        edges.add(e81);
        Edge e9 = new Edge(vertices.get(5), vertices.get(7), weights[8]);
        edges.add(e9);
        Edge e91 = new Edge(vertices.get(7), vertices.get(5), weights[8]);
        edges.add(e91);
        Edge e10 = new Edge(vertices.get(2), vertices.get(3), weights[9]);
        edges.add(e10);
        Edge e11 = new Edge(vertices.get(7), vertices.get(3), weights[10]);
        edges.add(e11);
    }

}