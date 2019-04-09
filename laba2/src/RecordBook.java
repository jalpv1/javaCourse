
public class RecordBook {
 private    String firstName;
 private String lastName;
 private  String patronymic;
 private    int numberOfRecord;
 private  int numberOfCourse;
 private String[] examsAndOffset;
  private int midScoreOfSession;


    public RecordBook(String firstName, String lastName,
                       String patronymic, int numberOfRecord, int numberOfCourse,
                       String[] examsAndOffset, int midScoreOfSession) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.numberOfRecord = numberOfRecord;
        this.numberOfCourse = numberOfCourse;
        this.examsAndOffset = examsAndOffset;
        this.midScoreOfSession = midScoreOfSession;
    }
    public RecordBook() {
       firstName = new String();
        lastName = new String();
        patronymic = new String();

        examsAndOffset = new String[5];;

    }
    public String toString(){
        /*System.out.printf("%30s%30s%30s%30s%30s%30s%30s",
                recordBook[i].getFirstName(), recordBook[i].getLastName(),
                recordBook[i].getPatronymic(), recordBook[i].getNumberOfRecord(), recordBook[i].getNumberOfCourse(),
                recordBook[i].getExamsAndOffset(), recordBook[i].getExamsAndOffset());*/
        String exams = new String();
        for(int i =0; i< examsAndOffset.length;i++){
            exams = exams+examsAndOffset[i]+"  ";
        }
        //exams = exams+examsAndOffset[0]+"  ";
        String output = String.format("%30s%30s%30s%30s%30s%30s%30s",firstName, lastName , patronymic,numberOfRecord,numberOfCourse, exams,midScoreOfSession);
        //String res = "      "+ firstName+ "      "+lastName + "      "+ patronymic+"      "+numberOfRecord+"      "+ numberOfCourse+ "         "+ exams+"         " +midScoreOfSession ;
        return  output;
    }
   // public RecordBook() { examsAndOffset = new String[5]; }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getNumberOfRecord() {
        return numberOfRecord;
    }

    public void setNumberOfRecord(int numberOfRecord) {
        this.numberOfRecord = numberOfRecord;
    }

    public int getNumberOfCourse() {
        return numberOfCourse;
    }

    public void setNumberOfCourse(int numberOfCourse) {
        this.numberOfCourse = numberOfCourse;
    }

    public String[] getExamsAndOffset() {
        return examsAndOffset;
    }

    public void setExamsAndOffset(String[] examsAndOffset) {
        this.examsAndOffset = examsAndOffset;
    }

    public int getMidScoreOfSession() {
        return midScoreOfSession;
    }

    public void setMidScoreOfSession(int midScoreOfSession) {
        this.midScoreOfSession = midScoreOfSession;
    }

}
