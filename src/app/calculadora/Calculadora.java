package app.calculadora;

import app.calculadora.operacoes.Potencia;
import app.calculadora.operacoes.Soma;
import app.calculadora.operacoes.Multiplica;
import app.calculadora.operacoes.Subtrai;

import javax.swing.*;

// RECEBE TODAS AS OPERAÇÕES
public class Calculadora {
    double x;
    double y;
    public Calculadora (double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void soma() {
        this.x = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o primeiro valor: "));
        this.y = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o segundo valor: "));
        Soma calcular = new Soma(this.x, this.y);
        JOptionPane.showMessageDialog(null,String.format("A soma vale: %.2f",calcular.soma()));
    }
    public void subtrai() {
        this.x = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o primeiro valor: "));
        this.y = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o segundo valor: "));
        Subtrai calcular = new Subtrai(this.x,this.y);
        JOptionPane.showMessageDialog(null,String.format("A subtração vale: %.2f",calcular.subtrai()));
    }
    public void multiplica() {
        this.x = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o primeiro valor: "));
        this.y = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o segundo valor: "));
        Multiplica calcular = new Multiplica(this.x,this.y);
        JOptionPane.showMessageDialog(null,String.format("A multiplicação vale: %.2f",calcular.multiplica()));
    }
    public void divide() {
        this.x = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o primeiro valor: "));
        this.y = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o segundo valor: "));
        double soma = this.x / this.y;
        JOptionPane.showMessageDialog(null,String.format("A divisão vale: %.2f",soma));
    }
    public void elevaNa(int expoente) {
        this.x = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o valor da base: "));
        Potencia calcular = new Potencia(this.x,expoente);
        JOptionPane.showMessageDialog(null,String.format("A potência vale: %.2f",calcular.potencia()));
    }
}
