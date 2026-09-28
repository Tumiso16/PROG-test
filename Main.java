/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.electronicreport;

/**
 *
 * @author Student
 */
import java.util.Scanner;
//interface in different file
public class Main implements IConsole {
    


    Scanner input = new Scanner(System.in);

    String consoleType;
    String store;
    int totalSales;
    
    public String getConsoleType() {
        return consoleType;
    }
@Override
    public String getStore() {
        return store;
    }

    public int getTotalSales() {
        return totalSales;
    }

    public static void main(String[] args) {

        Main console = new Main();

        System.out.println("----- Console Sales -----");

        System.out.print("Enter console type: ");
        console.consoleType = console.input.nextLine();

        System.out.print("Enter store name: ");
        console.store = console.input.nextLine();

        System.out.print("Enter total sales: ");
        console.totalSales = console.input.nextInt();

        System.out.println();
        System.out.println("----- Sales Information -----");
        System.out.println("Console: " + console.getConsoleType());
        System.out.println("Store: " + console.getStore());
        System.out.println("Total Sales: R" + console.getTotalSales());
    }
}


    

