package lochai.web_ban_sach.dao;

import lochai.web_ban_sach.entity.ChiTietDonHang;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "chi_tiet_don_hang") // sử dụng rest api
public interface ChiTietDonHangRepository extends JpaRepository<ChiTietDonHang, Integer> {

}
