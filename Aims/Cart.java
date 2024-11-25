package Aims;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println(disc.getTitle() + " has been added.");
        } else {
            System.out.println("Cannot add more DVDs! The cart is almost full.");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (itemsOrdered == null) {
            System.out.println(" Your cart is empty.");
            return;
        }

        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println(disc.getTitle() + " has been removed!");
                return;
            }
        }
        System.out.println(" No such DVD exists!");
    }

    public float totalCost() {
        float total = 0.0f;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    // return cart's info
    public String toString() {
        String result = "";
        for (int i = 0; i < qtyOrdered; i++) {
            result += itemsOrdered[i].toString();
            result += "\n";
        }
        return result;
    }
}