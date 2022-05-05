package app.calculadora.operacoes;

//EXTENDS = HERANÇA
public class Divide extends Operacao{
    //CONSTRUTOR USANDO VALORES DA SUPER :0
    public Divide(double x, double y) {
        super(x, y, 2);
        this.valores[0] = x;
        this.valores[1] = y;
    }

    // POLIMORFISMO DA CLASSE OPERAÇÃO
    @Override
    public double divide() {
        if (this.valores[1] > 0 ) return this.valores[0] / this.valores[1];
        return 0;
    }

}