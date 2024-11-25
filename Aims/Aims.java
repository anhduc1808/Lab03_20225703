package Aims;

public class Aims {

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("======AIMS Project by DucNSA225703======");
        System.out.println("========================================\n");

        // Khởi tạo một giỏ hàng mới
        Cart anOrder = new Cart();

        // Tạo và thêm DVD vào giỏ hàng
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        // Xóa DVD khỏi giỏ hàng
        anOrder.removeDigitalVideoDisc(dvd1);
        anOrder.removeDigitalVideoDisc(dvd2); 
        anOrder.removeDigitalVideoDisc(dvd3);
        // Tính và in ra tổng chi phí
        System.out.printf("Total cost is: %.2f\n", anOrder.totalCost());
        System.out.println(anOrder.toString());
    }
}
