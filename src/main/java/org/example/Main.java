package org.example;

import org.example.Politico.Governor;
import org.example.Politico.Party;
import org.example.Politico.President;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Governor sanwoOlu = new Governor("Sanwo Olu", Party.APC, 55,"Lagos", 50);
        Governor adeleke = new Governor("Adeleke", Party.PDP, 50,"Osun", 40);
        President tinubu = new President("jagabam", Party.SPD, 70, "Nigeria", 37);


        System.out.println(adeleke);
        System.out.println(tinubu);

    }
}