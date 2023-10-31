package Hashing;

import java.util.*;

public class ItineraryForTickets {
    public static void main(String[] args) {
        String tickets[][] = { { "Chennai", "Bengaluru" },
        { "Mumbai", "Delhi" },
        { "Goa", "Chennai" },
        { "Delhi", "Goa" } };

        LinkedHashSet<String> from = new LinkedHashSet<>();
        LinkedHashMap<String, String> to = new LinkedHashMap<>();

        for (int i = 0; i < tickets.length; i++) {
        from.add(tickets[i][0]);
        }
        for (int i = 0; i < tickets.length; i++) {
        to.put(tickets[i][0], tickets[i][1]);
        }

        String start = "";
        for (String ele : from) {
        if (to.containsValue(ele) == false) {
        System.out.print(ele + "->");
        start = ele;
        break;
        }
        }
        while (!to.isEmpty()) {
        if (to.containsKey(start)) {
        System.out.print(to.get(start) + "->");
        String val = to.get(start);
        to.remove(start);
        start = val;
        }
        }

        // String b = (int)('k'-'a')+" "+(int)('f'-'a')+" "+(int)('a'-'a')+"
        // "+(int)('f'-'a')+" "+(int)Math.sqrt((int)'d');
        // if(true){
        // System.out.println(b);

        // }

        
            
        
        
   
         
    }
}
