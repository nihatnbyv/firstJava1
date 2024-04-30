package Lesson7;

import java.util.Arrays;

public class Family {
    private Human father;
    private Human mother;
    private Human[] children;
    private Pet pet;

    public Family(Human father, Human mother, Human[] children, Pet pet) {
        this.father = father;
        this.mother = mother;
        this.children = children;
        this.pet = pet;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(Human child) {
        for (int i = 0; i < children.length + 1; i++) {
            this.children[i] = child;
        }
    }

    public void deleteChild(Human child) {
        for (int j = 0; j < children.length - 1; j++) {
            this.children[j] = child;
        }
    }

    @Override
    public String toString() {
        return "Family{" +
                "father=" + father +
                ", mother=" + mother +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }
}
