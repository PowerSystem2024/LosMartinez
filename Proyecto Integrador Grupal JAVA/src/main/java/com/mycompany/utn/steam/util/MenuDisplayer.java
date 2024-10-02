
package com.mycompany.utn.steam.util;

import com.mycompany.utn.steam.model.Menu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class MenuDisplayer {

    // Public Functions
    public static void displayMenu(String menuSlug) {
        Menu menu = JsonDataLoader.getMenuData(menuSlug);
        
        if (!menu.getTitle().isEmpty()) {
            displayLine(menu.getTitle(), true, true);
        }
        
        int optionNumber = 1;
        for (String option : menu.getOptions()) {
            displayLine(optionNumber+ " " + option, false, false);
            optionNumber++;
        }
        
        displayLine("", false, false);
        displayLine("Seleccione una Opcion para continuar", false, true);
        System.out.print("Opcion: ");
    }
    
    public static void displayLine(String line, boolean withStartBorder, boolean withEndBorder){
        if (withStartBorder) {
            showDisplayBorder();
        }
        
        addSpaces(line);
        
        if (withEndBorder) {
            showDisplayBorder();
        }
    }
    
    public static void showDisplayBorder(){
        System.out.print("+");
        for (int i = 2; i < getDisplayLength() - 1; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
    
    public static int getIntInput(String name, Optional<Integer> min, Optional<Integer> max){
        Scanner scanner = new Scanner(System.in);
        boolean validValue = false;
        int value = 0;
        
        while(!validValue){
            try {
                System.out.print(name + ": ");
                value = Integer.parseInt(scanner.nextLine());

                if (max.isPresent() && value > max.get()) {
                    System.out.println("El valor ingresado supera el maximo permitido ("+ max.get() +")");
                    break;
                } else if(min.isPresent() && value > min.get()){
                    System.out.println("El valor ingresado supera el minimo permitido ("+ min.get() +")");
                    break;
                }
                
                validValue = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada no valida, por favor ingrese un numero.");
            }
        }
        
        return value;
    }
    
    public static float getFloatInput(String name, Optional<Float> min, Optional<Float> max){
        Scanner scanner = new Scanner(System.in);
        boolean validValue = false;
        float value = 0;
        
        while(!validValue){
            try {
                System.out.print(name + ": ");
                value = Float.parseFloat(scanner.nextLine());

                if (max.isPresent() && value > max.get()) {
                    System.out.println("El valor ingresado supera el maximo permitido ("+ max.get() +")");
                    break;
                } else if(min.isPresent() && value < min.get()){
                    System.out.println("El valor ingresado es menor al minimo permitido ("+ min.get() +")");
                    break;
                }
                
                validValue = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada no valida, por favor ingrese un numero.");
            }
        }
        
        return value;
    }
    
    public static String getStringInput(String name){
        Scanner scanner = new Scanner(System.in);
        boolean validValue = false;
        String value = "";
        
        while(!validValue){
            try {
                System.out.print(name + ": ");
                value = scanner.nextLine();
                
                if (isNumeric(value)) {
                    System.out.println("Error: No se aceptan números.");
                    break;
                }
                
                // Todo: Verificar si hace falta alguna validacion
                validValue = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada no valida, por favor ingrese un valor correcto.");
            }
        }
        
        return value;
    }
    
    public static String getDateInput(String name){
        Scanner scanner = new Scanner(System.in);
        boolean validValue = false;
        String[] dateArray = new String[3];
        
        while(!validValue){
            System.out.println(name + " (yyyy-mm-dd): ");
            try {               
                System.out.print("Anio: ");
                String value = getDateInputValidator(scanner);
                if (value.isBlank() || value.length() != 4) { 
                    System.out.println("ERROR: Entrada no valida, por favor ingrese un valor correcto.");
                    continue; 
                }
                dateArray[0] = value;
                
                System.out.print("Mes: ");
                value = getDateInputValidator(scanner);
                if (value.isBlank() || value.length() > 2 || Integer.parseInt(value) > 12) {
                    System.out.println("ERROR: Entrada no valida, por favor ingrese un valor correcto.");                    
                    continue; 
                }
                dateArray[1] = value;
                                
                System.out.print("Dia: ");
                value = getDateInputValidator(scanner);
                if (value.isBlank() || Integer.parseInt(value) > getMaxDaysByMonthAndYear(dateArray[0], dateArray[1])) {
                    System.out.println("ERROR: Entrada no valida, por favor ingrese un valor correcto.");
                    continue; 
                }
                dateArray[2] = value;
                
                validValue = true;
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Entrada no valida, por favor ingrese un valor correcto.");
            }
        }
        
        String date = String.join("-", dateArray);
        System.out.println("La fecha cargada es " + date);
        
        return date;
    }
    
    public static String[] getOptionsInput(String name, String[] categories){
        Scanner scanner = new Scanner(System.in);
        boolean validValue = false;
        ArrayList<String> categoryArray = new ArrayList<>();
        
        while(!validValue){
            System.out.println(name + ": ");
            try {               
                for (String category : categories) {
                    System.out.println(category);
                }
                
                validValue = true;
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Entrada no valida, por favor ingrese un valor correcto.");
            }
        }
        
        System.out.println("[" + String.join("], [", categoryArray) + "]");
        return categories;
    }
    
    // Private Functions
    private static String getDateInputValidator(Scanner scanner) {
        String value = scanner.nextLine();
                
        if (!isNumeric(value) || Integer.parseInt(value) <= 0) {
            value = "";
        } else if(Integer.parseInt(value) < 10) {
            value = "0" + value;
        }
        
        return value;
    }
    
    private static int getMaxDaysByMonthAndYear(String month, String year) {
        Map<String, Integer> maxByMonth = new HashMap<>();
        maxByMonth.put("04", 30);
        maxByMonth.put("06", 30);
        maxByMonth.put("09", 30);
        maxByMonth.put("11", 30);
        
        if (month == "02") {
            if (isLeapYear(Integer.parseInt(year))) {
                return 29;
            } else {
                return 28;
            }
        } else if(maxByMonth.containsValue(month)) {
         return maxByMonth.get(month);   
        }
        
        return 31;
    }
    
    private static boolean isLeapYear(int year) {
        // Un año es bisiesto si es divisible por 4, pero no divisible por 100, excepto si es divisible por 400
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }
        
    private static int getDisplayLength(){
        // Tamaño del display del menu
        return 73;
    }
        
    private static void addSpaces(String line){
         // -4 por las decoraciones de | y espacio al final y comienzo
        int spacesToDisplay =  getDisplayLength() - line.length() - 4;
        if(spacesToDisplay < 0) {
             // -5 por las decoraciones y el index iniciando en 0
            String firstPart = line.substring(0, getDisplayLength() - 5);
            String secondPart = line.substring(getDisplayLength() - 5);
            
            System.out.println("| " + firstPart + " |");
            addSpaces(secondPart);
        } else {
            System.out.print("| " + line);
            for (int i = 1; i < spacesToDisplay; i++) {
                System.out.print(" ");
            }
            System.out.println(" |");
        }
    }
    
    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}