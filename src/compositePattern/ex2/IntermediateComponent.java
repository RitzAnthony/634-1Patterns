package compositePattern.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: compositePattern.ex2
 * Date: 4/3/2018
 */
public class IntermediateComponent extends NodeComponent {

    public IntermediateComponent(int value) {
        super(value);
    }

    @Override
    public void addChildNode(NodeComponent childNode) {
        this.childs.add(childNode);
    }


}
