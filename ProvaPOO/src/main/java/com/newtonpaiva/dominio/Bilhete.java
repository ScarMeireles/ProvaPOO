package com.newtonpaiva.dominio;

import java.util.Objects;

public class Bilhete {
    private Integer id;
    private Integer numero;
    private String assento;
    private String dataPartida;
    private String dataChegada;
    private String tipo;

    public Bilhete() {
    }

    public Bilhete(Integer id, Integer numero, String assento, String dataPartida, String dataChegada, String tipo) {
        this.id = id;
        this.numero = numero;
        this.assento = assento;
        this.dataPartida = dataPartida;
        this.dataChegada = dataChegada;
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }

    public String getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(String dataPartida) {
        this.dataPartida = dataPartida;
    }

    public String getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(String dataChegada) {
        this.dataChegada = dataChegada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bilhete bilhete)) return false;
        return Objects.equals(id, bilhete.id) && Objects.equals(numero, bilhete.numero) && Objects.equals(assento, bilhete.assento) && Objects.equals(dataPartida, bilhete.dataPartida) && Objects.equals(dataChegada, bilhete.dataChegada) && Objects.equals(tipo, bilhete.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numero, assento, dataPartida, dataChegada, tipo);
    }

    @Override
    public String toString() {
        return "Bilhete{" +
                "id=" + id +
                ", numero=" + numero +
                ", assento='" + assento + '\'' +
                ", dataPartida='" + dataPartida + '\'' +
                ", dataChegada='" + dataChegada + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
