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

    public static Linkedlist mergeTwoSortedLists(Linkedlist li, Linkedlist l2){
        Node one = li.head;
        Node two = l2.head;

        Linkedlist res = new Linkedlist();

        while(one != null && two != null){
            if(one.data < two.data){
                res.addLast(one.data);
                one = one.next;
            } else{
                res.addLast(two.data);
                two = two.next;
            }
        }
        
        while(one != null){
            res.addLast(one.data);
            one = one.next;
        }
        
        while(two != null){
            res.addLast(two.data);
            two = two.next;
        }
        
        return res;
    }

    public static Node midNode(Node head, Node tail){
        Node s = head;
        Node f = head;

        while (f != tail && f.next != tail) {
            s = s.next;
            f = f.next.next;
        }

        return s;
    }

    public static Linkedlist mergeSort(Node head, Node tail){
        if(head == tail){
            Linkedlist br = new Linkedlist();
            br.addLast(head.data);
            return br;
        }

        Node mid = midNode(head, tail);
        Linkedlist fsh = mergeSort(head, mid);
        Linkedlist ssh = mergeSort(mid.next, tail);
        Linkedlist cl = mergeTwoSortedLists(fsh, ssh);
        return cl;
    }

    public void removeDuplicates(){
        Linkedlist res = new Linkedlist();

        while(this.size() > 0){
            int val = this.getFirst();
            this.removeFirst();

            if(res.size() == 0 || res.tail.data != val){
                res.addLast(val);
            }
        }

        this.head = res.head;
        this.tail = res.tail;
    }

    public void oddEven(){
        Linkedlist odd = new Linkedlist();
        Linkedlist even = new Linkedlist();

        while(this.size > 0){
            int val = this.getFirst();
            this.removeFirst();

            if(val % 2 == 0){
                even.addLast(val);
            } else{
                odd.addLast(val);
            }
        }

        if(odd.size > 0 && even.size > 0){
            odd.tail.next = even.head;
            this.head = odd.head;
            this.tail = even.tail;
            this.size = odd.size + even.size;
        } else if(odd.size > 0){
            this.head = odd.head;
            this.tail = odd.tail;
            this.size = odd.size;
        } else if(even.size > 0){
            this.head = even.head;
            this.tail = even.tail;
            this.size = even.size;
        }
    }

    public void kReverse(int k) {
        Linkedlist prev = null;

        while(this.size > 0){
            Linkedlist curr = new Linkedlist();

            if(this.size >= k){
                for(int i = 0; i < k; i++){
                    int val = this.getFirst();
                    this.removeFirst();
                    curr.addFirst(val);
                }
            } else {
                int os = this.size;
                for(int i = 0; i < os; i++){
                    int val = this.getFirst();
                    this.removeFirst();
                    curr.addLast(val);
                }
            }

            if(prev == null){
                prev = curr;
            } else {
                prev.tail.next = curr.head;
                prev.tail = curr.tail;
                prev.size += curr.size;
            }
        }
        this.head = prev.head;
        this.tail = prev.tail;
        this.size = prev.size;
    }

    private void displayReverseHelper(Node node){
        if(node == null){
            return;
        }
        displayReverseHelper(node.next);
        System.out.print(node.data + " ");
    }

    public void displayReverse(){
        displayReverseHelper(head);
        System.out.println();
    }

    private void reversePRHelper(Node node){
        if(node == null){
            return;
        }
        reversePRHelper(node.next);

        if(node == tail){
            //Nothing to do...
        } else{
            node.next.next = node;
        }
    }

    public void reversePR(){
        reversePRHelper(head);
        head.next = null;
        Node temp = head;
        head = tail;
        tail = temp;
    }
    }

    // public static void main(String[] args)throws Exception {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     Linkedlist qu = new Linkedlist();

    //     String str = br.readLine();
    //     while(str.equals("quit") == false){
    //         if(str.startsWith("addlast")){
    //             int val = Integer.parseInt(str.split(" ")[1]);
    //             qu.addLast(val);
    //         } else if(str.startsWith("removefirst")){
    //             qu.removeFirst();
    //         } else if(str.startsWith("removelast")){
    //             qu.removeLast();
    //         } else if(str.startsWith("getfirst")){
    //             int val = qu.getFirst();
    //             System.out.println(val);
    //         } else if(str.startsWith("getlast")){
    //             int val = qu.getLast();
    //             System.out.println(val);
    //         } else if(str.startsWith("getat")){
    //             int val = Integer.parseInt(str.split(" ")[1]);
    //             System.out.println(qu.getAt(val)); 
    //         } else if(str.startsWith("removeat")){
    //             int val = Integer.parseInt(str.split(" ")[1]);
    //             qu.removeAt(val); 
    //         } else if(str.startsWith("addfirst")){
    //             int val = Integer.parseInt(str.split(" ")[1]);
    //             qu.addFirst(val);
    //         } else if(str.startsWith("addat")){
    //             int idx = Integer.parseInt(str.split(" ")[1]);
    //             int val = Integer.parseInt(str.split(" ")[2]);
    //             qu.addAt(idx, val);
    //         } else if(str.startsWith("size")){
    //             System.out.println(qu.size());
    //         } else if(str.startsWith("display")){
    //             qu.display();
    //         } else if(str.startsWith("reversedi")){
    //             qu.reverseDI();
    //         } else if(str.startsWith("reversepi")){
    //             qu.reversePI();
    //         } else if(str.startsWith("mid")){
    //             int val = qu.mid();
    //             System.out.println(val);
    //         } else if(str.startsWith("kthfromlast")){
    //             int k = Integer.parseInt(str.split(" ")[1]);
    //             int val = qu.kthFromLast(k);
    //             System.out.println(val); 
    //         } else{
    //             System.out.println("Write only given arguments:\n 1)addlast or addfirst or addat\n 2)removefirst or removelast or rempveat\n 3)getfirst or getlast or getat\n  4)display\n 7)size\n 8)reversedi or reversepi\n 9)kthfromlast 10)mid 11)quit");
    //         }
    //         str = br.readLine();
    //     }
    // }

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

    // Merge two sorted Linked List
    // public static void main(String[] args) throws Exception {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //     int n1 = Integer.parseInt(br.readLine());
    //     Linkedlist l1 = new Linkedlist();
    //     String[] values1 = br.readLine().split(" ");
    //     for(int i = 0; i < n1; i++){
    //         int d= Integer.parseInt(values1[i]);
    //         l1.addLast(d);
    //     }
        
    //     int n2 = Integer.parseInt(br.readLine());
    //     Linkedlist l2 = new Linkedlist();
    //     String[] values2 = br.readLine().split(" ");
    //     for(int i = 0; i < n2; i++){
    //         int d= Integer.parseInt(values2[i]);
    //         l2.addLast(d);
    //     }
        
    //     Linkedlist merged = Linkedlist.mergeTwoSortedLists(l1 , l2);
    //     merged.display();
    //     l1.display();
    //     l2.display();
    // }
    
    // merge sort a list
    // public static void main(String[] args) throws Exception {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //     int n1 = Integer.parseInt(br.readLine());
    //     Linkedlist l1 = new Linkedlist();
    //     String[] values1 = br.readLine().split(" ");
    //     for(int i = 0; i < n1; i++){
    //         int d= Integer.parseInt(values1[i]);
    //         l1.addLast(d);
    //     }
        
    //     Linkedlist fsl = Linkedlist.mergeSort(l1.head, l1.tail);
    //     fsl.display();
    //     l1.display();
    // }

    //Remove duplicate from a sorted list
    // public static void main(String[] args) throws Exception {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //     int n1 = Integer.parseInt(br.readLine());
    //     Linkedlist l1 = new Linkedlist();
    //     String[] values1 = br.readLine().split(" ");
    //     for(int i = 0; i < n1; i++){
    //         int d= Integer.parseInt(values1[i]);
    //         l1.addLast(d);
    //     }
        
    //     l1.display();
    //     l1.removeDuplicates();
    //     l1.display();
    // }
    
    // Odd Even LL
    // public static void main(String[] args) throws Exception {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //     int n1 = Integer.parseInt(br.readLine());
    //     Linkedlist l1 = new Linkedlist();
    //     String[] values1 = br.readLine().split(" ");
    //     for(int i = 0; i < n1; i++){
    //         int d= Integer.parseInt(values1[i]);
    //         l1.addLast(d);
    //     }
        
    //     l1.display();
    //     l1.oddEven();
    //     l1.display();
    // }
    
    //K reverse in LL
    // public static void main(String[] args) throws Exception {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //     int n1 = Integer.parseInt(br.readLine());
    //     Linkedlist l1 = new Linkedlist();
    //     String[] values1 = br.readLine().split(" ");
    //     for(int i = 0; i < n1; i++){
    //         int d= Integer.parseInt(values1[i]);
    //         l1.addLast(d);
    //     }

    //     int k = Integer.parseInt(br.readLine());
    //     int a = Integer.parseInt(br.readLine());
    //     int b = Integer.parseInt(br.readLine());
        
    //     l1.display();
    //     l1.kReverse(k);
    //     l1.display();
    //     l1.addFirst(a);
    //     l1.addLast(b);
    //     l1.display();
    // }

    //Display Reverse LL
    // public static void main(String[] args) throws Exception {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //     int n1 = Integer.parseInt(br.readLine());
    //     Linkedlist l1 = new Linkedlist();
    //     String[] values1 = br.readLine().split(" ");
    //     for(int i = 0; i < n1; i++){
    //         int d= Integer.parseInt(values1[i]);
    //         l1.addLast(d);
    //     }

    //     l1.display();
    //     l1.displayReverse();
    //     l1.addLast(111);
    //     l1.addFirst(222);
    //     l1.display();
    // }

    //reverse LL by pointer - recursive
    // public static void main(String[] args) throws Exception {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //     int n1 = Integer.parseInt(br.readLine());
    //     Linkedlist l1 = new Linkedlist();
    //     String[] values1 = br.readLine().split(" ");
    //     for(int i = 0; i < n1; i++){
    //         int d= Integer.parseInt(values1[i]);
    //         l1.addLast(d);
    //     }

    //     l1.display();
    //     l1.reversePR();
    //     l1.addLast(111);
    //     l1.addFirst(222);
    //     l1.display();
    // }

    // Queue to Stack Adapter - pop efficient
    public static class QueueToStackAdapter {
        Queue<Integer> mainQ;
        Queue<Integer> helperQ;

        public QueueToStackAdapter(){
            mainQ = new ArrayDeque<>();
            helperQ = new ArrayDeque<>();
        }

        int size() {
            return mainQ.size();
        }

        void push(int val){
            while(mainQ.size() > 0){
                helperQ.add(mainQ.remove());
            }
            mainQ.add(val);

            while (helperQ.size() > 0) {
                mainQ.add(helperQ.remove());
            }
        }

        int pop() {
            if(size() == 0){
                System.out.println("Stack Underflow");
                return -1;
            } else{
                return mainQ.remove();
            }
        }

        int top() {
            if(size() == 0){
                System.out.println("Stack Underflow");
                return -1;
            } else{
                return mainQ.peek();
            }
        }
        
    }

    // public static void main(String[] args) throws Exception {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     QueueToStackAdapter st = new QueueToStackAdapter();

    //     String str = br.readLine();
    //     while(str.equals("quit") == false){
    //         if(str.startsWith("push")){
    //             int val = Integer.parseInt(str.split(" ")[1]);
    //             st.push(val);
    //         } else if(str.startsWith("pop")){
    //             int val = st.pop();
    //             if(val != -1){
    //                 System.out.println(val);
    //             }
    //         } else if(str.startsWith("top")){
    //             int val = st.top();
    //             if(val != -1){
    //                 System.out.println(val);
    //             }
    //         } else if(str.startsWith("size")){
    //             System.out.println(st.size());
    //         } else{
    //             System.out.println("Invalid arguments");
    //         }
    //         str = br.readLine();
    //     }
    // }

    






}
