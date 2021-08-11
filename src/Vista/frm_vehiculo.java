/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Modelo.Automovil;
import Modelo.Avion;
import Modelo.Helicoptero;
import Modelo.Moto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author justo
 */
public class frm_vehiculo extends javax.swing.JFrame {

    /**
     * Creates new form frm_vehiculo
     */
    DefaultTableModel t_automovil;
    DefaultTableModel t_moto;
    DefaultTableModel t_avion;
    DefaultTableModel t_helicoptero;
    int entrada = 0;
    public frm_vehiculo() {
        initComponents();
        
        JOptionPane.showMessageDialog(rootPane, "Para agregar un vehiculo debera seleccionar el tipo de vehiculo completo, por lo que el boton agregar no aparecera hasta completar la seleccion","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        
        t_automovil = new DefaultTableModel();
        String encabezado[]={"Modelo","Tipo moto","color","No. llantas","No. chasis","Tipo luces","Tipo frenos","Tipo escape","No. placa","Carroceria","Marca","Tarjeta circulacion","No. puertas","No. asientos","Vehiculo"};
        t_automovil.setColumnIdentifiers(encabezado);
        tbl_automovil.setModel(t_automovil);
        
        t_moto = new DefaultTableModel();
        String encabezado2[]={"Modelo","Tipo modelo","color","No. llantas","No. chasis","Tipo luces","Tipo frenos","Tipo escape","No. placa","Marca","Tipo manigueta","Tipo pedales","No. rin","Vehiculo"};
        t_moto.setColumnIdentifiers(encabezado2);
        tbl_moto.setModel(t_moto);
        
        t_avion = new DefaultTableModel();
        String encabezado3[]={"Modelo","Tipo modelo","color","No. llantas","No. chasis","Tipo cola","Tipo fuselaje","Tipo alerones","Tipo estabilizador","Tipo tren aterrizaje","Vehiculo"};
        t_avion.setColumnIdentifiers(encabezado3);
        tbl_avion.setModel(t_avion);
        
        t_helicoptero = new DefaultTableModel();
        String encabezado4[]={"Modelo","Tipo modelo","color","No. llantas","No. chasis","Tipo cola","Tipo fuselaje","Tipo patin cola","Tipo mastil","Tipo patin aterrizaje","Numero elices","Vehiculo"};
        t_helicoptero.setColumnIdentifiers(encabezado4);
        tbl_helicoptero.setModel(t_helicoptero);
        
        lbl_tipo_luces.setVisible(false); 
        lbl_tipo_frenos.setVisible(false); 
        lbl_tipo_escape.setVisible(false); 
        lbl_numero_placa.setVisible(false); 
        lbl_tipo_cola.setVisible(false); 
        lbl_tipo_fuselaje.setVisible(false); 
        
        lbl_carroceria.setVisible(false); 
        lbl_marca.setVisible(false); 
        lbl_tarjeta_circulacion.setVisible(false); 
        lbl_numero_puertas.setVisible(false); 
        lbl_numero_asientos.setVisible(false); 
        
        lbl_marca2.setVisible(false); 
        lbl_tipo_manigueta.setVisible(false); 
        lbl_tipo_pedales.setVisible(false); 
        lbl_numero_rin.setVisible(false); 
        
        lbl_tipo_alerones.setVisible(false); 
        lbl_tipo_estabilizador.setVisible(false); 
        lbl_tipo_tren_aterrizaje.setVisible(false); 
        
        lbl_tipo_patin_cola.setVisible(false); 
        lbl_tipo_mastil.setVisible(false); 
        lbl_tipo_patin_aterrizaje.setVisible(false); 
        lbl_numero_elices.setVisible(false); 


//-----------------------------------------------------

        
        txt_tipo_luces.setVisible(false); 
        txt_tipo_frenos.setVisible(false); 
        txt_tipo_escape.setVisible(false); 
        txt_numero_placa.setVisible(false); 
        txt_tipo_cola.setVisible(false); 
        txt_tipo_fuselaje.setVisible(false); 
        
        txt_carroceria.setVisible(false); 
        txt_marca.setVisible(false); 
        txt_tarjeta_circulacion.setVisible(false); 
        txt_numero_puertas.setVisible(false); 
        txt_numero_asientos.setVisible(false); 
        
        txt_marca2.setVisible(false); 
        txt_tipo_manigueta.setVisible(false); 
        txt_tipo_pedales.setVisible(false); 
        txt_numero_rin.setVisible(false);
        
        txt_tipo_alerones.setVisible(false); 
        txt_tipo_estabilizador.setVisible(false); 
        txt_tipo_tren_aterrizaje.setVisible(false); 
        
        txt_tipo_patin_cola.setVisible(false); 
        txt_tipo_mastil.setVisible(false); 
        txt_tipo_patin_aterrizaje.setVisible(false); 
        txt_numero_elices.setVisible(false); 
        
        //==========================
        combo_tipo_vehiculo_terrestre.setVisible(false);
        combo_tipo_vehiculo_aereo.setVisible(false);
        lbl_tipo_vehiculo_terrestre.setVisible(false);
        lbl_tipo_vehiculo_aereo.setVisible(false);
        
        
        
        //------BOTON-----
        btn_agregar.setVisible(false);
           
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_modelo = new javax.swing.JTextField();
        txt_tipo_motor = new javax.swing.JTextField();
        txt_color = new javax.swing.JTextField();
        txt_numero_llantas = new javax.swing.JTextField();
        txt_numero_chasis = new javax.swing.JTextField();
        combo_tipo_vehiculo = new javax.swing.JComboBox<>();
        lbl_tipo_luces = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_tipo_frenos = new javax.swing.JLabel();
        lbl_tipo_escape = new javax.swing.JLabel();
        lbl_numero_placa = new javax.swing.JLabel();
        txt_tipo_luces = new javax.swing.JTextField();
        txt_tipo_frenos = new javax.swing.JTextField();
        txt_tipo_escape = new javax.swing.JTextField();
        txt_numero_placa = new javax.swing.JTextField();
        lbl_tipo_cola = new javax.swing.JLabel();
        lbl_tipo_fuselaje = new javax.swing.JLabel();
        txt_tipo_cola = new javax.swing.JTextField();
        txt_tipo_fuselaje = new javax.swing.JTextField();
        combo_tipo_vehiculo_terrestre = new javax.swing.JComboBox<>();
        lbl_tipo_vehiculo_terrestre = new javax.swing.JLabel();
        lbl_tipo_vehiculo_aereo = new javax.swing.JLabel();
        combo_tipo_vehiculo_aereo = new javax.swing.JComboBox<>();
        lbl_carroceria = new javax.swing.JLabel();
        lbl_marca = new javax.swing.JLabel();
        lbl_tarjeta_circulacion = new javax.swing.JLabel();
        lbl_numero_puertas = new javax.swing.JLabel();
        lbl_numero_asientos = new javax.swing.JLabel();
        txt_carroceria = new javax.swing.JTextField();
        txt_marca = new javax.swing.JTextField();
        txt_tarjeta_circulacion = new javax.swing.JTextField();
        txt_numero_puertas = new javax.swing.JTextField();
        txt_numero_asientos = new javax.swing.JTextField();
        lbl_marca2 = new javax.swing.JLabel();
        lbl_tipo_manigueta = new javax.swing.JLabel();
        lbl_tipo_pedales = new javax.swing.JLabel();
        lbl_numero_rin = new javax.swing.JLabel();
        txt_marca2 = new javax.swing.JTextField();
        txt_tipo_manigueta = new javax.swing.JTextField();
        txt_tipo_pedales = new javax.swing.JTextField();
        txt_numero_rin = new javax.swing.JTextField();
        lbl_tipo_alerones = new javax.swing.JLabel();
        lbl_tipo_estabilizador = new javax.swing.JLabel();
        lbl_tipo_tren_aterrizaje = new javax.swing.JLabel();
        txt_tipo_alerones = new javax.swing.JTextField();
        txt_tipo_estabilizador = new javax.swing.JTextField();
        txt_tipo_tren_aterrizaje = new javax.swing.JTextField();
        lbl_tipo_patin_cola = new javax.swing.JLabel();
        lbl_tipo_mastil = new javax.swing.JLabel();
        lbl_tipo_patin_aterrizaje = new javax.swing.JLabel();
        lbl_numero_elices = new javax.swing.JLabel();
        txt_tipo_patin_cola = new javax.swing.JTextField();
        txt_tipo_mastil = new javax.swing.JTextField();
        txt_tipo_patin_aterrizaje = new javax.swing.JTextField();
        txt_numero_elices = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        jtb_vehiculo = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_automovil = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_moto = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_avion = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_helicoptero = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Modelo");

        jLabel2.setText("Tipo de motor");

        jLabel3.setText("Color");

        jLabel4.setText("Numero de llantas");

        jLabel5.setText("Numero de chasis");

        combo_tipo_vehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Vehiculo-aereo", "Vehiculo-terrestre" }));
        combo_tipo_vehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tipo_vehiculoActionPerformed(evt);
            }
        });

        lbl_tipo_luces.setText("Tipo de luces");

        jLabel6.setText("Tipo de vehiculo");

        lbl_tipo_frenos.setText("Tipo de frenos");

        lbl_tipo_escape.setText("Tipo de escape");

        lbl_numero_placa.setText("Numero de placa");

        lbl_tipo_cola.setText("Tipo de cola");

        lbl_tipo_fuselaje.setText("Tipo de fuselaje");

        combo_tipo_vehiculo_terrestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Automovil", "Moto" }));
        combo_tipo_vehiculo_terrestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tipo_vehiculo_terrestreActionPerformed(evt);
            }
        });

        lbl_tipo_vehiculo_terrestre.setText("Tipo de Vehiculo terrestre");

        lbl_tipo_vehiculo_aereo.setText("Tipo vehiculo aereo");

        combo_tipo_vehiculo_aereo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Avion", "Helicoptero", " " }));
        combo_tipo_vehiculo_aereo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tipo_vehiculo_aereoActionPerformed(evt);
            }
        });

        lbl_carroceria.setText("Carroceria");

        lbl_marca.setText("Marca");

        lbl_tarjeta_circulacion.setText("Tarjeta de circulacion");

        lbl_numero_puertas.setText("Numero de puertas");

        lbl_numero_asientos.setText("Numero de asientos");

        lbl_marca2.setText("Marca");

        lbl_tipo_manigueta.setText("Tipo de manigueta");

        lbl_tipo_pedales.setText("Tipo de pedales");

        lbl_numero_rin.setText("Numero de rin");

        lbl_tipo_alerones.setText("Tipo de alerones");

        lbl_tipo_estabilizador.setText("Tipo de estabilizador");

        lbl_tipo_tren_aterrizaje.setText("Tipo de tren de aterrizaje");

        lbl_tipo_patin_cola.setText("Tipo de patin cola");

        lbl_tipo_mastil.setText("Tipo de mastil");

        lbl_tipo_patin_aterrizaje.setText("Tipo de patin aterrizaje");

        lbl_numero_elices.setText("Numero de elices");

        btn_agregar.setBackground(new java.awt.Color(0, 204, 0));
        btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        tbl_automovil.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbl_automovil);

        jtb_vehiculo.addTab("Automovil", jScrollPane2);

        tbl_moto.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tbl_moto);

        jtb_vehiculo.addTab("Moto", jScrollPane3);

        tbl_avion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tbl_avion);

        jtb_vehiculo.addTab("Avion", jScrollPane4);

        tbl_helicoptero.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(tbl_helicoptero);

        jtb_vehiculo.addTab("Helicoptero", jScrollPane5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txt_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_tipo_motor))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_color))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_numero_llantas))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_numero_chasis)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_tipo_luces)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_tipo_luces, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_tipo_frenos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_tipo_frenos))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_tipo_escape)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_tipo_escape))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_numero_placa)
                                    .addComponent(lbl_tipo_vehiculo_terrestre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combo_tipo_vehiculo_terrestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_numero_placa))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_tipo_cola)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_tipo_cola, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_tipo_fuselaje)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_tipo_fuselaje)))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_carroceria)
                                    .addComponent(lbl_marca))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_carroceria, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(txt_marca)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_tipo_vehiculo_aereo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(combo_tipo_vehiculo_aereo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_numero_puertas)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_numero_puertas))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_numero_asientos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_numero_asientos))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_tarjeta_circulacion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_tarjeta_circulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_numero_rin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_numero_rin))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_tipo_pedales)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_tipo_pedales))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_marca2)
                                .addGap(18, 18, 18)
                                .addComponent(txt_marca2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_tipo_manigueta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_tipo_manigueta, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(lbl_tipo_alerones)
                                .addGap(18, 18, 18)
                                .addComponent(txt_tipo_alerones, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_tipo_tren_aterrizaje)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_tipo_tren_aterrizaje, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_tipo_estabilizador)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_tipo_estabilizador, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_tipo_patin_cola)
                                    .addComponent(lbl_tipo_mastil))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_tipo_patin_cola, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(txt_tipo_mastil)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_numero_elices)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_numero_elices))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_tipo_patin_aterrizaje)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_tipo_patin_aterrizaje, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_tipo_vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btn_agregar)))
                .addContainerGap(570, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jtb_vehiculo)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tipo_luces)
                    .addComponent(txt_tipo_luces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tipo_cola)
                    .addComponent(txt_tipo_cola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_carroceria)
                    .addComponent(txt_carroceria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_marca2)
                    .addComponent(txt_marca2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tipo_alerones)
                    .addComponent(txt_tipo_alerones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tipo_patin_cola)
                    .addComponent(txt_tipo_patin_cola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_tipo_manigueta)
                        .addComponent(txt_tipo_manigueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_tipo_estabilizador)
                        .addComponent(txt_tipo_estabilizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_tipo_mastil)
                        .addComponent(txt_tipo_mastil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_tipo_motor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_tipo_frenos)
                            .addComponent(txt_tipo_frenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_tipo_fuselaje)
                            .addComponent(txt_tipo_fuselaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_marca))
                        .addComponent(txt_marca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txt_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txt_numero_llantas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txt_numero_chasis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_tipo_patin_aterrizaje)
                                    .addComponent(txt_tipo_patin_aterrizaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_numero_elices)
                                    .addComponent(txt_numero_elices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combo_tipo_vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(btn_agregar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_tipo_escape)
                            .addComponent(txt_tipo_escape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_tipo_vehiculo_aereo)
                            .addComponent(combo_tipo_vehiculo_aereo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_tarjeta_circulacion)
                            .addComponent(txt_tarjeta_circulacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_numero_placa)
                            .addComponent(txt_numero_placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_numero_puertas)
                            .addComponent(txt_numero_puertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(combo_tipo_vehiculo_terrestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_tipo_vehiculo_terrestre)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_numero_asientos)
                                    .addComponent(txt_numero_asientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_tipo_pedales)
                            .addComponent(txt_tipo_pedales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_numero_rin)
                            .addComponent(txt_numero_rin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_tipo_tren_aterrizaje)
                            .addComponent(txt_tipo_tren_aterrizaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jtb_vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void esconder(){
        lbl_tipo_luces.setVisible(false); 
        lbl_tipo_frenos.setVisible(false); 
        lbl_tipo_escape.setVisible(false); 
        lbl_numero_placa.setVisible(false); 
        lbl_tipo_cola.setVisible(false); 
        lbl_tipo_fuselaje.setVisible(false); 
        
        lbl_carroceria.setVisible(false); 
        lbl_marca.setVisible(false); 
        lbl_tarjeta_circulacion.setVisible(false); 
        lbl_numero_puertas.setVisible(false); 
        lbl_numero_asientos.setVisible(false); 
        
        lbl_marca2.setVisible(false); 
        lbl_tipo_manigueta.setVisible(false); 
        lbl_tipo_pedales.setVisible(false); 
        lbl_numero_rin.setVisible(false); 
        
        lbl_tipo_alerones.setVisible(false); 
        lbl_tipo_estabilizador.setVisible(false); 
        lbl_tipo_tren_aterrizaje.setVisible(false); 
        
        lbl_tipo_patin_cola.setVisible(false); 
        lbl_tipo_mastil.setVisible(false); 
        lbl_tipo_patin_aterrizaje.setVisible(false); 
        lbl_numero_elices.setVisible(false); 


//-----------------------------------------------------

        
        txt_tipo_luces.setVisible(false); 
        txt_tipo_frenos.setVisible(false); 
        txt_tipo_escape.setVisible(false); 
        txt_numero_placa.setVisible(false); 
        txt_tipo_cola.setVisible(false); 
        txt_tipo_fuselaje.setVisible(false); 
        
        txt_carroceria.setVisible(false); 
        txt_marca.setVisible(false); 
        txt_tarjeta_circulacion.setVisible(false); 
        txt_numero_puertas.setVisible(false); 
        txt_numero_asientos.setVisible(false); 
        
        txt_marca2.setVisible(false); 
        txt_tipo_manigueta.setVisible(false); 
        txt_tipo_pedales.setVisible(false); 
        txt_numero_rin.setVisible(false);
        
        txt_tipo_alerones.setVisible(false); 
        txt_tipo_estabilizador.setVisible(false); 
        txt_tipo_tren_aterrizaje.setVisible(false); 
        
        txt_tipo_patin_cola.setVisible(false); 
        txt_tipo_mastil.setVisible(false); 
        txt_tipo_patin_aterrizaje.setVisible(false); 
        txt_numero_elices.setVisible(false); 
        
        //==========================
        combo_tipo_vehiculo_terrestre.setVisible(false);
        combo_tipo_vehiculo_aereo.setVisible(false);
        lbl_tipo_vehiculo_terrestre.setVisible(false);
        lbl_tipo_vehiculo_aereo.setVisible(false);
        
        
        
        //------BOTON-----
        btn_agregar.setVisible(false);
    }
    
    private void limpiar(){
        txt_modelo.setText("");
        txt_tipo_motor.setText("");
        txt_color.setText("");
        txt_numero_llantas.setText("");
        txt_numero_chasis.setText("");
        txt_tipo_luces.setText("");
        txt_tipo_frenos.setText("");
        txt_tipo_escape.setText("");
        txt_numero_placa.setText("");
        txt_carroceria.setText("");
        txt_marca.setText("");
        txt_tarjeta_circulacion.setText("");
        txt_numero_puertas.setText("");
        txt_numero_asientos.setText("");
        txt_marca2.setText("");
        txt_tipo_manigueta.setText("");
        txt_tipo_pedales.setText("");
        txt_numero_rin.setText("");
        txt_tipo_cola.setText("");
        txt_tipo_fuselaje.setText("");
        txt_tipo_alerones.setText("");
        txt_tipo_estabilizador.setText("");
        txt_tipo_tren_aterrizaje.setText("");
        txt_tipo_patin_cola.setText("");
        txt_tipo_mastil.setText("");
        txt_tipo_patin_aterrizaje.setText("");
        txt_numero_elices.setText("");
        combo_tipo_vehiculo.setSelectedIndex(0);
        combo_tipo_vehiculo_terrestre.setSelectedIndex(0);
        combo_tipo_vehiculo_aereo.setSelectedIndex(0);
    }
    
    private void combo_tipo_vehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tipo_vehiculoActionPerformed
        // TODO add your handling code here:

        String opcion = (String) combo_tipo_vehiculo.getSelectedItem();
        
        if(opcion.equals("Vehiculo-terrestre")){
            lbl_tipo_luces.setVisible(true); 
            lbl_tipo_frenos.setVisible(true); 
            lbl_tipo_escape.setVisible(true); 
            lbl_numero_placa.setVisible(true); 
            
            txt_tipo_luces.setVisible(true); 
            txt_tipo_frenos.setVisible(true); 
            txt_tipo_escape.setVisible(true); 
            txt_numero_placa.setVisible(true); 
            
            combo_tipo_vehiculo_aereo.setVisible(false);
            lbl_tipo_vehiculo_aereo.setVisible(false);
            combo_tipo_vehiculo_terrestre.setVisible(true);
            lbl_tipo_vehiculo_terrestre.setVisible(true);
            
            
            //------------------------------
            lbl_tipo_cola.setVisible(false); 
            lbl_tipo_fuselaje.setVisible(false); 

            txt_tipo_cola.setVisible(false); 
            txt_tipo_fuselaje.setVisible(false); 
            
            
            //==============================================
            txt_carroceria.setVisible(false); 
            txt_marca.setVisible(false); 
            txt_tarjeta_circulacion.setVisible(false); 
            txt_numero_puertas.setVisible(false); 
            txt_numero_asientos.setVisible(false); 

            txt_marca2.setVisible(false); 
            txt_tipo_manigueta.setVisible(false); 
            txt_tipo_pedales.setVisible(false); 
            txt_numero_rin.setVisible(false);

            txt_tipo_alerones.setVisible(false); 
            txt_tipo_estabilizador.setVisible(false); 
            txt_tipo_tren_aterrizaje.setVisible(false); 

            txt_tipo_patin_cola.setVisible(false); 
            txt_tipo_mastil.setVisible(false); 
            txt_tipo_patin_aterrizaje.setVisible(false); 
            txt_numero_elices.setVisible(false); 
            
            lbl_carroceria.setVisible(false); 
            lbl_marca.setVisible(false); 
            lbl_tarjeta_circulacion.setVisible(false); 
            lbl_numero_puertas.setVisible(false); 
            lbl_numero_asientos.setVisible(false); 

            lbl_marca2.setVisible(false); 
            lbl_tipo_manigueta.setVisible(false); 
            lbl_tipo_pedales.setVisible(false); 
            lbl_numero_rin.setVisible(false); 

            lbl_tipo_alerones.setVisible(false); 
            lbl_tipo_estabilizador.setVisible(false); 
            lbl_tipo_tren_aterrizaje.setVisible(false); 

            lbl_tipo_patin_cola.setVisible(false); 
            lbl_tipo_mastil.setVisible(false); 
            lbl_tipo_patin_aterrizaje.setVisible(false); 
            lbl_numero_elices.setVisible(false); 
        }else{
            if(opcion.equals("Vehiculo-aereo")){
                lbl_tipo_cola.setVisible(true); 
                lbl_tipo_fuselaje.setVisible(true); 

                txt_tipo_cola.setVisible(true); 
                txt_tipo_fuselaje.setVisible(true); 
                
                combo_tipo_vehiculo_aereo.setVisible(true);
                lbl_tipo_vehiculo_aereo.setVisible(true);
                combo_tipo_vehiculo_terrestre.setVisible(false);
                lbl_tipo_vehiculo_terrestre.setVisible(false);
                
                
                //-----------------------------------
                lbl_tipo_luces.setVisible(false); 
                lbl_tipo_frenos.setVisible(false); 
                lbl_tipo_escape.setVisible(false); 
                lbl_numero_placa.setVisible(false); 

                txt_tipo_luces.setVisible(false); 
                txt_tipo_frenos.setVisible(false); 
                txt_tipo_escape.setVisible(false); 
                txt_numero_placa.setVisible(false); 
                
                //===================
                txt_carroceria.setVisible(false); 
                txt_marca.setVisible(false); 
                txt_tarjeta_circulacion.setVisible(false); 
                txt_numero_puertas.setVisible(false); 
                txt_numero_asientos.setVisible(false); 

                txt_marca2.setVisible(false); 
                txt_tipo_manigueta.setVisible(false); 
                txt_tipo_pedales.setVisible(false); 
                txt_numero_rin.setVisible(false);

                txt_tipo_alerones.setVisible(false); 
                txt_tipo_estabilizador.setVisible(false); 
                txt_tipo_tren_aterrizaje.setVisible(false); 

                txt_tipo_patin_cola.setVisible(false); 
                txt_tipo_mastil.setVisible(false); 
                txt_tipo_patin_aterrizaje.setVisible(false); 
                txt_numero_elices.setVisible(false); 
                
                lbl_carroceria.setVisible(false); 
                lbl_marca.setVisible(false); 
                lbl_tarjeta_circulacion.setVisible(false); 
                lbl_numero_puertas.setVisible(false); 
                lbl_numero_asientos.setVisible(false); 

                lbl_marca2.setVisible(false); 
                lbl_tipo_manigueta.setVisible(false); 
                lbl_tipo_pedales.setVisible(false); 
                lbl_numero_rin.setVisible(false); 

                lbl_tipo_alerones.setVisible(false); 
                lbl_tipo_estabilizador.setVisible(false); 
                lbl_tipo_tren_aterrizaje.setVisible(false); 

                lbl_tipo_patin_cola.setVisible(false); 
                lbl_tipo_mastil.setVisible(false); 
                lbl_tipo_patin_aterrizaje.setVisible(false); 
                lbl_numero_elices.setVisible(false); 
                
            }
        }
        
        
       
    }//GEN-LAST:event_combo_tipo_vehiculoActionPerformed

    private void combo_tipo_vehiculo_terrestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tipo_vehiculo_terrestreActionPerformed
        // TODO add your handling code here:
        String opcion2 = (String) combo_tipo_vehiculo_terrestre.getSelectedItem();
        
        if(opcion2.equals("Automovil")){
            lbl_carroceria.setVisible(true); 
            lbl_marca.setVisible(true); 
            lbl_tarjeta_circulacion.setVisible(true); 
            lbl_numero_puertas.setVisible(true); 
            lbl_numero_asientos.setVisible(true); 
            
            //----------------------------------------
            txt_carroceria.setVisible(true); 
            txt_marca.setVisible(true); 
            txt_tarjeta_circulacion.setVisible(true); 
            txt_numero_puertas.setVisible(true); 
            txt_numero_asientos.setVisible(true);
   
            btn_agregar.setVisible(true);
            
            //-----------------------
            //-----------------------
            
            lbl_marca2.setVisible(false); 
            lbl_tipo_manigueta.setVisible(false); 
            lbl_tipo_pedales.setVisible(false); 
            lbl_numero_rin.setVisible(false); 
                
            //--------------------
                
            txt_marca2.setVisible(false); 
            txt_tipo_manigueta.setVisible(false); 
            txt_tipo_pedales.setVisible(false); 
            txt_numero_rin.setVisible(false);
            
            entrada = 1;
        }else{
            if(opcion2.equals("Moto")){
                lbl_marca2.setVisible(true); 
                lbl_tipo_manigueta.setVisible(true); 
                lbl_tipo_pedales.setVisible(true); 
                lbl_numero_rin.setVisible(true); 
                
                //--------------------
                
                txt_marca2.setVisible(true); 
                txt_tipo_manigueta.setVisible(true); 
                txt_tipo_pedales.setVisible(true); 
                txt_numero_rin.setVisible(true);
                
                btn_agregar.setVisible(true);

                //------------------
                //------------------
                
                lbl_carroceria.setVisible(false); 
                lbl_marca.setVisible(false); 
                lbl_tarjeta_circulacion.setVisible(false); 
                lbl_numero_puertas.setVisible(false); 
                lbl_numero_asientos.setVisible(false); 

                //----------------------------------------
                txt_carroceria.setVisible(false); 
                txt_marca.setVisible(false); 
                txt_tarjeta_circulacion.setVisible(false); 
                txt_numero_puertas.setVisible(false); 
                txt_numero_asientos.setVisible(false);
                
                entrada = 2;
            }
        }
    }//GEN-LAST:event_combo_tipo_vehiculo_terrestreActionPerformed

    private void combo_tipo_vehiculo_aereoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tipo_vehiculo_aereoActionPerformed
        // TODO add your handling code here:
        String opcion2 = (String) combo_tipo_vehiculo_aereo.getSelectedItem();
        
        if(opcion2.equals("Avion")){
            lbl_tipo_alerones.setVisible(true); 
            lbl_tipo_estabilizador.setVisible(true); 
            lbl_tipo_tren_aterrizaje.setVisible(true); 
     
            //----------------------------------------
            txt_tipo_alerones.setVisible(true); 
            txt_tipo_estabilizador.setVisible(true); 
            txt_tipo_tren_aterrizaje.setVisible(true); 
            
            btn_agregar.setVisible(true);
 
            //-----------------------
            //-----------------------
            
            lbl_tipo_patin_cola.setVisible(false); 
            lbl_tipo_mastil.setVisible(false); 
            lbl_tipo_patin_aterrizaje.setVisible(false); 
            lbl_numero_elices.setVisible(false);  
                
            //--------------------
                
            txt_tipo_patin_cola.setVisible(false); 
            txt_tipo_patin_aterrizaje.setVisible(false); 
            txt_numero_elices.setVisible(false); 
            
            entrada = 3;
        }else{
            if(opcion2.equals("Helicoptero")){
                lbl_tipo_patin_cola.setVisible(true); 
                lbl_tipo_mastil.setVisible(true); 
                lbl_tipo_patin_aterrizaje.setVisible(true); 
                lbl_numero_elices.setVisible(true);  
                
                //--------------------
                
                txt_tipo_patin_cola.setVisible(true); 
                txt_tipo_mastil.setVisible(true); 
                txt_tipo_patin_aterrizaje.setVisible(true); 
                txt_numero_elices.setVisible(true); 
                
                btn_agregar.setVisible(true);

                //------------------
                //------------------
                
                lbl_tipo_alerones.setVisible(false); 
                lbl_tipo_estabilizador.setVisible(false); 
                lbl_tipo_tren_aterrizaje.setVisible(false); 

                //----------------------------------------
                txt_tipo_alerones.setVisible(false); 
                txt_tipo_estabilizador.setVisible(false); 
                txt_tipo_tren_aterrizaje.setVisible(false); 
                
                entrada = 4;
            }
        }
    }//GEN-LAST:event_combo_tipo_vehiculo_aereoActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        // TODO add your handling code here:
         
        if(entrada == 1){
            String datos[] = new String[15];
            datos[0] = txt_modelo.getText();
            datos[1] = txt_tipo_motor.getText();
            datos[2] = txt_color.getText();
            datos[3] = txt_numero_llantas.getText();
            datos[4] = txt_numero_chasis.getText();
            datos[5] = txt_tipo_luces.getText();
            datos[6] = txt_tipo_frenos.getText();
            datos[7] = txt_tipo_escape.getText();
            datos[8] = txt_numero_placa.getText();
            datos[9] = txt_carroceria.getText();
            datos[10] = txt_marca.getText();
            datos[11] = txt_tarjeta_circulacion.getText();
            datos[12] = txt_numero_puertas.getText();
            datos[13] = txt_numero_asientos.getText();
            datos[14] = combo_tipo_vehiculo_terrestre.getSelectedItem().toString();
           t_automovil.addRow(datos);
           JOptionPane.showMessageDialog(rootPane, "Ingreso Correcto, Los datos se muestran en la pestaña AUTOMOVIL","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        }else{
            if(entrada == 2){
                String datos2[] = new String[14];
                datos2[0] = txt_modelo.getText();
                datos2[1] = txt_tipo_motor.getText();
                datos2[2] = txt_color.getText();
                datos2[3] = txt_numero_llantas.getText();
                datos2[4] = txt_numero_chasis.getText();
                datos2[5] = txt_tipo_luces.getText();
                datos2[6] = txt_tipo_frenos.getText();
                datos2[7] = txt_tipo_escape.getText();
                datos2[8] = txt_numero_placa.getText();
                datos2[9] = txt_marca2.getText();
                datos2[10] = txt_tipo_manigueta.getText();
                datos2[11] = txt_tipo_pedales.getText();
                datos2[12] = txt_numero_rin.getText();
                datos2[13] = combo_tipo_vehiculo_terrestre.getSelectedItem().toString();
               t_moto.addRow(datos2);
               JOptionPane.showMessageDialog(rootPane, "Ingreso Correcto, Los datos se muestran en la pestaña MOTO","Mensaje",JOptionPane.INFORMATION_MESSAGE);
            }else{
                if(entrada == 3){
                    
                    String datos2[] = new String[11];    
                    datos2[0] = txt_modelo.getText();
                    datos2[1] = txt_tipo_motor.getText();
                    datos2[2] = txt_color.getText();
                    datos2[3] = txt_numero_llantas.getText();
                    datos2[4] = txt_numero_chasis.getText();
                    datos2[5] = txt_tipo_cola.getText();
                    datos2[6] = txt_tipo_fuselaje.getText();
                    datos2[7] = txt_tipo_alerones.getText();
                    datos2[8] = txt_tipo_estabilizador.getText();
                    datos2[9] = txt_tipo_tren_aterrizaje.getText();
                    datos2[10] = combo_tipo_vehiculo_aereo.getSelectedItem().toString();
                    t_avion.addRow(datos2);
                    JOptionPane.showMessageDialog(rootPane, "Ingreso Correcto, Los datos se muestran en la pestaña AVION","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    String datos2[] = new String[12];    
                    datos2[0] = txt_modelo.getText();
                    datos2[1] = txt_tipo_motor.getText();
                    datos2[2] = txt_color.getText();
                    datos2[3] = txt_numero_llantas.getText();
                    datos2[4] = txt_numero_chasis.getText();
                    datos2[5] = txt_tipo_cola.getText();
                    datos2[6] = txt_tipo_fuselaje.getText();
                    datos2[7] = txt_tipo_patin_cola.getText();
                    datos2[8] = txt_tipo_mastil.getText();
                    datos2[9] = txt_tipo_patin_aterrizaje.getText();
                    datos2[10] = txt_numero_elices.getText();
                    datos2[11] = combo_tipo_vehiculo_aereo.getSelectedItem().toString();
                    t_helicoptero.addRow(datos2);
                    JOptionPane.showMessageDialog(rootPane, "Ingreso Correcto, Los datos se muestran en la pestaña HELICOPTERO","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        limpiar();
        esconder();
    }//GEN-LAST:event_btn_agregarActionPerformed

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
            java.util.logging.Logger.getLogger(frm_vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_vehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JComboBox<String> combo_tipo_vehiculo;
    private javax.swing.JComboBox<String> combo_tipo_vehiculo_aereo;
    private javax.swing.JComboBox<String> combo_tipo_vehiculo_terrestre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jtb_vehiculo;
    private javax.swing.JLabel lbl_carroceria;
    private javax.swing.JLabel lbl_marca;
    private javax.swing.JLabel lbl_marca2;
    private javax.swing.JLabel lbl_numero_asientos;
    private javax.swing.JLabel lbl_numero_elices;
    private javax.swing.JLabel lbl_numero_placa;
    private javax.swing.JLabel lbl_numero_puertas;
    private javax.swing.JLabel lbl_numero_rin;
    private javax.swing.JLabel lbl_tarjeta_circulacion;
    private javax.swing.JLabel lbl_tipo_alerones;
    private javax.swing.JLabel lbl_tipo_cola;
    private javax.swing.JLabel lbl_tipo_escape;
    private javax.swing.JLabel lbl_tipo_estabilizador;
    private javax.swing.JLabel lbl_tipo_frenos;
    private javax.swing.JLabel lbl_tipo_fuselaje;
    private javax.swing.JLabel lbl_tipo_luces;
    private javax.swing.JLabel lbl_tipo_manigueta;
    private javax.swing.JLabel lbl_tipo_mastil;
    private javax.swing.JLabel lbl_tipo_patin_aterrizaje;
    private javax.swing.JLabel lbl_tipo_patin_cola;
    private javax.swing.JLabel lbl_tipo_pedales;
    private javax.swing.JLabel lbl_tipo_tren_aterrizaje;
    private javax.swing.JLabel lbl_tipo_vehiculo_aereo;
    private javax.swing.JLabel lbl_tipo_vehiculo_terrestre;
    private javax.swing.JTable tbl_automovil;
    private javax.swing.JTable tbl_avion;
    private javax.swing.JTable tbl_helicoptero;
    private javax.swing.JTable tbl_moto;
    private javax.swing.JTextField txt_carroceria;
    private javax.swing.JTextField txt_color;
    private javax.swing.JTextField txt_marca;
    private javax.swing.JTextField txt_marca2;
    private javax.swing.JTextField txt_modelo;
    private javax.swing.JTextField txt_numero_asientos;
    private javax.swing.JTextField txt_numero_chasis;
    private javax.swing.JTextField txt_numero_elices;
    private javax.swing.JTextField txt_numero_llantas;
    private javax.swing.JTextField txt_numero_placa;
    private javax.swing.JTextField txt_numero_puertas;
    private javax.swing.JTextField txt_numero_rin;
    private javax.swing.JTextField txt_tarjeta_circulacion;
    private javax.swing.JTextField txt_tipo_alerones;
    private javax.swing.JTextField txt_tipo_cola;
    private javax.swing.JTextField txt_tipo_escape;
    private javax.swing.JTextField txt_tipo_estabilizador;
    private javax.swing.JTextField txt_tipo_frenos;
    private javax.swing.JTextField txt_tipo_fuselaje;
    private javax.swing.JTextField txt_tipo_luces;
    private javax.swing.JTextField txt_tipo_manigueta;
    private javax.swing.JTextField txt_tipo_mastil;
    private javax.swing.JTextField txt_tipo_motor;
    private javax.swing.JTextField txt_tipo_patin_aterrizaje;
    private javax.swing.JTextField txt_tipo_patin_cola;
    private javax.swing.JTextField txt_tipo_pedales;
    private javax.swing.JTextField txt_tipo_tren_aterrizaje;
    // End of variables declaration//GEN-END:variables
}
