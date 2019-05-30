package com.raywuBinarySearchTree;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        //System.out.println("Please enter your tools: ");
        Scanner Tools = new Scanner(System.in);
        ArrayList<String> ToolsArray = new ArrayList<String>();              //used an Array list
        String enter;
        int i = 0;
        while (i < 4) {
            System.out.println("Please enter a Tool: ");             //the entering of the tools
            enter = Tools.next();
            ToolsArray.add(enter);
            i++;
        }
        System.out.println();
        Scanner Toolsprice = new Scanner(System.in);
        ArrayList<String> PriceTools = new ArrayList<String>();              //used an Array list
        String next;
        int k = 0;
        while (k < 4) {
            System.out.println("Please enter tools price : ");             //the entering of the building supplies
            next = Toolsprice.next();
            PriceTools.add(next);
            k++;
        }
        System.out.println();
        Scanner Building = new Scanner(System.in);
        ArrayList<String> BuildingArray = new ArrayList<String>();              //used an Array list
        String in;
        int j = 0;
        while (j < 4) {
            System.out.println("Please enter Building supplies: ");             //the entering of the building supplies
            in = Building.next();
            BuildingArray.add(in);
            j++;
        }
        System.out.println();
        Scanner BuildingPrice = new Scanner(System.in);
        ArrayList<String> PriceBuilding = new ArrayList<String>();              //used an Array list
        String input;
        int l = 0;
        while (l < 4) {
            System.out.println("Please enter Building supply price: ");        //the entering of the building supplies
            input = BuildingPrice.next();
            PriceBuilding.add(input);
            l++;
        }
        // this is where the different data structures are pulling different elements to match each other
        // than it will print it on what case is chosen
        int x;
        x = 0;
        while (x < 8) {
            System.out.println();
            System.out.println("enter 1,2,3,4 for tools and prices: ");
            System.out.println("or 5,6,7,8 for the building supply and prices: ");
            System.out.println("press 9 rating system ");
            System.out.println("press 10 a log for last entered choice: ");
            System.out.println("If user wants to end program press 0: ");
            Scanner Option = new Scanner(System.in);
            int first = Option.nextInt();
            switch (first) {
                case 0:
                    return;
                case 1:
                    Queue<String> toolsQueue;                           // Queue list
                    toolsQueue = new LinkedList<>();
                    toolsQueue.add(ToolsArray.get(0));
                    toolsQueue.add(String.valueOf(PriceTools.get(0)));

                    System.out.println("The item and price is: " + toolsQueue);
                    break;
                case 2:
                    toolsQueue = new LinkedList<>();
                    toolsQueue.add(ToolsArray.get(1));
                    toolsQueue.add(String.valueOf(PriceTools.get(1)));
                    System.out.println("The item and price is: " + toolsQueue);
                    break;
                case 3:
                    toolsQueue = new LinkedList<>();
                    toolsQueue.add(ToolsArray.get(2));
                    toolsQueue.add(String.valueOf(PriceTools.get(2)));
                    System.out.println("The item and price is: " + toolsQueue);
                    break;
                case 4:
                    toolsQueue = new LinkedList<>();
                    toolsQueue.add(ToolsArray.get(3));
                    toolsQueue.add(String.valueOf(PriceTools.get(3)));
                    System.out.println("The item and price is: " + toolsQueue);
                    break;
                case 5:
                    Stack Buildingsupply = new Stack();                // stack
                    Buildingsupply.add(BuildingArray.get(0));
                    Buildingsupply.add(PriceBuilding.get(0));
                    System.out.println("The item and price is: " + Buildingsupply);
                    break;
                case 6:
                    LinkedList ll = new LinkedList();
                    ll.add(BuildingArray.get(1));                      // LinkedList
                    ll.add(PriceBuilding.get(1));
                    System.out.println("The item and price is: " + ll);
                    break;
                case 7:
                    LinkedList jj = new LinkedList();                   //LinkedList
                    jj.add(BuildingArray.get(2));
                    jj.add(PriceBuilding.get(2));
                    System.out.println("The item and price is: " + jj);
                    break;
                case 8:
                    Stack bb = new Stack();                         //stack
                    bb.add(BuildingArray.get(3));
                    bb.add(PriceBuilding.get(3));
                    System.out.println("The item and price is: " + bb);
                    break;

                case 9://bubble sort all items used for a rating system
                {
                    Scanner bubble = new Scanner(System.in);
                    int a, b, c, change;
                    System.out.println("ratings system of this program  ");
                    a = (3);
                    int array[] = new int[a];
                    System.out.println("Enter a rating for each category: ");

                    System.out.println("The category's are how was the interaction, how did this help, and how was your experience : ");

                    System.out.println("Enter a number any where from 1-5 5 being Great and 1 not so good:");

                    for (c = 0; c < a; c++) {
                        array[c] = bubble.nextInt();
                    }

                    for (c = 0; c < (a - 1); c++) {
                        for (b = 0; b < a - c - 1; b++) {
                            if (array[b] > array[b + 1]) {
                                change = array[b];
                                array[b] = array[b + 1];
                                array[b + 1] = change;
                            }
                        }
                    }
                    System.out.println("Sorted list of numbers");
                    for (c = 0; c < a; c++) {
                        LinkedList done = new LinkedList(Arrays.asList(c));
                        done.add(array[c]);
                        System.out.println(done);
                    }
                }

        //binary tree actions are too log the last 2 choices user entered
                case 10:
                    class BSTNode
                    {
                        BSTNode left, right;
                        int data;

                        public BSTNode()
                        {
                            left = null;
                            right = null;
                            data = 0;
                        }

                        public BSTNode(int n)
                        {
                            left = null;
                            right = null;
                            data = n;
                        }
                        /* Function to set left node */
                        public void setLeft(BSTNode n)
                        {
                            left = n;
                        }
                        /* Function to set right node */
                        public void setRight(BSTNode n)
                        {
                            right = n;
                        }
                        /* Function to get left node */
                        public BSTNode getLeft()
                        {
                            return left;
                        }
                        /* Function to get right node */
                        public BSTNode getRight()
                        {
                            return right;
                        }
                        /* Function to set data to node */
                        public void setData(int d)
                        {
                            data = d;
                        }
                        /* Function to get data from node */
                        public int getData()
                        {
                            return data;
                        }
                    }
                    /* Class BST */
                    class BST
                    {
                        private BSTNode root;
                        /* Constructor */
                        public BST()
                        {
                            root = null;
                        }
                        /* Function to check if tree is empty */
                        public boolean isEmpty()
                        {
                            return root == null;
                        }
                        /* Functions to insert data */
                        public void insert(int data)
                        {
                            root = insert(root, data);
                        }
                        /* Function to insert data recursively */
                        private BSTNode insert(BSTNode node, int data)
                        {
                            if (node == null)
                                node = new BSTNode(data);
                            else
                            {
                                if (data <= node.getData())
                                    node.left = insert(node.left, data);
                                else
                                    node.right = insert(node.right, data);
                            }
                            return node;
                        }
                        /* Functions to delete data */
                        public void delete(int k)
                        {
                            if (isEmpty())
                                System.out.println("Tree Empty");
                            else if (search(k) == false)
                                System.out.println("Sorry "+ k +" is not present");
                            else
                            {
                                root = delete(root, k);
                                System.out.println(k+ " deleted from the tree");
                            }
                        }
                        private BSTNode delete(BSTNode root, int k)
                        {
                            BSTNode p, p2, n;
                            if (root.getData() == k)
                            {
                                BSTNode lt, rt;
                                lt = root.getLeft();
                                rt = root.getRight();
                                if (lt == null && rt == null)
                                    return null;
                                else if (lt == null)
                                {
                                    p = rt;
                                    return p;
                                }
                                else if (rt == null)
                                {
                                    p = lt;
                                    return p;
                                }
                                else
                                {
                                    p2 = rt;
                                    p = rt;
                                    while (p.getLeft() != null)
                                        p = p.getLeft();
                                    p.setLeft(lt);
                                    return p2;
                                }
                            }
                            if (k < root.getData())
                            {
                                n = delete(root.getLeft(), k);
                                root.setLeft(n);
                            }
                            else
                            {
                                n = delete(root.getRight(), k);
                                root.setRight(n);
                            }
                            return root;
                        }
         /* Functions to count number of nodes */
                        public int countNodes()
                        {
                            return countNodes(root);
                        }
         /* Function to count number of nodes recursively */
                        private int countNodes(BSTNode r)
                        {
                            if (r == null)
                                return 0;
                            else
                            {
                                int l = 1;
                                l += countNodes(r.getLeft());
                                l += countNodes(r.getRight());
                                return l;
                            }
                        }
         /* Functions to search for an element */
                        public boolean search(int val)
                        {
                            return search(root, val);
                        }
         /* Function to search for an element recursively */
                        private boolean search(BSTNode r, int val)
                        {
                            boolean found = false;
                            while ((r != null) && !found)
                            {
                                int rval = r.getData();
                                if (val < rval)
                                    r = r.getLeft();
                                else if (val > rval)
                                    r = r.getRight();
                                else
                                {
                                    found = true;
                                    break;
                                }
                                found = search(r, val);
                            }
                            return found;
                        }
         /* Function for inorder traversal */
                        public void inorder()
                        {
                            inorder(root);
                        }
                        private void inorder(BSTNode r)
                        {
                            if (r != null)
                            {
                                inorder(r.getLeft());
                                System.out.print(r.getData() +" ");
                                inorder(r.getRight());
                            }
                        }
         /* Function for preorder traversal */
                        public void preorder()
                        {
                            preorder(root);
                        }
                        private void preorder(BSTNode r)
                        {
                            if (r != null)
                            {
                                System.out.print(r.getData() +" ");
                                preorder(r.getLeft());
                                preorder(r.getRight());
                            }
                        }
         /* Function for postorder traversal */
                        public void postorder()
                        {
                            postorder(root);
                        }
                        private void postorder(BSTNode r)
                        {
                            if (r != null)
                            {
                                postorder(r.getLeft());
                                postorder(r.getRight());
                                System.out.print(r.getData() +" ");
                            }
                        }
                    }
     /* Class BinarySearchTree */
                            Scanner scan = new Scanner(System.in);
            /* Creating object of BST */
                            BST bst = new BST();
                            System.out.println("Binary Search Tree Test\n");
                            char ch;
            /*  Perform tree operations  */
                            do

                            {
                                System.out.println("\nBinary Search Tree Operations\n");

                                System.out.println("1. insert log of last 2 entered choices");
                                System.out.println("2. delete log");
                                System.out.println("3. check empty");

                                int choice = scan.nextInt();
                                switch (choice)
                                {
                                    case 1 :
                                        System.out.println("log of last 2 choices: ");
                                            bst.insert(first);
                                            bst.insert(choice);
                                        break;
                                    case 2 :
                                        System.out.println("Enter integer element to delete");
                                        bst.delete( scan.nextInt() );
                                        break;

                                    case 3 :
                                        System.out.println("Empty status = "+ bst.isEmpty());
                                        break;
                                    default :
                                        System.out.println("Wrong Entry \n ");
                                        break;
                                }

                /*  Display tree  */

                                System.out.print("\nPost order : ");

                                bst.postorder();


                                System.out.println("\nDo you want to continue (Type y or n) \n");

                                ch = scan.next().charAt(0);
                            } while (ch == 'Y'|| ch == 'y');
            }

        }
    }
}