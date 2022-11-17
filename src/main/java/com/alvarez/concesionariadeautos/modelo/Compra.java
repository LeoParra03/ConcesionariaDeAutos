/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alvarez.concesionariadeautos.modelo;

/**
 *
 * @author Moises Alvarez
 */
//Compra
public class Compra extends Solicitud {
    private Vendedor vendedor;

    public Compra(Usuario usuario, Vehiculo vehiculo,Vendedor vendedor) {
        super(usuario, vehiculo);
        this.vendedor= vendedor;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }
    
    
    @Override
    public String mostrarInformacion(){
        return "Compra {El usuario "+ usuario.getNombres()+" solicita la compra del vehiculo "+vehiculo.mostrarInformacionCliente()+ "Estado: "+estado;
    }
    
    public void mostrarInformacionSupervisor(){
        System.out.println("Compra {El usuario "+ usuario.getNombres()+" solicita la compra del vehiculo "+vehiculo.mostrarInformacionCliente()+ "Estado: "+estado+" Vendedor: "+vendedor.getNombres()+" "+vendedor.getApellidos());
    }
    
}
