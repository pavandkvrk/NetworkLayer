package sample;

/**
 * Created by Pavand on 11/23/17.
 */
        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;
        import java.util.Random;

/**
 *
 *
 */
public class DijkstraAlgorithm {

    @SuppressWarnings("unused")
    private List<Vertex> routers;
    private List<Edge> edges;
    private List<Vertex> visited;
    private List<Vertex> unvisited;
    private HashMap<Vertex, Vertex> predecesor;
    private HashMap<Vertex, Integer> distance;

    public DijkstraAlgorithm(Graph g) {
        routers = new ArrayList<Vertex>(g.getVertices());
        edges = new ArrayList<Edge>(g.getEdges());
    }

    public void Dijkstras(Vertex source) {
        visited = new ArrayList<Vertex>();
        unvisited = new ArrayList<Vertex>();
        predecesor = new HashMap<Vertex, Vertex>();
        distance = new HashMap<Vertex, Integer>();

        // consisdering the source as zero
        distance.put(source, 0);
        unvisited.add(source);
        while (unvisited.size() > 0) {
            Vertex visitedRouter = getMinimum(unvisited);
            visited.add(visitedRouter);
            unvisited.remove(visitedRouter);
            findMinimalDistance(visitedRouter);
        }
        for (Map.Entry<Vertex, Integer> e : distance.entrySet()) {
            System.out.println(e.getKey().getName() + " " + e.getValue());
        }
    }

    private void findMinimalDistance(Vertex visitedRouter) {
        List<Vertex> adjecentRouters = getConnetedNodes(visitedRouter);
        for (Vertex v : adjecentRouters) {
            if (getShortestDistance(v) > getShortestDistance(visitedRouter) + getDistance(visitedRouter, v)) {
                distance.put(v, getShortestDistance(visitedRouter) + getDistance(visitedRouter, v));
                predecesor.put(v, visitedRouter);
                unvisited.add(v);
            }
        }

    }

    private int getDistance(Vertex visitedRouter, Vertex v) {
        for (Edge e : edges) {
            if (e.getSource().equals(visitedRouter) && e.getDestination().equals(v)) {
                return e.getWeight();
            }
        }
        throw new RuntimeException("This should not happen");

    }

    private List<Vertex> getConnetedNodes(Vertex visitedRouter) {
        List<Vertex> conneceted = new ArrayList<Vertex>();
        for (Edge e : edges) {
            if (e.getSource().equals(visitedRouter) && !visited.contains(e.getDestination())) {
                conneceted.add(e.getDestination());
            }
        }
        return conneceted;
    }

    private Vertex getMinimum(List<Vertex> vertices) {
        Vertex minimum = null;
        for (Vertex v : vertices) {
            if (minimum == null) {
                minimum = v;
            } else {
                if (getShortestDistance(v) < getShortestDistance(minimum)) {
                    minimum = v;
                }
            }
        }
        return minimum;
    }

    private int getShortestDistance(Vertex v) {
        Integer d = distance.get(v);
        if (d == null) {
            return Integer.MAX_VALUE;
        } else {
            return d;
        }
    }

    public ArrayList<Vertex> getPath(Vertex destination) {
        ArrayList<Vertex> path = new ArrayList<Vertex>();
        Vertex step = destination;
        if (predecesor.get(step) == null) {
            return null;

        }
        while (predecesor.get(step) != null) {
            step = predecesor.get(step);
            path.add(step);
        }

        return path;
    }

    public static int[] generateRandomEdges() {
        int[] weights = new int[11];
        Random rm = new Random();
        for (int i = 0; i < 11; i++) {
            int roll = rm.nextInt(7) + 1;
            weights[i] = roll;
        }
        return weights;
    }
}