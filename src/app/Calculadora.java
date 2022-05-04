package app;

import javax.swing.*;

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
        double soma = this.x + this.y;
        JOptionPane.showMessageDialog(null,"A soma vale: " + soma);
    }
    public void subtrai() {
        this.x = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o primeiro valor: "));
        this.y = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o segundo valor: "));
        double soma = this.x - this.y;
        JOptionPane.showMessageDialog(null,"A subtração vale: " + soma);
    }
    public void multiplica() {
        this.x = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o primeiro valor: "));
        this.y = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o segundo valor: "));
        double soma = this.x * this.y;
        JOptionPane.showMessageDialog(null,"A multiplicação vale: " + soma);
    }
    public void divide() {
        this.x = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o primeiro valor: "));
        this.y = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o segundo valor: "));
        double soma = this.x / this.y;
        JOptionPane.showMessageDialog(null,"A divisão vale: " + soma);
    }
}

