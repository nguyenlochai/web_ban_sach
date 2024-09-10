package lochai.web_ban_sach.dao;

import lochai.web_ban_sach.entity.TheLoai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "the-loai") // sử dụng rest api
public interface TheLoaiRepository extends JpaRepository<TheLoai, Integer> {
}
