package app.calculadora.operacoes;

/*
* NOME DOS OPERADORES DE UMA POTÊNCIA
*   a = expoente
* X  = base         =>   Y = potência
*
* Ex:
* a = 2
* 9ª  = 81;
* */

//EXTENDS = HERANÇA
public class Potencia extends Operacao{
    private final int expoente;
    //CONSTRUTOR USANDO VALORES DA SUPER :0
    public Potencia(double x,int expoente ) {
        super(x, x, 2);
        this.valores[0] = x;
        this.expoente = expoente;
    }

    // POLIMORFISMO COM CLASSE OPERAÇÃO
    @Override
    public double calcular() {
        double base = this.valores[0];
        double resultado = 0;
        for (int i = 1; i < expoente; i ++)  {
            resultado = base * base;
        }
        return resultado;
    }

}