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

    /**
     * 全{@link User}を取得する
     * @return
     */
    public List<User> getAll() {
        return list;
    }

    /**
     * uidでrepositoryを検索する
     * @param uid
     * @return {@code uid}に対する{@link User}が存在しない場合はnullを返す
     */
    public User findByUid(String uid) {
        for (User user: list) {
            if (uid.equals(user.getUid())) {
                return user;
            }
        }
        return null;
    }
}
