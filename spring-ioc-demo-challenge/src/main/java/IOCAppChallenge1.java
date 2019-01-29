import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCAppChallenge1 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-challenge.xml");
		
		City one = (City) ctx.getBean("mycity");
		
		one.cityName();
		
		((ClassPathXmlApplicationContext)ctx).close();

	}

}
