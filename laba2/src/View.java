public class View {
    String [] message;
    View(){
        message = new String[6];
        message[0]="To know about midScore 1";
        message[1] = "ArrayOf Exam and Offset 2";
    }
    public void printArray(ArrayRecordBook arrayRecordBook){
       System.out.printf("%30s%30s%30s%30s%30s%30s%30s",
                "FirstName", "LastName", "patronymic", "numberOfRecord", "numberOfCourse",
                "examsAndOffset", "MidScoreOfSession");
       RecordBook[]recordBook = arrayRecordBook.getArrayRecordBook();
        System.out.println(" ");
       for (int i = 0;i<  recordBook.length;i++){

           if(recordBook[i] != null) {
               System.out.print(recordBook[i].toString());
               System.out.println(" ");
           }

       }

    }
    public void printArrayExams(String []ar){

        for (int i = 0;i<ar.length;i++){

            System.out.printf("%30s",
                    ar[i]);
        }
    }
    void showMessage(int numberOfMessage){
        System.out.println(message[numberOfMessage]);

    }

void menuView(int index){
    String message [] = new String[8];
    message[0] = "To know about midScore 1";
    message[1] = "ArrayOf Exam and Offset 2";
    message[2] = "Print array 3";
    message[3] = "Enter data 4";
    message[4] = "To exit  0";
    System.out.println(" ");
    System.out.println(message[index]);
    System.out.println(" ");


}
void enterView(int index){
    String message [] = new String[9];
    message[0] = "Enter firstName";
    message[1] = "Enter patronymic";
    message[2] = "Enter second name";
    message[3] = "midscore";
    message[4] = "numberOfRecord";
    message[5] = "numberOfCourse";
    message[6] = "massiv";
     message[7] ="NUMBERS IN STRING";
    message[8] = "LETTERS IN STRING";

    System.out.println(" ");
    System.out.println(message[index]);
    System.out.println(" ");
}
}

//ArrayRecordBook arrayRecordBook) {