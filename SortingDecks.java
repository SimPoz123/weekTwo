import java.util.Random;

public class SortingDecks {


  public static void main (String[] args) {
    int [] deck = makeDeck();
    int count;

    int four = search(deck, 4);

    deck = bubbleSort(deck);

    // deck = selectionSort(deck);

    // deck = insertionSort(deck);

    int three = betterSearch(deck, 3);

    System.out.println("The final deck is:");

    for ( count = 0; count <= deck.length - 1; count ++) {
      System.out.println(deck[count]);
    }

  }


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

    System.out.println("The starting deck is finished.");

    return(deck);
  }

  public static int[] swap(int[] deck, int a, int b) {
    int temp;

    temp = deck[a];
    deck[a] = deck[b];
    deck[b] = temp;

    return(deck);
  }


  public static int[] bubbleSort (int[] deck) {

    int first, second;

    for (int count = 0; count <= (deck.length - 1); count++) {

      for(int card = 0; card <= (deck.length - 2); card++) {
        first = deck[card];
        second = deck[card + 1];

        if (first > second) {
          deck = swap(deck, card, card + 1);
        }
      }
    }

    return deck;
  }

  public static int[] selectionSort (int[] deck) {

    int[] finalDeck = new int[deck.length];

    for (int i = 0; i <= (deck.length - 1); i++) {

      int minCard = 14;
      int temp = 0;

      for (int card = 0; card <= (deck.length - 1); card++) {

        if (deck[card] < minCard) {
          minCard = deck[card];
          temp = card;
        }
      }

      finalDeck[i] = minCard;
      deck[temp] = 14;


    }
//
    return finalDeck;

  }

  public static int[] insertionSort(int deck[]) {

    for (int i = 0; i <= (deck.length - 1); i++) {

      int temp = i;

      for(int card = i; card >= 0; card--) {

        if (deck[card] > deck[temp]) {
          deck = swap(deck, card, temp);
          temp = card;
        }
      }

    }


    return deck;
  }

  public static int search(int deck[], int value) {

    for (int i = 0; i <= (deck.length - 1); i++) {
      if (deck[i] == value) {
        System.out.println(value + " can be found at index " + i);
        return i;
      }
    }
    System.out.println("The number cannot be found")   ;
    return -1;
  }

  public static int betterSearch (int[] deck, int value) {

    for (int i = 0; deck[i] <= value; i++) {
      if (deck[i] == value) {
        System.out.println(value + " can be found at index " + i);
        return i;
      }
    }
    System.out.println("That number cannot be found");
    return -1;
  }


}
