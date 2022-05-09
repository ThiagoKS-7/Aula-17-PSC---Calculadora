package app.calculadora.operacoes;

// CLASSE PAI DAS OPERAÇÕES
// PODE RECEBER QUANTOS VALORES FOR CONFIGURADO
// DEVE CONTER TODAS AS OPERAÇÕES QUE UMA CALCULADORA FAZ


public abstract class Operacao {
    int quantidadeDeValores = 2; // valor default
    double[] valores = new double[quantidadeDeValores];

    public Operacao(double x, double y, int quantidadeDeValores) {

        this.quantidadeDeValores = quantidadeDeValores;
        this.valores[0] = x;
        this.valores[1] = y;
    }

    public double soma() {
        return 0f;
    };

    public double subtrai() {
        return 0f;
    };

    public double divide() {
        return 0f;
    };

    public double multiplica() {
        return 0f;
    };

    public double potencia() {
        return 0f;
    };

    public double raiz() {
        return 0f;
    };
}
