package lochai.web_ban_sach.config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.metamodel.Type;
import lochai.web_ban_sach.entity.NguoiDung;
import lochai.web_ban_sach.entity.TheLoai;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

// này cho phép bạn cấu hình và tùy chỉnh cách Spring Data REST hoạt động. Bạn có thể can thiệp vào
// quá trình tạo REST API, cấu hình CORS, hoặc cấu hình các phương thức HTTP được hỗ trợ

@Configuration
public class MethodRestConfig implements RepositoryRestConfigurer {
    private String url = "http://localhost:8080";

    @Autowired
    private EntityManager entityManager;

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        HttpMethod[] chanCacPhuongThuc = {
                HttpMethod.POST,
                HttpMethod.PUT,
                HttpMethod.PATCH,
                HttpMethod.DELETE
        };

        //expose ids, hiển thị nhiều id, (cho phép id xuất hiện bên trong json)
        // entityManager.getMetamodel().getEntities().stream().map(Type::getJavaType).toArray(Class[]::new) là thông tin của các entity để hiển thị phản hồi ở json
        //Cho phép hiển thị ID chỉ cho tất cả entity
        // config.exposeIdsFor(entityManager.getMetamodel().getEntities().stream().map(Type::getJavaType).toArray(Class[]::new));

        //expose id, hiển thị 1 id TheLoai
        //Cho phép hiển thị ID chỉ cho thực thể TheLoai
        //config.exposeIdsFor(TheLoai.class);


        disableHttpMethods(TheLoai.class, config, chanCacPhuongThuc);

        HttpMethod[] phuongThucDelete = {

                HttpMethod.DELETE
        };
        disableHttpMethods(NguoiDung.class, config, phuongThucDelete);

    }

    private void disableHttpMethods(Class c, RepositoryRestConfiguration config, HttpMethod[] methods){
        config.getExposureConfiguration()
                .forDomainType(c)
                .withItemExposure(((metdata, httpMethods) -> httpMethods.disable(methods)))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable());
    }
}