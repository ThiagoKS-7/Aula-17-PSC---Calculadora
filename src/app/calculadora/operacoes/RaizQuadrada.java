package app.calculadora.operacoes;

public class RaizQuadrada extends Operacao{
    public RaizQuadrada(double x) {
        super(x, x, 2);
        this.valores[0] = x;
    }

    // POLIMORFISMO COM CLASSE OPERAÇÃO
    @Override
    public double calcular() {
        System.out.println(String.format("Calcular da raiz: %.2f", Math.sqrt(this.valores[0])));
        return Math.sqrt(this.valores[0]);
    }
}
