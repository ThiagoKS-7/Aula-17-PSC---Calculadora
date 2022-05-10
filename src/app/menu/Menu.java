package app.menu;

import app.calculadora.Calculadora;

import javax.swing.*;

public class Menu {
    private int opcao;
    Calculadora calculadora;

    public Menu(int opcao, Calculadora calculadora) {
        this.opcao = opcao;
        this.calculadora = calculadora;
    }
    public void mostraMenu() {
        while (this.opcao != 0) {
            // precisa converter o valor recebido antes de mostrar a mensagem
            this.opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha a sua operação:\n" +
                            "1- Adição (+)\n" +
                            "2- Subtração (-)\n" +
                            "3- Divisão (/)\n" +
                            "4- Multiplicação (*)\n" +
                            "5- Potenciação (x^ª)\n" +
                            "6- Raíz quadrada (√)\n" +
                            "0- Sair\n"));
            this.calculadora.escolheOperacao(this.opcao);
        }
    }
}
