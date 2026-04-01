package ArrayConcept;

import java.util.HashMap;
import java.util.Map;

public  class ArrayUnderstanding {
    //create a program to get the occurance of words into a sentence..
    //input : -"There is there is a model, check point, ignore those word whose length is less than 2.

    public void wordsOccurrenceCount(String str){
        String[] words = str.split(" ");
       // System.out.println(words);
        Map<String, Integer> map = new HashMap<>();
        for(String word : words){
           word=  word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            if(word.length() < 2){
                continue;
            }
            map.put(word, map.getOrDefault(word, 0)+ 1);
        };

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : "+  entry.getValue());
        }
    }

    public static void main(String[] args) {
        String str = "There is there is a model";
        System.out.println("Git status checked");
        ArrayUnderstanding arr = new ArrayUnderstanding();
        arr.wordsOccurrenceCount(str);
    }
}
