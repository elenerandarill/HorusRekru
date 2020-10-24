package net.elener;

import java.util.ArrayList;
import java.util.List;

public class MyNode implements ICompositeNode {
    List<INode> subNodes = new ArrayList<>();
    String code;
    String renderer;

    MyNode(String code, String renderer){
        this.code = code;
        this.renderer = renderer;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getRenderer() {
        return renderer;
    }

    public void addSubNode(INode node){
        subNodes.add(node);
    }

    @Override
    public List<INode> getNodes() {
        return subNodes;
    }

    @Override
    public String toString() {
        return "MyNode{" +
                "code='" + code + '\'' +
                ", renderer='" + renderer + '\'' +
                '}';
    }
}
