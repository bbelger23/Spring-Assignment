package brandon;


import brandon.iface.SalesReport;
import brandon.iface.ShippingPolicy;
import brandon.impl.FileInput;
import brandon.impl.FreeShipping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("brandon")
public class Config {
}
