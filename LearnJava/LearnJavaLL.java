package LearnJava;

import java.util.*;

import java.io.*;

public class LearnJavaLL {
    //LinkedList Introduction
    public static class Node {
        int data;
        Node next;
    }

    public static class Linkedlist {
    Node head;
    Node tail;
    int size;

    public int size(){
        return size;
    }

    public void addFirst(int val){
        Node temp = new Node();
        temp.data = val;
        temp.next = head;
        head = temp;
        if(size == 0){
            tail = temp;
        }
        size++;
    }

    public void addLast(int val){
        Node temp = new Node();
        temp.data = val;
        temp.next = null;

        if(size == 0) {
            head = tail = temp;
        } else{
            tail.next = temp;
            tail = temp;
        }

        size++;
    }

    public void addAt(int idx, int val){
        if(idx < 0 || idx > size){
            System.out.println("Invalid Arguments");
        } else if(idx == 0){
            addFirst(val);
        } else if(idx == size){
            addLast(val);
        } else{
            Node node = new Node();
            node.data = val;

            Node temp = head;
            for(int i = 0; i < idx - 1; i++){
                temp = temp.next;
            }

            node.next = temp.next;
            temp.next = node;

            size++;
        }
    }

    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
        
    public void removeFirst(){
        if(size == 0){
            System.out.println("List is empty");
        } else if(size == 1){
            head = tail = null;
            size--;
        } else{
            head = head.next;
            size--;
        }
    }

    public void removeLast(){
        if(size == 0){
            System.out.println("List is empty");
        } else if(size == 1){
            head = tail = null;
            size--;
        } else{
            Node temp = head;
            for(int i =0; i < size - 2; i++){
                temp = temp.next;
            }

            tail = temp;
            temp.next = null;
            size--;
        }
    }

