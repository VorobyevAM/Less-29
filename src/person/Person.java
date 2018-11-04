package person;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.Objects;


@JsonAutoDetect
public class Person {

    private boolean sex;

    private int age;

    private String name;

    private String surname;

    private int tabelNumber;

    private int phoneNamber;

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNamber() {
        return phoneNamber;
    }

    public void setPhoneNamber(int phoneNamber) {
        this.phoneNamber = phoneNamber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getTabelNumber() {
        return tabelNumber;
    }

    public void setTabelNumber(int tabelNumber) {
        this.tabelNumber = tabelNumber;
    }

    public Person(boolean sex, int age, String name, String surname, int tabelNumber, int phoneNamber) {
        this.sex = sex;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.tabelNumber = tabelNumber;
        this.phoneNamber = phoneNamber;
    }

    public Person() {
    }



    //------------------------------------------------------------------------------------------------------------------
/*   *//* @Override    public boolean equals(Object obj) {
        if(this == obj) return true;

        if (obj == null||(getClass()!=obj.getClass())) return false;

        Person other = (Person) obj;

        //if (this.name!=other.name) return false;

        if (this.age!=other.age) return false;

        //if (this.sex != other.sex) return false;

        if (this.phoneNamber != other.phoneNamber) return false;

        return true;*//*
    }*/
//---Equals-------------------------------------------------------------------------------------------------------------

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return tabelNumber == person.tabelNumber &&
                phoneNamber == person.phoneNamber;
    }

//---HashCode-----------------------------------------------------------------------------------------------------------

    @Override
    public int hashCode() {
        return Objects.hash(tabelNumber, phoneNamber);
    }



//---toString-----------------------------------------------------------------------------------------------------------

    @Override
    public String toString() {
        return "Person{" +
                "sex=" + sex +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", tabelNumber=" + tabelNumber +
                ", phoneNamber=" + phoneNamber +
                '}';
    }

//----------------------------------------------------------------------------------------------------------------------
}
