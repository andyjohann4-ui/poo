package org.example;

public class Carro {
    // 1. Atributos privados
    private String marca;
    private String modelo;
    private int anio;

    // 2. Constructor por defecto (valores iniciales fijos)
    public Carro() {
        this.marca = "Generico";
        this.modelo = "Estandar";
        this.anio = 2020;
    }

    // 3. Constructor normal (con parámetros)
    public Carro(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    // 4. Métodos Getter (para obtener los datos)
    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAnio() {
        return this.anio;
    }

    // 5. Métodos Setter (para modificar los datos)
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}