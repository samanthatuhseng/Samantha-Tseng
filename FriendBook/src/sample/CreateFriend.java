package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class CreateFriend {
    private static String name;
    private static String gender;
    private static int age;

    private static FileReader fr;
    private static BufferedReader br;
    private static ArrayList<Friend> friends = new ArrayList<>();

    public static ArrayList createFriend(String fileName) throws IOException {
        fr = new FileReader(fileName);
        br = new BufferedReader(fr);
        String line;
        String friendString = "";
        while ((line = br.readLine()) != null) {
            if (!line.equals(";")) {
                friendString += line;
            } else {
                parseFriend(friendString);
                friendString="";
            }
        }
        return friends;
    }
    private static void parseFriend(String string) throws IOException {
        int pos1;
        int pos2;
        String name = "";
        String gender = "";
        int age = 0;
        for (int i =0; i<string.length();i++){
            if(string.substring(i,i+1).equals(",")){
                pos1 = i;
                name = string.substring(0,pos1);
                for (int k =pos1+1;k<string.length();k++){
                    if(string.substring(k,k+1).equals(",")){
                        pos2=k;
                        gender = string.substring(pos1+1,pos2);
                        age =Integer.parseInt(string.substring(pos2+1));
                        friends.add(new Friend(name,gender,age));
                        }
                    }
                }

        }
    }


}
