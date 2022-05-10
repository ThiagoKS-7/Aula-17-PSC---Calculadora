package app;

import app.calculadora.Calculadora;
import app.menu.Menu;

public class Main {
    public static void main(String[] args) {
        /*   DECLARANDO VARIÁVEIS  */
        int opcao = -1;
        int x = 0, y = 0;
        /*   INSTANCIANDO CLASSES  */
        Calculadora calculadora = new Calculadora(x, y);
        Menu menu = new Menu(opcao,calculadora);
        /*   CHAMANDO MENU  */
        menu.mostraMenu();
    }
}
