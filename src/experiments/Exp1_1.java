package experiments;

import core.IExperiment;

import java.util.*;

public class Exp1_1 implements IExperiment
{
    @Override
    public String GetName()
    {
        return "Exp1_1 Word Counter";
    }

    @Override
    public void Run()
    {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner cin = new Scanner(System.in);
        String text = cin.nextLine();
        String[] words = text.split(" ");
        for (String s : words)
        {
            if (!map.containsKey(s))
            {
                map.put(s, 1);
            } else
            {
                map.put(s, map.get(s) + 1);
            }
        }

        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        for (Map.Entry<String, Integer> entry : list)
        {
            System.out.println(entry);
        }
    }
}
