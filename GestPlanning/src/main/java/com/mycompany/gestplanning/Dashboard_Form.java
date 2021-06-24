package com.mycompany.gestplanning;


import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1BestCsharp
 */
public class Dashboard_Form extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard_Form
     */
    
    // default border for the menu items
    Border default_border = BorderFactory.createMatteBorder(1, 0, 1, 0, new Color(46,49,49));
        
    // yellow border for the menu items
    Border yellow_border = BorderFactory.createMatteBorder(1, 0, 1, 0, Color.YELLOW);
    
    // create an array of jlabels
    JLabel[] menuLabels = new JLabel[7];
    
    // create an array of jpanels
    JPanel[] panels = new JPanel[7];
    
    public Dashboard_Form() {
        initComponents();
        
        // center this form
        this.setLocationRelativeTo(null);
        
        // set icons

        
        
        // set borders
        // panel logo border
        Border panelBorder = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.lightGray);
        jPanel_logoANDname.setBorder(panelBorder);
        // panel container border
        Border containerBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(46,49,49));
        jPanel_container.setBorder(containerBorder);
        
        // populate the menuLabels array
        // you can use a for loop to do that
        menuLabels[0] = jLabel_menuItem1;
        menuLabels[1] = jLabel_menuItem2;
        menuLabels[2] = jLabel_menuItem3;
        menuLabels[3] = jLabel_menuItem4;
        menuLabels[4] = jLabel_menuItem5;
        menuLabels[5] = jLabel_menuItem6;
        menuLabels[6] = jLabel_menuItem7;
        
        // populate the panels array
        panels[0] = jPanel_dashboard;
        panels[1] = jPanel_users;
        panels[2] = jPanel_products;
        panels[3] = jPanel_settings;
        panels[4] = jPanel_contact;
        panels[5] = jPanel_calendar;
        panels[6] = jPanel_test;
        
        addActionToMenuLabels();
        
    }

    
    // create a function to set the label background color
    public void setLabelBackround(JLabel label)
    {
        // reset labels to their default design
        for (JLabel menuItem : menuLabels)
        {
           // change the jlabel background color to white
           menuItem.setBackground(new Color(46,49,49));
           // change the jlabel Foreground color to blue
           menuItem.setForeground(Color.white); 
        }
        
        // change the jlabel background color to white
        label.setBackground(Color.white);
        // change the jlabel Foreground color to blue
        label.setForeground(Color.blue);
    }
    
    // create a function to show the selected panel
    public void showPanel(JPanel panel)
    {
        // hide panels
        for (JPanel pnl : panels) 
        {
            pnl.setVisible(false);
        }
        
        // and show only this panel
        panel.setVisible(true);
    }
    
    
    
    public void addActionToMenuLabels()
    {
        // get labels in the jpanel menu
        Component[] components = jPanel_menu.getComponents();
        
        for (Component component : components) {
            if(component instanceof JLabel)
            {
                JLabel label = (JLabel) component;
                
                label.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        
                        // change the jlabel background and Foreground
                        setLabelBackround(label);
                        
                        // displa the selected panel
                        switch (label.getText().trim()){
                            case "Dashboard":
                                   showPanel(jPanel_dashboard);
                                   break;
                                   
                            case "Users":
                                   showPanel(jPanel_users);
                                   // jPanel_users.setBackground(Color.red);
                                   break;
                                   
                            case "Products":
                                   showPanel(jPanel_products);
                                   // jPanel_products.setBackground(Color.BLUE);
                                   break;
                                   
                                   case "Settings":
                                   showPanel(jPanel_settings);
                                   // jPanel_settings.setBackground(Color.GRAY);
                                   break;
                                   
                                   case "Contact":
                                   showPanel(jPanel_contact);
                                   // jPanel_contact.setBackground(Color.GREEN);
                                   break;
                                   
                                   case "Calendar":
                                   showPanel(jPanel_calendar);
                                   // jPanel_calendar.setBackground(Color.yellow);
                                   break;
                                   
                                   case "Test":
                                   showPanel(jPanel_test);
                                   // jPanel_test.setBackground(Color.orange);
                                   break;
                                   
                        }
                        
                      }

                    @Override
                    public void mousePressed(MouseEvent e) {
                     }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                      }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        
                        // set the border to yellow
                        label.setBorder(yellow_border);
                        
                      }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        
                        // reset to the default border
                        label.setBorder(default_border);
                        
                      }
                });
                
            }
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_container = new javax.swing.JPanel();
        jPanel_menu = new javax.swing.JPanel();
        jPanel_logoANDname = new javax.swing.JPanel();
        jLabel_appLogo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel_menuItem1 = new javax.swing.JLabel();
        jLabel_menuItem3 = new javax.swing.JLabel();
        jLabel_menuItem2 = new javax.swing.JLabel();
        jLabel_menuItem4 = new javax.swing.JLabel();
        jLabel_menuItem5 = new javax.swing.JLabel();
        jLabel_menuItem6 = new javax.swing.JLabel();
        jLabel_menuItem7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_close = new javax.swing.JLabel();
        jPanel_dashboard = new javax.swing.JPanel();
        jPanel_products = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel_users = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel_settings = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel_contact = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel_calendar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel_test = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel_container.setBackground(new java.awt.Color(255, 255, 255));

        jPanel_menu.setBackground(new java.awt.Color(46, 49, 49));

        jPanel_logoANDname.setBackground(new java.awt.Color(46, 49, 49));

        jLabel_appLogo.setBackground(new java.awt.Color(153, 255, 204));
        jLabel_appLogo.setOpaque(true);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("MyApp");

        javax.swing.GroupLayout jPanel_logoANDnameLayout = new javax.swing.GroupLayout(jPanel_logoANDname);
        jPanel_logoANDname.setLayout(jPanel_logoANDnameLayout);
        jPanel_logoANDnameLayout.setHorizontalGroup(
            jPanel_logoANDnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_logoANDnameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_appLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_logoANDnameLayout.setVerticalGroup(
            jPanel_logoANDnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_logoANDnameLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel_logoANDnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_appLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel_menuItem1.setBackground(new java.awt.Color(46, 49, 49));
        jLabel_menuItem1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel_menuItem1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_menuItem1.setText("  Dashboard");
        jLabel_menuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_menuItem1.setOpaque(true);

        jLabel_menuItem3.setBackground(new java.awt.Color(46, 49, 49));
        jLabel_menuItem3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel_menuItem3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_menuItem3.setText("  Products");
        jLabel_menuItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_menuItem3.setOpaque(true);

        jLabel_menuItem2.setBackground(new java.awt.Color(46, 49, 49));
        jLabel_menuItem2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel_menuItem2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_menuItem2.setText("  Users");
        jLabel_menuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_menuItem2.setOpaque(true);

        jLabel_menuItem4.setBackground(new java.awt.Color(46, 49, 49));
        jLabel_menuItem4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel_menuItem4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_menuItem4.setText("  Settings");
        jLabel_menuItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_menuItem4.setOpaque(true);

        jLabel_menuItem5.setBackground(new java.awt.Color(46, 49, 49));
        jLabel_menuItem5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel_menuItem5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_menuItem5.setText("  Contact");
        jLabel_menuItem5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_menuItem5.setOpaque(true);

        jLabel_menuItem6.setBackground(new java.awt.Color(46, 49, 49));
        jLabel_menuItem6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel_menuItem6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_menuItem6.setText("  Calendar");
        jLabel_menuItem6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_menuItem6.setOpaque(true);

        jLabel_menuItem7.setBackground(new java.awt.Color(46, 49, 49));
        jLabel_menuItem7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel_menuItem7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_menuItem7.setText("  Test");
        jLabel_menuItem7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_menuItem7.setOpaque(true);

        javax.swing.GroupLayout jPanel_menuLayout = new javax.swing.GroupLayout(jPanel_menu);
        jPanel_menu.setLayout(jPanel_menuLayout);
        jPanel_menuLayout.setHorizontalGroup(
            jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_logoANDname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_menuItem1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(jLabel_menuItem4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_menuItem2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_menuItem3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_menuItem5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_menuItem6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_menuItem7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_menuLayout.setVerticalGroup(
            jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menuLayout.createSequentialGroup()
                .addComponent(jPanel_logoANDname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel_menuItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_menuItem2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_menuItem3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_menuItem4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_menuItem5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_menuItem6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_menuItem7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(46, 49, 49));

        jLabel_close.setBackground(new java.awt.Color(46, 49, 49));
        jLabel_close.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_close.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_close.setText(" X");
        jLabel_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_close.setOpaque(true);
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_close, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        jPanel_dashboard.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel_dashboardLayout = new javax.swing.GroupLayout(jPanel_dashboard);
        jPanel_dashboard.setLayout(jPanel_dashboardLayout);
        jPanel_dashboardLayout.setHorizontalGroup(
            jPanel_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 912, Short.MAX_VALUE)
        );
        jPanel_dashboardLayout.setVerticalGroup(
            jPanel_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
        );

        jPanel_products.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Products");

        javax.swing.GroupLayout jPanel_productsLayout = new javax.swing.GroupLayout(jPanel_products);
        jPanel_products.setLayout(jPanel_productsLayout);
        jPanel_productsLayout.setHorizontalGroup(
            jPanel_productsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_productsLayout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
        );
        jPanel_productsLayout.setVerticalGroup(
            jPanel_productsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_productsLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        jPanel_users.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Users");

        javax.swing.GroupLayout jPanel_usersLayout = new javax.swing.GroupLayout(jPanel_users);
        jPanel_users.setLayout(jPanel_usersLayout);
        jPanel_usersLayout.setHorizontalGroup(
            jPanel_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_usersLayout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(406, Short.MAX_VALUE))
        );
        jPanel_usersLayout.setVerticalGroup(
            jPanel_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_usersLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        jPanel_settings.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Settings");

        javax.swing.GroupLayout jPanel_settingsLayout = new javax.swing.GroupLayout(jPanel_settings);
        jPanel_settings.setLayout(jPanel_settingsLayout);
        jPanel_settingsLayout.setHorizontalGroup(
            jPanel_settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_settingsLayout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(383, Short.MAX_VALUE))
        );
        jPanel_settingsLayout.setVerticalGroup(
            jPanel_settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_settingsLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        jPanel_contact.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("Contact");

        javax.swing.GroupLayout jPanel_contactLayout = new javax.swing.GroupLayout(jPanel_contact);
        jPanel_contact.setLayout(jPanel_contactLayout);
        jPanel_contactLayout.setHorizontalGroup(
            jPanel_contactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_contactLayout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(380, Short.MAX_VALUE))
        );
        jPanel_contactLayout.setVerticalGroup(
            jPanel_contactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_contactLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        jPanel_calendar.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText("Calendar");

        javax.swing.GroupLayout jPanel_calendarLayout = new javax.swing.GroupLayout(jPanel_calendar);
        jPanel_calendar.setLayout(jPanel_calendarLayout);
        jPanel_calendarLayout.setHorizontalGroup(
            jPanel_calendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_calendarLayout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(379, Short.MAX_VALUE))
        );
        jPanel_calendarLayout.setVerticalGroup(
            jPanel_calendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_calendarLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        jPanel_test.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setText("Test");

        javax.swing.GroupLayout jPanel_testLayout = new javax.swing.GroupLayout(jPanel_test);
        jPanel_test.setLayout(jPanel_testLayout);
        jPanel_testLayout.setHorizontalGroup(
            jPanel_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_testLayout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(380, Short.MAX_VALUE))
        );
        jPanel_testLayout.setVerticalGroup(
            jPanel_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_testLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_containerLayout = new javax.swing.GroupLayout(jPanel_container);
        jPanel_container.setLayout(jPanel_containerLayout);
        jPanel_containerLayout.setHorizontalGroup(
            jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_containerLayout.createSequentialGroup()
                .addComponent(jPanel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_containerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_containerLayout.createSequentialGroup()
                    .addGap(0, 207, Short.MAX_VALUE)
                    .addComponent(jPanel_users, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_containerLayout.createSequentialGroup()
                    .addGap(0, 207, Short.MAX_VALUE)
                    .addComponent(jPanel_products, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_containerLayout.createSequentialGroup()
                    .addGap(0, 202, Short.MAX_VALUE)
                    .addComponent(jPanel_settings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_containerLayout.createSequentialGroup()
                    .addGap(0, 205, Short.MAX_VALUE)
                    .addComponent(jPanel_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_containerLayout.createSequentialGroup()
                    .addGap(0, 206, Short.MAX_VALUE)
                    .addComponent(jPanel_calendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_containerLayout.createSequentialGroup()
                    .addGap(0, 205, Short.MAX_VALUE)
                    .addComponent(jPanel_test, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel_containerLayout.setVerticalGroup(
            jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_containerLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_containerLayout.createSequentialGroup()
                    .addGap(0, 42, Short.MAX_VALUE)
                    .addComponent(jPanel_users, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_containerLayout.createSequentialGroup()
                    .addGap(0, 44, Short.MAX_VALUE)
                    .addComponent(jPanel_products, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_containerLayout.createSequentialGroup()
                    .addGap(0, 41, Short.MAX_VALUE)
                    .addComponent(jPanel_settings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_containerLayout.createSequentialGroup()
                    .addGap(0, 39, Short.MAX_VALUE)
                    .addComponent(jPanel_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_containerLayout.createSequentialGroup()
                    .addGap(0, 39, Short.MAX_VALUE)
                    .addComponent(jPanel_calendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_containerLayout.createSequentialGroup()
                    .addGap(0, 41, Short.MAX_VALUE)
                    .addComponent(jPanel_test, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        // close this form
        this.dispose();

    }//GEN-LAST:event_jLabel_closeMouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_appLogo;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_menuItem1;
    private javax.swing.JLabel jLabel_menuItem2;
    private javax.swing.JLabel jLabel_menuItem3;
    private javax.swing.JLabel jLabel_menuItem4;
    private javax.swing.JLabel jLabel_menuItem5;
    private javax.swing.JLabel jLabel_menuItem6;
    private javax.swing.JLabel jLabel_menuItem7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_calendar;
    private javax.swing.JPanel jPanel_contact;
    private javax.swing.JPanel jPanel_container;
    private javax.swing.JPanel jPanel_dashboard;
    private javax.swing.JPanel jPanel_logoANDname;
    private javax.swing.JPanel jPanel_menu;
    private javax.swing.JPanel jPanel_products;
    private javax.swing.JPanel jPanel_settings;
    private javax.swing.JPanel jPanel_test;
    private javax.swing.JPanel jPanel_users;
    // End of variables declaration//GEN-END:variables
}
