/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public class LoaiPhong implements Serializable{
    public String maLoaiPhong;
    public String LoaiPhong;
    public String Khoa;
    public int CoSo;

    public LoaiPhong(String maLoaiPhong, String LoaiPhong, String Khoa, int CoSo) {
        this.maLoaiPhong = maLoaiPhong;
        this.LoaiPhong = LoaiPhong;
        this.Khoa = Khoa;
        this.CoSo = CoSo;
    }

    public LoaiPhong(String LoaiPhong, int CoSo) {
        this.LoaiPhong = LoaiPhong;
        this.CoSo = CoSo;
    }

    public LoaiPhong() {
        LoaiPhong = "";
        CoSo = 0;
    }

    public String getMaLoaiPhong() {
        return maLoaiPhong;
    }

    public String getLoaiPhong() {
        return LoaiPhong;
    }

    public String getKhoa() {
        return Khoa;
    }

    public int getCoSo() {
        return CoSo;
    }

    public void setMaLoaiPhong(String maLoaiPhong) {
        this.maLoaiPhong = maLoaiPhong;
    }

    public void setLoaiPhong(String LoaiPhong) {
        this.LoaiPhong = LoaiPhong;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }

    public void setCoSo(int CoSo) {
        this.CoSo = CoSo;
    }
    
}
