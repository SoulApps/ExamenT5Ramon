/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jackpot;

import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author usuario
 */
public class Jackpot {

    public static final double MONEDA_50 = 0.50;

    public static final double MONEDA_1 = 1;
    public static final double MONEDA_2 = 2;

    public static int saldo;
    public static int premio;
    public static int deposito = 1000;

    public static final int CHERRY = 0;
    public static final int CAMPANA = 1;
    public static final int TREBOL = 2;
    public static final int COIN = 3;
    public static final int LUCKY_SEVEN = 4;

    public static int numAleatorio[];

    public static int ponerImagen;

    public static int getSaldo() {

        return saldo;
    }

//    public static void setSaldo(int saldo) {
//        Jackpot.saldo = saldo;
//    }
    public static int getPremio() {

        premio += saldo;
        deposito -= premio;
        return premio;
    }

//    public static void setPremio(int premio) {
//        Jackpot.premio = premio;
//    }
    public static void setDeposito(int deposito) {
        if (deposito == 0) {
            deposito += 1000;
        }

    }

    public static int getDeposito() {
        return deposito;
    }

    

   
}
