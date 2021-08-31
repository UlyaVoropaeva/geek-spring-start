package app.current;

import app.configuration.CartConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import(CartConfiguration.class)
public class FirstWebApplicationConfig  {
}
