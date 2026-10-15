public class Program {
    public static void main(String[] args) throws Exception {
        Cart c1 = new Cart("Sankara");
        c1.addItem("AC", 973);
        c1.addItem("TV", 456);
        c1.addItem("AC1");

        c1.display();
        c1.addItem("AC");
        c1.sort();
        c1.display();
    }
}
