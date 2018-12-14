package jp.john.satoh.springkotlinsample.other.domain;

/**
 * Userを表すValue Objectです
 */
public class User {
    private String uid;
    private String name;
    private String mailAddress;

    public User(String uid, String name, String mailAddress) {
        this.uid = uid;
        this.name = name;
        this.mailAddress = mailAddress;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }
}
