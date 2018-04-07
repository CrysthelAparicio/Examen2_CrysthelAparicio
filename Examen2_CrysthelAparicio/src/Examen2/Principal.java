package Examen2;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Principal extends javax.swing.JFrame {

    String[] titulos = {"NOMBRE"};
    DefaultTableModel dtm = new DefaultTableModel(null, titulos);
    Object[] modelo = new Object[1];
    String[] titulos2 = {"autor", "publicacion"};
    DefaultTableModel dtm2 = new DefaultTableModel(null, titulos2);
    Object[] modelo2 = new Object[2];
    DefaultTableModel dtm3 = new DefaultTableModel(null, titulos);
    Object[] modelo3 = new Object[1];

    public Principal() {
        initComponents();
        nombre.setEditable(false);
        correo.setEditable(false);
        fecha.setEditable(false);
        usuarui1.setEditable(false);
        contraseña.setEditable(false);
        new_fecha.setEnabled(false);
        usuario.add(new usuario_administrador("Crysthel Aparicio", "Crysthel Aparicio", "apariciocrysthel@gmail.com",
                (Date) js_fecha.getValue(), "Crys", "123", lb_imagen.getIcon()));
        usuario_administrador x2 = new usuario_administrador("Crysthel Aparicio", "Crysthel Aparicio", "apariciocrysthel@.com",
                (Date) js_fecha.getValue(), "Crys", "123", lb_imagen.getIcon());
        admin_usuario_administrador ad1 = new admin_usuario_administrador("./usuario_administrador.bin");
        ad1.cargarArchivo();
        ad1.set_usuario_administrador(x2);
        ad1.escribirArchivo();
        System.out.println(ad1.getListas_usuario_administrador());
        tabla1.setModel(dtm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_login = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_contraseña_login = new javax.swing.JTextField();
        tf_usuario_login = new javax.swing.JTextField();
        loging = new javax.swing.JButton();
        jd_usuario = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lb_imagen = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        agregar_usuario = new javax.swing.JButton();
        tf_nombre = new javax.swing.JTextField();
        tf_usuario = new javax.swing.JTextField();
        tf_correo = new javax.swing.JTextField();
        tf_contraseña = new javax.swing.JTextField();
        rb_usuario_normal = new javax.swing.JRadioButton();
        rb_usuario_admin = new javax.swing.JRadioButton();
        js_fecha = new javax.swing.JSpinner();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jButton2 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jd_administrador = new javax.swing.JDialog();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tax2 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        bloquear_normal = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        bloquear_publicaciones = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jd_normal = new javax.swing.JDialog();
        tab = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texta = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jl_p = new javax.swing.JList<>();
        jButton4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        usuarui1 = new javax.swing.JTextField();
        contraseña = new javax.swing.JTextField();
        new_fecha = new javax.swing.JSpinner();
        jButton9 = new javax.swing.JButton();
        fecha = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        bt_problema = new javax.swing.JRadioButton();
        bt_repuestas = new javax.swing.JRadioButton();
        bt_comentario = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        ta_mensaje = new javax.swing.JTextArea();
        bt_publico = new javax.swing.JRadioButton();
        bt_privado = new javax.swing.JRadioButton();
        bt_amigos = new javax.swing.JRadioButton();
        js_categoria = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        js_respuestas = new javax.swing.JSpinner();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        ta_comentario = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        bt_cerrado = new javax.swing.JRadioButton();
        bt_abierto = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        arbol = new javax.swing.JTree();
        jScrollPane9 = new javax.swing.JScrollPane();
        tabla_usuarios = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        arbol_amigos = new javax.swing.JTree();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        menu1 = new javax.swing.JPopupMenu();
        agregar_amigos = new javax.swing.JMenuItem();
        jd_about = new javax.swing.JDialog();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jLabel8.setText("Usuario");

        jLabel9.setText("Contraseña");

        loging.setText("login");
        loging.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logingMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_loginLayout = new javax.swing.GroupLayout(jd_login.getContentPane());
        jd_login.getContentPane().setLayout(jd_loginLayout);
        jd_loginLayout.setHorizontalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_loginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(154, 154, 154))
            .addGroup(jd_loginLayout.createSequentialGroup()
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_loginLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(loging, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_loginLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_usuario_login, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_contraseña_login, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jd_loginLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel8)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jd_loginLayout.setVerticalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_loginLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(tf_usuario_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_contraseña_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(loging)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jLabel1.setText("Usuario");

        jLabel2.setText("Nombre Completo");

        jLabel3.setText("Correo");

        jLabel4.setText("Fecha");

        jLabel5.setText("Usuario");

        jLabel6.setText("Contraseña");

        jLabel7.setText("Imagen");

        jButton1.setText("cargar imagen");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        agregar_usuario.setText("Agregar");
        agregar_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregar_usuarioMouseClicked(evt);
            }
        });

        buttonGroup1.add(rb_usuario_normal);
        rb_usuario_normal.setSelected(true);
        rb_usuario_normal.setText("Usuario normal");

        buttonGroup1.add(rb_usuario_admin);
        rb_usuario_admin.setText("Usuario administrador");

        js_fecha.setModel(new javax.swing.SpinnerDateModel());

        javax.swing.GroupLayout jd_usuarioLayout = new javax.swing.GroupLayout(jd_usuario.getContentPane());
        jd_usuario.getContentPane().setLayout(jd_usuarioLayout);
        jd_usuarioLayout.setHorizontalGroup(
            jd_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_usuarioLayout.createSequentialGroup()
                .addGroup(jd_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_usuarioLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jButton1)
                        .addGap(40, 40, 40)
                        .addComponent(lb_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_usuarioLayout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jd_usuarioLayout.createSequentialGroup()
                .addGroup(jd_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_usuarioLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(rb_usuario_normal))
                    .addGroup(jd_usuarioLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(agregar_usuario)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jd_usuarioLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jd_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jd_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3))
                    .addGroup(jd_usuarioLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jd_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))))
                .addGap(39, 39, 39)
                .addGroup(jd_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_usuarioLayout.createSequentialGroup()
                        .addGroup(jd_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jd_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(rb_usuario_admin)
                                .addComponent(tf_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 150, Short.MAX_VALUE))
                    .addGroup(jd_usuarioLayout.createSequentialGroup()
                        .addGroup(jd_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(js_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jd_usuarioLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jd_usuarioLayout.setVerticalGroup(
            jd_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_usuarioLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(jd_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jd_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(js_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(jd_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_usuarioLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5))
                    .addGroup(jd_usuarioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jd_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_usuarioLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel6))
                    .addGroup(jd_usuarioLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(tf_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jd_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_usuario_normal)
                    .addComponent(rb_usuario_admin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jd_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_usuarioLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(80, 80, 80)
                        .addComponent(agregar_usuario)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_usuarioLayout.createSequentialGroup()
                        .addComponent(lb_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))))
        );

        jButton2.setText("jButton2");

        jTabbedPane2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane2StateChanged(evt);
            }
        });

        tax2.setColumns(20);
        tax2.setRows(5);
        jScrollPane2.setViewportView(tax2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Vista", jPanel2);

        jLabel13.setText("Usuarios");

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tabla1);

        bloquear_normal.setText("bloquedar");
        bloquear_normal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bloquear_normalMouseClicked(evt);
            }
        });
        bloquear_normal.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                bloquear_normalComponentHidden(evt);
            }
        });

        jLabel10.setText("Publicaciones");

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tabla2);

        bloquear_publicaciones.setText("bloquedar");
        bloquear_publicaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bloquear_publicacionesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169)
                        .addComponent(bloquear_publicaciones))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(bloquear_normal))
                    .addComponent(jLabel10)
                    .addComponent(jLabel13))
                .addContainerGap(294, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(bloquear_normal)))
                .addGap(122, 122, 122)
                .addComponent(jLabel10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(bloquear_publicaciones)
                        .addGap(211, 211, 211))))
        );

        jTabbedPane2.addTab("Publicaciones & Usuarios", jPanel1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 823, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Nada", jPanel3);

        jMenu3.setText("Usuario administrador");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Abrir");
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Guardar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Salir");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("About");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jd_administrador.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout jd_administradorLayout = new javax.swing.GroupLayout(jd_administrador.getContentPane());
        jd_administrador.getContentPane().setLayout(jd_administradorLayout);
        jd_administradorLayout.setHorizontalGroup(
            jd_administradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_administradorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jd_administradorLayout.setVerticalGroup(
            jd_administradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_administradorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        tab.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabStateChanged(evt);
            }
        });

        texta.setColumns(20);
        texta.setRows(5);
        jScrollPane1.setViewportView(texta);

        jLabel26.setText("Esta parte la hice de balde jajaja xD");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addGap(85, 85, 85))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel26)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        tab.addTab("Vista", jPanel4);

        jl_p.setModel(new DefaultListModel()
        );
        jScrollPane7.setViewportView(jl_p);

        jButton4.setText("Ver Publicaciones");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jButton4))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton4)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        tab.addTab("Ver Publicaciones", jPanel6);

        jButton7.setText("Modificar");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButton8.setText("Eliminar");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jLabel19.setText("Nombre");

        jLabel20.setText("Correo");

        jLabel21.setText("Fecha Nacimiento");

        jLabel22.setText("Usuario");

        jLabel23.setText("Contraseña");

        new_fecha.setModel(new javax.swing.SpinnerDateModel());

        jButton9.setText("Actualizar");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jButton7)
                        .addGap(39, 39, 39)
                        .addComponent(jButton9)
                        .addGap(42, 42, 42)
                        .addComponent(jButton8))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel20))
                                        .addGap(18, 18, 18))))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel22))
                                .addGap(34, 34, 34)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuarui1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(new_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(403, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(new_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(usuarui1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addContainerGap(220, Short.MAX_VALUE))
        );

        tab.addTab("Informacion de Usuario ", jPanel7);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 851, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
        );

        tab.addTab("Nada", jPanel9);

        jLabel11.setText("hacer publicacion");

        buttonGroup3.add(bt_problema);
        bt_problema.setText("problemas");

        buttonGroup3.add(bt_repuestas);
        bt_repuestas.setText("respuestas");

        buttonGroup3.add(bt_comentario);
        bt_comentario.setText("comentarios");

        jLabel12.setText("ID");

        jLabel14.setText("mensaje");

        ta_mensaje.setColumns(20);
        ta_mensaje.setRows(5);
        jScrollPane5.setViewportView(ta_mensaje);

        buttonGroup2.add(bt_publico);
        bt_publico.setText("publico");

        buttonGroup2.add(bt_privado);
        bt_privado.setText("privado");

        buttonGroup2.add(bt_amigos);
        bt_amigos.setText("amigos");

        js_categoria.setModel(new javax.swing.SpinnerNumberModel(1, 1, 3, 1));

        jLabel15.setText("estado");

        jLabel16.setText("categoria");

        js_respuestas.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel17.setText("calificacion general");

        ta_comentario.setColumns(20);
        ta_comentario.setRows(5);
        jScrollPane6.setViewportView(ta_comentario);

        jButton3.setText("PUBLICAR");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        buttonGroup4.add(bt_cerrado);
        bt_cerrado.setSelected(true);
        bt_cerrado.setText("cerrado");

        buttonGroup4.add(bt_abierto);
        bt_abierto.setText("abierto");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bt_problema)
                            .addComponent(jLabel15)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(bt_cerrado)
                            .addComponent(bt_abierto)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(js_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_repuestas)
                            .addComponent(jLabel17)
                            .addComponent(js_respuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_comentario)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(208, 208, 208))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt_publico)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel12)
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_id)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(bt_privado))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_amigos)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel14)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(bt_privado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_publico, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_amigos)
                        .addGap(12, 12, 12)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(bt_abierto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(bt_problema)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addGap(9, 9, 9))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(bt_comentario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(bt_repuestas)
                        .addGap(21, 21, 21)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(js_respuestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_cerrado))
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(js_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(111, 111, 111))
        );

        tab.addTab("Crear Publicaciones", jPanel5);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("solicitudes");
        arbol.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        arbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arbolMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(arbol);

        tabla_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane9.setViewportView(tabla_usuarios);

        jLabel24.setText("usuarios");

        jButton10.setText("agregar a mis amigos");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        jLabel18.setText("solicitudes");

        jLabel25.setText("amigos");

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("amigos");
        arbol_amigos.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane10.setViewportView(arbol_amigos);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(jLabel25)
                .addGap(200, 200, 200))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jButton10)))
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(jLabel24)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap(305, Short.MAX_VALUE)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(jButton10)
                                .addGap(165, 165, 165)))))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        tab.addTab("Solicitud", jPanel8);

        jMenu5.setText("Usuario Normal");

        jMenuItem7.setText("Abrir");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuItem8.setText("Salir");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuItem10.setText("About");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        jMenuItem11.setText("Guardar");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        jMenuBar3.add(jMenu5);

        jMenu6.setText("Publicaciones");

        jMenuItem9.setText("Crear Publicaciones");
        jMenu6.add(jMenuItem9);

        jMenuBar3.add(jMenu6);

        jd_normal.setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout jd_normalLayout = new javax.swing.GroupLayout(jd_normal.getContentPane());
        jd_normal.getContentPane().setLayout(jd_normalLayout);
        jd_normalLayout.setHorizontalGroup(
            jd_normalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_normalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_normalLayout.setVerticalGroup(
            jd_normalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_normalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        agregar_amigos.setText("Agregar a mis amigos");
        agregar_amigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_amigosActionPerformed(evt);
            }
        });
        menu1.add(agregar_amigos);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Esto es un Mini Proyecto solo que es\nsin listas enlazadas, largo pero interesante\n\nGracias Por Progra 2!\n");
        jScrollPane11.setViewportView(jTextArea1);

        javax.swing.GroupLayout jd_aboutLayout = new javax.swing.GroupLayout(jd_about.getContentPane());
        jd_about.getContentPane().setLayout(jd_aboutLayout);
        jd_aboutLayout.setHorizontalGroup(
            jd_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_aboutLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jd_aboutLayout.setVerticalGroup(
            jd_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_aboutLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Administrador Examen!");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Iniciar Sesión");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenu2.setText("Registro");

        jMenuItem1.setText("Usuarios!");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenu1.add(jMenu2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jd_usuario.setModal(true);
        jd_usuario.pack();
        jd_usuario.setLocationRelativeTo(this);
        jd_usuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        JFileChooser fc = new JFileChooser();
        FileFilter filtro = new FileNameExtensionFilter("Imagenes", "png", "jpg", "jpeg", "gif");
        fc.setFileFilter(filtro);
        File archivo;
        int op = fc.showOpenDialog(jd_usuario);
        if (op == JFileChooser.APPROVE_OPTION) {
            archivo = fc.getSelectedFile();
            Image img = Toolkit.getDefaultToolkit().createImage(
                    archivo.getPath()).getScaledInstance(100, 100, 0);
            this.lb_imagen.setIcon(new ImageIcon(img));
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void agregar_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregar_usuarioMouseClicked
        if (rb_usuario_normal.isSelected()) {
            usuario.add(new usuario_normal(tf_nombre.getText(), tf_nombre.getText(), tf_correo.getText(),
                    (Date) js_fecha.getValue(), tf_usuario.getText(), tf_contraseña.getText(), lb_imagen.getIcon()));

            usuario_normal un = new usuario_normal(tf_nombre.getText(), tf_nombre.getText(), tf_correo.getText(),
                    (Date) js_fecha.getValue(), tf_usuario.getText(), tf_contraseña.getText(), lb_imagen.getIcon());
            admin_usuario_normal ad = new admin_usuario_normal("./usuarioNormal.bin");
            ad.cargarArchivo();
            ad.set_usuario_comun(un);
            ad.escribirArchivo();
            JOptionPane.showMessageDialog(jd_usuario, "Sos un Usuario Normal en mi Examen! :D");
            tf_nombre.setText("");
            tf_correo.setText("");
            tf_usuario.setText("");
            tf_contraseña.setText("");
            lb_imagen.setIcon(null);
        } else {
            usuario.add(new usuario_administrador(tf_nombre.getText(), tf_nombre.getText(), tf_correo.getText(),
                    (Date) js_fecha.getValue(), tf_usuario.getText(), tf_contraseña.getText(), lb_imagen.getIcon()));
            usuario_administrador x = new usuario_administrador(tf_nombre.getText(), tf_nombre.getText(), tf_correo.getText(),
                    (Date) js_fecha.getValue(), tf_usuario.getText(), tf_contraseña.getText(), lb_imagen.getIcon());
            admin_usuario_administrador ad = new admin_usuario_administrador("./usuarioAdministrador.cbm");
            ad.cargarArchivo();
            ad.set_usuario_administrador(x);
            ad.escribirArchivo();
            JOptionPane.showMessageDialog(jd_usuario, "Sos un Usuario Administrador en mi Examen! :D");
            tf_nombre.setText("");
            tf_correo.setText("");
            tf_usuario.setText("");
            tf_contraseña.setText("");
            lb_imagen.setIcon(null);
        }
    }//GEN-LAST:event_agregar_usuarioMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jd_login.setModal(true);
        jd_login.pack();
        jd_login.setLocationRelativeTo(this);
        jd_login.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void logingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logingMouseClicked
        admin_usuario_normal ap = new admin_usuario_normal("./usuarioNormal.bin");
        ap.cargarArchivo();
        admin_usuario_administrador ap2 = new admin_usuario_administrador("./usuarioAdministrador.bin");
        ap2.cargarArchivo();
        for (int i = 0; i < ap.getListas_usuario_normal().size(); i++) {
            if (tf_usuario_login.getText().equals(ap.getListas_usuario_normal().get(i).getUsuario())
                    && tf_contraseña_login.getText().equals(ap.getListas_usuario_normal().get(i).getContraseña())) {
                JOptionPane.showMessageDialog(jd_usuario, "Usuario Normal :D");
                usuario_normal_actual = (usuario_normal) ap.getListas_usuario_normal().get(i);
                nombre.setText(ap.getListas_usuario_normal().get(i).getNombre());
                correo.setText(ap.getListas_usuario_normal().get(i).getCorreo());
                fecha.setText(ap.getListas_usuario_normal().get(i).getFecha().toString());
                usuarui1.setText(ap.getListas_usuario_normal().get(i).getUsuario());
                contraseña.setText(ap.getListas_usuario_normal().get(i).getContraseña());
                jd_normal.setModal(true);
                jd_normal.pack();
                jd_normal.setLocationRelativeTo(this);
                jd_normal.setVisible(true);
                tf_contraseña_login.setText("");
                tf_usuario_login.setText("");
            }
        }
        for (int i = 0; i < ap2.getListas_usuario_administrador().size(); i++) {
            if (tf_usuario_login.getText().equals(ap2.getListas_usuario_administrador().get(i).getUsuario())
                    && tf_contraseña_login.getText().equals(ap2.getListas_usuario_administrador().get(i).getContraseña())) {
                JOptionPane.showMessageDialog(jd_usuario, "Usuario Administrador :D");
                jd_administrador.setModal(true);
                jd_administrador.pack();
                jd_administrador.setLocationRelativeTo(this);
                jd_administrador.setVisible(true);
                usuario_admin_actual = (usuario_administrador) ap2.getListas_usuario_administrador().get(i);
                tf_contraseña_login.setText("");
                tf_usuario_login.setText("");
            }
        }
    }//GEN-LAST:event_logingMouseClicked

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        admin_usuario_administrador ap = new admin_usuario_administrador("./administrador.bin");
        ap.cargarArchivo();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jTabbedPane2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane2StateChanged
        admin_usuario_normal ap = new admin_usuario_normal("./usuarioNormal.bin");
        ap.cargarArchivo();
        dtm.setRowCount(0);
        for (int i = 0; i < ap.getListas_usuario_normal().size(); i++) {
            modelo[0] = ap.getListas_usuario_normal().get(i);
            dtm.addRow(modelo);
            tabla1.setModel(dtm);
        }
        admin_comentarios c = new admin_comentarios("./Comentarios.bin");
        c.cargarArchivo();
        dtm2.setRowCount(0);
        for (int i = 0; i < c.getListas_comentarios().size(); i++) {
            modelo2[0] = ap.getListas_usuario_normal().get(i);
            dtm2.addRow(modelo2);
            tabla2.setModel(dtm2);
        }
        admin_problemas c2 = new admin_problemas("./problemas.cbm");
        c2.cargarArchivo();
        dtm2.setRowCount(0);
        for (int i = 0; i < c2.getListas_problemas().size(); i++) {
            modelo2[0] = c2.getListas_problemas().get(i);
            dtm2.addRow(modelo2);
            tabla2.setModel(dtm2);
        }
        admin_respuestas c3 = new admin_respuestas("./respuestas.cbm");
        c3.cargarArchivo();
        dtm2.setRowCount(0);
        for (int i = 0; i < c3.getListas_respuestas().size(); i++) {
            modelo2[0] = c3.getListas_respuestas().get(i);
            dtm2.addRow(modelo2);
            tabla2.setModel(dtm2);
        }
    }//GEN-LAST:event_jTabbedPane2StateChanged

    private void bloquear_normalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloquear_normalMouseClicked
        admin_usuario_administrador ad = new admin_usuario_administrador("./usuarioAdministrador.bin");
        ad.cargarArchivo();
        admin_usuario_normal ap = new admin_usuario_normal("./usuarioNormal.bin");
        ap.cargarArchivo();
        int filaselect = tabla1.getSelectedRow();
        if (filaselect >= 0) {
        } else {
            JOptionPane.showMessageDialog(jd_administrador, "No estas seleccionando ninguna Fila");
        }
    }//GEN-LAST:event_bloquear_normalMouseClicked

    private void bloquear_publicacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloquear_publicacionesMouseClicked

    }//GEN-LAST:event_bloquear_publicacionesMouseClicked

    private void bloquear_normalComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_bloquear_normalComponentHidden

    }//GEN-LAST:event_bloquear_normalComponentHidden

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        jd_administrador.setVisible(false);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;
        texta.setText("");
        try {
            JFileChooser jfc = new JFileChooser("./");
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto", "bin");
            jfc.setFileFilter(filtro);
            int seleccion = jfc.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                fichero = jfc.getSelectedFile();
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);
                String linea;
                texta.setText("");
                while ((linea = br.readLine()) != null) {
                    texta.append(linea);
                    texta.append("\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            br.close();
            fr.close();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        jd_normal.setVisible(false);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;
        tax2.setText("");
        try {
            JFileChooser jfc = new JFileChooser("./");
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto", "bin");
            jfc.setFileFilter(filtro);
            int seleccion = jfc.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                fichero = jfc.getSelectedFile();
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);
                String linea;
                tax2.setText("");
                while ((linea = br.readLine()) != null) {
                    tax2.append(linea);
                    tax2.append("\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            br.close();
            fr.close();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void agregar_amigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_amigosActionPerformed
        admin_usuario_normal ap = new admin_usuario_normal("./usuario_normal.bin");
        ap.cargarArchivo();
        String temp = usuario2;
        for (int i = 0; i < ap.getListas_usuario_normal().size(); i++) {
            if (ap.getListas_usuario_normal().get(i).getNombre().equals(nombre.getText())) {
                for (int j = 0; j < ap.getListas_usuario_normal().size(); j++) {
                    System.out.println(temp);
                    if (ap.getListas_usuario_normal().get(j).getNombre().equals(temp)) {
                        ap.getListas_usuario_normal().get(i).setAmigos(ap.getListas_usuario_normal().get(j));
                        ap.getListas_usuario_normal().get(j).setAmigos(ap.getListas_usuario_normal().get(i));
                        ap.escribirArchivo();
                        JOptionPane.showMessageDialog(jd_normal, "Esta Agregado :D");
                    }
                }
            }
        }
    }//GEN-LAST:event_agregar_amigosActionPerformed

    private void tabStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabStateChanged
        admin_usuario_normal ap = new admin_usuario_normal("./usuarioNormal.bin");
        ap.cargarArchivo();
        if (tab.getSelectedIndex() == 4) {
            DefaultTreeModel modelo_arbol = (DefaultTreeModel) arbol.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo_arbol.getRoot();
            raiz.removeAllChildren();
            modelo_arbol.reload();
            for (int i = 0; i < ap.getListas_usuario_normal().size(); i++) {
                if (ap.getListas_usuario_normal().get(i).getNombre().equals(nombre.getText())) {
                    for (int j = 0; j < ap.getListas_usuario_normal().get(i).getSolicitudes().size(); j++) {
                        raiz.add(new DefaultMutableTreeNode(ap.getListas_usuario_normal().get(i).getSolicitudes().get(j)));
                        arbol.setModel(new DefaultTreeModel(raiz));
                        modelo_arbol.reload();
                    }
                }
            }
        }
        if (tab.getSelectedIndex() == 4) {
            DefaultTreeModel modelo_arbol2 = (DefaultTreeModel) arbol_amigos.getModel();
            DefaultMutableTreeNode raiz2 = (DefaultMutableTreeNode) modelo_arbol2.getRoot();
            raiz2.removeAllChildren();
            modelo_arbol2.reload();
            for (int i = 0; i < ap.getListas_usuario_normal().size(); i++) {
                if (ap.getListas_usuario_normal().get(i).getNombre().equals(nombre.getText())) {
                    for (int j = 0; j < ap.getListas_usuario_normal().get(i).getAmigos().size(); j++) {
                        raiz2.add(new DefaultMutableTreeNode(ap.getListas_usuario_normal().get(i).getAmigos().get(j)));
                        arbol_amigos.setModel(new DefaultTreeModel(raiz2));
                        modelo_arbol2.reload();
                    }
                }
            }
        }

        if (tab.getSelectedIndex() == 3) {
            dtm3.setRowCount(0);
            for (int i = 0; i < ap.getListas_usuario_normal().size(); i++) {
                if (!ap.getListas_usuario_normal().get(i).equals(usuario_normal_actual)) {
                    modelo3[0] = ap.getListas_usuario_normal().get(i);
                    dtm3.addRow(modelo3);
                    tabla_usuarios.setModel(dtm3);
                }
            }
        }
    }//GEN-LAST:event_tabStateChanged

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        admin_usuario_normal ap = new admin_usuario_normal("./usuario_normal.cbm");
        ap.cargarArchivo();
        String p = "";
        String estado;
        Date f = new Date();
        if (bt_problema.isSelected()) {
            if (bt_privado.isSelected()) {
                p = "privado";
            } else {
                if (bt_publico.isSelected()) {
                    p = "publico";
                } else {
                    p = "amigos";
                }
            }
            if (bt_cerrado.isSelected()) {
                estado = "cerrado";
            } else {
                estado = "abierto";
            }
            publicacion.add(new problemas(estado, Integer.parseInt(js_categoria.getValue().toString()), tf_id.getText(), ta_mensaje.getText(), usuario_normal_actual, p, f));
            problemas publi = new problemas(estado, Integer.parseInt(js_categoria.getValue().toString()), tf_id.getText(), ta_mensaje.getText(), usuario_normal_actual, p, f);
            admin_problemas ad = new admin_problemas("./Problemas.bin");
            ad.cargarArchivo();
            ad.set_problemas(publi);
            ad.escribirArchivo();
            for (int i = 0; i < ap.getListas_usuario_normal().size(); i++) {
                if (ap.getListas_usuario_normal().get(i).equals(usuario_normal_actual)) {
                    ap.getListas_usuario_normal().get(i).setPublicaciones((publicaciones) publi);
                }
            }
            JOptionPane.showMessageDialog(jd_normal, "Problema Publicado");
        }
        if (bt_comentario.isSelected()) {
            if (bt_privado.isSelected()) {
                p = "privado";
            } else {
                if (bt_publico.isSelected()) {
                    p = "publico";
                } else {
                    p = "amigos";
                }
            }
            publicacion.add(new comentarios(ta_comentario.getText(), tf_id.getText(), ta_mensaje.getText(), usuario_normal_actual, p, f));
            comentarios comen = new comentarios(ta_comentario.getText(), tf_id.getText(), ta_mensaje.getText(), usuario_normal_actual, p, f);
            admin_comentarios ad1 = new admin_comentarios("./Comentarios.bin");
            ad1.cargarArchivo();
            ad1.set_comentarios(comen);
            ad1.escribirArchivo();
            for (int i = 0; i < ap.getListas_usuario_normal().size(); i++) {
                if (ap.getListas_usuario_normal().get(i).equals(usuario_normal_actual)) {
                    ap.getListas_usuario_normal().get(i).setPublicaciones((publicaciones) comen);
                }
            }
            JOptionPane.showMessageDialog(jd_normal, "Comentario Publicado");
        }
        if (bt_repuestas.isSelected()) {
            if (bt_privado.isSelected()) {
                p = "privado";
            } else {
                if (bt_publico.isSelected()) {
                    p = "publico";
                } else {
                    p = "amigos";
                }
            }
            publicacion.add(new Respuestas(Integer.parseInt(js_respuestas.getValue().toString()), tf_id.getText(), ta_mensaje.getText(), usuario_normal_actual, p, f));
            Respuestas res = new Respuestas(Integer.parseInt(js_respuestas.getValue().toString()), tf_id.getText(), ta_mensaje.getText(), usuario_normal_actual, p, f);
            admin_respuestas ad2 = new admin_respuestas("./respuestas.bin");
            ad2.cargarArchivo();
            ad2.set_respuestas(res);
            ad2.escribirArchivo();
            for (int i = 0; i < ap.getListas_usuario_normal().size(); i++) {
                if (ap.getListas_usuario_normal().get(i).equals(usuario_normal_actual)) {
                    ap.getListas_usuario_normal().get(i).setPublicaciones((publicaciones) res);
                }
            }
            JOptionPane.showMessageDialog(jd_normal, "Respuesta Publicada");
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        int z = tabla_usuarios.getSelectedRow();
        if (z >= 0) {
            admin_usuario_normal ap = new admin_usuario_normal("./usuarioNormal.bin");
            ap.cargarArchivo();
            for (int i = 0; i < ap.getListas_usuario_normal().size(); i++) {
                if (ap.getListas_usuario_normal().get(i).getNombre().equals(nombre.getText())) {
                    for (int j = 0; j < ap.getListas_usuario_normal().size(); j++) {
                        if (j == z) {
                            solicitudes sol = new solicitudes(ap.getListas_usuario_normal().get(i), ap.getListas_usuario_normal().get(j));
                            admin_solicitudes ad = new admin_solicitudes("./Solicitudes");
                            ad.cargarArchivo();
                            ad.set_solicitud(sol);
                            ad.escribirArchivo();
                            ap.getListas_usuario_normal().get(j).setSolicitudes(sol);
                            ap.escribirArchivo();
                            JOptionPane.showMessageDialog(jd_administrador, "Solicitud enviada con exito a: " + ap.getListas_usuario_normal().get(j));
                        }
                    }
                    ap.escribirArchivo();
                }
            }
        }
    }//GEN-LAST:event_jButton10MouseClicked

    private void arbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arbolMouseClicked
        if (evt.isMetaDown()) {
            int row = arbol.getClosestRowForLocation(evt.getX(), evt.getY());
            arbol.setSelectionRow(row);//Seleccionar fila
            Object v1 = arbol.getSelectionPath().getLastPathComponent();
            nodo_seleccionado = (DefaultMutableTreeNode) v1;
            System.out.println(nodo_seleccionado.getUserObject().toString());
            if (nodo_seleccionado.getUserObject() instanceof solicitudes) {
                usuario2 = nodo_seleccionado.getUserObject().toString();
                menu1.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_arbolMouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        usuario_normal_actual.setNombre(nombre.getText());
        usuario_normal_actual.setCorreo(correo.getText());
        usuario_normal_actual.setFecha((Date) new_fecha.getValue());
        usuario_normal_actual.setUsuario(usuarui1.getText());
        usuario_normal_actual.setContraseña(contraseña.getText());
        JOptionPane.showMessageDialog(jd_normal, "Usuario Modificado con Exito");
        fecha.setText(new_fecha.getValue().toString());
        nombre.setEditable(false);
        correo.setEditable(false);
        new_fecha.setEnabled(false);
        usuarui1.setEditable(false);
        contraseña.setEditable(false);
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        admin_usuario_normal ap = new admin_usuario_normal("./usuarioNormal.bin");
        ap.cargarArchivo();
        for (int i = 0; i < ap.getListas_usuario_normal().size(); i++) {
            if (ap.getListas_usuario_normal().get(i).getNombre().equals(nombre.getText())) {
                ap.getListas_usuario_normal().remove(i);
                ap.escribirArchivo();
                jd_normal.setVisible(false);
            }
        }
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        JOptionPane.showMessageDialog(jd_normal, "Modifique lo que desea!");
        nombre.setEditable(true);
        correo.setEditable(true);
        new_fecha.setEnabled(true);
        usuarui1.setEditable(true);
        contraseña.setEditable(true);
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultListModel model = (DefaultListModel) jl_p.getModel();
        model.removeAllElements();
        jl_p.setModel(model);
        admin_comentarios a = new admin_comentarios("./Comentarios.bin");
        a.cargarArchivo();
        admin_respuestas b = new admin_respuestas("./Respuestas.bin");
        b.cargarArchivo();
        admin_problemas c = new admin_problemas("./Problemas.bin");
        c.cargarArchivo();
        for (int i = 0; i < a.getListas_comentarios().size(); i++) {
            model.addElement(a.getListas_comentarios().get(i));
        }
        for (int i = 0; i < b.getListas_respuestas().size(); i++) {
            model.addElement(b.getListas_respuestas().get(i));
        }
        for (int i = 0; i < c.getListas_problemas().size(); i++) {
            model.addElement(c.getListas_problemas().get(i));
        }
        jl_p.setModel(model);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        File Archivo;
        int cont = 0;
        String path = "";
        if (cont > 0) {
            Archivo = new File(path);
            FileOutputStream fw = null;
            ObjectOutputStream bw = null;
            try {
                fw = new FileOutputStream(Archivo);
                bw = new ObjectOutputStream(fw);
                for (Usuario l : usuario) {
                    bw.writeObject(l);
                }
                for (publicaciones h : publicacion) {
                    bw.writeObject(h);
                }
                for (Respuestas s : respuesta) {
                    bw.writeObject(s);
                }
                for (problemas ss : problema) {
                    bw.writeObject(ss);
                }
                for (comentarios c : comentario) {
                    bw.writeObject(c);
                }
                bw.flush();
            } catch (Exception ex) {
            } finally {
                try {
                    bw.close();
                    fw.close();
                } catch (Exception ex) {
                }
            }
        } else {
            JFileChooser fcs = new JFileChooser();
            int aprove = fcs.showSaveDialog(this);
            if (aprove == JFileChooser.APPROVE_OPTION) {
                File fs = fcs.getSelectedFile();
                path = fs.getAbsolutePath();
                FileOutputStream fw = null;
                ObjectOutputStream bw = null;
                try {
                    fw = new FileOutputStream(fs);
                    bw = new ObjectOutputStream(fw);
                    for (Usuario l : usuario) {
                        bw.writeObject(l);
                    }
                    for (publicaciones h : publicacion) {
                        bw.writeObject(h);
                    }
                    for (Respuestas s : respuesta) {
                        bw.writeObject(s);
                    }
                    for (problemas ss : problema) {
                        bw.writeObject(ss);
                    }
                    for (comentarios c : comentario) {
                        bw.writeObject(c);
                    }
                    bw.flush();
                } catch (Exception ex) {
                } finally {
                    try {
                        bw.close();
                        fw.close();
                    } catch (Exception ex) {
                    }
                }
            }
        }
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        jd_about.setModal(true);
        jd_about.pack();
        jd_about.setLocationRelativeTo(this);
        jd_about.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        jd_about.setModal(true);
        jd_about.pack();
        jd_about.setLocationRelativeTo(this);
        jd_about.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem agregar_amigos;
    private javax.swing.JButton agregar_usuario;
    private javax.swing.JTree arbol;
    private javax.swing.JTree arbol_amigos;
    private javax.swing.JButton bloquear_normal;
    private javax.swing.JButton bloquear_publicaciones;
    private javax.swing.JRadioButton bt_abierto;
    private javax.swing.JRadioButton bt_amigos;
    private javax.swing.JRadioButton bt_cerrado;
    private javax.swing.JRadioButton bt_comentario;
    private javax.swing.JRadioButton bt_privado;
    private javax.swing.JRadioButton bt_problema;
    private javax.swing.JRadioButton bt_publico;
    private javax.swing.JRadioButton bt_repuestas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JTextField contraseña;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JDialog jd_about;
    private javax.swing.JDialog jd_administrador;
    private javax.swing.JDialog jd_login;
    private javax.swing.JDialog jd_normal;
    private javax.swing.JDialog jd_usuario;
    private javax.swing.JList<String> jl_p;
    private javax.swing.JSpinner js_categoria;
    private javax.swing.JSpinner js_fecha;
    private javax.swing.JSpinner js_respuestas;
    private javax.swing.JLabel lb_imagen;
    private javax.swing.JButton loging;
    private javax.swing.JPopupMenu menu1;
    private javax.swing.JSpinner new_fecha;
    private javax.swing.JTextField nombre;
    private javax.swing.JRadioButton rb_usuario_admin;
    private javax.swing.JRadioButton rb_usuario_normal;
    private javax.swing.JTextArea ta_comentario;
    private javax.swing.JTextArea ta_mensaje;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTable tabla1;
    private javax.swing.JTable tabla2;
    private javax.swing.JTable tabla_usuarios;
    private javax.swing.JTextArea tax2;
    private javax.swing.JTextArea texta;
    private javax.swing.JTextField tf_contraseña;
    private javax.swing.JTextField tf_contraseña_login;
    private javax.swing.JTextField tf_correo;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_usuario;
    private javax.swing.JTextField tf_usuario_login;
    private javax.swing.JTextField usuarui1;
    // End of variables declaration//GEN-END:variables
    ArrayList<solicitudes> solicitud = new ArrayList();
    DefaultMutableTreeNode nodo_seleccionado;
    String usuario2;
    ArrayList<Usuario> usuario = new ArrayList();
    ArrayList<publicaciones> publicacion = new ArrayList();
    ArrayList<Respuestas> respuesta = new ArrayList();
    ArrayList<comentarios> comentario = new ArrayList();
    ArrayList<problemas> problema = new ArrayList();
    usuario_normal usuario_normal_actual;
    usuario_administrador usuario_admin_actual;
}
