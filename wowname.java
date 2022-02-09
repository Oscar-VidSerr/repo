import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class wowname {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = "";
        boolean comprover = false;
        System.out.println("Introdueix nom d'usuari");
        name = scan.nextLine();

        char tmp = name.charAt(0);

        for (int i = 1; i < name.length(); i++) {
            if (name.charAt(i) == tmp) {
                comprover = false;
            } else {
                comprover = true;
            }
        }

        if (comprover == true) {
            System.out.println("SI");;
        } else {
            System.out.println("NO");;
        }

        scan.close();
    }
}