package examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertKotlin {

    public class User {
        private final String name;
        public User(String name) {
            this.name = name;
        }
    }

    public List<User> createTestList() {
        List<String> names = new ArrayList<>();
        names.add("john");
        names.add("bob");
        names.add("alice");
        return names
                .stream()
                .map(name -> new User(name))
                .collect(Collectors.toList());
    }
}
