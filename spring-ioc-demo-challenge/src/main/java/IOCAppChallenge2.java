import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCAppChallenge2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("beans-challenge.xml");
		
		City one = (City) ctx.getBean("mycity");
		
		one.cityName();
		
		((FileSystemXmlApplicationContext)ctx).close();

	}

}
