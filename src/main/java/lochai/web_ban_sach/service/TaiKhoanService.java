package lochai.web_ban_sach.service;

import lochai.web_ban_sach.dao.NguoiDungRepository;
import lochai.web_ban_sach.entity.NguoiDung;
import lochai.web_ban_sach.entity.ThongBao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TaiKhoanService {

    @Autowired
    private NguoiDungRepository nguoiDungRepository;

    public ResponseEntity<?> dangKyNguoiDung(NguoiDung nguoiDung){

        if (nguoiDungRepository.existsByTenDangNhap(nguoiDung.getTenDangNhap())){

            return ResponseEntity.badRequest().body(new ThongBao("Tên đăng nhập đã tồn tại"));
        }

        if (nguoiDungRepository.existsByEmail(nguoiDung.getEmail())){

            return ResponseEntity.badRequest().body(new ThongBao("Tên đăng nhập đã tồn tại"));
        }

        NguoiDung nguoiDung1_daDangKy = nguoiDungRepository.save(nguoiDung);
        return ResponseEntity.ok("Đăng ký thannh công");

    }
}
