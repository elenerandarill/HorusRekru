package net.elener;

import java.util.ArrayList;
import java.util.List;

public class MyStructure implements IMyStructure {
    private List<INode> nodes = new ArrayList<>();

    public void addNode(INode node){
        nodes.add(node);
    }

    @Override
    public INode findByCode(String code) {
        return findNode(code, null, nodes);
    }

    @Override
    public INode findByRenderer(String renderer) {
        return findNode(null, renderer, nodes);
    }

    @Override
    public int count() {
        return nodes.size();
    }

    private INode findNode(String code, String renderer, List<INode> list) {
        // checking all parentNodes
        for (INode node : list){
            if (node.getCode().equals(code)) {
                return node;
            }
            if (node.getRenderer().equals(renderer)){
                return node;
            }
            // checking SubNodes
            if (node instanceof ICompositeNode) {
                ICompositeNode parentNode = (ICompositeNode) node;
                List<INode> subNodes = parentNode.getNodes();
                INode nodeFound = findNode(code, renderer, subNodes);
                if (nodeFound != null){
                    return nodeFound;
                }
            }
        }
        return null;
    }
}
