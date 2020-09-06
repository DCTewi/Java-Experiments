package experiments;

import core.IExperiment;

public class Exp4_1 implements IExperiment
{
    @Override
    public String GetName()
    {
        return "Exp4_1 Template";
    }

    @Override
    public void Run()
    {
        GeneralType<String> hello = new GeneralType<>("Hello world!");
        GeneralType<Integer> number = new GeneralType<>(15);

        System.out.println(hello.GetValue() + " " + number.GetValue());
    }

    public static class GeneralType<T>
    {
        private final T obj;

        public GeneralType(T obj)
        {
            this.obj = obj;
        }

        public T GetValue()
        {
            return obj;
        }
    }
}
