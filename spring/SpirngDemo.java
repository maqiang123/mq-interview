package spring;

import spring.context.BeanFactory;
import spring.model.User;

/**
 * @ClassName SpirngDemo.java
 * @description:
 * @author: ma_qiang
 * @create: 2020-06-13 16:56
 **/
public class SpirngDemo {

    public static void main(String[] args) {
        User user=new User();
        user.setAge(1);
        user.setName("aa");

        BeanFactory<User> applicationContext=new BeanFactory<User>();
        applicationContext.addBean("user",user);
        User userFormBeanFactory = applicationContext.getBean("user");
        System.out.println(userFormBeanFactory.toString());;
    }

}
