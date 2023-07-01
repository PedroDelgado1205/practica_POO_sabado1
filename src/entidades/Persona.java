package entidades;

public abstract class Persona {
    public String nombre;
    public void miNombre(){
        System.out.println("Mi nombre es "+nombre);
    }
    public abstract void miNombre(int edad);
}
