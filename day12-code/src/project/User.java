package project;

public class User {
    private String userName;
    private String password;
    private String idCardNumber;
    private String mobileNumber;

    public User() {
    }

    public User(String userName, String password, String idCardNumber, String mobileNumber) {
        this.userName = userName;
        this.password = password;
        this.idCardNumber = idCardNumber;
        this.mobileNumber = mobileNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
