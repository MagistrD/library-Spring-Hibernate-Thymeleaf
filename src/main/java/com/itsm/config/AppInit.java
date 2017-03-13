package com.itsm.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    private static final String DISPATCHER_SERVLET_NAME = "dispatcher";

    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{
                WebConfig.class
        };
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{
                WebConfig.class
        };
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
//        applicationContext.register(WebConfig.class);
//        applicationContext.register(HibernateConfiguration.class);
////        applicationContext.register(SecurityConfig.class);
//        servletContext.addListener(new ContextLoaderListener(applicationContext));
//        applicationContext.setServletContext(servletContext);
//        ServletRegistration.Dynamic servlet = servletContext.addServlet(DISPATCHER_SERVLET_NAME, new DispatcherServlet(applicationContext));
//        servlet.addMapping("/");
//        servlet.setLoadOnStartup(1);
//
//    }
}
