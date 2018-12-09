package jp.john.satoh.springkotlinsample.other.domain;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class User {
    private String uid;
    private String name;
    private String mailAddress;
}

//
//public class User {
//    public String uid;
//    public String name;
//    public String mailAddress;
//
//    public User(String uid, String name, String mailAddress) {
//        this.uid = uid;
//        this.name = name;
//        this.mailAddress = mailAddress;
//    }
//}
