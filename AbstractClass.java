public abstract class AbstractClass {
    private String name;

    public AbstractClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person p1 = (Person) o;
        return hashCode() == p1.hashCode();
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}