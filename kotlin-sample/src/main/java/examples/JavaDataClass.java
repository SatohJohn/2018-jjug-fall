package examples;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

public class JavaDataClass {
    @AllArgsConstructor
    @Data
    public class User1 {
        private String uid;
        private String name;
        private String mailAddress;
    }

    @AllArgsConstructor
    @Getter
    @ToString
    @EqualsAndHashCode
    public class User2 {
        private String uid;
        private String name;
        private String mailAddress;
    }

}