    public void removeAt(int idx){
        if(idx < 0 || idx >= size){
            System.out.println("Invalid arguments");
        } else if(idx == 0){
            removeFirst();
        } else if(idx == size - 1){
            removeLast();
        } else{
            Node temp = head;
            for(int i = 0; i < idx - 1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }

    public int getFirst(){
        if(size == 0){
            System.out.println("List is empty");
            return -1;
        } else{
            return head.data;
        }
    }

    public int getLast(){
        if(size == 0){
            System.out.println("List id empty");
            return -1;
        } else{
            return tail.data;
        }
    }

    public int getAt(int idx){
        if(size == 0){
            System.out.println("List is empty");
            return -1;
        } else if(idx < 0 || idx >= size){
            System.out.println("Invalid arguments");
            return -1;
        } else{
            Node temp = head;
            for(int i = 0; i < idx; i++){
                temp = temp.next;
            }
            return temp.data;
        }
    }

    private Node getNodeAt(int idx){
        Node temp = head;
        for(int i = 0; i < idx; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void reverseDI(){
        int li = 0;
        int ri = size - 1;

        while(li < ri){
            Node left = getNodeAt(li);
            Node right = getNodeAt(ri);

            int temp = left.data;
            left.data = right.data;
            right.data = temp;

            li++;
            ri--;
        }
    }

    public void reversePI(){
        Node prev = null;
        Node curr = head;

        while(curr != null){
            Node nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        Node temp = head;
        head = tail;
        tail = temp;
    }

    public int kthFromLast(int k) {
        Node s = head;
        Node f = head;

        for(int i = 0; i < k; i++){
            f = f.next;
        }

        while(f != tail){
            s = s.next;
            f = f.next;
        }

        return s.data;
    }

    public int mid(){
        Node s = head;
        Node f = head;

        while (f.next != null && f.next.next != null) {
            s = s.next;
            f = f.next.next;
        }

        return s.data;
    }

    }

    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Linkedlist qu = new Linkedlist();

        String str = br.readLine();
        while(str.equals("quit") == false){
            if(str.startsWith("addlast")){
                int val = Integer.parseInt(str.split(" ")[1]);
                qu.addLast(val);
            } else if(str.startsWith("removefirst")){
                qu.removeFirst();
            } else if(str.startsWith("removelast")){
                qu.removeLast();
            } else if(str.startsWith("getfirst")){
                int val = qu.getFirst();
                System.out.println(val);
            } else if(str.startsWith("getlast")){
                int val = qu.getLast();
                System.out.println(val);
            } else if(str.startsWith("getat")){
                int val = Integer.parseInt(str.split(" ")[1]);
                System.out.println(qu.getAt(val)); 
            } else if(str.startsWith("removeat")){
                int val = Integer.parseInt(str.split(" ")[1]);
                qu.removeAt(val); 
            } else if(str.startsWith("addfirst")){
                int val = Integer.parseInt(str.split(" ")[1]);
                qu.addFirst(val);
            } else if(str.startsWith("addat")){
                int idx = Integer.parseInt(str.split(" ")[1]);
                int val = Integer.parseInt(str.split(" ")[2]);
                qu.addAt(idx, val);
            } else if(str.startsWith("size")){
                System.out.println(qu.size());
            } else if(str.startsWith("display")){
                qu.display();
            } else if(str.startsWith("reversedi")){
                qu.reverseDI();
            } else if(str.startsWith("reversepi")){
                qu.reversePI();
            } else if(str.startsWith("mid")){
                int val = qu.mid();
                System.out.println(val);
            } else if(str.startsWith("kthfromlast")){
                int k = Integer.parseInt(str.split(" ")[1]);
                int val = qu.kthFromLast(k);
                System.out.println(val); 
            } else{
                System.out.println("Write only given arguments:\n 1)addlast or addfirst or addat\n 2)removefirst or removelast or rempveat\n 3)getfirst or getlast or getat\n  4)display\n 7)size\n 8)reversedi or reversepi\n 9)kthfromlast 10)mid 11)quit");
            }
            str = br.readLine();
        }
    }

    // Linked list to Stack adapter (unncomment import too!)
    // public class Main {
    //     public static class LLtoStackAdapter {
    //         LinkedList<Integer> list;

    //         public LLtoStackAdapter() {
    //             list = new LinkedList<>();
    //         }

    //         int size() {
    //             return list.size();
    //         }

    //         void push(int val){
    //             list.addFirst(val);
    //         }

    //         int pop() {
    //             if(size() == 0){
    //                 System.out.println("Stack Underflow");
    //                 return -1;
    //             } else{
    //                 return list.removeFirst();
    //             }
    //         }

    //         int top() {
    //             if(size() == 0){
    //                 System.out.println("Stack Underflow");
    //                 return -1;
    //             } else{
    //                 return list.getFirst();
    //             }
    //         }

    //     }
    // }

    // public static void main(String[] args) throws Exception {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     LLtoStackAdapter st = new LLtoStackAdapter();

    //     String str = br.readLine();
    //     while(str.equals("quit") == false){
    //         if(str.startsWith("push")){
    //             int val = Integer.parseInt(str.split(" ")[1]);
    //             st.push(val);
    //         } else if(str.equals("pop")){
    //             int x = st.pop();
    //             System.out.println(x);
    //         } else if(str.equals("size")){
    //             int x = st.size();
    //             System.out.println(x);
    //         } else if(str.equals("top")){
    //             int x = st.top();
    //             System.out.println(x);
    //         } else{
    //             System.out.println("Invalid Argument");
    //         }
    //         str = br.readLine();
    //     }

    // } 
    
    //Linked list to Queue Adapter
    // public static class LLtoQueueAdapter{
    //     LinkedList<Integer> list;

    //     public LLtoQueueAdapter() {
    //             list = new LinkedList<>();
    //         }

    //         int size() {
    //             return list.size();
    //         }

    //         void push(int val){
    //             list.addLast(val);
    //         }

    //         int pop() {
    //             if(size() == 0){
    //                 System.out.println("Stack Underflow");
    //                 return -1;
    //             } else{
    //                 return list.removeFirst();
    //             }
    //         }

    //         int top() {
    //             if(size() == 0){
    //                 System.out.println("Stack Underflow");
    //                 return -1;
    //             } else{
    //                 return list.getFirst();
    //             }
    //         }
    //     }
    

    // public static void main(String[] args) throws Exception {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     LLtoQueueAdapter st = new LLtoQueueAdapter();

    //     String str = br.readLine();
    //     while(str.equals("quit") == false){
    //         if(str.startsWith("push")){
    //             int val = Integer.parseInt(str.split(" ")[1]);
    //             st.push(val);
    //         } else if(str.equals("pop")){
    //             int x = st.pop();
    //             System.out.println(x);
    //         } else if(str.equals("size")){
    //             int x = st.size();
    //             System.out.println(x);
    //         } else if(str.equals("top")){
    //             int x = st.top();
    //             System.out.println(x);
    //         } else{
    //             System.out.println("Invalid Argument");
    //         }
    //         str = br.readLine();
    //     }

    // } 

}
