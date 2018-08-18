public class Cat {

    static final String ANIMAL_FAMILY = "feline";
    private String name;
    private String type;
    private boolean domesticated = true;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isDomesticated() {
        return domesticated;
    }
}
