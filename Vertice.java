import java.util.ArrayList;
import java.util.List;
public class Vertice {
    private String nome;
    List<Aresta> arestaVizinhos;

    public Vertice (String nome) {
        this.nome = nome;
        arestaVizinhos = new ArrayList<>();
    }
    public String getNome() {
        return nome;
    }
    public void adicionarAresta(Vertice destino, Vertice origem, double custo) {
        Aresta aresta = new Aresta(destino, origem, custo);
        this.arestaVizinhos.add(aresta);
    }
    public void imprimirAresta() {
        for(Aresta aresta : arestaVizinhos) {
            System.out.println(getNome() + " --> " + aresta.getDestino().getNome() + " - Custo para viagem: " + aresta.getCusto() + "\n"); 
        }
    }
}
