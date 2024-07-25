package com.pildorasinformaticas.colecciones;

import java.util.HashSet;
import java.util.Set;

public class ClientesBancarios {
    public static void main(String[] args) {
        Set<Cliente> clientes = new HashSet<>(); // esta es la interfaz hashset 

        // Agregando clientes al HashSet
        clientes.add(new Cliente(1, "Juan Pérez", 2500.50));
        clientes.add(new Cliente(2, "María López", 3700.75));
        clientes.add(new Cliente(3, "Carlos Sánchez", 1500.00));
        clientes.add(new Cliente(4, "Ana Fernández", 4500.80));
/* hashset 
   *rapida
   *no duplica
   *no ordena
   *no acc aleatorio
   */

 
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        // Verificando si un cliente con un ID específico existe
        Cliente clienteBuscado = new Cliente(2, "María López", 3700.75);
        if (clientes.contains(clienteBuscado)) {
            System.out.println("\nEl cliente con ID " + clienteBuscado.getId() + " está en el sistema.");
        } else {
            System.out.println("\nEl cliente con ID " + clienteBuscado.getId() + " no está en el sistema.");
        }

        // Eliminando un cliente
        clientes.remove(new Cliente(3, "Carlos Sánchez", 1500.00));
        System.out.println("\nLista de Clientes después de la eliminación:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}
