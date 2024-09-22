package lochai.web_ban_sach.service;

import lochai.web_ban_sach.entity.NguoiDung;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface NguoiDungService extends UserDetailsService {
    public NguoiDung findByUsername(String tenDangNhap);
}
