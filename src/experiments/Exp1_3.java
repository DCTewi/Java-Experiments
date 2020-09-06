package experiments;

import core.IExperiment;
import core.Main;

import java.util.Scanner;

public class Exp1_3 implements IExperiment
{
    @Override
    public String GetName()
    {
        return "Exp1_3 Find123";
    }

    @Override
    public void Run()
    {
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();

        System.out.println(s.contains("abc"));
    }
}
