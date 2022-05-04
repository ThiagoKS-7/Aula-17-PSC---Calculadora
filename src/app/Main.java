package app;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void soma () {
        double x, y;
        x = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o primeiro valor: "));
        y = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o segundo valor: "));
        double soma = x + y;
        JOptionPane.showMessageDialog(null,"A soma vale: " + soma);
    }
    public static void subtrai () {
        double x, y;
        x = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o primeiro valor: "));
        y = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o segundo valor: "));
        double subtracao = x - y;
        JOptionPane.showMessageDialog(null,"A subtração vale: " + subtracao);
    }
    public static void multiplica () {
        double x, y;
        x = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o primeiro valor: "));
        y = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o segundo valor: "));
        double multiplicacao = x * y;
        JOptionPane.showMessageDialog(null,"A multiplicação vale: " + multiplicacao);
    }
    public static void divide () {
        double x, y;
        x = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o primeiro valor: "));
        y = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o segundo valor: "));
        double divisao = x / y;
        JOptionPane.showMessageDialog(null,"A divisão vale: " + divisao);
    }
    public static void main(String[] args) {
        int opcao = -1;
        int x = 0, y = 0;
        Calculadora calculadora = new Calculadora(x, y);

        while (opcao != 0) {
            // precisa converter o valor recebido antes de mostrar a mensagem
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha a sua opção:\n" +
                            "1- Adição\n" +
                            "2- Subtração\n" +
                            "3- Divisão\n" +
                            "4- Multiplicação\n" +
                            "0- Sair\n"));
            switch (opcao) {
                case 0:
                    JOptionPane.showMessageDialog(null,"Fim do programa! \n");
                    break;
                case 1:
                    calculadora.soma();
                    break;
                case 2:
                    calculadora.subtrai();
                    break;
                case 3:
                    calculadora.divide();
                    break;
                case 4:
                    calculadora.multiplica();
                    break;
                    default: JOptionPane.showMessageDialog(null, "Opção Inválida! \n");

            }
        }

    }
}
