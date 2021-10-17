package genericos;

/*
    Nombre Significado
    E Element
    K Key
    N Number
    T Type
    V Value
 */

public class ClaseGenerica<T> {

    private T objeto;

    public ClaseGenerica(T objeto) {
        this.objeto = objeto;
    }
    
    //MÉTODO PARA COMPROBAR EL TIPO
    
    public void obtenerTipo(){
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
    }
}
