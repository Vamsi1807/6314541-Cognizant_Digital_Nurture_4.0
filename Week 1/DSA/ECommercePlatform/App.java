package ECommercePlatform;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Platform items[] = new Platform[3];

        for(int i =0;i < 3; i++) {
            items[i] = new Platform();
            System.out.print("Enter product ID for item " + (i + 1) + ": ");
            items[i].setProductId(scanner.nextInt());
            System.out.println("Enter product name for item " + (i + 1) + ": ");
            scanner.nextLine(); // Consume newline
            items[i].setProductName(scanner.nextLine());    
            System.out.print("Enter category for item " + (i + 1) + ": ");
            items[i].setCategory(scanner.nextLine());
        }


        System.out.println("\nEnter product id to search : ");
        int id = scanner.nextInt();

        linerarSearch(items, id);
        binarySearch(items, id);
    }

    public static void linerarSearch(Platform[] items, int id) {
        boolean found = false;
        for (Platform item : items) {
            if (item != null && item.getProductId() == id) {
                System.out.println("Item found using linear search: " + item.getProductName());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found using linear search.");
        }
    }

    public static void binarySearch(Platform[] items, int id) {
        // Sort the items based on productId for binary search
        java.util.Arrays.sort(items, (a, b) -> Integer.compare(a.getProductId(), b.getProductId()));

        int left = 0;
        int right = items.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (items[mid] != null && items[mid].getProductId() == id) {
                System.out.println("Item found using binary search: " + items[mid].getProductName());
                found = true;
                break;
            } else if (items[mid] != null && items[mid].getProductId() < id) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Item not found using binary search.");
        }
    }
}
