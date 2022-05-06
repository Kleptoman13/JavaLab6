package com.company.classes;

import java.util.Arrays;
import java.util.Random;

public class RightKvadrats {
    private RightKvadrat[] right_kvadrats;
    private double sredSquar;

    public RightKvadrats(final int kvadratsNumber)
    {
        this.right_kvadrats = new RightKvadrat[kvadratsNumber];
        addRightKvadrat();
        CalculatingSredSquar(kvadratsNumber);
    }

    public RightKvadrat[] addRightKvadrat()
    {

        Random random = new Random();
        for (int i = 0; i < right_kvadrats.length; i++) {
            right_kvadrats[i] = new RightKvadrat(random.nextInt(10), random.nextInt(10), random.nextInt(10), random.nextInt(10));
        }
        return right_kvadrats;
    }

    public void CalculatingSredSquar(final int kvadratsNumber)
    {
        double sum = 0;
        for (RightKvadrat right_kvadrat : right_kvadrats)
        {
            sum += right_kvadrat.getRightSquar();
        }
        sredSquar = sum / kvadratsNumber;
    }

    public String toString() {
        String result = "Right Kvadrats: " + System.lineSeparator();

        for (RightKvadrat right_kvadrat : right_kvadrats) {

            result += right_kvadrat + System.lineSeparator();

        }
        result += "Средная площадь Прямоугольников: " + sredSquar + System.lineSeparator();
        return result;
    }
}
