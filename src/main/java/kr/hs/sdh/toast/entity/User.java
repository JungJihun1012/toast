package kr.hs.sdh.toast.entity;

public class User {
    private final String userId;
    private final String userPassword;
    private final String userName;
    private final String userEmail;
    private final String userContact;
    private final String userAddress;

    public User(String userId, String userPassword, String userName, String userEmail, String userContact, String userAddress) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userContact = userContact;
        this.userAddress = userAddress;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserContact() {
        return userContact;
    }

    public String getUserAddress() {
        return userAddress;
    }
}
