import java.util.Arrays;
import java.util.Scanner;

public  class ArrayRecordBook {
    RecordBook [] arrayRecordBook;
    ValidatorNumbers validatorNumbers;
    ValidatorLetter validatorLetter;
    View v ;

    public ArrayRecordBook(RecordBook[] arrayRecordBook) {
        arrayRecordBook = new RecordBook[10];
        this.arrayRecordBook = arrayRecordBook;
        validatorLetter = new ValidatorLetter();
        validatorNumbers= new ValidatorNumbers();
    }
    public ArrayRecordBook() {
        arrayRecordBook = new RecordBook[10];

        //Arrays.fill(ArrayRecordBook,0,ArrayRecordBook.length,null);
        fillForTest(arrayRecordBook);
        validatorLetter = new ValidatorLetter();
        validatorNumbers= new ValidatorNumbers();
        v = new View();

    }
    public RecordBook[] getArrayRecordBook() {
        return arrayRecordBook;
    }

    public void setArrayRecordBook(RecordBook[] arrayRecordBook) {
        this.arrayRecordBook = arrayRecordBook;
    }



    public RecordBook[] fillForTest(RecordBook[] ArrayRecordBook){
       /* ArrayRecordBook[1].firstName = "Paul";
        ArrayRecordBook[1].lastName ="Black";
        ArrayRecordBook[1].MidScoreOfSession =5;
        ArrayRecordBook[1].numberOfCourse =2;
        ArrayRecordBook[1].numberOfRecord = 71;
        ArrayRecordBook[1].patronymic ="Ivanovich";
        ArrayRecordBook[1].examsAndOffset ={"Math"};*/

       String [] ex ={"Math Phisics English","OOP "};
        String [] ex2 ={"Math PE Biologie","OOP "};
        String [] ex3 ={"Informatic Phisics English"," OOP"};
      // ArrayRecordBook[0] = new ArrayRecordBook();
        RecordBook testVal = new RecordBook();

        testVal.setFirstName("Paul");
        testVal.setLastName("P");
        testVal.setPatronymic("tyui");
        testVal.setMidScoreOfSession(5);
        testVal.setExamsAndOffset(ex);
        testVal.setNumberOfCourse(1);
        testVal.setNumberOfRecord(54);
        RecordBook testVal1 = new RecordBook();
        testVal1.setFirstName("Petro");
        testVal1.setLastName("Popov");
        testVal1.setPatronymic("tyui");
        testVal1.setMidScoreOfSession(4);
        testVal1.setExamsAndOffset(ex2);
        testVal1.setNumberOfCourse(2);
        testVal1.setNumberOfRecord(32);
        RecordBook testVal2 = new RecordBook();
        testVal2.setFirstName("Vlad");
        testVal2.setLastName("Sonko");
        testVal2.setPatronymic("tyui");
        testVal2.setMidScoreOfSession(2);
        testVal2.setExamsAndOffset(ex3);
        testVal2.setNumberOfCourse(4);
        testVal2.setNumberOfRecord(67);
        RecordBook testVal3 = new RecordBook();
        testVal3.setFirstName("Oleg");
        testVal3.setLastName("Mir");
        testVal3.setPatronymic("Olyo");
        testVal3.setMidScoreOfSession(2);
        testVal3.setExamsAndOffset(ex3);
        testVal3.setNumberOfCourse(4);
        testVal3.setNumberOfRecord(67);
        ArrayRecordBook[0] = testVal;
        ArrayRecordBook[1] = testVal1;
        ArrayRecordBook[2] = testVal;
        ArrayRecordBook[3] = testVal1;
        ArrayRecordBook[4] = testVal;
        ArrayRecordBook[5] = testVal1;
        ArrayRecordBook[6] = testVal2;
        ArrayRecordBook[7] = testVal1;
        ArrayRecordBook[8] = testVal2;
        ArrayRecordBook[9] = testVal3;


        return arrayRecordBook;
    }
    RecordBook[]  copy(RecordBook[]Sourse,RecordBook[]Distin){
        for(int i =0;i< Sourse.length;i++){
            Distin[i]=Sourse[i];

        }
        return Distin;
    }
    RecordBook[] add(RecordBook el){
        RecordBook []copyDate = new RecordBook[arrayRecordBook.length*2];
        copyDate =copy(arrayRecordBook,copyDate);
        if(arrayRecordBook[arrayRecordBook.length -1]!=null){
            for(int i = 0; i <copyDate.length;i++){
                if(copyDate[i] ==null){
                    copyDate[i] = el;
                    arrayRecordBook = copyDate;
                    return copyDate;

                }

            }

            //return copyDate;

    }
        else{
            for(int i =0;i < arrayRecordBook.length;i++){
                if(arrayRecordBook[i]==null){
                    arrayRecordBook[i]=el;

                    return arrayRecordBook;
                }

            }

        }
       return arrayRecordBook;
    }
    boolean takeData1(){
        boolean flag = false;
        // read string values
        RecordBook recordBook = new RecordBook();
        Scanner scanner = new Scanner(System.in);
        v.enterView(0);
       // System.out.println("Enter firstName");
        String firstName =  scanner.nextLine();
        v.enterView(1);
        //System.out.println("Enter patronymic");
        String patronymic = scanner.nextLine();

        // validatorNumbers.withoutNumbers(firstName);
        v.enterView(2);
       // System.out.println("Enter lastName");

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


        }
        catch (NumberExeption e){

            return flag = true;
        }
        v.enterView(3);
        //System.out.println("midscore");
        v.enterView(4);
        v.enterView(5);
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

        }
        catch (StringExeption e){
            return flag = true;
        }

        v.enterView(6);



        String [] examsAndOffset= new String[3];
        for (int i = 0;i < 3;i++){
            String subject = scanner.nextLine();
            examsAndOffset[i] = subject;
        }
        recordBook.setExamsAndOffset(examsAndOffset);
        add(recordBook);

return flag;

    }

    public ValidatorNumbers getValidatorNumbers() {
        return validatorNumbers;
    }

    public void setValidatorNumbers(ValidatorNumbers validatorNumbers) {
        this.validatorNumbers = validatorNumbers;
    }

    public ValidatorLetter getValidatorLetter() {
        return validatorLetter;
    }

    public void setValidatorLetter(ValidatorLetter validatorLetter) {
        this.validatorLetter = validatorLetter;
    }

    public View getV() {
        return v;
    }

    public void setV(View v) {
        this.v = v;
    }
}
