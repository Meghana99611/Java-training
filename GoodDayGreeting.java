package First.Second;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;



@Component
public class GoodDayGreeting implements Greeting
{
String greeting = "Have a Good Day";

public String getGreeting()
{
return greeting;
}

public void setGreeting(String greeting)
{
this.greeting = greeting;
}

public String greet()
{



return greeting;
}



public GoodDayGreeting()
{
super();
System.out.println(greeting);
}

}

