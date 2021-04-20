package com.company;

import com.company.Clients.Waitress;
import com.company.Menus.DinerMenu;
import com.company.Menus.Menu;
import com.company.Menus.PancakeMenu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PancakeMenu pancakeMenu = new PancakeMenu();
        DinerMenu dinerMenu = new DinerMenu();

        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(pancakeMenu);
        menus.add(dinerMenu);

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
