package spring.event;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ListenerRegister.java
 * @description:
 * @author: ma_qiang
 * @create: 2020-06-13 17:45
 **/
public class ListenerManager {

    private List<Listener> listenerList=new ArrayList<Listener>();

    public void add(Listener listener){
        listenerList.add(listener);
    }

    public void publish(CustomerEvent customerEvent){
        for (Listener listener : listenerList) {
            listener.getResult(customerEvent);
        }
    }

}
