import java.util.Scanner;
import java.util.regex.*;

public class Controller {
    Model model;
    ArrayRecordBook arrayRecordBook;
    View v;
    ValidatorNumbers validatorNumbers;
    ValidatorLetter validatorLetter;
    FileHandler fileHandler;
    public Controller(){
        arrayRecordBook = new ArrayRecordBook();
         model = new Model();
         v = new View();
         validatorNumbers = new ValidatorNumbers();
         validatorLetter = new ValidatorLetter();
          fileHandler = new FileHandler();

    }


void menu(){
   // arrayRecordBook.fillForTest(arrayRecordBook.ArrayRecordBook);

    char c = ' ';
    do {
        System.out.println(" ");
        v.menuView(0);
        v.menuView(1);
        v.menuView(2);
        v.menuView(3);
        v.menuView(4);
       /* System.out.println("To know about midScore 1");

        System.out.println("ArrayOf Exam and Offset 2");
        System.out.println(" ");
        System.out.println("Print array 3");
        System.out.println(" ");
        System.out.println("To exit  0");
        System.out.println(" ");*/

        Scanner scanner = new Scanner(System.in);
         c =  scanner.next().charAt(0);

        switch (c){
            case '1':
                ArrayRecordBook res = model.findWithMidScore( arrayRecordBook);
                v.printArray(res);
                break;
            case '2':
                System.out.println("Enter Name of student");
                System.out.println(" ");
                String nameOfStudent =  scanner.next();
               String[] sr= model.findExamsOffsetName(nameOfStudent);
               if(sr != null){
                v.printArrayExams(sr);}
               else{
                   System.out.println("Wrong data no student in base");
               }
                break;
            case '3':
                v.printArray(arrayRecordBook);
            case '4':
                //arrayRecordBook = takeData();
                if(arrayRecordBook.takeData1()){
                continue;}
                v.printArray(arrayRecordBook);
                break;
            case '5':
         System.out.println(fileHandler.serialization());

        }

    }
    while (c !=  '0');
}


    ArrayRecordBook takeData() {

        // read string values
        RecordBook recordBook = new RecordBook();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter firstName");
        String firstName = scanner.nextLine();
        System.out.println("Enter patronymic");
        String patronymic = scanner.nextLine();

        // validatorNumbers.withoutNumbers(firstName);
        System.out.println("Enter lastName");

        String lastName = scanner.nextLine();
        try {
            validatorNumbers.setCheckString(firstName);
            validatorNumbers.isValid();

            recordBook.setFirstName(firstName);
            validatorNumbers.setCheckString(lastName);
            validatorNumbers.isValid();
            recordBook.setLastName(lastName);

            validatorNumbers.setCheckString(patronymic);
            validatorNumbers.isValid();
            recordBook.setPatronymic(patronymic);


        } catch (NumberExeption e) {
            System.out.println("NUMBERS IN STRING");
        }

        System.out.println("midscore");

        String midscore = scanner.nextLine();
        String numberOfRecord = scanner.nextLine();
        String numberOfCourse = scanner.nextLine();
        try {
            // System.out.println("midscore");
            validatorLetter.setCheckString(midscore);
            validatorLetter.isValid();

            int midscoreInt = Integer.parseInt(midscore);
            recordBook.setMidScoreOfSession(midscoreInt);


            validatorLetter.setCheckString(numberOfRecord);
            validatorLetter.isValid();
            int numberOfRecordInt = Integer.parseInt(numberOfRecord);
            recordBook.setNumberOfRecord(numberOfRecordInt);

            validatorLetter.setCheckString(numberOfCourse);
            validatorLetter.isValid();
            int numberOfCourseInt = Integer.parseInt(numberOfCourse);
            recordBook.setNumberOfCourse(numberOfCourseInt);

        } catch (StringExeption e) {
            System.out.println("LETTERS IN NUMBER");
        }

        System.out.println("massiv");


        String[] examsAndOffset = new String[3];
        for (int i = 0; i < 3; i++) {
            String subject = scanner.nextLine();
            examsAndOffset[i] = subject;
        }
        recordBook.setExamsAndOffset(examsAndOffset);
        arrayRecordBook.add(recordBook);


        return arrayRecordBook;
    }

}

