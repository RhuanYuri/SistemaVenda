public class User {
    private String name;
    private String password;
    private UserType type;

    public User(String name, String password, UserType type){
        this.name = name;
        this.password = password;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public UserType getType(){
        return type;
    }

    public void setType(UserType type){
        this.type = type;
    }

    public boolean validatePassword(String password){
        return this.password.equals(password);
    }
}
