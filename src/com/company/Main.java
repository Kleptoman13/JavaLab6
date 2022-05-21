package com.company;

import com.company.classes.Kvadrats;
import com.company.classes.RightKvadrats;

import java.io.IOException;
import java.util.Random;
//import com.company.classes.Kvadrats;


public class Main {

    public static final int kvadratsNumber = 10;
    public static final int right_kvadratsNumber = 20;

    public static void main(String[] args) throws IOException {
        Random random = new Random();
        final int numbersKvadrats = 5;
        final int numbersRightKvadrats = 5;
        Kvadrats kvadrats = new Kvadrats();
        RightKvadrats rightkvadrats = new RightKvadrats();

        for (int i = 0; i < numbersKvadrats; i++) {
            kvadrats.add(random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1);
        }

        for (int i = 0; i < numbersRightKvadrats; i++) {
            rightkvadrats.add(random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1);
        }

        System.out.println(kvadrats);
        System.out.println(rightkvadrats);
    }

//    public void createKvadrats(Kvadrat[] kvadrats)
//    {
//        Random random = new Random();
//        for (int i = 0; i < kvadratsNumber; i++) {
//            kvadrats[i] = new Kvadrat(random.nextInt(10), random.nextInt(10), random.nextInt(10), random.nextInt(10), random.nextInt(10), random.nextInt(10), random.nextInt(10), random.nextInt(10));
//        }
//    }
//
//    public void outputKvadrats(Kvadrat[] kvadrats)
//    {
//        for (int i = 0; i<kvadratsNumber; i++){
//            System.out.println(kvadrats[i]);
//        }
//    }

}
