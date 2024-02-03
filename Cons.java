class Fruit {
    String name;
    int quantity;
    double avgWeight;

    public void getInfo() {
        System.out.println(this.name);
        System.out.println(this.quantity);
        System.out.println(this.avgWeight);
    }

    /*
     * Fruit() {
     * System.out.println("abcd");
     * 
     * }
     */

    /*
     * Fruit(String name, int quantity, double avgWeight) {
     * this.name = name;
     * this.quantity = quantity;
     * this.avgWeight = avgWeight;
     * 
     * }
     */

    Fruit(Fruit f2) {
        this.name = name;
        this.quantity = f2.quantity;
        this.avgWeight = f2.avgWeight;
    }

    Fruit() {

    }

}

public class Cons {
    public static void main(String[] args) {
        Fruit f1 = new Fruit();
        f1.name = "Hapus";
        f1.quantity = 30;
        f1.avgWeight = 150.15;
        Fruit f2 = new Fruit(f1);
        f2.getInfo();

    }
}