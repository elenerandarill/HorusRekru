package net.elener;

public class Main {

    public static void main(String[] args) {
        // creating nodes
        MySimpleNode node1 = new MySimpleNode("code1", "renderer1");
        MySimpleNode node2 = new MySimpleNode("code2", "renderer2");
        MyNode node3 = new MyNode("code3", "renderer3");
        MySimpleNode node3A = new MySimpleNode("code3a", "renderer3a");
        MyNode node3B = new MyNode("code3b", "renderer3b");
        MySimpleNode node3B1 = new MySimpleNode("code3b1", "renderer3b1");

        // adding subNodes to parentNode
        node3.addSubNode(node3A);
        node3.addSubNode(node3B);
        node3B.addSubNode(node3B1);

        // adding parentNodes to myStructure
        MyStructure myStructure = new MyStructure();
        myStructure.addNode(node1);
        myStructure.addNode(node2);
        myStructure.addNode(node3);


        // checking if working properly:
        System.out.println("Nodes count: " + myStructure.count());

        System.out.println("Lookup by code 'code3b1':");
        System.out.println(myStructure.findByCode("code3b1"));
        System.out.println();
        System.out.println("Lookup by renderer 'renderer3b1':");
        System.out.println(myStructure.findByRenderer("renderer3b1"));
        System.out.println();
        System.out.println("Lookup by code 'code3a':");
        System.out.println(myStructure.findByCode("code3a"));
        System.out.println();
        System.out.println("Lookup by renderer 'renderer3b': ");
        System.out.println(myStructure.findByRenderer("renderer3b"));
        System.out.println();
        System.out.println("Lookup by not existing renderer 'renderer5': ");
        System.out.println(myStructure.findByRenderer("renderer5"));


    }
}
