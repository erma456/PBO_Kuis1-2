/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Math.toIntExact;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.beans.binding.Bindings.select;
import static javafx.beans.binding.Bindings.select;
import static javafx.beans.binding.Bindings.select;
import static javafx.beans.binding.Bindings.select;
import static javafx.beans.binding.Bindings.select;
import static javafx.beans.binding.Bindings.select;
import static javafx.beans.binding.Bindings.select;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import sun.java2d.pipe.SpanShapeRenderer.Simple;

/**
 *
 * @author Luviana
 */
public class form_main extends javax.swing.JFrame {
    
    String tglpinjam;
    String tglkembali;

    /**
     * Creates new form form_main
     */
    public form_main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtKTP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtPolisi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Tanggal1 = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        Tanggal2 = new com.toedter.calendar.JDateChooser();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtStruk = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        btnHitung = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Data Peminjam");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 11, 300, 33);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(10, 45, 300, 10);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Nama");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 62, 300, 21);

        txtNama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(txtNama);
        txtNama.setBounds(10, 89, 200, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setText("Nomor Kartu Identitas");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 130, 300, 21);

        txtKTP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(txtKTP);
        txtKTP.setBounds(10, 157, 200, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setText("Nomor Telepon");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 198, 300, 23);

        txtTelp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(txtTelp);
        txtTelp.setBounds(10, 227, 200, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setText("Alamat");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 268, 300, 26);

        txtAlamat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(txtAlamat);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 300, 200, 45);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Data Barang");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(353, 11, 300, 33);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(353, 45, 300, 10);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel8.setText("Nomor Polisi");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(353, 62, 300, 21);

        txtPolisi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(txtPolisi);
        txtPolisi.setBounds(353, 89, 200, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel9.setText("Tanggal Pinjam");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(353, 130, 300, 21);

        Tanggal1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                Tanggal1PropertyChange(evt);
            }
        });
        jPanel1.add(Tanggal1);
        Tanggal1.setBounds(353, 157, 200, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel10.setText("Tanggal Kembali");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(353, 199, 300, 21);

        Tanggal2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                Tanggal2PropertyChange(evt);
            }
        });
        jPanel1.add(Tanggal2);
        Tanggal2.setBounds(353, 227, 200, 30);

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave);
        btnSave.setBounds(720, 200, 75, 30);

        btnClear.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear);
        btnClear.setBounds(720, 250, 75, 30);

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 5, true));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("NO.STRUK");

        txtStruk.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtStruk.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtStruk)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtStruk, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(705, 11, 110, 110);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel13.setText("Total Harga");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(350, 270, 300, 21);

        txtHarga.setEditable(false);
        txtHarga.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(txtHarga);
        txtHarga.setBounds(350, 300, 200, 30);

        btnHitung.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });
        jPanel1.add(btnHitung);
        btnHitung.setBounds(560, 300, 75, 30);

        btnClose.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel1.add(btnClose);
        btnClose.setBounds(720, 300, 75, 30);

        jTabbedPane2.addTab("Input Data", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tblData.setBackground(new java.awt.Color(204, 255, 255));
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "No.KTP", "No.Telp", "Alamat", "No.Struk", "No.Polisi", "Tgl Pinjam", "Tgl Kembali", "Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblData);

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnPrint.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnRefresh.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Daftar Data", jPanel2);

        getContentPane().add(jTabbedPane2);
        jTabbedPane2.setBounds(-5, 90, 830, 400);

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RENTAL MOTOR SANJAYA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(227, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 830, 300);

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("SANJAYA PRODUCTION");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(-10, 490, 840, 40);

        setBounds(0, 0, 840, 571);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        
        MessageFormat header = new MessageFormat("Data Peminjaman Motor Rental Sanjaya");
        MessageFormat footer = new MessageFormat("Pgae (0,number,integer)");
        try{
            tblData.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Cannot print %s%n", e.getMessage());
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        int baris = tblData.getSelectedRow();
        if (baris != -1) {
            String no_struk = tblData.getValueAt(baris, 4).toString();
            String SQL = "DELETE FROM tb_peminjam WHERE no_struk = '" + no_struk + "'";
            int status = 0;
            status = KoneksiDB.execute(SQL);
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Data Gagal Dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih Dahulu", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyy");
        String tanggal1 = dateFormat.format(Tanggal1.getDate());
        String tanggal2 = dateFormat.format(Tanggal2.getDate());
        int struk = Integer.parseInt(txtStruk.getText());
        int telp = Integer.parseInt(txtTelp.getText());
        
        if(txtNama.getText().equals("") || txtKTP.getText().equals("") || txtAlamat.getText().equals("") ||
                txtPolisi.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        } 
        else {
        String SQL = "INSERT INTO tb_peminjam(nama, no_ktp, no_telp, alamat, no_struk, no_pol, tanggal_pinjam, tanggal_kembali, harga)"
                + " VALUES ('" + txtNama.getText() + "','" + txtKTP.getText() + "'," + telp + ",'" + txtAlamat.getText() + "',"
                + struk +  ",'" + txtPolisi.getText() + "','" + tanggal1 + "','" + tanggal2 + "','" + txtHarga.getText() + "')";
        int status = KoneksiDB.execute(SQL);
        if(status==1) {
            JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            try {
                selectData();
            } catch (SQLException ex) {
                Logger.getLogger(form_main.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Data Gagal Ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
        }
      }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        
        txtNama.setText("");
        txtKTP.setText("");
        txtTelp.setText("");
        txtAlamat.setText("");
        txtStruk.setText("");
        txtPolisi.setText("");
        Date dateFormat = null;
        Tanggal1.setDate(dateFormat);
        Tanggal2.setDate(dateFormat);
        txtHarga.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        try {
            // TODO add your handling code here:

            selectData();
        } catch (SQLException ex) {
            Logger.getLogger(form_main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void Tanggal1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_Tanggal1PropertyChange
        // TODO add your handling code here:
        
        if(Tanggal1.getDate()!=null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy");
            tglpinjam = simpleDateFormat.format(Tanggal1.getDate());
        }
    }//GEN-LAST:event_Tanggal1PropertyChange

    private void Tanggal2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_Tanggal2PropertyChange
        // TODO add your handling code here:
        
        if(Tanggal2.getDate()!=null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy");
            tglkembali = simpleDateFormat.format(Tanggal2.getDate());
        }
    }//GEN-LAST:event_Tanggal2PropertyChange

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
   
        try{
            String konString = "jdbc:mysql://localhost:3306/db_pinjammotor"; 
            Connection conn;
            conn = (com.mysql.jdbc.Connection) 
            DriverManager.getConnection(konString,"root",""); ;
            
            Statement st = conn.createStatement();
            String search = txtSearch.getText();
            ResultSet rs = st.executeQuery("SELECT * FROM tb_peminjam WHERE nama like '%"+ search +"%' OR no_struk like '%"+ search + "%'");
            DefaultTableModel dtm = (DefaultTableModel) tblData.getModel();

                            data[4] = rs.getString("no_struk");
                data[5] = rs.getString("no_pol");
                data[6] = rs.getString("tanggal_pinjam");
                data[7] = rs.getString("tanggal_kembali");
                data[8] = rs.getString("harga");
                dtm.addRow(data);
                i++;
            
            dtm.setRowCount(0);
            String [] data = new String[9];
            int i = 1;

            while(rs.next())
            {

            }
            rs.close();
            txtSearch.setText("");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Data yang Anda cari Tidak dapat Ditemukan");
            System.err.println("error (search) : " +ex);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        // TODO add your handling code here:
        
        try{
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date pinjam = df.parse(tglpinjam);
            Date kembali = df.parse(tglkembali);
            long pinjam1 = pinjam.getTime();
            long kembali1 = kembali.getTime();
            long diff = kembali1 - pinjam1;
            long lama = diff/(24*60*60*1000);
            long harga = lama * 20000;
            txtHarga.setText(Long.toString(harga));
        } catch (Exception e){
            System.out.println("" + e.getMessage());
        }
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed
            
    public void selectData() throws SQLException {
        String kolom[] = {"nama", "no_ktp", "no_telp", "alamat", "no_struk", "no_pol", "tanggal_pinjam", "tanggal_kembali", "harga"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM tb_peminjam";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try {
            while(rs.next()) {
                String nama = rs.getString(1);
                String no_ktp = rs.getString(2);
                String no_telp = rs.getString(3);
                String alamat = rs.getString(4);
                String no_struk = rs.getString(5);
                String no_pol = rs.getString(6);
                String tanggal_pinjam = rs.getString(7);
                String tanggal_kembali = rs.getString(8);
                String harga = rs.getString(9);
                String data[] = {nama, no_ktp, no_telp, alamat, no_struk, no_pol, tanggal_pinjam, tanggal_kembali, harga};
                dtm.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(form_main.class.getName()).log(Level.SEVERE, null, ex);
        }
        tblData.setModel(dtm);
    }
    
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
            java.util.logging.Logger.getLogger(form_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_main().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Tanggal1;
    private com.toedter.calendar.JDateChooser Tanggal2;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtKTP;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtPolisi;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtStruk;
    private javax.swing.JTextField txtTelp;
    // End of variables declaration//GEN-END:variables

    private void SimpleDateFormat(String dd_MMMM_yyyy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
