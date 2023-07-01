package herencia;

public class Subclase  extends Superclase{
    private int otroAtributo;
    public Subclase(int valor1, int valor2) {
        super(valor1);
        this.otroAtributo=valor2;
    }

    @Override
    public void metodo() {
        super.metodo();
        System.out.println("metodo de la subclase");
    }
    //public void otroMetodo(){
      //  atributo = 10;
        //metodo();
    //}
}
