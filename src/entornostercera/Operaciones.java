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
