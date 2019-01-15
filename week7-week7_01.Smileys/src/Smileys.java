
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
        //hello
    }
        
    private static void printWithSmileys(String characterString) {
        String smiley = ":)";
        
        int length = characterString.length();
        characterString = " " + characterString;
        characterString = characterString + " ";
        if (length % 2 == 1) {
            characterString += " ";
        }
        length = characterString.length();
        
        int numberOfSmileys = length/2 + 2;
        for (int i = 0; i < numberOfSmileys; i++) {
            System.out.print(smiley);
        }
        System.out.println("");
        System.out.print(smiley + characterString + smiley);
        System.out.println("");
        for (int i = 0; i < numberOfSmileys; i++) {
            System.out.print(smiley);
        }
        System.out.println("");
    }
        
}


