package in.vamsoft.excersise1;

/**
 * creating SalesTest class.
 * @author JK
 *
 */
public class SalesTest {
 /**
  * Creating main method.
  * @param args LOGIN - login of user PASSWORD - password
  */
  public static void main(String[] args) {
    Sellable sale1 = (Sellable) new CarSale("Lamborghini Aventador", 400_000, 5);
    Sellable sale2 = (Sellable) new CarSale("Ferrari 458 Spider", 300_000, 4);
    PaperclipSale sale3 = new PaperclipSale("silver", 1.55, 3_000);
    PaperclipSale sale4 = new PaperclipSale("gold", 2.56, 2_000);
    Sellable[] sales = { sale1, sale2, sale3, sale4 };
    System.out.println("Items for sale:");
    for (Sellable sale: sales) {
      System.out.println("  " + sale);
    }
    System.out.println("Cheapest item: " + Sellable.cheapest(sales));
    System.out.println("Total cost: " + Sellable.totalCost(sales));
  }
}
