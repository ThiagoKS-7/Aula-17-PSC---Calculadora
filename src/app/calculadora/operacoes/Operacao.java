package app.calculadora.operacoes;

// CLASSE PAI DAS OPERAÇÕES
// PODE RECEBER QUANTOS VALORES FOR CONFIGURADO
// DEVE CONTER TODAS AS OPERAÇÕES QUE UMA CALCULADORA FAZ

//ABSTRACT - INDICA Q ELA NÃO GERA OBJETO POR CONTA PRÓPRIA (NÃO PODE SER INSTANCIADA), SÓ SERVE PROS HERDEIROS
public abstract class Operacao {
    protected int quantidadeDeValores = 2; // valor default
    protected double[] valores = new double[quantidadeDeValores];

    public Operacao(double x, double y, int quantidadeDeValores) {

        this.quantidadeDeValores = quantidadeDeValores;
        this.valores[0] = x;
        this.valores[1] = y;

    }

    public double calcular() {
        return 0f;
    };
}