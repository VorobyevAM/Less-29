package person;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import java.util.ArrayList;
@JsonAutoDetect
public class PersonReestr {

    public PersonReestr() {
    }

    public ArrayList<Person> getPersonArrayList() {
        return personArrayList;
    }

    public void setPersonArrayList(ArrayList<Person> personArrayList) {
        this.personArrayList = personArrayList;
    }

    private ArrayList<Person> personArrayList = new ArrayList<>();

    public void addPersonInReestr(Person person){
        personArrayList.add(person);
    }

    public void getAllPerson(){

        for (Person person:personArrayList) {
            System.out.println(person);
        }

    }

    public int size(){
        int i = 0;
        for (Person person:personArrayList) {
            i++;
        }
        return i;
    }

    @Override
    public String toString() {
        return "PersonReestr{" +
                "personArrayList=" + personArrayList +
                '}';
    }

    public void findUnuniqePerson(){
        for (int i = 0; i < personArrayList.size(); i++) {
            for (int j = i+1; j < personArrayList.size(); j++) {
                if (getPerson(i).equals(getPerson(j))){
                    System.out.println("Обнаружено совпадение в реестре. А именно:" + getPerson(i) + " записи и " + getPerson(j) + " записи.");
                }
            }

        }
    }

    public Person getPerson(int personNumberInArray){
        return personArrayList.get(personNumberInArray);
    }

}
