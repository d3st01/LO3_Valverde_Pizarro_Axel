/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornostercera;

/**
 *
 * @author CES
 */
public class Operaciones {

    /**
     * recibe 2 parámetros de tipo int y retorna un array de tipo int. El
     * resultado esperado tras la ejecución de dicho método es un array con
     * todos los valores enteros comprendidos entre los dos parámetros (ambos
     * incluidos) en orden ascendente (de menor a mayor). Si el primer parámetro
     * es mayor que el segundo, debe generar igualmente el rango en orden
     * ascendente.
     *
     * @author: Axel Ivan Valverde Pizarro
     * @version: 1.1
     * @since: 1.0
     * @package: entornostercera
     * @param a int
     * @param b int
     * @return nums int[]array
     */
    public int[] rango(int a, int b) {
        int[] nums = new int[1];
        if (a == 0 && b == 0) {
            nums = null;
        } else {
            if (a > b) {
                nums = new int[a - b + 1];
                for (int i = b; i <= a; i++) {
                    nums[0] = i;
                }
            } else {
                nums = new int[b - a + 1];
                for (int i = a; i <= b; i++) {
                    nums[0] = i;
                }
            }
        }
        return nums;
    }

    /**
     * recibe 2 parámetros de tipo int y retorna un entero. El resultado
     * esperado como retorno es la suma de todos los valores comprendidos entre
     * los dos parámetros (ambos incluidos). El método debe retornar el cálculo
     * correcto con indiferencia del orden en el que reciba los dos argumentos.
     *
     * @author: Axel Ivan Valverde Pizarro
     * @version: 1.1
     * @since: 1.0
     * @package: entornostercera
     * @param: a int
     * @param: b int
     * @return sum int
     */
    public int sumRango(int a, int b) {
        int sum = 0;
        if (a == b) {
            sum = a;
        } else {
            if (b > a) {
                for (int i = a; i < b; i++) {
                    sum += i;
                }
            } else {
                for (int i = b; i <= a; i++) {
                    sum += i;
                }
            }
        }
        return sum;
    }

    /**
     * recibe un parámetro de tipo int y devuelve un boolean. El resultado
     * esperado tras la ejecución es true siempre que el valor del argumento sea
     * par. Debe retornar false en caso contrario. Si el argumento es negativo o
     * 0 se espera que el método propague la excepción IllegalArgumentException.
     *
     * @author: Axel Ivan Valverde Pizarro
     * @version: 1.1
     * @since: 1.0
     * @package: entornostercera
     * @param a int
     * @return boolean
     */
    public boolean isPar(int a) {
        if (a % 2 == 0) {
            if (a == 0) {
                throw new IllegalArgumentException();
            }
            return true;
        }
        if (a < 0) {
            throw new IllegalArgumentException();
        }
        return false;
    }

    /**
     * recibe como parámetro un array de int y devuelve como resultado otro
     * array de int. El resultado esperado es un nuevo array con los valores
     * positivos del array recibido como parámetro. El nuevo array generado será
     * el retorno del método. Si el array recibido es nulo, se espera que el
     * método propague la excepción IllegalArgumentException. Si el array
     * recibido está vacío, el array resultante también lo estará.
     * @author: Axel Ivan Valverde Pizarro
     * @version: 1.1
     * @since: 1.0
     * @package: entornostercera
     * @param nums int[]array
     * @return positivos 
     */
    public int[] extraerPositivos(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException();
        } else {
            int n = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    n++;
                }
            }
            int[] positivos = new int[n];
            int j = 0;
            if (nums.length == 0) {
                positivos = new int[0];
            } else {
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] > 0) {
                        positivos[j] = nums[i];
                        j++;
                    }
                }
            }
            return positivos;
        }
    }
}
