public class Main {
    public static void main(String[] args) {
    }
    String createObject(String className) {
        createObject("");
        switch (className){
            case "Fanta":
                System.out.println("Fanta");
                break;
            case "CocaCola":
                System.out.println("CocaCola");
                break;
            case "Pepsi":
                break;
            default:
                System.out.println("Netu Drink");
        }
        createObject("CocaCola");
        CocaCola cocaCola = new CocaCola();
        cocaCola.print();
        createObject("Pepsi");
        Pepsi pepsi = new Pepsi();
        pepsi.print();
        createObject("Fanta");
        Fanta fanta = new Fanta();
        fanta.print();
        return className;
    }
}