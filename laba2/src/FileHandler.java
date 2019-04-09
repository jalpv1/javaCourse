import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.*;
public class FileHandler {
   private String data;
  String tojson;
  private   ArrayRecordBook arrayRecordBook;
  Gson gson;
  FileHandler(){
    arrayRecordBook = new ArrayRecordBook();
  }
  String serialization(){
    RecordBook []recordBook = arrayRecordBook.getArrayRecordBook();
    gson = new GsonBuilder().setPrettyPrinting().create();
     tojson = gson.toJson(arrayRecordBook);

     return tojson;
  }
  void deserialization(){

  }
  void readFromFile(){

  }
  void writeToFile(){
    data =serialization();
    try(FileWriter file = new FileWriter( "sample1.txt" )){
      file.write(data);

    }
    catch (IOException e){
      System.out.println("File not exist");
    }

  }
}
