/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.electronicreport;

/**
 *
 * @author Student
 */
public class Electronicreport {

    public static void main(String[] args) {
        
        
        String[]cities = {"Capetown","Port Elizabeth", "Pretoria"};
        String[]console = {"PS5" , "XBOX", "SWITCH"};
        int[][]sales ={
            {1000,2000,300},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };     
            System.out.println("City     Console     Sales");
            System.out.println("------------------");
            for (int i = 0; i < cities.length; i++){
            System.out.print("City: " + cities);
           for (int j = 0; j < console.length; j++ )
               System.out.println(" " + console[j] + " " + sales[i][j]);
            }
    }                      

}
                     
           
                   
         
                
            
        
        
     
               
    
