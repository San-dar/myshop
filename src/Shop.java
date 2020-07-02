import java.util.Scanner;

public class Shop {

	// TODO Auto-generated method stub
	Item[] item = { new Item("Apple", 1000, 50), new Item("Orange", 500, 50), new Item("Mango", 300, 50), };
	Scanner scan = new Scanner(System.in);

	public void Launch() {
		String answer;
		int menu;
		int count;
		int total = 0;
		do {
			showMenu();
			System.out.println("What kind of fruit do you want?");
			menu = Integer.parseInt(getuserInput());
			System.out.println("How many do you want");
			count = Integer.parseInt(getuserInput());

			if (canOrder(menu, count)) {
					total+=calculate(menu, count);
			} else {
				System.out.printf("Sorry , we are out of store you can still get ( %d ) left.Do you want to buy");
				item[menu-1].getAmount();
				if (getuserInput().equalsIgnoreCase("Y")) {
					total += calculate(menu, item[menu - 1].getAmount());
				}
			}
			System.out.println("Do You want to another fruits? Y/N");
			answer = getuserInput();
		} while (answer.equalsIgnoreCase("Y"));
			System.out.printf("Your total amount : %d Kyats",total);
		
	}

	private int calculate(int menu, int count) {
		item[menu - 1].setAmount(item[menu - 1].getAmount() - count);
		return item[menu - 1].getPrice() * count;
	}

	private boolean canOrder(int menu, int count) {
		return item[menu - 1].getAmount() >= count;
	}

	private void showMenu() {
		System.out.println("MyShop");
		for (int i = 0; i < item.length; i++) {
			System.out.printf("No.%d  Name :%s  Price : %d  Amount : %d \n", (i + 1), item[i].getName(),
					item[i].getPrice(), item[i].getAmount());
		}

	}

	private String getuserInput() {
		return scan.nextLine();
	}
}
