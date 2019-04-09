public class NumberExeption extends Exception {
     final String NUMBER_IN_STRING = "In this input you can*t use numbers";
     View v;
    NumberExeption(){
        v = new View();
  // System.out.println(NUMBER_IN_STRING);
        v.enterView(7);
        //System.out.println("NUMBERS IN STRING");
    }
}
