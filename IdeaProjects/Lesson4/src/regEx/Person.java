package regEx;

import java.util.regex.Pattern;

public class Person {

    private String name;
    private String email;

    private final String emailRegex = "^(.+)@(.+).com$";
    private final Pattern patter = Pattern.compile(emailRegex);

    public Person(String name, String email) {
        if(!patter.matcher(email).matches()) {
            throw new IllegalArgumentException("Error, Invalid email");
        }
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +  "name = " + name + " , email = " + email + "}";
    }
}
