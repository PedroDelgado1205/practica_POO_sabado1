import entidades.Animal;

public class Gato implements Animal {

    @Override
    public void miNombre() {
        System.out.println("mi nombre es "+Animal.nombre);

    }

    @Override
    public int miEdad() {
        return 3;
    }
}
