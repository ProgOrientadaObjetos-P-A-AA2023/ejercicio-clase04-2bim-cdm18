/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class PasajeUniversitario extends PasajeUrbano {
    
    public PasajeUniversitario(double pasaje){
        super(pasaje);
    }
    
    @Override
    public void establecerValorPasaje() {
        valorPasaje = valorFijo - (valorFijo*0.3);
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

    public void setUsuario(Persona u) {
        usuario = u;
    }
    
    
       
    @Override
    public String toString(){
        return String.format("Tipo de pasaje: Universitario\n"
                + "%s",
                super.toString()
                );
    }
}