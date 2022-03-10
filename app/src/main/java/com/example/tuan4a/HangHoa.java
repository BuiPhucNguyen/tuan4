package com.example.tuan4a;

public class HangHoa {
    private String tenHang;
    private String mota;
    private int hinh;

    public HangHoa(String tenHang, String mota, int hinh) {
        this.tenHang = tenHang;
        this.mota = mota;
        this.hinh = hinh;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
