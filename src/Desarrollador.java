import entidades.Persona;

public class Desarrollador extends Persona {
    public Desarrollador() {

    }

    @Override
    public void miNombre(int edad) {
        System.out.println("Mi nombre es "+this.nombre+" mi edad es "+edad);
    }
}
