package lochai.web_ban_sach.dao;


import lochai.web_ban_sach.entity.SachYeuThich;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "sach-yeu-thich") // sử dụng rest api
public interface SachYeuThichRepository extends JpaRepository<SachYeuThich, Integer> {
}
