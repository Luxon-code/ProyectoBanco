/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobanco;

import java.util.Date;

/**
 *
 * @author SENA
 */
public class CuentaBancaria {

    private String codigoDeCuenta;
    private String nombreDeCliente;
    private Date fechaDeCreacion;
    private int saldo;

    public CuentaBancaria(String codigoDeCuenta, String nombreDeCliente, Date fechaDeCreacion, int saldo) {
        this.codigoDeCuenta = codigoDeCuenta;
        this.nombreDeCliente = nombreDeCliente;
        this.fechaDeCreacion = fechaDeCreacion;
        this.saldo = saldo;
    }

    public String getCodigoDeCuenta() {
        return codigoDeCuenta;
    }

    public void setCodigoDeCuenta(String codigoDeCuenta) {
        this.codigoDeCuenta = codigoDeCuenta;
    }

    public String getNombreDeCliente() {
        return nombreDeCliente;
    }

    public void setNombreDeCliente(String nombreDeCliente) {
        this.nombreDeCliente = nombreDeCliente;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public int getSaldo() {
        return saldo;
    }

    public void agregarSaldo(int saldo) {
        this.saldo += saldo;
    }

    public void quitarSaldo(int saldo) {
        this.saldo -= saldo;
    }

}
