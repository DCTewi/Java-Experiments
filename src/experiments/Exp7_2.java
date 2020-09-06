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
        Ticket t = new Ticket(10);
        new Consumer(t).start();
        new Producer(t).start();
    }

    public static class Ticket
    {
        private int size;
        private int number = 0;
        private int id = 0;
        private boolean available = false;

        public Ticket(int size)
        {
            this.size = size;
        }

        public synchronized void Sell()
        {
            if (available && id <= number)
            {
                id += 1;
                System.out.println("Sell ticket" + (id));
            }
            if (id == number) available = false;
        }

        public synchronized void Buy()
        {
            number += 1;
            System.out.println("Buy ticket" + number);
            available = true;
        }
    }

    public static class Producer extends Thread
    {
        private final Ticket t;

        public Producer(Ticket t)
        {
            this.t = t;
        }

        @Override
        public void run() {
            while (t.number < t.size)
            {
                t.Buy();
            }
        }
    }

    public static class Consumer extends Thread
    {
        private final Ticket t;

        public Consumer(Ticket t)
        {
            this.t = t;
        }

        @Override
        public void run() {
            while (t.id < t.size)
            {
                t.Sell();
            }
        }
    }
}
