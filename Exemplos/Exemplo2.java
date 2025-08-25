/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0030482321019
 */
public class Exemplo2 {
    public static void main(String[] args) {
        int x;
        
        x = (int)(Math.random() * 100);
        
        if (x <50){
            System.out.println("O valor " + x + " é menor que 50.");
        }
        else{
            System.out.println("O valor " + x + " é maior que ou igual a 50.");
        }
    }
}
