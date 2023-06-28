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
public class PasajeTerceraEdad extends PasajeUrbano {
    
    public PasajeTerceraEdad(double pasaje){
        super(pasaje);
    }
    
    
    @Override
    public void establecerValorPasaje() {
        valorPasaje = valorFijo - (valorFijo*0.5);
    }

    public double getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(double vP) {
        valorPasaje = vP;
    }

    public double getValorFijo() {
        return valorFijo;
    }

    public void setValorFijo(double vF) {
        valorFijo = vF;
    }

    public Persona getUsuario() {
        return usuario;
    }

    public void setUsuario(Persona U) {
        usuario = U;
    }
    
    
       
    @Override
    public String toString(){
        return String.format("Tipo de pasaje: Tercera Edad\n"
                + "%s",
                super.toString()
                );
    }
}
