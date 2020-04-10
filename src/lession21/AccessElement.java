package lession21;

import java.util.ArrayList;
import java.util.List;
public class AccessElement {

    public static void main(String[] args) {
        List<String> topCompanies = new ArrayList<>();

        //check jf an arrayList is empty.
        System.out.println("Is the topCompanies list empty :?" + topCompanies.isEmpty());

        topCompanies.add("Google");
        topCompanies.add("apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        //Find the size of ArrayList.
        System.out.println("Here are the top" + topCompanies.size() + "companies in the word");
        System.out.println(topCompanies);

        //Retrieve the element at a give index.
        String bestCompany = topCompanies.get(4);
        String secondBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size() - 1);

        System.out.println("Best company : " + bestCompany);
        System.out.println("Second Best Company :" + secondBestCompany);
        System.out.println("Last Company :" + lastCompany);

        //Modify the element at a given index.
        topCompanies.set(3, "Walmart");
        System.out.println("Modified top companies list " + topCompanies);
    }
}
