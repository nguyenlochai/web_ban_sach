package lochai.web_ban_sach.security;

public class Endpoints {

    public static  final String front_end_host = "http://localhost:3000";

    public static final String[] PUBLIC_GET_ENDPOISTS = {
            "/sach",
            "/sach/**",
            "/hinh-anh/**",
            "/nguoi-dung/search/existsByTenDangNhap",
            "/nguoi-dung/search/existsByEmail",


    };
    public static final String[] PUBLIC_POST_ENDPOISTS = {
            "/tai-khoan/dang-ky",

    };

    public static final String[] ADMIN_GET_ENDPOISTS = {
            "/nguoi-dung",
            "/nguoi-dung/**",


    };
}
