package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {



    //Creating a list of students
    ArrayList<Student> al=new ArrayList<Student>();
al.add(new Student(101,"Vijay",23));
al.add(new Student(106,"Ajay",27));
al.add(new Student(105,"Jai",21));

System.out.println("Sorting by Name");
//Using NameComparator to sort the elements
Collections.sort(al,new Sortbyname());
//Traversing the elements of list
for(Student st: al){
        System.out.println(st.rollno+" "+st.name+" "+st.age);
    }

System.out.println("sorting by Age");
//Using AgeComparator to sort the elements
Collections.sort(al,new Sortbyage());
//Travering the list again
for(Student st: al){
        System.out.println(st.rollno+" "+st.name+" "+st.age);
    }

}}