package exercicios_uniritter;

public class Calculadora implements Runnable {
    private double num1;
    private double num2;
    private String operacao;
    private Contador contador;

    public Calculadora(double num1, double num2, String operacao, Contador contador) {
        this.num1 = num1;
        this.num2 = num2;
        this.operacao = operacao;
        this.contador = contador;
    }

    @Override
    public void run() {
        switch (operacao) {
            case "add":
                System.out.println("Resultado da adição: " + (num1 + num2));
                break;
            case "sub":
                System.out.println("Resultado da subtração: " + (num1 - num2));
                break;
            case "mul":
                System.out.println("Resultado da multiplicação: " + (num1 * num2));
                break;
            case "div":
                if (num2 != 0) {
                    System.out.println("Resultado da divisão: " + (num1 / num2));
                } else {
                    System.out.println("Erro: Divisão por zero");
                }
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
        contador.incrementar();
    }
}


