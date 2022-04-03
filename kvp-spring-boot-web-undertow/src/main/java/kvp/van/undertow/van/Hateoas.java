package kvp.van.undertow.van;

public class Hateoas {
    private String prefix;
    private String name;

    public Hateoas(String prefix, String name) {
        this.prefix = prefix;
        this.name = name;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hateoas{" +
            "prefix='" + prefix + '\'' +
            ", name='" + name + '\'' +
            '}';
    }
}
