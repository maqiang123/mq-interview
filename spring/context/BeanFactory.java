package spring.context;

import java.io.Serializable;
import java.util.HashMap;

/**
 * @ClassName ApplicationContext.java
 * @description:
 * @author: ma_qiang
 * @create: 2020-06-13 17:07
 **/
public class BeanFactory<T> extends AbstractBeanFactory<T> implements Serializable {

    public void addBean(String beanName,T bean){
        beanMap.put(beanName,bean);
    }

}
