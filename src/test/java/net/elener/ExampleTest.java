package net.elener;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {
    // by code.
    @Test
    void shouldAddSubNodesToMyNodesList() {
        MyNode nodeParent = new MyNode("c", "r");
        MySimpleNode nodeChild = new MySimpleNode("c2", "r2");

        nodeParent.addSubNode(nodeChild);
        List<INode> listOfNodes = nodeParent.getNodes();

        assertEquals(1, listOfNodes.size());
    }

    @Test
    void shouldFindNodeByCode() {
        MyStructure myStructure = new MyStructure();
        MyNode node1 = new MyNode("code1", "r1");
        MyNode node2 = new MyNode("code2", "r2");

        myStructure.addNode(node1);
        myStructure.addNode(node2);

        INode result = myStructure.findByCode("code1");

        assertEquals("code1", result.getCode());
    }

    @Test
    void shouldFindNodeByRendererInputSameAsOtherCode() {
        MyStructure myStructure = new MyStructure();
        MyNode node1 = new MyNode("code1", "code2");
        MyNode node2 = new MyNode("code2", "r2");

        myStructure.addNode(node1);
        myStructure.addNode(node2);

        INode result = myStructure.findByCode("code2");

        System.out.println(result);
        assertEquals("code2", result.getCode());
    }

    @Test
    void shouldReturnNullFromFindNodeByCodeIfNoResult() {
        MyStructure myStructure = new MyStructure();
        MyNode node1 = new MyNode("code1", "r1");
        MyNode node2 = new MyNode("code2", "r2");

        myStructure.addNode(node1);
        myStructure.addNode(node2);

        INode result = myStructure.findByCode("code3");

        assertNull(result);
    }

    @Test
    void shouldFindNodeByCodeWithDuplicatesReturnsFirst() {
        // recruitment task didn't say what the correct behaviour should be
        // in this case, so I've decided to keep the first result as the right one.
        MyStructure myStructure = new MyStructure();
        MyNode node1 = new MyNode("code1", "r1");
        MyNode node2 = new MyNode("code1", "r2");

        myStructure.addNode(node1);
        myStructure.addNode(node2);

        INode result = myStructure.findByCode("code1");

        assertEquals(node1, result);
    }

    // by renderer
    @Test
    void shouldFindNodeByRenderer() {
        MyStructure myStructure = new MyStructure();
        MyNode node1 = new MyNode("c1", "renderer1");
        MyNode node2 = new MyNode("c2", "renderer2");

        myStructure.addNode(node1);
        myStructure.addNode(node2);

        INode result = myStructure.findByRenderer("renderer1");

        assertEquals("renderer1", result.getRenderer());
    }

    @Test
    void shouldReturnNullFromFindNodeByRendererIfNoResult() {
        MyStructure myStructure = new MyStructure();
        MyNode node1 = new MyNode("c1", "renderer1");
        MyNode node2 = new MyNode("c2", "renderer2");

        myStructure.addNode(node1);
        myStructure.addNode(node2);

        INode result = myStructure.findByRenderer("renderer3");

        assertNull(result);
    }

    @Test
    void shouldFindNodeByRendererWithDuplicatesReturnsFirst() {
        // recruitment task didn't say what the correct behaviour should be
        // in this case, so I've decided to keep the first result as the right one.
        MyStructure myStructure = new MyStructure();
        MyNode node1 = new MyNode("c1", "renderer1");
        MyNode node2 = new MyNode("c2", "renderer1");

        myStructure.addNode(node1);
        myStructure.addNode(node2);

        INode result = myStructure.findByRenderer("renderer1");

        assertEquals(node1, result);
    }

    // general.
    @Test
    void shouldReturnCountOfNodesInMyStructureList() {
        MyStructure myStructure = new MyStructure();
        MyNode node1 = new MyNode("c1", "r1");
        MyNode node2 = new MyNode("c2", "r2");

        myStructure.addNode(node1);
        myStructure.addNode(node2);

        int result = myStructure.count();

        assertEquals(2, result);

    }

    @Test
    void shouldFindSubNodeOfTheParentNodeByCode() {
        MySimpleNode node1 = new MySimpleNode("code1", "renderer1");
        MySimpleNode node2 = new MySimpleNode("code2", "renderer2");
        MyNode node3 = new MyNode("code3", "renderer3");
        MySimpleNode node3A = new MySimpleNode("code3a", "renderer3a");
        MyNode node3B = new MyNode("code3b", "renderer3b");
        MySimpleNode node3B1 = new MySimpleNode("code3b1", "renderer3b1");

        node3.addSubNode(node3A);
        node3.addSubNode(node3B);
        node3B.addSubNode(node3B1);

        MyStructure myStructure = new MyStructure();
        myStructure.addNode(node1);
        myStructure.addNode(node2);
        myStructure.addNode(node3);

        INode result = myStructure.findByCode("code3b1");
        assertEquals("code3b1", result.getCode());

    }
}
