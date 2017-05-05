package e_02_11_DieSimulatorRandom;

import java.util.Random;

/**
 * The {@code Random} class implements a <em>random number generator</em>,
 * which produces sequences of numbers that appear to be random. To generate
 * random integers, you construct an object of the {@code Random} class,
 * and then apply the {@code nextInt} method. For example, the call
 * {@code generator.nextInt(6)} gives you a random number between 0 and 5.
 * <p>
 * Write a program {@code DieSimulator} that uses the {@code Random} class to
 * simulate the cast of a die, printing a random number between 1 and 6 every
 * time that the program is run.
 */
public class DieSimulator
{
    public static void main(String[] args)
    {
        Random generator = new Random();

        System.out.println(generator.nextInt(6) + 1);
        System.out.println(generator.nextInt(6) + 1);
        System.out.println(generator.nextInt(6) + 1);
        System.out.println(generator.nextInt(6) + 1);
        System.out.println(generator.nextInt(6) + 1);
        System.out.println(generator.nextInt(6) + 1);
    }

}
