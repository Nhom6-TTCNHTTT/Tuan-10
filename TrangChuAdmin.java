/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.Connect;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.LoaiPhong;
import model.PhongHoc;
import model.ThietBi;

/**
 *
 * @author admin
 */
public class TrangChuAdmin extends javax.swing.JFrame {
    private int selectedIndex;
    ArrayList<LoaiPhong> listLP = new ArrayList<>();
    ArrayList<PhongHoc> listPH = new ArrayList<>();
    ArrayList<ThietBi> listTB = new ArrayList<>();
    private final Connect db = new Connect();
     static String fileNameLP = "loaiphong.txt";
    static String fileNamePH = "phonghoc.txt";
    static String fileNameTB = "thietbi.txt";
    private final DefaultTableModel tblModelLoai;
    private final DefaultTableModel tblModelPhong;
    private final DefaultTableModel tblModelThiet;
    /**
     * Creates new form TrangChu
     */
    public TrangChuAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        tblModelLoai = (DefaultTableModel) tblLoaiPhong.getModel();
        tblModelPhong = (DefaultTableModel) tblPhongHoc.getModel();
        tblModelThiet = (DefaultTableModel) tblThietBi.getModel();
        
        docFilePH(fileNamePH);
        showDataPhongHoc(listPH,tblModelPhong );
        
