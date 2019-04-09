public class Main {
    public static void main(String[] args) {

        Controller c = new Controller();
        try {
        c.menu();
          throw new NumberExeption();
        } catch (NumberExeption e) {
        }
        //System.out.println(" ");

    }
}
