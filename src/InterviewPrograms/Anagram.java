package InterviewPrograms;

import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function

        if(a.length() != b.length()){
            return false;
        }

        char[] chs1 = a.toLowerCase().toCharArray();
        char[] chs2 = b.toLowerCase().toCharArray();

        //For String a
        for(int i=0; i<(chs1.length-1); i++){
            for(int j = i+1; j>0; j--){

                if(chs1[j]<chs1[j-1]){
                    char temp = chs1[j-1];
                    chs1[j-1] = chs1[j];
                    chs1[j] = temp;
                }
            }
        }

        a = String.valueOf(chs1);

        //For String b
        for(int i=0; i<(chs2.length-1); i++){
            for(int j = i+1; j>0; j--){

                if(chs2[j]<chs2[j-1]){
                    char temp = chs2[j-1];
                    chs2[j-1] = chs2[j];
                    chs2[j] = temp;
                }
            }
        }
        b = String.valueOf(chs2);

        if(a.equalsIgnoreCase(b)){
            return true;

        }
        return false;


    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
