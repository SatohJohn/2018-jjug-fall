package jp.john.satoh.springkotlinsample.other.repository;

import jp.john.satoh.springkotlinsample.other.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private static List<User> list = new ArrayList<User>() {{
        this.add(new User("uid1", "alice", "alice@gmail.com"));
        this.add(new User("uid2", "jack", "jack@gmail.com"));
        this.add(new User("uid3", "davis", "davis@icloud.com"));
        this.add(new User("uid4", "john", "john@icloud.com"));
        this.add(new User("uid5", "mark", "mark@hotmail.co.jp"));
    }};

    public List<User> getAll() {
        return list;
    }
}
