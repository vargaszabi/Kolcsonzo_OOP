package hu.petrik.kolcsonzooop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Kolcsonozheto> katalogus = new ArrayList<>();


    public static void main(String[] args) {
        Konyv konyv1 = new Konyv("A Gyűrűk ura", "J.R.R.Tolkien", "IS-2146");
        Konyv konyv2 = new Konyv("Harry Potter", "J.K.Rowling", "IS-4564");
        Konyv konyv3 = new Konyv("A Song Of Ice and Fire", "GoergeR.R.Martin", "IS-1234");
        Konyv konyv4 = new Konyv("Lord of The Rings", "Lakatos Lajos", "IS-7896");
        Dvd dvd1 = new Dvd("Star Wars", 128);
        Dvd dvd2 = new Dvd("Star Wars2", 116);
        Dvd dvd3 = new Dvd("Star Wars3", 120);
        Dvd dvd4 = new Dvd("Star Wars4", 132);
        Dvd dvd5 = new Dvd("Star Wars5", 134);
        Dvd dvd6 = new Dvd("Star Wars6", 186);
        Ujsag ujsag1 = new Ujsag("Izé", 2000, 3);
        Ujsag ujsag2 = new Ujsag("Izé2", 2004, 46);
        Ujsag ujsag3 = new Ujsag("Izé3", 2006, 32);
        katalogus.add(konyv1);
        katalogus.add(konyv2);
        katalogus.add(konyv3);
        katalogus.add(konyv4);
        katalogus.add(dvd1);
        katalogus.add(dvd2);
        katalogus.add(dvd3);
        katalogus.add(dvd4);
        katalogus.add(dvd5);
        katalogus.add(dvd6);
        katalogus.add(ujsag1);
        katalogus.add(ujsag2);
        katalogus.add(ujsag3);
        System.out.println();
        for (Kolcsonozheto k : katalogus){
            System.out.println(k.megjelenitendoNev());
        }
    }
}
