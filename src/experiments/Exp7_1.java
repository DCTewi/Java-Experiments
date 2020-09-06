package experiments;

import core.IExperiment;

import java.math.BigInteger;

public class Exp7_1 implements IExperiment
{
    @Override
    public String GetName()
    {
        return "Exp7_1 Thread and Runnable";
    }

    @Override
    public void Run()
    {
        ExpThread thr = new ExpThread(50);
        Thread rab = new Thread(new ExpRunnable(50));
        thr.start();
        rab.start();
    }

    public static class ExpThread extends Thread
    {
        private BigInteger target, res = BigInteger.ONE;

        public ExpThread(int x)
        {
            target = new BigInteger(String.valueOf(x));
        }

        @Override
        public void run()
        {
            for (BigInteger i = BigInteger.ONE; i.compareTo(target) <= 0; i = i.add(BigInteger.ONE))
            {
                res = res.multiply(i);
            }
            System.out.println("[Thread] " + target + "! = " + res);
        }
    }

    public static class ExpRunnable implements Runnable
    {
        private BigInteger target, res = BigInteger.ONE;

        public ExpRunnable(int x)
        {
            target = new BigInteger(String.valueOf(x));
        }
        @Override
        public void run()
        {
            for (BigInteger i = BigInteger.ONE; i.compareTo(target) <= 0; i = i.add(BigInteger.ONE))
            {
                res = res.multiply(i);
            }
            System.out.println("[Runnable] " + target + "! = " + res);
        }
    }
}
