package lochai.web_ban_sach.dao;

import lochai.web_ban_sach.entity.DonHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "don-hang") // sử dụng rest api
public interface DonHangRepository extends JpaRepository<DonHang, Integer> {
}
