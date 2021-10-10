import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        //created linkedList that reads in from txt file

        MyList<String> myList = new <String>MyList();
        System.out.println(myList.isEmpty());
        myList.add("Hello");
        System.out.println(myList.isEmpty());
        myList.add(1,"World");
        boolean containsWorld = myList.contains("World");
        String s = myList.toString();
        System.out.println(s + "\n"+ containsWorld);

        File item = new File("/Users/admin/IdeaProjects/LinkedListsAreCool/src/item");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(item));
        String st;
        int counter = myList.size();
        while ((st = bufferedReader.readLine()) != null){
            myList.add(counter,st);
            counter++;
        }
s = myList.toString();
        System.out.println(s);

    }

}
