package com.company;

import com.company.classes.Kvadrats;
import com.company.classes.RightKvadrats;

import java.io.IOException;
import java.util.Random;
//import com.company.classes.Kvadrats;


public class Main {

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


}
