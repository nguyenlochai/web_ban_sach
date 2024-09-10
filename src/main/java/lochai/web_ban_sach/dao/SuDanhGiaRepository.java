package lochai.web_ban_sach.dao;

import lochai.web_ban_sach.entity.SuDanhGia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "su-danh-gia") // sử dụng rest api
public interface SuDanhGiaRepository extends JpaRepository<SuDanhGia, Long> {
}
