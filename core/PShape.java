package org.fleen.neopaisley.core;

import org.fleen.geom_2D.DYard;
import org.fleen.util.tag.Tagged;
import org.fleen.util.tree.TreeNode;

public interface PShape extends TreeNode,Tagged{
    
    DYard getEdge();
    
    void addAttribute(String k,Object a);
    
    Object getAttribute(String k);
    
    Object removeAttribute(String k);

  }
