import java.util.Random;

public class AccountService {

    public Account findById() {
        // 適当な条件でnullが返る
        // randomは面倒なだけです
        Random random = new Random();
        if (random.nextBoolean()) {
            return new Account();
        }
        return null;
    }
}
