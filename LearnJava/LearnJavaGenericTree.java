package LearnJava;

import java.util.*;

import java.io.*;


public class LearnJavaGenericTree {
    //Introduction to Generic Tree
    private static class Node {
        int data;
        ArrayList <Node> children = new ArrayList<>();
    }

    public static void display(Node node){
        String str = node.data + "->";
        for(Node child: node.children){
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for(Node child: node.children){
            display(child);
        }
    }

    //size of generic tree
    public static int size(Node node){
        int s = 0;
        for(Node child: node.children){
            int cs = size(child);
            s = s + cs;
        }
        return s + 1;
    }

    public static int max(Node node){
        int m = Integer.MIN_VALUE;
        for(Node child: node.children){
            int cm = max(child);
            m = Math.max(m, cm);
        }
        m = Math.max(m, node.data);
        return m;
    }

    public static Node construct(int[] arr){
        Node root = null;
        Stack<Node> st = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == -1){
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];

                if(st.size() > 0){
                    st.peek().children.add(t);
                } else {
                    root = t;
                }

                st.push(t);
            }
        }
        return root;
    }

    public static int height(Node node){
        int h = -1;
        for(Node child: node.children){
            int ch = height(child);
            h = Math.max(h, ch);
        }
        h = h + 1;
        return h;
    }

    public static void transverse(Node node){
        System.out.println("pre " +node.data);
        for(Node child: node.children){
            System.out.println("Edge pre " + child.data);
            transverse(child);
            System.out.println("Edge post " + child.data);
        }
        System.out.println("post " + node.data);
    }

    public static void levelOrder(Node node){
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);

        while(q.size() > 0){
            int count = q.size();
            for(int i = 0; i < count; i++){
                node = q.remove();
                System.out.print(node.data + " ");
                for(Node child: node.children){
                    q.add(child);
                }
            }
            System.out.print(".");
        }
    }

    public static void levelOrderLinewise(Node node){
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(node);

        Queue<Node> cq = new ArrayDeque<>();

        while(mq.size() > 0){
            node = mq.remove();
            System.out.print(node.data + " ");
            for(Node child: node.children){
                cq.add(child);
            }

            if(mq.size() == 0){
                mq = cq;
                cq = new ArrayDeque<>();
                System.out.println();
            }
        }
    }

    // public static void main(String[] args) throws Exception {
    //     int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
            
    //     Node root = null;
    //     Stack<Node> st = new Stack<>();
    //     for(int i = 0; i < arr.length; i++){
    //         if(arr[i] == -1){
    //             st.pop();
    //         } else {
    //             Node t = new Node(); //giving err.. don't know why!?
    //             t.data = arr[i];

    //             if(st.size() > 0){
    //                 st.peek().children.add(t);
    //             } else {
    //                 root = t;
    //             }

    //             st.push(t);
    //         }
    //     }
    //     display(root);
    //     System.out.println(size(root));
    // }

    // public  static void main(String[] args) throws Exception {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     int n = Integer.parseInt(br.readLine());
    //     int[] arr = new int[n];
    //     String[] values = br.readLine().split(" ");
    //     for (int i = 0; i < n; i++) {
    //         arr[i] = Integer.parseInt(values[i]);
    //     }

    //     Node root = construct(arr);
    //     int m = max(root);
    //     System.out.println(m);
    // }

    //height of generic tree
    // public  static void main(String[] args) throws Exception {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     int n = Integer.parseInt(br.readLine());
    //     int[] arr = new int[n];
    //     String[] values = br.readLine().split(" ");
    //     for (int i = 0; i < n; i++) {
    //         arr[i] = Integer.parseInt(values[i]);
    //     }

    //     Node root = construct(arr);
    //     int m = height(root);
    //     System.out.println(m);
    // }

    //Transverse of a generic tree
    // public  static void main(String[] args) throws Exception {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     int n = Integer.parseInt(br.readLine());
    //     int[] arr = new int[n];
    //     String[] values = br.readLine().split(" ");
    //     for (int i = 0; i < n; i++) {
    //         arr[i] = Integer.parseInt(values[i]);
    //     }

    //     Node root = construct(arr);
    //     transverse(root);
    // }

    //Level order traversal of a generic tree
    // public  static void main(String[] args) throws Exception {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     int n = Integer.parseInt(br.readLine());
    //     int[] arr = new int[n];
    //     String[] values = br.readLine().split(" ");
    //     for (int i = 0; i < n; i++) {
    //         arr[i] = Integer.parseInt(values[i]);
    //     }

    //     Node root = construct(arr);
    //     levelOrder(root);
    // }

    //Level order linewise of a generic tree
    // public  static void main(String[] args) throws Exception {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     int n = Integer.parseInt(br.readLine());
    //     int[] arr = new int[n];
    //     String[] values = br.readLine().split(" ");
    //     for (int i = 0; i < n; i++) {
    //         arr[i] = Integer.parseInt(values[i]);
    //     }

    //     Node root = construct(arr);
    //     levelOrderLinewise(root);
    // }

    






}
