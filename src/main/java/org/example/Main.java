package org.example;

public class Main {
    public static void main(String[] args) {
        // 1. Usar el constructor por defecto
        Carro carro1 = new Carro();
        System.out.println("El carro 1 es marca " + carro1.getMarca() + ", modelo " + carro1.getModelo() + " y año " + carro1.getAnio());

        // 2. Modificar sus atributos con los métodos setter
        carro1.setMarca("Toyota");
        carro1.setModelo("Corolla");
        carro1.setAnio(2022);
        System.out.println("El carro 1 modificado es marca " + carro1.getMarca() + ", modelo " + carro1.getModelo() + " y año " + carro1.getAnio());

        System.out.println("--------------------------------------------------");

        // 3. Usar el constructor con parámetros
        Carro carro2 = new Carro("Ford", "Mustang", 2024);
        System.out.println("El carro 2 es marca " + carro2.getMarca() + ", modelo " + carro2.getModelo() + " y año " + carro2.getAnio());
    }
}