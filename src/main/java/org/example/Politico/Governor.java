package org.example.Politico;

public class Governor extends Politico {

    public String state;
    public int lgaCount;

    public Governor(String name, Party party, int age, String state, int lgaCount) {
        super(name, party, age);
        this.state = state;
        this.lgaCount = lgaCount;
    }

    @Override
    public String toString() {
        return "Governor{" +
                "state='" + state + '\'' +
                ", lgaCount=" + lgaCount +
                ", name='" + name + '\'' +
                ", party='" + party + '\'' +
                ", age=" + age +
                '}';

    }



}