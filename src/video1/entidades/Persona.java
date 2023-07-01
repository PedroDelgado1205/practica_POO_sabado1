package video1.entidades;

public abstract class Persona {
    public String nombre;
    private String apelldio;

    public String getApelldio() {
        return apelldio;
    }

    public void setApelldio(String apelldio) {
        this.apelldio = apelldio;
    }

    public void miNombre(){
        System.out.println("Mi nombre es "+nombre);
    }
    public abstract void miNombre(int edad);
}
