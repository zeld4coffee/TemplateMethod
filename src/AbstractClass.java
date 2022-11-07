public abstract class AbstractClass {

    // método template
    public void necessidadesBasicas() {
        comer();
        escovarDentes();
        tomarBanho();
        dormir();
    }

    // o método template usa os métodos abstratos
    public abstract void comer();
    public abstract void escovarDentes();
    public abstract void tomarBanho();
    public abstract void dormir();

}
