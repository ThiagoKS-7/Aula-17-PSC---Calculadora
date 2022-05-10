package app.calculadora;

import app.calculadora.operacoes.*;

import javax.swing.*;
// RECEBE TODAS AS OPERAÇÕES
// POLIMORFISMO - quando um atributo pode ser visto de varias formas

public class Calculadora {
    private double x;
    private double y;
    public Calculadora (double x, double y) {
        this.x = x;
        this.y = y;
    }
    private void soma() {
        this.x = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o primeiro valor: "));
        this.y = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o segundo valor: "));
        Soma calcular = new Soma(this.x, this.y);
        JOptionPane.showMessageDialog(null,String.format("A soma vale: %.2f",calcular.calcular()));
    }
    private void subtrai() {
        this.x = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o primeiro valor: "));
        this.y = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o segundo valor: "));
        Subtrai calcular = new Subtrai(this.x,this.y);
        JOptionPane.showMessageDialog(null,String.format("A subtração vale: %.2f",calcular.calcular()));
    }
    private void multiplica() {
        this.x = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o primeiro valor: "));
        this.y = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o segundo valor: "));
        Multiplica calcular = new Multiplica(this.x,this.y);
        JOptionPane.showMessageDialog(null,String.format("A multiplicação vale: %.2f",calcular.calcular()));
    }
    private void divide() {
        this.x = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o primeiro valor: "));
        this.y = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o segundo valor: "));
        Divide calcular = new Divide(this.x,this.y);
        JOptionPane.showMessageDialog(null,String.format("A divisão vale: %.2f",calcular.calcular()));
    }
    private void elevaNa(int expoente) {
        this.x = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o valor da base: "));
        Potencia calcular = new Potencia(this.x,expoente);
        JOptionPane.showMessageDialog(null,String.format("A potência vale: %.2f",calcular.calcular()));
    }
    private void raiz() {
        this.x = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o valor do radicando: "));
        RaizQuadrada calcular = new RaizQuadrada(this.x);
        JOptionPane.showMessageDialog(null,String.format("A raiz quadrada de %.2f vale: %.2f",this.x,calcular.calcular()));
    }
    private void bhaskara() {
        double a = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o valor de A: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o valor de B: "));
        double c = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o valor de C: "));
        Bhaskara calculo = new Bhaskara(a,b,c);
        calculo.calculaRaizes();
    }
    public void escolheOperacao(int opcao) {
        switch (opcao) {
            case 0:
                JOptionPane.showMessageDialog(null,"Fim do programa! \n");
                break;
            case 1:
                this.soma();
                break;
            case 2:
                this.subtrai();
                break;
            case 3:
                this.divide();
                break;
            case 4:
                this.multiplica();
                break;
            case 5:
                int expoente = Integer.parseInt(JOptionPane.showInputDialog(
                        "Digite o valor do expoente: "));
                this.elevaNa(expoente);
                break;
            case 6:
                this.raiz();
                break;
            case 7:
                this.bhaskara();
                break;
            default: JOptionPane.showMessageDialog(null, "Opção Inválida! \n");

        }
    }
}