        docFileLP(fileNameLP);
        showDataLoaiPhong(listLP, tblModelLoai );
        //fakedata();
        docFileTB(fileNameTB);
        showDataThietBi(listTB, tblModelThiet );
        
    }
    
    public final <T> void showDataLoaiPhong(ArrayList<T> list, DefaultTableModel model) {
        model.setRowCount(0);
        for(LoaiPhong t: listLP){
            tblModelLoai.addRow(new Object[]{
                t.getMaLoaiPhong(), t.getLoaiPhong(), t.getKhoa(), t.getCoSo()
            });
        }       
    }
    public final <T> void showDataPhongHoc(ArrayList<T> list, DefaultTableModel model) {
        model.setRowCount(0);
        for(PhongHoc t: listPH){
            tblModelPhong.addRow(new Object[]{
                t.getMaPhong(),t.getTenPhong(), t.getSoLuongMay(), t.getTinhTrang(), t.getLoaiPhong(), t.getCoSo()
            });
        }       
    }
    public final <T> void showDataThietBi(ArrayList<T> list, DefaultTableModel model) {
        model.setRowCount(0);
        for(ThietBi t: listTB){
            tblModelThiet.addRow(new Object[]{
                t.getMaTB(),t.getTenTB(), t.getLoaiTB(), t.getSoHoatDong(), t.getSoLoi(), t.getNamSX()
            });
        }       
    }
    void addLoaiPhong(LoaiPhong lp) {
        listLP.add(lp);
        showDataLoaiPhong(listLP, tblModelLoai);
    }
    void addPhongHoc(PhongHoc ph) {
        listPH.add(ph);
        showDataPhongHoc(listPH, tblModelPhong);
    }
    void suaPhongHoc(PhongHoc ph) {
        listPH.remove(selectedIndex);
        this.addPhongHoc(ph);
    }
     void addThietBi(ThietBi tb) {
        listTB.add(tb);
        showDataThietBi(listTB, tblModelThiet);    
    }
    void suaPhongHoc(ThietBi th) {
        listTB.remove(selectedIndex);
        this.addThietBi(th);    
    } 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLoaiPhong = new javax.swing.JTable();
        ThemLoaiPhong = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPhongHoc = new javax.swing.JTable();
        SuaPhongHoc = new javax.swing.JButton();
        ThemPhongHoc = new javax.swing.JButton();
        XoaPhongHoc = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblThietBi = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        TimKiemNgay = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtSoHD = new javax.swing.JTextField();
        Load = new javax.swing.JButton();
        txtNam = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSoLoi = new javax.swing.JTextField();
        boxLoaiTB = new javax.swing.JComboBox<>();
        btnXoaTB = new javax.swing.JButton();
        btnThemTB = new javax.swing.JButton();
        btnSuaTB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblLoaiPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Loại Phòng", "Tên Loại Phòng", "Khoa", "Cơ Sở"
            }
        ));
        jScrollPane1.setViewportView(tblLoaiPhong);

        ThemLoaiPhong.setText("Thêm loại phòng");
        ThemLoaiPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemLoaiPhongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(ThemLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(ThemLoaiPhong)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Loại Phòng Học", jPanel1);

        tblPhongHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã phòng", "Tên phòng học", "Số lượng máy", "Tình trạng", "Loại Phòng", "Cơ sở"
            }
        ));
        jScrollPane2.setViewportView(tblPhongHoc);

        SuaPhongHoc.setText("Sửa phòng học");
        SuaPhongHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuaPhongHocActionPerformed(evt);
            }
        });

        ThemPhongHoc.setText("Thêm phòng học");
        ThemPhongHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemPhongHocActionPerformed(evt);
            }
        });

        XoaPhongHoc.setText("Xóa phòng học");
        XoaPhongHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaPhongHocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(ThemPhongHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(SuaPhongHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(XoaPhongHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SuaPhongHoc)
                    .addComponent(ThemPhongHoc)
                    .addComponent(XoaPhongHoc))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Phòng Học", jPanel2);

        tblThietBi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã thiết bị", "Tên thiết bị", "Loại thiết bị", "Số hoạt động", "Số lỗi", "Năm SX"
            }
        ));
        jScrollPane3.setViewportView(tblThietBi);

        jLabel1.setText("Chọn năm:");

        TimKiemNgay.setText("Tìm kiếm");
        TimKiemNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiemNgayActionPerformed(evt);
            }
        });

        jLabel2.setText("Tổng số thiết bị hđ:");

        Load.setText("Load");
        Load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadActionPerformed(evt);
            }
        });

        txtNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamActionPerformed(evt);
            }
        });

        jLabel3.setText("Loại thiết bị:");

        jLabel4.setText("Tổng số thiết bị lỗi:");

        boxLoaiTB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Màn hình", "Case máy tính", "Chuột", "Bàn phím" }));

        btnXoaTB.setText("Xóa thiết bị");
        btnXoaTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaTBActionPerformed(evt);
            }
        });

        btnThemTB.setText("Thêm thiết bị");
        btnThemTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemTBActionPerformed(evt);
            }
        });

        btnSuaTB.setText("Sửa thiết bị");
        btnSuaTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaTBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNam)
                                .addComponent(boxLoaiTB, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtSoHD, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSoLoi, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSuaTB)
                            .addComponent(TimKiemNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(123, 123, 123))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnXoaTB)
                            .addComponent(btnThemTB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Load)
                        .addGap(17, 17, 17))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TimKiemNgay)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(boxLoaiTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnThemTB))))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnXoaTB)
                                    .addComponent(txtSoHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Load, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSoLoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuaTB))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Thiết Bị", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fakedata(){
        ThietBi tb1 = new ThietBi("TB01", "Dell Prison 3004", "Case máy tính",40,2, 2021);
        listTB.add(tb1);
        ThietBi tb2 = new ThietBi("TB02", "Dell Otiplex 2014", "Case máy tính",1,0, 2021);
        listTB.add(tb2);
        ThietBi tb3 = new ThietBi("TB03", "Gitech 34", "Chuột",40,2, 2022);
        listTB.add(tb3);
        ThietBi tb4 = new ThietBi("TB04", "EKM045BK – PRO", "Bàn phím",40,1, 2021);
        listTB.add(tb4);
        ThietBi tb5 = new ThietBi("TB05", "Elead F20RAA", "Màn hình",40,1, 2022);
        listTB.add(tb5);
        luuFile(listTB, fileNameTB);
    }
    private void SuaPhongHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuaPhongHocActionPerformed
        selectedIndex = tblPhongHoc.getSelectedRow();
        if (listPH.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane,
                    "Nhập thêm số phòng!");
        } else if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(rootPane,
                    "Hãy chọn số phòng!");
        } else {
            SuaPhongHoc suaph = new SuaPhongHoc(this,
                    rootPaneCheckingEnabled);
            suaph.setSuaPhongHoc(listPH.get(selectedIndex));
            suaph.setVisible(true);
        }

        luuFile(listPH, fileNamePH);
    }//GEN-LAST:event_SuaPhongHocActionPerformed

    private void ThemPhongHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemPhongHocActionPerformed
        AddPhongHoc phongHocFrm = new AddPhongHoc(this,
                rootPaneCheckingEnabled);
        phongHocFrm.setVisible(true);
        luuFile(listPH, fileNamePH);
        
    }//GEN-LAST:event_ThemPhongHocActionPerformed

    private void TimKiemNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiemNgayActionPerformed
        String  loaiThietBi;
        int nam;
        int soLuongHoatDong = 0;
        int soLuongLoi = 0;
        boolean check = false;
        nam = Integer.valueOf(txtNam.getText());
        loaiThietBi = boxLoaiTB.getSelectedItem().toString();
        
        tblModelThiet.setRowCount(0);
        for (ThietBi tb : listTB) {
            if ( (nam == tb.getNamSX()) && (loaiThietBi.equals(tb.getLoaiTB())) ) {
                tblModelThiet.addRow(new Object[]{
                    tb.getMaTB(),tb.getTenTB(), tb.getLoaiTB(), tb.getSoHoatDong(), tb.getSoLoi(), tb.getNamSX()
                });
                soLuongHoatDong += tb.getSoHoatDong();
                soLuongLoi += tb.getSoLoi();
                check = true;
            }
        }
        txtSoHD.setText(Integer.toString(soLuongHoatDong));
        txtSoLoi.setText(Integer.toString(soLuongLoi));
        
        if (check == false) {
            JOptionPane.showMessageDialog(rootPane
            , "Năm không đúng hoặc không có loại thiết bị đó");
            showDataThietBi(listTB, tblModelThiet);
        }
    }//GEN-LAST:event_TimKiemNgayActionPerformed

    private void LoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadActionPerformed
        // TODO add your handling code here:
        docFileTB(fileNameTB);
        showDataThietBi(listTB, tblModelThiet);
        /*int removeIndex = tblThietBi.getSelectedRow();
        if (removeIndex == -1) {
            JOptionPane.showMessageDialog(rootPane,
                    "Chọn Ca cần xóa!");
        } else if (listTB.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane,
                    "Không có thông tin!");
        } else {
            listTB.remove(removeIndex);
            showDataPhongHoc(listTB, tblModelThiet);
        }
        luuFile(listTB, fileNameTB);*/
    }//GEN-LAST:event_LoadActionPerformed

    private void XoaPhongHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaPhongHocActionPerformed
        int removeIndex = tblPhongHoc.getSelectedRow();
        if (removeIndex == -1) {
            JOptionPane.showMessageDialog(rootPane,
                    "Chọn phòng cần xóa!");
        } else if (listPH.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane,
                    "Không có thông tin!");
        } else {
            listPH.remove(removeIndex);
            showDataPhongHoc(listPH, tblModelPhong);
        }
        luuFile(listPH, fileNamePH);
        
    }//GEN-LAST:event_XoaPhongHocActionPerformed

    private void txtNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamActionPerformed

    private void ThemLoaiPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemLoaiPhongActionPerformed
        // TODO add your handling code here:
        AddLoaiPhong loaiphongFrm = new AddLoaiPhong(this,
                rootPaneCheckingEnabled);
        loaiphongFrm.setVisible(true);
        luuFile(listLP, fileNameLP);
    }//GEN-LAST:event_ThemLoaiPhongActionPerformed

    private void btnThemTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemTBActionPerformed
        // TODO add your handling code here:
        AddThietBi thietbiFrm = new AddThietBi(this,
                rootPaneCheckingEnabled);
        thietbiFrm.setVisible(true);
        luuFile(listTB, fileNameTB);
    }//GEN-LAST:event_btnThemTBActionPerformed

    private void btnXoaTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTBActionPerformed
        // TODO add your handling code here:
        int removeIndex = tblThietBi.getSelectedRow();
        if (removeIndex == -1) {
            JOptionPane.showMessageDialog(rootPane,
                    "Chọn thiết bị cần xóa!");
        } else if (listTB.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane,
                    "Không có thông tin!");
        } else {
            listTB.remove(removeIndex);
            showDataPhongHoc(listTB, tblModelThiet);
        }
        luuFile(listTB, fileNameTB);
    }//GEN-LAST:event_btnXoaTBActionPerformed

    private void btnSuaTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaTBActionPerformed
        selectedIndex = tblThietBi.getSelectedRow();
        if (listTB.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane,
                    "Nhập thêm thiết bị!");
        } else if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(rootPane,
                    "Hãy chọn thiết bị!");
        } else {
            SuaThietBi suatb = new SuaThietBi(this,
                    rootPaneCheckingEnabled);
            suatb.setSuaThietBi(listTB.get(selectedIndex));
            suatb.setVisible(true);
        }

        luuFile(listTB, fileNameTB);
    }//GEN-LAST:event_btnSuaTBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrangChuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChuAdmin().setVisible(true);
            }
        });
    }
    public void luuFile(ArrayList T, String fileName) {
        try {
            db.writeToFile(T, fileName);
            System.out.println("Luu file thanh cong");
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
    public void docFileLP(String fileName) {
        try {
            listLP = (ArrayList) db.readDataFromFile(fileName);
            System.out.println(" Doc file LP");
        } catch (Exception ex) {
            System.out.println("Khong doc duoc file");
        }
    }
    public void docFilePH(String fileName) {
        try {
            listPH = (ArrayList) db.readDataFromFile(fileName);
            System.out.println(" Doc file PH");
        } catch (Exception ex) {
            System.out.println("Khong doc duoc file");
        }
    }
    public void docFileTB(String fileName) {
        try {
            listTB = (ArrayList) db.readDataFromFile(fileName);
            System.out.println(" Doc file TB");
        } catch (Exception ex) {
            System.out.println("Khong doc duoc file");
        }
    }
    public void writeFileLP(){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
             fos = new FileOutputStream("LoaiPhong.txt");
             oos = new ObjectOutputStream(fos);
            oos.writeObject(listLP);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                oos.close();
                fos.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
    public void readFileLP(){
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            fis = new FileInputStream("LoaiPhong.txt");
            ois = new ObjectInputStream(fis);
            listLP =  (ArrayList<LoaiPhong>)ois.readObject();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(ois != null && fis != null){
                    ois.close();
                    fis.close();
                }
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Load;
    private javax.swing.JButton SuaPhongHoc;
    private javax.swing.JButton ThemLoaiPhong;
    private javax.swing.JButton ThemPhongHoc;
    private javax.swing.JButton TimKiemNgay;
    private javax.swing.JButton XoaPhongHoc;
    private javax.swing.JComboBox<String> boxLoaiTB;
    private javax.swing.JButton btnSuaTB;
    private javax.swing.JButton btnThemTB;
    private javax.swing.JButton btnXoaTB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblLoaiPhong;
    private javax.swing.JTable tblPhongHoc;
    private javax.swing.JTable tblThietBi;
    private javax.swing.JTextField txtNam;
    private javax.swing.JTextField txtSoHD;
    private javax.swing.JTextField txtSoLoi;
    // End of variables declaration//GEN-END:variables



   

    

    

    



    

    
}
