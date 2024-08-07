import java.util.Random;

public class RandomClassExamples {
    public static void main(String[] args) {
        // Create an instance of Random
        Random random = new Random();

        // Generate random integers
        int randomInt = random.nextInt();
        System.out.println("Random Integer: " + randomInt);

        // Generate random integers within a specific range (0 to 99)
        int randomIntRange = random.nextInt(100);
        System.out.println("Random Integer (0-99): " + randomIntRange);

        // Generate random long
        long randomLong = random.nextLong();
        System.out.println("Random Long: " + randomLong);

        // Generate random float
        float randomFloat = random.nextFloat();
        System.out.println("Random Float: " + randomFloat);

        // Generate random double
        double randomDouble = random.nextDouble();
        System.out.println("Random Double: " + randomDouble);

        // Generate random boolean
        boolean randomBoolean = random.nextBoolean();
        System.out.println("Random Boolean: " + randomBoolean);

        // Generate a stream of random numbers (using nextInt as an example)
        int streamSize = 5;
        System.out.println("Stream of Random Integers:");
        random.ints(streamSize, 0, 100).forEach(System.out::println);

        // Seeding the random number generator
        long seed = 12345L;
        Random seededRandom = new Random(seed);

        // Generate random integers with the seeded generator
        int seededRandomInt = seededRandom.nextInt();
        System.out.println("Seeded Random Integer: " + seededRandomInt);

        // Generate random integers within a specific range with the seeded generator (0 to 99)
        int seededRandomIntRange = seededRandom.nextInt(100);
        System.out.println("Seeded Random Integer (0-99): " + seededRandomIntRange);

        // Generate random long with the seeded generator
        long seededRandomLong = seededRandom.nextLong();
        System.out.println("Seeded Random Long: " + seededRandomLong);

        // Generate random float with the seeded generator
        float seededRandomFloat = seededRandom.nextFloat();
        System.out.println("Seeded Random Float: " + seededRandomFloat);

        // Generate random double with the seeded generator
        double seededRandomDouble = seededRandom.nextDouble();
        System.out.println("Seeded Random Double: " + seededRandomDouble);

        // Generate random boolean with the seeded generator
        boolean seededRandomBoolean = seededRandom.nextBoolean();
        System.out.println("Seeded Random Boolean: " + seededRandomBoolean);
    }
}
