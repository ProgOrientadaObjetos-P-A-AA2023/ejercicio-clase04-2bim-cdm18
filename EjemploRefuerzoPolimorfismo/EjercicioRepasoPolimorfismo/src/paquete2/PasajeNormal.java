/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class PasajeNormal extends PasajeUrbano {

    public PasajeNormal(double pasaje) {
        super(pasaje);
    }

    @Override
    public void establecerValorPasaje() {
        valorPasaje = valorFijo;
    }

    public double getValorPasaje() {
        return valorPasaje;
    }

    public double getValorFijo() {
        return valorFijo;
    }

    public Persona getUsuario() {
        return usuario;
    }

    public void setValorPasaje(double vP) {
        valorPasaje = vP;
    }

    public void setValorFijo(double vF) {
        valorFijo = vF;
    }

    public void setUsuario(Persona U) {
        usuario = U;
    }

    @Override
    public String toString() {
        return String.format("Tipo de pasaje: Normal\n"
                + "%s",
                super.toString()
        );
    }
}
