import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Start {

    public static HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) throws IOException {
        createUser();
        System.out.println("Enter you name (example :Pupkin V.V.)");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        validate(name);
    }

    public static void validate(String name) {
        try {
            if (phoneBook.containsKey(name)) {
                PrintInfo(name);
            } else {
                check(name);
            }
        } catch (NullPointerException e) {
            System.out.println("Exception : " + e);
        }
    }

    public static void createUser() {
        phoneBook.put("Pupkin V.V.", new ArrayList<>(Arrays.asList("+7-123-456-789")));
        phoneBook.put("Ogurcov A.A.", new ArrayList<>(Arrays.asList("+7-987-654-321", "+7-456-789-123")));
        phoneBook.put("Kukuruzka A.B", new ArrayList<>(Arrays.asList("+7-321-64-987", "+7-123-456-456", "+7-789-123-456")));
    }

    public static void PrintInfo(String name) {
        ArrayList<String> phones = phoneBook.get(name);
        for (int i = 0; i < phones.size(); i++) {
            System.out.println(i + 1 + ". " + phones.get(i));
        }
    }

    public static void check(String name) {
        if (name.length() < 4) {
            System.out.println("Short name");
        } else {
            System.out.println("Name :" + name + " does not exist");
        }
    }
}
