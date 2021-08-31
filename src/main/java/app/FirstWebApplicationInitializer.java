package app;

import app.current.FirstWebApplicationConfig;
import app.current.WebMVCApllicationConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class FirstWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    //Тут добовляем конфигурацию, в которой  инициализируем ViewResolver
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebMVCApllicationConfig.class};
    }

    //Этот метод должеержать конфигурации которые  инициализируют Beans
    //для инициализации бинов
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{FirstWebApplicationConfig.class};
    }
}