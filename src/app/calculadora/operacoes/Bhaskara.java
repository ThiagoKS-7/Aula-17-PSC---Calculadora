package app.calculadora.operacoes;

import javax.swing.*;

public class Bhaskara {
    private  double a;
    private  double b;
    private  double c;

    public Bhaskara(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    private double calculaDelta() {
        Potencia bQdrd = new Potencia(this.b,2);
        double delta = (bQdrd.calcular()) - (4 * this.a * this.c);
        System.out.println(String.format("Delta %.2f", delta));
        return delta;
    }

    private void checaRaizes(double x1, double x2) {
        if (this.calculaDelta() < 0) {
            JOptionPane.showMessageDialog(null,"Não existem raízes reais.\n");
        }
        else if (this.calculaDelta() == 0) {
            JOptionPane.showMessageDialog(null,String.format("X vale: %.2f",x1));
        }
        else {
            JOptionPane.showMessageDialog(null,String.format("X vale: %.2f\nX' vale %.2f\n",x1,x2));
        }
    }

    public void calculaRaizes() {
        RaizQuadrada raizDeDelta = new RaizQuadrada(calculaDelta());
        System.out.println(String.format("Calcula raízes %.2f",raizDeDelta.calcular()));
        double x1 = (-this.b +  raizDeDelta.calcular())/ (2 * this.a);
        System.out.println(String.format("X %.2f",x1));
        double x2 = (-this.b -  raizDeDelta.calcular())/ (2 * this.a);
        System.out.println(String.format("X' %.2f",x2));
        checaRaizes(x1, x2);
    }

}
