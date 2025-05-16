/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ed_uc4_229324_abba;

/**
 *
 * @author naely
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        System.out.println("== Insercion de nodos ==");
        int[] valores = {50, 30, 70, 20, 40, 60, 80, 30, 70};
        for (int valor : valores) {
            System.out.println("Insertando: " + valor);
            arbol.insertarNodo(valor);
        }

        System.out.println("\n== Recorrido en orden (debe estar ordenado) ==");
        arbol.imprimirEnOrden();  

        System.out.println("\n\n== Recorrido preorden ==");
        arbol.imprimirPreOrden(); 

        System.out.println("\n\n== Recorrido postorden ==");
        arbol.imprimirPostOrden(); 

        System.out.println("\n\n== Busqueda de valores ==");
        int[] busquedas = {40, 90};
        for (int valor : busquedas) {
            boolean encontrado = arbol.buscar(valor);
            System.out.println("Existe " + valor + "? " + (encontrado ? "Si" : "No"));
        }
    
    }
}
