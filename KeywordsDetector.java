public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for (int i = 0; i < sentences.length; i++) {
            lowerCase(stringAt(sentences, i));
        }
        for (int i = 0; i < keywords.length; i++) {
            lowerCase(stringAt(keywords, i));
        }
        
        for (int i = 0; i < sentences.length; i++) {
            for (int j = 0; j < keywords.length; j++) {
                if (contains(stringAt(sentences, i), stringAt(keywords, j)) == true) {
                    System.out.println(stringAt(sentences, i));
                    j = keywords.length;
                }
            }
        }
    }

       /** Returns the lowercase version of the given string. */
       public static String lowerCase(String str) {
        if (str.length() == 0) {
            return "";
        }
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)<= 90 && str.charAt(i) >= 65){
                newStr+= (char) (str.charAt(i) + 32);
            }
            else {
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {

        if (str2.length() == 0) {
            return true;
        }
        for (int i = 0; i < str1.length(); i++) {
            int counter1 = i;
            int counter2 = 0;
            while (counter2 < str2.length() && str2.charAt(counter2) == str1.charAt(counter1)) {
                counter1++;
                counter2++;
            } 
            if (counter2 == str2.length()){
                return true;
            }
        }
        return false;
    }

    public static String stringAt(String[] arr, int index) {
        String theString = arr[0];
        int counter = 0;
        if (index == 0) {
            theString = arr[counter];
            return theString;
        }
        while (counter != index){
            counter++;
            theString = arr[counter];
        }
        return theString;
    }
}
