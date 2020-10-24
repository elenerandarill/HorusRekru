package net.elener;

public class MySimpleNode implements INode {
    String code;
    String renderer;

    MySimpleNode(String code, String renderer){
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

    @Override
    public String toString() {
        return "MySimpleNode{" +
                "code='" + code + '\'' +
                ", renderer='" + renderer + '\'' +
                '}';
    }
}
