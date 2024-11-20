package kr.hs.sdh.toast.entity;

public class Customer {

    private final String id;
    private final String password;
    private final String alias;
    private People people;

    public Customer(String id, String password, String alias) {
        this.id = id;
        this.password = password;
        this.alias = alias;
    }


    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getAlias() {
        return alias;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public  People getPeople() {
        return people;
    }

}
