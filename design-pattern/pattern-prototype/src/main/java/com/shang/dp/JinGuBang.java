package com.shang.dp;

import java.io.Serializable;


/**
 * 通过序列化克隆，只需要实现Serializable即可
 */
public class JinGuBang implements Cloneable,Serializable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
