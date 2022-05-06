package com.company;

import com.company.classes.Kvadrat;
import com.company.classes.Kvadrats;
import com.company.classes.RightKvadrats;
//import com.company.classes.Kvadrats;
import java.util.Random;



public class Main {

    public static final int kvadratsNumber = 10;
    public static final int right_kvadratsNumber = 20;

    public static void main(String[] args) {
        Kvadrats kvadrats =new Kvadrats(kvadratsNumber);
        RightKvadrats right_kvadrats = new RightKvadrats(right_kvadratsNumber);

        System.out.println(kvadrats);
        System.out.println(right_kvadrats);

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
