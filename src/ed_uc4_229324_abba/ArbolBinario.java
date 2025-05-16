/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed_uc4_229324_abba;

/**
 *
 * @author naely
 */
public class ArbolBinario {

    private Nodo raiz;

     /**
     * Constructor del árbol. Inicializa la raíz como null.
     */
    public ArbolBinario() {
        this.raiz = null;
    }

    /**
     * Inserta un nuevo nodo en el árbol siguiendo las reglas del ABB.
     * Si el valor ya existe, no se inserta y se muestra un mensaje.
     * 
     * @param valor El valor entero a insertar en el árbol
     */
    public void insertarNodo(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    
    /**
     * Método recursivo para insertar un nodo en la posición correcta
     * 
     * @param actual Nodo actual del recorrido
     * @param valor Valor a insertar
     * @return Nodo actualizado con el nuevo valor insertado si corresponde
     */
    private Nodo insertarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor);
        }

        if (valor < actual.valor) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, valor);
        } else if (valor > actual.valor) {
            actual.derecho = insertarRecursivo(actual.derecho, valor);
        } else {
            System.out.println("Duplicado no permitido: " + valor);
        }

        return actual;
    }

     /**
     * Imprime en consola los valores del árbol en orden (inorden):
     * Izquierda -> Raíz -> Derecha.
     */
    public void imprimirEnOrden() {
        imprimirEnOrdenRec(raiz);
    }

    /**
     * Método recursivo para imprimir en orden (inorden).
     * @param nodo Nodo actual del recorrido
     */
    private void imprimirEnOrdenRec(Nodo nodo) {
        if (nodo != null) {
            imprimirEnOrdenRec(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            imprimirEnOrdenRec(nodo.derecho);
        }
    }

   
    /**
     * Imprime en consola los valores del árbol en preorden:
     * Raíz - Izquierda - Derecha.
     */
    public void imprimirPreOrden() {
        imprimirPreOrdenRec(raiz);
        System.out.println(); // Salto de línea al final
    }

    /**
     * Método recursivo para imprimir en preorden.
     * @param nodo Nodo actual del recorrido
     */
    private void imprimirPreOrdenRec(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            imprimirPreOrdenRec(nodo.izquierdo);
            imprimirPreOrdenRec(nodo.derecho);
        }
    }

     /**
     * Imprime en consola los valores del árbol en postorden:
     * Izquierda - Derecha - Raíz.
     */
    public void imprimirPostOrden() {
        imprimirPostOrdenRec(raiz);
        System.out.println(); // Salto de línea al final
    }

    /**
     * Método recursivo para imprimir en postorden
     * @param nodo Nodo actual del recorrido
     */
    private void imprimirPostOrdenRec(Nodo nodo) {
        if (nodo != null) {
            imprimirPostOrdenRec(nodo.izquierdo);
            imprimirPostOrdenRec(nodo.derecho);
            System.out.print(nodo.valor + " ");
        }
    }


    /**
     * Busca un valor en el árbol binario
     * 
     * @param valor El valor a buscar
     * @return true si el valor se encuentra, false si no existe en el árbol
     */
    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    /**
     * Método recursivo para buscar un valor
     * @param actual actual Nodo actual del recorrido
     * @param valor Valor a buscar
     * @return true si se encuentra, false si no
     */
    private boolean buscarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return false;
        }

        if (valor == actual.valor) {
            return true;
        }

        return valor < actual.valor
                ? buscarRecursivo(actual.izquierdo, valor)
                : buscarRecursivo(actual.derecho, valor);
    }

}
