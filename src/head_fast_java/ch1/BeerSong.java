package head_fast_java.ch1;

public class BeerSong {
    public static void main(String[] args) {
        int beerNem = 9;
        String word = "bottles";
        while (beerNem>0){
            System.out.println(beerNem + " " + word + " of beer on the wall.");
            System.out.println(beerNem + " " +word + " of beer");
            System.out.println("Take one down.");
            System.out.println("Passed it around.");
            beerNem--;
            if(beerNem == 1)
                word = "bottle";

            if(beerNem>0)
                System.out.println(beerNem + " " + word + " of beer on the wall");
            else
                System.out.println("NO more beer.");

        }

    }
}
