package com.company.classes;

import java.util.Random;

public class Kvadrats {

    private Kvadrat[] kvadrats;
    private double sredSquar;

    public Kvadrats(final int kvadratsNumber)
    {
        this.kvadrats = new Kvadrat[kvadratsNumber];
        addKvadrat();
        CalculatingSredSquar(kvadratsNumber);
    }

    public Kvadrat[] addKvadrat()
    {

        Random random = new Random();
        for (int i = 0; i < kvadrats.length; i++) {
            kvadrats[i] = new Kvadrat(random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1);
        }
        return kvadrats;
    }

    public void CalculatingSredSquar(final int kvadratsNumber)
    {
        double sum = 0;
        for (Kvadrat kvadrat : kvadrats)
        {
            sum += kvadrat.getSquar();
        }
        sredSquar = sum / kvadratsNumber;
    }

    public int CountOfKvadrats()
    {
        int count = 0;
        for (Kvadrat kvadrat : kvadrats)
        {
            if (sredSquar > kvadrat.getSquar())
            {
                count++;
            }
        }

        return count;
    }


    public String toString() {
        String result = "Kvadrats: " + System.lineSeparator();

        for (Kvadrat kvadrat : kvadrats) {

            result += kvadrat + System.lineSeparator();
        }
        result += "Средная площадь четыреугольников: " + sredSquar + System.lineSeparator();
        result += "Количество четыреугольников, у которых площадь меньше средней площади четыреугольников: " + CountOfKvadrats();
        return result;
    }


}
