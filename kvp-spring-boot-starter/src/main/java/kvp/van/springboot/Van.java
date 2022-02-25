package kvp.van.springboot;

public class Van {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Van{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}
