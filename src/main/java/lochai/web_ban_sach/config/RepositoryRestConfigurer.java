package lochai.web_ban_sach.config;


import jakarta.persistence.EntityManager;
import jakarta.persistence.metamodel.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;


//config này hiển thị id, (cho phép id xuất hiện bên trong json)

@Component
public class RepositoryRestConfigurer implements org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer {

    @Autowired
    private EntityManager entityManager;

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        //  hiển thị id, (cho phép id xuất hiện bên trong json)
        // entityManager.getMetamodel().getEntities().stream().map(Type::getJavaType).toArray(Class[]::new) là thông tin của các entity để hiển thị phản hồi ở json
        config.exposeIdsFor(entityManager.getMetamodel().getEntities().stream().map(Type::getJavaType).toArray(Class[]::new));
    }
}
