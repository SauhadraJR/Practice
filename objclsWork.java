class Computer{
    int id;
    String model;
    double price;

    void printDetails(){
        System.out.println(this.id);
        System.out.println(this.model);
        System.out.println(this.price);
    }
}
public class objclsWork {
    public static void main(String[] args) {
        Computer com2 = new Computer();
        com2.id= 1;
        com2.model = "Dell";
        com2.price = 89000;
        com2.printDetails();
    }
}
