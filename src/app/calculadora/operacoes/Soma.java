package app.calculadora.operacoes;

//EXTENDS = HERANÇA
public class Soma extends Operacao{
    //CONSTRUTOR USANDO VALORES DA SUPER :0
    public Soma(double x, double y) {
        super(x, y, 2);
        this.valores[0] = x;
        this.valores[1] = y;
    }
    // POLIMORFISMO DA CLASSE OPERAÇÃO
    @Override
    public double soma() {
        return this.valores[0] + this.valores[1];
    }

}
