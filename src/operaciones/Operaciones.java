/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author Carlos.L
 * @version 1.0
 * @since 17/05/2021
 * 
 */
public class Operaciones {
/** 
 * Esta operación realiza una suma entre dos números, 
 * si el número es para se devuleve igual,
 * si es impar se devuelve igual +1. 
 * número +1.
 * @param a Integer
 * @param b Integer
 * @return  Devuelve un integer
 */
    public int sumarPar(int a, int b) {
        int resultado = a + b;
        if(resultado%2==0){
            return resultado;
        }else{
            return resultado+1;
        }
    }
/**
 * Esta operación comprueba cuál de los dos números es el mayor.
 * @param a Integer
 * @param b Integer
 * @return  Devuelve un integer
 */
    public int mayor(int a, int b) {
        if(a>b){
            return a;
        }else{
            return a;
        }
    }
   /**
    * Esta operación realiza una suma de todos los números dentro del array.
    * @param numeros Array de integer
    * @return Devuelve un integer
    */
    public int sumarVector(int [] numeros) {
        int sum=0;
        for (int i = 0; i < numeros.length; i++) {
            sum+=numeros[0];
        }
        return sum;
    }
    
}