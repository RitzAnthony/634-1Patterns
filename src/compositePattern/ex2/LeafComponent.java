package compositePattern.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: compositePattern.ex2
 * Date: 4/3/2018
 */
public class LeafComponent extends NodeComponent {

    public LeafComponent(int value) {
        super(value);
    }

    @Override
    public void addChildNode(NodeComponent childNode) {
        //do nothing
    }
}
