package prototype;

public class Horse implements Cloneable {
    private String name;
    private int age;
    private prototype.Animal animal;

    public Horse(String name, int age, prototype.Animal animal) {
        this.name = name;
        this.age = age;
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public prototype.Animal getAnimal() {
        return animal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAnimal(prototype.Animal animal) {
        this.animal = animal;
    }

    @Override
    public Horse clone() throws CloneNotSupportedException {
        return (Horse) super.clone();
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", animal='" + animal + '\'' +
                '}';
    }

    public Horse cloneHorse() {
        try {
            return (Horse) this.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
