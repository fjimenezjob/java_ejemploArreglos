public class EjemploArreglos{
    public static void main(String[] args) {
        //1. Declarar un arreglo de tipo entero
        int edades [];
        //2. Instanciar el arreglo
        edades = new int[3];
        //3. Inicializamos los valores del arreglo de enteros
        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 20;
        // Imprimimos los valores del arreglo a la salida standard
        //4. leemos cada valor del arreglo
        System.out.println("Arreglo entteros indice 0: " + edades[0]);
        System.out.println("Arreglo entteros indice 1: " + edades[1]);
        System.out.println("Arreglo entteros indice 2: " + edades[2]);

        Persona personas[];
        personas = new Persona[3];
        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Pedro");
        personas[2] = new Persona("Roberto");

        System.out.println("Arreglo personas indice 0: " + personas[0]);
        System.out.println("Arreglo personas indice 1: " + personas[1]);
        System.out.println("Arreglo personas indice 2: " + personas[2]);

        String nombres[] = {"sara", "pepito", "roberto"};
        for(int i=0; i< nombres.length; i++){

            System.out.println("Arreglo personas indice "+ i +" : " + nombres[i]);

        }
    }
}
