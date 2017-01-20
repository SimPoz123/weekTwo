import java.util.Random;

public class SortingDecks {

  public static int[] makeDeck() {

    Random rand = new Random();

    int[] deck = new int[10];

    int count = 0;

    System.out.println("The starting deck is:");

    while (count <= 9) {
      deck[count] = (rand.nextInt(13) + 1);

      System.out.println(deck[count]);

      count = count + 1;

    }

    System.out.println("The started deck is finished.");

    return(deck);
  }

  public static int[] swap(int[] deck, int a, int b) {
    int temp;

    System.out.println(deck[a] + " is swapping with " + deck[b]);

    temp = deck[a];
    deck[a] = deck[b];
    deck[b] = temp;

    return(deck);
  }


  public static void bubbleSort () {
    int [] deck = makeDeck();

    boolean shuffled, swapped;
    shuffled = swapped = false;

    int temp, card, next, count, first, second;

    card = count = temp = 0;
    next = 1;

    while (!shuffled) {

      first = deck[card];
      second = deck[next];
      // System.out.println("First: " + first + " Second: " + second);

      if (first > second) {
        deck = swap(deck, card, next);

        System.out.println("It works");

        boolean swapped = true;
      } else if (!swapped && count == 8) {
        boolean shuffled = true;
        System.out.println("yee");
      }
      // System.out.println("swapped 2: " + swapped);


      if (card <= 7) {
        card = card + 1;
      } else if (card >= 8) {
        card = 0;
        boolean swapped = false;
      }
      next = card + 1;
    }

    System.out.println("swapped 3: " + swapped);


    System.out.println("The final deck is:");

    while (count <= 9) {
      System.out.println(deck[count]);

      count = count + 1;

    }

  }

  public static void main (String[] args) {

    bubbleSort();

  }
}
