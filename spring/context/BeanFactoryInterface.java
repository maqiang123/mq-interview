package spring.context;

import java.util.HashMap;

public interface BeanFactoryInterface<T> {

    void addBean(String beanName,T bean);

    T getBean(String beanName) ;

}
