package lochai.web_ban_sach.dao;


import lochai.web_ban_sach.entity.HinhThucGiaoHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "hinh-thuc-giao-hang") // sử dụng rest api
public interface HinhThucGIaoHangRepository extends JpaRepository<HinhThucGiaoHang, Integer> {
}
