package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class CollectionExample {

    public static void main (String[] args){
        List<String> companies = new ArrayList<String>();

        companies.add("Google");
        companies.add("Amazon");
        companies.add("VMware");
        companies.add("facebook");

        Comparator<String> com = (String o1, String o2) -> o1.compareTo(o2);

        Collections.sort(companies, com);

        for (String name : companies) {
            System.out.println(name);
        }

        Stream<String> st1 = companies.stream();

        st1.sorted().forEach( System.out::println );

    }
}
