/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import DAO.SachDAO;
import entity.Sach;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mark
 */
public class TrangChuPanel extends javax.swing.JPanel {

    /**
     * Creates new form TrangChuPanel
     */
    public TrangChuPanel() {
        initComponents();
        getall();
    }
        

    public void getall() {
        SachDAO dao = new SachDAO();
        List<Sach> sachList = dao.getAll(); // Lấy danh sách sách từ cơ sở dữ liệu
        DefaultTableModel model = new DefaultTableModel();
        
        // Thêm cột vào model
        model.addColumn("ID");
        model.addColumn("Tên Sách");
        model.addColumn("Năm Xuất Bản");
        model.addColumn("Giá"); // Thêm cột Giá nếu có

        // Thêm dữ liệu vào model
        for (Sach book : sachList) {
            model.addRow(new Object[]{
                book.getId(),           // ID của sách
                book.getTenSach(),      // Tên sách
               
                book.getNamXuatBan(),   // Năm xuất bản
                book.getGia()           // Giá
            });
        }

        jTable1.setModel(model); // Gán model vào jTable1 để hiển thị dữ liệu
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 610, 380));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Chức năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 14), new java.awt.Color(255, 0, 51))); // NOI18N
        jPanel1.setToolTipText("Chức năng");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton1.setText("Thêm ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 30));

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton2.setText("Sửa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, 30));

        jButton3.setBackground(new java.awt.Color(0, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton3.setText("Xoá");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, 30));

        jButton5.setBackground(new java.awt.Color(0, 204, 204));
        jButton5.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton5.setText("Chi tiết sách");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 300, 150));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 12), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 51, 0));
        jPanel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 230, 30));

        jButton4.setBackground(new java.awt.Color(0, 204, 204));
        jButton4.setText("Click");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 360, 70));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel1.setText("Nhập vào ID thêm , sửa");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 150, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel2.setText("Tiêu đề sách:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel3.setText("Năm xuất bản:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel4.setText("Giá:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 30, -1));
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 160, 30));
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 160, 30));
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 160, 30));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 160, 30));
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 160, 30));
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 160, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel5.setText("Nhà xuất bản");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel6.setText("Loại Sách");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jButton6.setText("Improt");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 110, -1));
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 160, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel7.setText("Tác giả");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 330, 380));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
    // Lấy dữ liệu từ các JTextField
    int id = Integer.parseInt(jTextField2.getText().trim());
    String ten = jTextField3.getText().trim();
    int namxb = Integer.parseInt(jTextField4.getText().trim());
    double gia = Double.parseDouble(jTextField5.getText().trim());

    // Khởi tạo đối tượng SachDAO để truy xuất cơ sở dữ liệu
    SachDAO sachDAO = new SachDAO();
    Sach sach = sachDAO.findById(id); // Tìm sách theo ID

    if (sach == null) {
        JOptionPane.showMessageDialog(null, "ID sách không tồn tại, không thể cập nhật!", "Lỗi", JOptionPane.ERROR_MESSAGE);
    } else {
        // Cập nhật thông tin sách
        sach.setTenSach(ten);
        sach.setNamXuatBan(namxb);
        sach.setGia(gia);

        boolean updated = sachDAO.updateBook(sach); // Giả sử updateBook trả về true nếu cập nhật thành công

        if (updated) {
            JOptionPane.showMessageDialog(null, "Cập nhật thông tin sách thành công!");
        getall();
          
           
        } else {
            JOptionPane.showMessageDialog(null, "Cập nhật thông tin sách thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
} catch (Exception e) {  // Gộp SQLException và NumberFormatException
    e.printStackTrace();
    JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra, vui lòng thử lại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
}


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        SachDAO sachDAO = new SachDAO();
        String ten = jTextField1.getText().trim();
        List<Sach> foundBooks = sachDAO.findByName(ten);
        DefaultTableModel model = new DefaultTableModel();
        
        // Thêm cột vào model
        model.addColumn("ID");
        model.addColumn("Tên Sách");
        model.addColumn("Năm Xuất Bản");
        model.addColumn("Giá"); // Thêm cột Giá nếu có

        // Thêm dữ liệu vào model
        for (Sach book : foundBooks) {
            model.addRow(new Object[]{
                book.getId(),           // ID của sách
                book.getTenSach(),      // Tên sách
               
                book.getNamXuatBan(),   // Năm xuất bản
                book.getGia()           // Giá
            });
        }

        jTable1.setModel(model);
      
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
       int selectedRow = jTable1.getSelectedRow();
    if (selectedRow != -1) {
        // Lấy ID sách từ cột ID của hàng được chọn
        String id = jTable1.getValueAt(selectedRow, 0).toString(); // Giả sử cột 0 là cột chứa id

        // Kiểm tra kiểu dữ liệu
       int masach=Integer.parseInt(id);
        openChiTietSach(masach);
    } else {
        JOptionPane.showMessageDialog(null, "Vui lòng chọn một sách từ bảng để xem chi tiết.");
    }
    }//GEN-LAST:event_jButton5ActionPerformed

private void openChiTietSach(int idSach) {
    // Tiêu đề của cửa sổ
    
    SachDAO dao = new SachDAO();
    Sach sach = dao.findById(idSach);

    if (sach != null) { // Kiểm tra nếu sach không null
        chiTietSachs chitiet = new chiTietSachs();
        chitiet.setIdSach(idSach);
        
        // Thiết lập các trường thông tin trước khi hiển thị
        chitiet.settensach(sach.getTenSach());
        chitiet.settacgia(sach.getTacgia());
        chitiet.setsoluong(String.valueOf(sach.getSoluong()));
        chitiet.settheloai(sach.getTheloai());
        chitiet.setnhaxuatban(sach.getNhaxb());
        chitiet.setnamxuatban(String.valueOf(sach.getNamXuatBan()));
        
        // Hiển thị ảnh (nếu có)
        if (sach.getAnh() != null && sach.getAnh().length > 0) {
            chitiet.showImage(sach.getAnh());
        }
        
        chitiet.pack();
        chitiet.setVisible(true); // Gọi sau khi thiết lập thông tin
    } else {
        JOptionPane.showMessageDialog(null, "Không tìm thấy sách với ID: " + idSach);
    }
}

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    // Lấy dữ liệu từ các JTextField
    try {
    // Lấy dữ liệu từ các JTextField
    String idStr = jTextField2.getText().trim();
    String ten = jTextField3.getText().trim();
    String namxbStr = jTextField4.getText().trim();
    String giaStr = jTextField5.getText().trim();
    String tacgia = jTextField8.getText().trim();
    String nhaxb = jTextField6.getText().trim();
    String theloai = jTextField7.getText().trim();
    
    

    // Kiểm tra xem các trường có rỗng không
    if (idStr.isEmpty() || ten.isEmpty() || namxbStr.isEmpty() || giaStr.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Chuyển đổi từ String sang int và double
    int id = Integer.parseInt(idStr);
    int namxb = Integer.parseInt(namxbStr);
    double gia = Double.parseDouble(giaStr);

    // Kiểm tra định dạng giá trị
    if (namxb < 1900 || namxb > 2024) {
        JOptionPane.showMessageDialog(null, "Năm xuất bản không hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (gia <= 0) {
        JOptionPane.showMessageDialog(null, "Giá sách phải lớn hơn 0!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Khởi tạo đối tượng SachDAO để truy xuất cơ sở dữ liệu
    SachDAO sachDAO = new SachDAO();
    Sach sach = sachDAO.findById(id); // Tìm sách theo ID

    if (sach == null) {
        // Nếu sách không tồn tại, tạo một đối tượng mới và lưu vào cơ sở dữ liệu
        sach = new Sach(id, ten, namxb, gia,tacgia,nhaxb,theloai);
        boolean saved = sachDAO.save(sach); // Gọi hàm save để thêm sách mới
        if (saved) {
            JOptionPane.showMessageDialog(null, "Thêm sách thành công!");
            getall();
        } else {
            JOptionPane.showMessageDialog(null, "Thêm sách thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "ID đã tồn tại", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Vui lòng nhập số hợp lệ cho ID, năm xuất bản và giá!", "Lỗi", JOptionPane.ERROR_MESSAGE);
} catch (Exception e) {
    e.printStackTrace(); // In ra lỗi cho quá trình gỡ lỗi
    JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra, vui lòng thử lại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_jButton1ActionPerformed

    
     private void deleteSelectedBook() {
        // Lấy hàng được chọn
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một quyển sách để xóa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Lấy ID từ hàng được chọn
        int id = (int) jTable1.getValueAt(selectedRow, 0); // Giả sử ID là ở cột 0

        // Tạo đối tượng SachDAO và gọi phương thức xóa
        SachDAO sachDAO = new SachDAO();
        boolean isDeleted = sachDAO.delete(id);

        if (isDeleted) {
            JOptionPane.showMessageDialog(this, "Xóa sách thành công!");
            // Xóa hàng khỏi bảng
            ((DefaultTableModel) jTable1.getModel()).removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "ID sách không tồn tại hoặc xóa thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        deleteSelectedBook();
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "chọn sách đã!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
         // Lấy ID quyển sách từ cột (giả sử ID nằm ở cột đầu tiên)
    int selectedBookId = (int) jTable1.getValueAt(selectedRow, 0);

    // Mở hộp thoại chọn ảnh
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Chọn ảnh");
    fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Ảnh", "jpg", "jpeg", "png", "gif"));

    int result = fileChooser.showOpenDialog(null);

    if (result == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();

        try (FileInputStream fis = new FileInputStream(selectedFile)) {
            // Đọc file ảnh thành mảng byte
            byte[] imageBytes = new byte[(int) selectedFile.length()];
            fis.read(imageBytes);

            // Lưu ảnh vào cơ sở dữ liệu
            saveImageToDatabase(selectedBookId, imageBytes);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi đọc file ảnh: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_jButton6ActionPerformed
    private void saveImageToDatabase(int bookId, byte[] imageBytes) {
    String url = "jdbc:mysql://localhost:3306/sach";
    String username = "root";
    String password = "112233";

    String sql = "UPDATE sach SET anh = ? WHERE id = ?"; // Cập nhật ảnh của quyển sách theo ID

    try (Connection conn = DriverManager.getConnection(url, username, password);
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        
        // Set ảnh vào PreparedStatement
        stmt.setBytes(1, imageBytes);
        stmt.setInt(2, bookId);

        // Thực hiện câu lệnh UPDATE
        int rowsAffected = stmt.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Ảnh đã được thêm thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Không thể thêm ảnh vào quyển sách.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi khi lưu ảnh vào cơ sở dữ liệu: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
