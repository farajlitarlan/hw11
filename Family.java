package happyfamily;


import happyfamily.abstracts.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Family {

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public Set <Pet> getPet() {
        return pet;
    }

    public void setPet(Set <Pet> pet) {
        this.pet = pet;
    }

    private Human mother;
    private Human father;
    private List<Human> children;
    private Set<Pet> pet;


    public Family(Human mother, Human father) {
        this.pet = getPet();
        this.mother = mother;
        this.father = father;
        this.children = new ArrayList<>();
        father.setFamily(this);
        mother.setFamily(this);
    }


    public void addChild(Human child) {
        children.add(child);
    }
    public void addPet(Pet pet){this.pet.add(pet);}

    public void deleteChild(int index){
        if (index < getChildren().size() && index>=0){
            getChildren().remove(index);

        }
        else{
            System.out.println("Operation Failed!");
        }


    }
    public int countFamily() {
        return 2 + this.children.size();

    }




    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + children +
                ", pet=" + pet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return mother.equals(family.mother) && father.equals(family.father) && Objects.equals(children, family.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father, children);
    }

    @Override
    protected void finalize() {
        System.out.printf("%s and %s", getFather().getName(), getMother().getName());

    }
}
