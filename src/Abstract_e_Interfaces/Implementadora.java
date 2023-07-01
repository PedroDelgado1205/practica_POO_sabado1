package Abstract_e_Interfaces;

public class Implementadora extends ClaseAbstracta implements Interfaz{
    public Implementadora(int valor) {
        super(valor);
    }

    @Override
    public void metodoAbstracto() {
        System.out.println("implementacion del metodo abstracto");
    }

    @Override
    public void metodo() {
        System.out.println("implementacion de la interfaz");
    }
}
