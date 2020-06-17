package spring.event;

import java.util.EventObject;

/**
 * 自定义事件,发布-订阅 模型
 *
 *  topic 主题
 *  我定义 done 主题。
 *  程序里有这样的场景，比如说 一个方法执行结束了，我想要做一些其他事情。或者说通知其他类 ，传递一些消息或者对象。
 *
 *
 * @ClassName CustomerEvent.java
 * @description:
 * @author: ma_qiang
 * @create: 2020-06-13 17:34
 **/
public class CustomerEvent extends EventObject {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public CustomerEvent(Object source) {
        super(source);
    }
}
