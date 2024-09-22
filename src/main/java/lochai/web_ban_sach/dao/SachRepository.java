package lochai.web_ban_sach.dao;


import lochai.web_ban_sach.entity.Sach;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

@RepositoryRestResource(path = "sach") // sử dụng rest api
public interface SachRepository extends JpaRepository<Sach, Integer> {

    // mặc định là GET

    Page<Sach> findByTenSachContaining(@RequestParam("tenSach") String tenSach, Pageable pageable);

    Page<Sach> findByDanhSachTheLoai_MaTheLoai(@RequestParam("maTheLoai") int maTheLoai, Pageable pageable);


    //findByTenSachContaining và DanhSachTheLoai_MaTheLoai = gì đó
    Page<Sach> findByTenSachContainingAndDanhSachTheLoai_MaTheLoai(@RequestParam("tenSach") String tenSach,@RequestParam("maTheLoai") int maTheLoai, Pageable pageable);



}
