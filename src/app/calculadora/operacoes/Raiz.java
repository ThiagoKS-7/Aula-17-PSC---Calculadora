package app.calculadora.operacoes;

public class RaizQuadrada extends Operacao{
    public RaizQuadrada(double x) {
        super(x, x, 2);
        this.valores[0] = x;
    }

    // POLIMORFISMO COM CLASSE OPERAÇÃO
    @Override
    public double calcular() {
        return Math.sqrt(this.valores[0]);
    }
}
