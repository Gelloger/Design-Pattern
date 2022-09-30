package pattern.factory.pizza;

public abstract class Pizza {
    private String name;
    private int price;

    public Pizza(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void printPrice(){
        System.out.println("Pizza Price is " + getPrice());
    }

    public void prepare(){
        System.out.println(getName() + " Pizza Prepare....");
    }

    public void bake(){
        System.out.println("Baking ~ 20 minutes");
    }

    public void cut(){
        System.out.println("Cut! ~ 1 minutes");
    }

    public void box(){
        System.out.println("Boxing ~ 1 minutes");
    }
}
