package code.models;

public class Cookie {
    private String name;
    private String taste;
    private Integer calories;
    private String ingredients;

    public Cookie(String name, String taste, Integer calories) {
        this.name = name;
        this.taste = taste;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }


    @Override
    public String toString() {
        return "Cookie{" +
                "name='" + name + '\'' +
                ", taste='" + taste + '\'' +
                ", calories=" + calories +
                ", ingredients xdddd ='" + ingredients + '\'' +
                '}';
    }
}
