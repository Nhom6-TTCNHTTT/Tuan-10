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
public class PhongHoc extends LoaiPhong implements Serializable {

    
    public String maPhong;
    public String tenPhong;
    public int soLuongMay;
    public String tinhTrang;

    public PhongHoc(String maPhong, String tenPhong, int soLuongMay, String tinhTrang, String maLoaiPhong, String LoaiPhong, String Khoa, int CoSo) {
        super(maLoaiPhong, LoaiPhong, Khoa, CoSo);
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.soLuongMay = soLuongMay;
        this.tinhTrang = tinhTrang;
    }

    public PhongHoc(String maPhong,String tenPhong, int soLuongMay, String tinhTrang,  String LoaiPhong, int CoSo) {
        super( LoaiPhong , CoSo);
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.soLuongMay = soLuongMay;
        this.tinhTrang = tinhTrang;
    }
    
    public PhongHoc() {
        maPhong = tenPhong = "";
        soLuongMay = 0;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public int getSoLuongMay() {
        return soLuongMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public void setSoLuongMay(int soLuongMay) {
        this.soLuongMay = soLuongMay;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
}
