import java.util.ArrayList;
import java.util.List;
public class Grafo {
    List<Vertice> grafo;

    public Grafo() {
        grafo = new ArrayList<>();
    }
    public void adicionarVertice(Vertice vertice) {
        grafo.add(vertice);
    }
    public void exibirGrafo() {
        for (Vertice ronda : grafo) {
        ronda.imprimirAresta();
        }
    }
}
