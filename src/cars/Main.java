package cars;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import  org.springframework.core.io.FileSystemResource;

/**
 * Created by husey on 26/10/2017.
 */
@SuppressWarnings("deprecation")
public class Main {
    public static void main (String [] args){


     //  Car car1= new Car();

        BeanFactory beanFactory =new XmlBeanFactory(new FileSystemResource("C:\\Users\\Huseyin\\Desktop\\PROJELER\\kitap_2\\src\\cars\\spring.xml"));
        Car car=(Car) beanFactory.getBean("car");

        car. moveOn();

    }
}
// yeni deneme