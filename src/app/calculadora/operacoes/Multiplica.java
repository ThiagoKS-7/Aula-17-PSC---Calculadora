package app.calculadora.operacoes;

//EXTENDS = HERANÇA
public class Multiplica extends Operacao{
    //CONSTRUTOR USANDO VALORES DA SUPER :0
    public Multiplica(double x, double y) {
        super(x, y, 2);
        this.valores[0] = x;
        this.valores[1] = y;
    }

    // POLIMORFISMO DA CLASSE OPERAÇÃO
    @Override
    public double multiplica() {
        return this.valores[0] * this.valores[1];
    }

}