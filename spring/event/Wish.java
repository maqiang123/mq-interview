package spring.event;

/**
 * 吃完饭洗碗
 * @ClassName SerialOne.java
 * @description:
 * @author: ma_qiang
 * @create: 2020-06-13 17:37
 **/
public class Wish implements Listener{

    public String wash(){
        return "洗碗";
    }

    public String getResult(CustomerEvent customerEvent) {
        Object source = customerEvent.getSource();
        System.out.println(source.toString());
        wash();
        return "洗完了";
    }
}
