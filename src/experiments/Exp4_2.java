package experiments;

import core.IExperiment;

public class Exp4_2 implements IExperiment
{
    @Override
    public String GetName()
    {
        return "Exp4_2 Person Class";
    }

    @Override
    public void Run()
    {
        Person a = new Person("A");
        Person b = new Person("B");
        Person aClone = new Person("A");

        System.out.println(a.equals(b) + " " + a.equals(aClone));
    }

    public static class Person
    {
        public String name;

        public Person(String name)
        {
            this.name = name;
        }

        @Override
        public String toString()
        {
            return name;
        }

        @Override
        public boolean equals(Object o)
        {
            if (o.getClass() != getClass()) return false;
            return toString().equals(o.toString());
        }

        @Override
        public int hashCode()
        {
            return super.hashCode();
        }
    }
}
