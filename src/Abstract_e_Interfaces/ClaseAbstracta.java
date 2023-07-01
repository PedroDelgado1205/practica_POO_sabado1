package Abstract_e_Interfaces;

public abstract class ClaseAbstracta {
    private int atributo;
    public ClaseAbstracta(int valor){
        this.atributo=valor;
    }
    public void  metodoConcreto(){
        System.out.println("metodo concreto");
    }
    public abstract void metodoAbstracto();
}
