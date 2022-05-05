package app.calculadora.operacoes;

//EXTENDS = HERANÇA
public class Potencia extends Operacao{
    int expoente;
    //CONSTRUTOR USANDO VALORES DA SUPER :0
    public Potencia(double x,int expoente ) {
        super(x, x, 2);
        this.valores[0] = x;
        this.valores[1] = x;
        this.expoente = expoente;
    }

    // POLIMORFISMO DA CLASSE OPERAÇÃO
    @Override
    public double potencia() {
        double potencia = 1;
        for (int i = 1; i <= expoente; i ++) potencia = potencia * this.expoente;
        return potencia;
    }

}