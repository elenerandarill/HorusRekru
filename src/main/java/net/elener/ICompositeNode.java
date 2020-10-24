package net.elener;

import java.util.List;

interface ICompositeNode extends INode {
    List<INode> getNodes();
}
