import java.util.HashMap;
import java.util.Map;

/**
 * Class to validate that a given paragraph contains all the letters of the alphaber as well as
 * the following 10 digrams - [TH, HE, IN, ER, AN, RE, ND, AT, ON, NT]
 * Created by Pelumi.Oyefeso on 19-04-2020
 */
public class Verifier {
    /**
     * This method takes in the paragraph text and returns a boolean which represents whether the paragraph contains
     * all alphabets as well as the required digrams.
     * @param paragraph paragraph to be verified
     * @return boolean which tells whether the paragraph contains all requirements or not.
     */
    public boolean validateParagraphText(String paragraph){
        boolean isValid = true;
        paragraph = paragraph.toUpperCase().trim();
        String [] requirements = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V",
                "W","X","Y","Z","TH", "HE", "IN", "ER", "AN", "RE", "ND", "AT", "ON", "NT"};
        Map<String, Integer> occurrenceMap = new HashMap<>();
        for(String requiredString : requirements){
            int occurrenceCount = occurrenceCounter(paragraph, requiredString);
            occurrenceMap.put(requiredString, occurrenceCount);
            isValid = (occurrenceCount > 0) ? true : false;
        }
        printData(occurrenceMap);
        return isValid;
    }

    private void printData(Map<String, Integer> elementMap){
        String dataString = "COUNT OF REQUIRED STRINGS : \n[ \n";
        for(Map.Entry<String, Integer> entry : elementMap.entrySet()){
            dataString += " "+entry.getKey()+" => "+String.valueOf(entry.getValue())+"\n";
        }
        dataString += " ] ";
        System.out.println(dataString);
    }

    private int occurrenceCounter(String text, String key){
        int count = 0;
        if(!text.contains(key)){
            return count;
        }
        char [] textArray = text.toCharArray();
        for(char character : textArray){
            if(String.valueOf(character).equals(key)){
                count++;
            }
        }
        return count;
    }
}
