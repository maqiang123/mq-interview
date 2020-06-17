package spring.context;

import java.util.HashMap;

/**
 * @ClassName AbstractBeanFactory.java
 * @description:
 * @author: ma_qiang
 * @create: 2020-06-13 17:16
 **/
public abstract class AbstractBeanFactory<T> {

    protected HashMap<String,T> beanMap=new HashMap<String, T>();

    public abstract void addBean(String beanName,T bean);
     public T getBean(String beanName){
        return beanMap.get(beanName);
    }

}
