package springdemo;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

//Advice -> WHAT -> Before, After
//Point Cut -> WHERE
@Component 
@Aspect
@EnableAspectJAutoProxy
public class Helper {
	@Before("execution(public void show())")
	public void log() {
		System.out.println("Calling show() method");
		System.out.println(""); 
	}

}
