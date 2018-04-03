package compositePattern.ex2;

import java.util.Optional;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: compositePattern.ex2
 * Date: 4/3/2018
 */
public class NodeComponentTest {
    public static void main(String[] args) {
        //root level
        NodeComponent tree = new IntermediateComponent(1);
        //first level
        tree.addChildNode(new IntermediateComponent(2));
        tree.addChildNode(new IntermediateComponent(3));
        //leaf level
        tree.childs.get(0).addChildNode(new LeafComponent(4));
        tree.childs.get(0).addChildNode(new LeafComponent(5));
        tree.childs.get(1).addChildNode(new LeafComponent(6));
        tree.childs.get(1).addChildNode(new LeafComponent(7));

        //search
        System.out.println(searchNumberRecursively(tree, 6));
    }

    public static int searchNumberRecursively(NodeComponent tree, int searchedValue) {
        int value = -1;
        if (tree.getValue() == searchedValue) return tree.getValue();
        for (NodeComponent node :tree.childs) {
            if ((value = searchNumberRecursively(node, searchedValue)) == searchedValue)
                return value;
        }
        return value;
    }
}
