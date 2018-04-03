package compositePattern.ex2;

import java.util.ArrayList;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: compositePattern.ex2
 * Date: 4/3/2018
 */
public abstract class NodeComponent {
    private int value;
    protected ArrayList<NodeComponent> childs = new ArrayList<>();

    public NodeComponent(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public abstract void addChildNode (NodeComponent childNode);
}
