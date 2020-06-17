package spring.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import spring.model.User;

/**
 * @ClassName XmlApplication.java
 * @description:
 * @author: ma_qiang
 * @create: 2020-06-13 18:05
 **/
public class XmlApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext();
        classPathXmlApplicationContext.refresh();
        User user = classPathXmlApplicationContext.getBean(User.class);
        System.out.println(user.toString());
    }

}
