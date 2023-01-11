package com.tpe;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// !!! web.xml yerine bu sınıfımızı kullanacağız
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
   // Db ve Hibernate ayalarım için kullanacağım
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{
                RootContextConfig.class
        };
    }

    @Override
   // Mvc config ayarlarım
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
                WebMvcConfig.class
        };
    }

    @Override
    // hangi url hangi servlet ile ilişkilendirilecek
    protected String[] getServletMappings() {
        return new String[]{"/"}; /// gelen bütün request leri bu servlet tarafından karşılanacağını söylüyorum
    }
}
