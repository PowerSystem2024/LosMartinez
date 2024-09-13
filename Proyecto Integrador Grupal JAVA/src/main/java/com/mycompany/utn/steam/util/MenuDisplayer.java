
package com.mycompany.utn.steam.util;

import com.mycompany.utn.steam.model.Menu;

public class MenuDisplayer {
    public static void displayMenu(String menuSlug) {
        Menu menu = JsonDataLoader.getMenuData(menuSlug);
        
        displayLine(menu.getTitle(), true, true);
        
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
        
        System.out.print("| " + line);
        addSpaces(line.length());
        System.out.println("|");
        
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
        
    private static int getDisplayLength(){
        // Tamaño del display del menu
        return 73;
    }
        
    private static void addSpaces(int wordLength){
        int spacesToDisplay =  getDisplayLength() - wordLength - 3;
        
        for (int i = 1; i < spacesToDisplay; i++) {
            System.out.print(" ");
        }
    }
}