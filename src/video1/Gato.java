package video1;

import video1.entidades.Animal;

public class Gato implements Animal {

    @Override
    public void miNombre() {
        System.out.println("mi nombre es "+ nombre);

    }

    @Override
    public int miEdad() {
        return 3;
    }
}
