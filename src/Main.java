public class Main {
    public static void main(String[] args) {

        /* Mesmo que o método template seja da AbstractClass,
           Precisamos de um objeto Concreto para estância-lo */

        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.necessidadesBasicas();
    }
}