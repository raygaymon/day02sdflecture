package sg.edu.nus.iss;

import java.util.LinkedList;

public class LinkedListExample {
    
    public void LinkedListEg() {
        LinkedList<String> linkedlist = new LinkedList<>();
        linkedlist.add("Qiqi");
        linkedlist.add("Hutao");
        linkedlist.add("schwarz");
        linkedlist.add("Mudrock");
        linkedlist.add("Zhongli");

        for (String names : linkedlist) {
            System.out.println(names); 
        }

    }
}

