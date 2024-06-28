package exercicios_uniritter;

public class Programa {
    public static void main(String[] args) {
        Contador contador = new Contador();
        
        Thread addThread = new Thread(new Calculadora(10, 5, "add", contador));
        Thread subThread = new Thread(new Calculadora(10, 5, "sub", contador));
        Thread mulThread = new Thread(new Calculadora(10, 5, "mul", contador));
        Thread divThread = new Thread(new Calculadora(10, 5, "div", contador));

        addThread.start();
        subThread.start();
        mulThread.start();
        divThread.start();

        try {
            addThread.join();
            subThread.join();
            mulThread.join();
            divThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Valor final do contador: " + contador.getCount());
    }
}


