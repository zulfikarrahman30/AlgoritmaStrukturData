
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class DoubleLinkedListMain {
    public static void main(String[] args){
        try {
            DoubleLinkedList dll = new DoubleLinkedList();
//            dll.addLast(50);
//            dll.addLast(40);
//            dll.addLast(10);
//            dll.addLast(20);
            dll.print();
            System.out.println("Size: "+dll.size());
            System.out.println("=================================================");
            dll.addFirst(3);
            dll.addLast(4);
            dll.addFirst(7);
            dll.removeFirst();
            dll.print();
            System.out.println("Size: "+dll.size());
            System.out.println("=================================================");
            dll.add(40, 1);
            dll.removeLast();
            dll.print();
            System.out.println("Size: "+dll.size());
            System.out.println("=================================================");
            //dll.clear();
//            dll.remove(1);
//            dll.print();
//            System.out.println("Size: "+dll.size());
            System.out.println("Data awal pada Linked list adalah: "+dll.getFirst());
            System.out.println("Data akhir pada Linked list adalah: "+dll.getLast());
            System.out.println("Data indeks ke-1 pada Linked list adalah: "+dll.get(1));
        } catch (Exception ex) {
            Logger.getLogger(DoubleLinkedListMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
