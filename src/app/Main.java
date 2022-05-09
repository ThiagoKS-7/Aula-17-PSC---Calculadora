package app;

import app.calculadora.Calculadora;

import javax.swing.*;

public class Main {

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
                            "5- Potenciação\n" +
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
                case 5:
                    int expoente = Integer.parseInt(JOptionPane.showInputDialog(
                            "Digite o valor do expoente: "));
                    calculadora.elevaNa(expoente);
                    break;
                    default: JOptionPane.showMessageDialog(null, "Opção Inválida! \n");

            }
        }

    }
}
