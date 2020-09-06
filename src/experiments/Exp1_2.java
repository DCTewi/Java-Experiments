package experiments;

import core.IExperiment;

import java.util.Arrays;

public class Exp1_2 implements IExperiment
{
    @Override
    public String GetName()
    {
        return "Exp1_2 Arrays";
    }

    @Override
    public void Run()
    {
        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }

        System.out.println(Arrays.deepToString(arr));
    }
}
