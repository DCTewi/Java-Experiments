package experiments;

import core.IExperiment;

public class Exp7_2 implements IExperiment
{
    @Override
    public String GetName()
    {
        return "Exp7_2 Tickets";
    }

    @Override
    public void Run()
    {

    }

    public static class Ticket
    {
        int number = 0;
        boolean using = false;

        public synchronized void Sell()
        {

        }

        public synchronized void Buy()
        {

        }
    }
}
