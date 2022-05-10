package app.calculadora.operacoes;

//EXTENDS = HERANÇA
public class Subtrai extends Operacao{
    //CONSTRUTOR USANDO VALORES DA SUPER :0
    public Subtrai(double x, double y) {
        super(x, y, 2);
        this.valores[0] = x;
        this.valores[1] = y;
    }

    // POLIMORFISMO COM CLASSE OPERAÇÃO
    @Override
    public double calcular() {
        return this.valores[0] - this.valores[1];
    }

}