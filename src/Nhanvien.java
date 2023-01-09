import java.awt.*;
import java.security.PublicKey;

public class Nhanvien {
    public String id;
    public String full_name;
    public String dia_chi;
    public int tuoi;
    public String so_dien_thoai;
    public float muc_luong;
    public float kinh_nghiem;

    public Nhanvien(String id, String full_name, String dia_chi, int tuoi, String so_dien_thoai, float muc_luong, float kinh_nghiem) {
        this.id = id;
        this.full_name = full_name;
        this.dia_chi = dia_chi;
        this.tuoi = tuoi;
        this.so_dien_thoai = so_dien_thoai;
        this.muc_luong = muc_luong;
        this.kinh_nghiem = kinh_nghiem;

    }


    public void LamViec(String viec) {
        System.out.println(full_name + " đang làm việc" + viec);
    }

    public void NghiNgoi() {
        System.out.println(full_name + " đang nghỉ ngơi");
    }

    public void NhanLuong(float muc_luong) {
        System.out.println(full_name + " nhận dược" + muc_luong + "$");
    }

    public void DuLich(String diadiem) {
        System.out.println(full_name + " đang đi du lich tại" + diadiem);

    }

}
