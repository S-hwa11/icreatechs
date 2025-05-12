package com.mycompany.icreatechs;

import java.io.IOException;

public class Utils {
    public static void sleep(int duration) {
        try {
            Thread.sleep(duration * 1000); //
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
    
    public static void cls() {
            try {
                if (System.getProperty("os.name").contains("Windows")) {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                }
                else {
                    System.out.print("\033\143");
                }
            } catch (IOException | InterruptedException ex) {}
    }
}
