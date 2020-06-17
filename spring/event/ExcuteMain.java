package spring.event;

/**
 * @ClassName ExcuteMain.java
 * @description:
 * @author: ma_qiang
 * @create: 2020-06-13 17:39
 **/
public class ExcuteMain {

    public static void main(String[] args) {
        //1.吃饭
        Eat eat=new Eat();
        String eat1 = eat.eat();
        System.out.println(eat1);

        // 创建监听管理器
        ListenerManager listenerManager=new ListenerManager();
        // 注册监听 spring中可以通过 xml、注解 的方式把监听器 注入到 spring
        listenerManager.add(new Wish());
        // 发布时间
        CustomerEvent customerEvent=new CustomerEvent("吃完了");
        listenerManager.publish(customerEvent);

    }

}
