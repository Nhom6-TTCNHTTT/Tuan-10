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
public class ThietBi implements Serializable{
    public String maTB;
    public String tenTB;
    public String loaiTB;
    public int soHoatDong;
    public int soLoi;
    public int namSX;

    public ThietBi(String maTB, String tenTB, String loaiTB, int soHoatDong, int soLoi, int namSX) {
        this.maTB = maTB;
        this.tenTB = tenTB;
        this.loaiTB = loaiTB;
        this.soHoatDong = soHoatDong;
        this.soLoi = soLoi;
        this.namSX = namSX;
    }

    

    
    
    public ThietBi() {
    }

    public String getMaTB() {
        return maTB;
    }

    public String getTenTB() {
        return tenTB;
    }

    public String getLoaiTB() {
        return loaiTB;
    }

    public int getSoHoatDong() {
        return soHoatDong;
    }

    public int getSoLoi() {
        return soLoi;
    }

    public float getNamSX() {
        return namSX;
    }

    public void setMaTB(String maTB) {
        this.maTB = maTB;
    }

    public void setTenTB(String tenTB) {
        this.tenTB = tenTB;
    }

    public void setLoaiTB(String loaiTB) {
        this.loaiTB = loaiTB;
    }

    public void setSoHoatDong(int soHoatDong) {
        this.soHoatDong = soHoatDong;
    }

    public void setSoLoi(int soLoi) {
        this.soLoi = soLoi;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    
    
}
