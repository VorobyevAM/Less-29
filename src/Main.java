import com.fasterxml.jackson.databind.ObjectMapper;
import person.Person;
import person.PersonReestr;

import java.io.*;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    private static PersonReestr personReestr = new PersonReestr();

    public static void main(String[] args) throws IOException {


        File file = new File("people.txt");

        if (!file.createNewFile()){
            try {
                personReestr = objectMapper.readValue(file, PersonReestr.class);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }else{
            personReestr.addPersonInReestr(new Person(choesBoolean(), choesInt(),
                    choesString(), choesString(), choesInt(), choesInt()));
        }

        //

        personReestr.getAllPerson();

        personReestr.findUnuniqePerson();

        reestrToHashMap(personReestr);

        objectMapper.writeValue(file, personReestr);

        //personReestr.save();



    }

    private static boolean choesBoolean(){
        Scanner scanner = new Scanner(System.in);
        boolean s = false;
        try {
             s = scanner.nextBoolean();
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
        return s;
    }

    private static String choesString(){
        Scanner scanner = new Scanner(System.in);
        String s = null;
        try{
            s = scanner.next();
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
        return s;
    }

    private static int choesInt(){
        Scanner scanner = new Scanner(System.in);
        int s = 0;
        try{
            s = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
        return s;
    }

    private static void reestrToHashMap(PersonReestr personReestr){

        HashMap<Integer,Person> personHashMap = new HashMap<>();

        for (Person person:personReestr.getPersonArrayList()) {
            System.out.println("Хэшмап записи реестра " + person + " = " +  person.hashCode());
            personHashMap.put(person.getPhoneNamber(), person);
        }

        System.out.println(personHashMap.toString());
        System.out.println("Количество записей в хэшмапу " + personHashMap.size());
        System.out.println("Количество записей в реестре " + personReestr.size());
    }

}
