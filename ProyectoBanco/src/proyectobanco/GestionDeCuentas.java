/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobanco;

import java.util.ArrayList;

/**
 *
 * @author SENA
 */
public class GestionDeCuentas {
    public static ArrayList<CuentaBancaria> cuentas = new ArrayList<>();
    public static void agregar(CuentaBancaria cuenta){
        cuentas.add(cuenta);
    }
    public static int consultar(String codigo) {
        String cod = codigo;
        int cuenta = 0;
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getCodigoDeCuenta().equals(cod)) {
                cuenta = i;
            }
        }
        return cuenta;
    }
    public static boolean existeCodigo(String codigo){
        String code = codigo;
        boolean existe = false;
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getCodigoDeCuenta().equals(code)) {
                existe = true;
            }
        }
        return existe;
    }
    
     public static ArrayList listar() {
        return cuentas;
    }
    public static void consignar(int posicion, int saldo){
        cuentas.get(posicion).agregarSaldo(saldo);
    }
    public static void retirar(int posicion,int saldo){
        cuentas.get(posicion).quitarSaldo(saldo);
    }
    public static void transferir (int posicion, int posicion1, int saldo){
        cuentas.get(posicion).quitarSaldo(saldo);
        cuentas.get(posicion1).agregarSaldo(saldo);
    }
    
    
}
