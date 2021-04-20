package com.company.Clients;

import com.company.Menu.MenuComponent;

public class Waitress {
    MenuComponent fullMenu;

    public Waitress(MenuComponent fullMenu) {
        this.fullMenu = fullMenu;
    }

    public void printMenu() {
        fullMenu.print();
    }
}
