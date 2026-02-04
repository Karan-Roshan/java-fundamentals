class Dog {
    int height, weight;
    String breed, color;
}

public class DogDetails {
    public static void main(String[] args) {
        
        Dog Beagle = new Dog();
        Dog Labradore = new Dog();
        Dog GoldenRetriever = new Dog();

        Beagle.height = 15;
        Beagle.weight = 12;
        Beagle.breed = "Beagle";
        Beagle.color = "Brown";

        Labradore.height = 20;
        Labradore.weight = 16;
        Labradore.breed = "Labradore";
        Labradore.color = "Light Golden";

        GoldenRetriever.height = 17;
        GoldenRetriever.weight = 20;
        GoldenRetriever.breed = "Golden Retriver";
        GoldenRetriever.color = "Light Brown";

        System.out.println("Beagle Details: Height - " + Beagle.height + " Inches , Weight - " + Beagle.weight
                + "Kg , Breed - " + Beagle.breed + ", Color - " + Beagle.color);
        System.out.println(" ");

        System.out.println("Labradore Details: Height - " + Labradore.height + " Inches , Weight - " + Labradore.weight
                + "Kg , Breed - " + Labradore.breed + ", Color - " + Labradore.color);
        System.out.println(" ");

        System.out.println("GoldenRetriever Details: Height - " + GoldenRetriever.height + " Inches , Weight - "+ GoldenRetriever.weight
                + "Kg , Breed - " + GoldenRetriever.breed + ", Color - " + GoldenRetriever.color);
        System.out.println(" ");
    }
}

