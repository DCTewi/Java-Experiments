package core;

import experiments.*;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        IExperiment[] experiments = {
                new Exp1_1(),
                new Exp1_2(),
                new Exp1_3(),
                new Exp4_1(),
                new Exp4_2(),
                new Exp7_1()
        };

        while (true)
        {
            System.out.println("Input the number of expected experiment(0 to exit): ");
            for (int i = 0; i < experiments.length; i++)
            {
                System.out.println((i + 1) + " " + experiments[i].GetName());
            }

            Scanner cin = new Scanner(System.in);
            int i = cin.nextInt();

            if (i == 0)
            {
                cin.close();
                return;
            }
            if (i < 0 || i > experiments.length)
            {
                System.out.println("Invalid Number!");
            }
            else
            {
                experiments[i - 1].Run();
            }
        }
    }
}
