package lochai.web_ban_sach.dao;


import lochai.web_ban_sach.entity.Sach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "sach") // sử dụng rest api
public interface SachRepository extends JpaRepository<Sach, Integer> {
}
