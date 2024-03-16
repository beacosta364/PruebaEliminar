public class Prueba2 {
    public static void main(String[] args) {
        Profesor profesor1 = new ProfesorTitular();
        Profesor profesor2 =  (ProfesorTitular) profesor1;  //este es el casteo.
        profesor1.imprimir();
    }
}