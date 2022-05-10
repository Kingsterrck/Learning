package LearnAP.DDCS;
import java.util.List;
import java.util.ArrayList;

public class RandomStringChooser {
    /** Declare any fields (instance variables) **/
    private ArrayList<String> strArr = new ArrayList<String>();
    private int index;
    private int len;
    private String temp;
    /** Declare any constructors */
    public RandomStringChooser(String[] arr) {
        for (int i = 0; i<arr.length;i++) {
            strArr.add(arr[i]);
        }
    }
    /** Write the getNext method */
    public String getNext() {
        if (strArr.size() != 0) {
            index = (int)(Math.random()*strArr.size());
            temp = strArr.get(index);
            strArr.remove(index);
            return temp;
        } else {
            return "NONE";
        }
        
        
    }    
    /** This is a main method for testing the class */
    public static void main(String[] args)
    {
        System.out.println("It should print the words in the array in a random order and then NONE twice");
        String[] wordArray = {"wheels", "on", "the", "bus"};
        RandomStringChooser sChooser = new RandomStringChooser(wordArray);
        for (int k = 0; k < 6; k++)
        {
           System.out.println(sChooser.getNext() + " ");
        }

     } // end of main
}