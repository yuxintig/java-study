package Class.week5;

/**
 * @ClassName DLinkNode
 * @Description TODO
 * @Author 余欣婷
 * @Date 2020/10/7
 **/

import java.util.*;

public class DLinkNode<E> {
    E mData;
    int mFrequency;
    DLinkNode<E> mFont;
    DLinkNode<E> mNext;

    public DLinkNode(){
        mFrequency = 0;
        mFont = null;
        mNext = null;
    }

    public DLinkNode(E data){
        mFrequency = 0;
        mData = data;
        mNext = null;
    }
}
