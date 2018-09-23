package collections;

import java.util.*;

public class UserRunner {
    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();
        users.add(new User("1","first"));
        users.add(new User("2","two"));
        users.add(new User("1","first"));

        Set<User> users1 = new HashSet<User>();
        users1.add(new User("1","first"));
        users1.add(new User("2","two"));
        users1.add(new User("1","first"));
        users1.add(new User("3","first"));

        Map<String, User> users2 = new HashMap<String,User>();
        users2.put("1",new User("1","first"));
        users2.put("2",new User("2","two"));
        users2.put("1",new User("1","first"));
        users2.put("3",new User("3","first"));

        for (Map.Entry<String, User> user: users2.entrySet()) {
            System.out.println(user);
        }
    }
}
