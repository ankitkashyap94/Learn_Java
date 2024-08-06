package InterviewPrograms;

import java.util.*;

public class DataHashmap {


    public static void login(HashMap<String, String> input){

        System.out.println(input.get("username") +" "+ input.get("password"));


    }

    public Object[][] loginDetails(){

        HashMap<String, String> map1 = new HashMap<String, String>();
        map1.put("username", "Ankit");
        map1.put("password", "ankit123");

        HashMap<String, String> map2 = new HashMap<String, String>();
        map2.put("username", "Raghvendra");
        map2.put("password", "password123");

        return new Object[][] {{map1},{map2}};

    }
}
