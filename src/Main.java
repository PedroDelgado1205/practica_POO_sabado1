import entidades.*;
public class Main {
    public static void main(String[] args) {
        // clase abstracta
        Desarrollador des = new Desarrollador();
        des.nombre = "Pedro";
        des.miNombre();
        des.miNombre(20);
        System.out.println("----------------------");
        // interfaz
        Gato gat = new Gato();
        gat.miNombre();
        System.out.println("Mi edad es "+gat.miEdad()+" "+Gato.nombre+" "+Animal.nombre);
    }
}