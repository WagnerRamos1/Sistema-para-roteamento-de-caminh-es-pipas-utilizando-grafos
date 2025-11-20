public class Aresta {
    private Vertice destino;
    private Vertice origem;
    private double custo;

    public Aresta (Vertice destino, Vertice origem,  double custo) {
        this.destino = destino;
        this.origem = origem;
        this.custo = custo;
    }
    public Vertice getDestino() {
        return destino;
    }
    public Vertice getOrigem() {
        return origem;
    }
    public double getCusto() {
        return custo;
    }
}
