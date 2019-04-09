import java.util.Arrays;

public class Model {
    private static ArrayRecordBook arrayRecordBook;

    public Model(ArrayRecordBook arrayRecordBook) {
        this.arrayRecordBook = arrayRecordBook;
    }

    public Model() {
        arrayRecordBook = new ArrayRecordBook() ;
    }

    ArrayRecordBook  findWithMidScore(ArrayRecordBook arrayRecordBook){
        RecordBook []recordBook = arrayRecordBook.getArrayRecordBook();
        RecordBook []recordBookResult = new RecordBook[recordBook.length];
        ArrayRecordBook resArray = new ArrayRecordBook();

      //  for (i:recordBook) { }
        int g = 0;
        for (int i =0;i< recordBook.length;i++){
            if(recordBook[i].getMidScoreOfSession()>= 4.5){
                recordBookResult[g]= recordBook[i];
                g++;
            }
        }
        resArray.setArrayRecordBook(recordBookResult);



        return   resArray;

    }
    String[] findExamsOffset(int course){
        RecordBook []recordBook = arrayRecordBook.getArrayRecordBook();
        //Arrays.binarySearch(recordBook,recordBook.)
        for (int i =0;i< recordBook.length;i++){
            if(recordBook[i].getNumberOfCourse()== course){
                return recordBook[i].getExamsAndOffset();

            }
        }
        return null;
    }
    public String[]  findExamsOffsetName(String nameOfStudent){
        RecordBook []recordBook = arrayRecordBook.getArrayRecordBook();
        //Arrays.binarySearch(recordBook,recordBook.)
        for (int i =0;i< recordBook.length;i++){
            if(recordBook[i].getFirstName().compareTo(nameOfStudent)==0){
                return recordBook[i].getExamsAndOffset();

            }
        }
        return null;
    }
}

