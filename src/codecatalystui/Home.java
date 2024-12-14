package codecatalystui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Stack;
import javax.swing.*;

public class Home extends JFrame {
    private Stack<Jobs> jobs; // Use a Stack to hold jobs
    private ArrayList<Jobs> allJobs; // List to hold all jobs for filtering
    private JPanel mainPanel;
    private JPanel jobPanel;

    public Home() {
        jobs = new Stack<>(); // Initialize the stack
        allJobs = new ArrayList<>(); // Initialize the list for all jobs
        initComponent();
        populateJobs();
    }

    private void initComponent() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null); // Center the window

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(67, 67, 172));

        // Header Panel
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(61, 61, 157));
        headerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        JLabel titleLabel = new JLabel("CODE CATALYST");
        titleLabel.setFont(new Font("Copperplate Gothic Bold", 1, 58));
        titleLabel.setForeground(Color.WHITE);
        headerPanel.add(titleLabel);

        // Search Panel
        JPanel searchPanel = new JPanel();
        searchPanel.setBackground(new Color(84, 84, 167));
        searchPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JLabel searchLabel = new JLabel("Search:");
        searchLabel.setForeground(Color.WHITE);
        searchLabel.setFont(new Font("Arial", Font.BOLD, 20));

        JTextField searchField = new JTextField(20);
        searchField.setToolTipText("Enter job title or location");
        searchField.setPreferredSize(new Dimension(250, 30));

        JButton searchButton = new JButton("Search");
        searchButton.setBackground(new Color(108, 108, 190));
        searchButton.setForeground(Color.WHITE);
        searchButton.setFocusPainted(false);
        searchButton.setBorderPainted(false);
        searchButton.setFont(new Font("Arial", Font.BOLD, 16));
        searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String query = searchField.getText();
                filterJobs(query);
            }
        });

        searchPanel.add(searchLabel);
        searchPanel.add(searchField);
        searchPanel.add(searchButton);

        // Job Listings Panel
        jobPanel = new JPanel();
        jobPanel.setLayout(new BoxLayout(jobPanel, BoxLayout.Y_AXIS)); // Stack job items vertically
        JScrollPane jobScrollPane = new JScrollPane(jobPanel);
        jobScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jobScrollPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jobScrollPane.setPreferredSize(new Dimension(800, 400)); // Set preferred size for the scroll pane

        // Add components to main panel
        mainPanel.add(headerPanel, BorderLayout.NORTH);
        mainPanel.add(searchPanel, BorderLayout.CENTER);
        mainPanel.add(jobScrollPane, BorderLayout.SOUTH); // Add scroll pane to the bottom

        getContentPane().add(mainPanel);
        pack();
    }

    private void populateJobs() {
        // Example job data
        addJob(new Jobs("1", "Manager", "Balanga", 80000, "09123456789"));
        addJob(new Jobs("2", "Developer", "Angeles", 70000, "09234567890"));
        addJob(new Jobs("3", "Analyst", "Pasay", 60000, "09345678901"));
        addJob(new Jobs("4", "Designer", "Taguig", 65000, "09456789012"));
        addJob(new Jobs("5", "Data Scientist", "Balanga", 90000, "095678 90123"));
        addJob(new Jobs("6", "Product Manager", "Olongapo", 95000, "09678901234"));
        addJob(new Jobs("7", "HR Specialist", "Muntinlupa", 55000, "09789012345"));
        addJob(new Jobs("8", "Web Developer", "San Fernando", 72000, "09890123456"));
        addJob(new Jobs("9", "System Administrator", "Balanga", 75000, "09901234567"));
        addJob(new Jobs("10", "Marketing Coordinator", "Taguig", 50000, "09123456780"));
        addJob(new Jobs("11", "Sales Executive", "Angeles", 60000, "09234567891"));
        addJob(new Jobs("12", "Business Analyst", "Olongapo", 70000, "09345678902"));
        addJob(new Jobs("13", "Network Engineer", "Pasay", 80000, "09456789013"));
        addJob(new Jobs("14", "Content Writer", "Caloocan", 45000, "09567890124"));
        addJob(new Jobs("15", "SEO Specialist", "Quezon", 55000, "09678901235"));
        addJob(new Jobs("16", "Quality Assurance Engineer", "Balanga", 65000, "09789012346"));
        addJob(new Jobs("17", "Database Administrator", "Taguig", 75000, "09890123457"));
        addJob(new Jobs("18", "Graphic Designer", "Pasig", 60000, "09901234568"));
        addJob(new Jobs("19", "Financial Analyst", "Muntinlupa", 70000, "09123456789"));
        addJob(new Jobs("20", "Operations Manager", "Balanga", 85000, "09234567890"));

        displayJobs(); // Call to display the jobs after populating
    }

    private void addJob(Jobs job) {
        jobs.push(job);
        allJobs.add(job); // Add to the list of all jobs
    }

    private void displayJobs() {
        jobPanel.removeAll(); // Clear existing panels
        for (Jobs job : jobs) {
            JPanel jobItemPanel = new JPanel();
            jobItemPanel.setLayout(new BorderLayout()); // Use BorderLayout for positioning
            jobItemPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
            jobItemPanel.setBackground(Color.WHITE);
            jobItemPanel.setPreferredSize(new Dimension(500, 50));

            // Create a panel for job details
            JPanel jobDetailsPanel = new JPanel();
            jobDetailsPanel.setLayout(new FlowLayout(FlowLayout.LEFT)); // Left align job details

            JLabel jobTitleLabel = new JLabel(job.getTitle());
            jobTitleLabel.setFont(new Font("Arial", Font.BOLD, 16));
            jobTitleLabel.setPreferredSize(new Dimension(200, 30));

            JLabel jobLocationLabel = new JLabel(job.getLocation());
            jobLocationLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            jobLocationLabel.setPreferredSize(new Dimension(150, 30));

            JLabel jobSalaryLabel = new JLabel("₱" + job.getSalary());
            jobSalaryLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            jobSalaryLabel.setPreferredSize(new Dimension(100, 30));
            
            JLabel jobContactLabel = new JLabel(job.getContact());
            jobContactLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            jobContactLabel.setPreferredSize(new Dimension(100, 30));

            // Add job details to the job details panel
            jobDetailsPanel.add(jobTitleLabel);
            jobDetailsPanel.add(jobLocationLabel);
            jobDetailsPanel.add(jobSalaryLabel);
            jobDetailsPanel.add(jobContactLabel);

            // Create the apply button with a fixed size
            JButton applyButton = new JButton("Apply");
            applyButton.setPreferredSize(new Dimension(80, 30)); // Set fixed size for the button
            applyButton.setBackground(new Color(0, 153, 51));
            applyButton.setForeground(Color.WHITE);
            applyButton.setFocusPainted(false);
            applyButton.setBorderPainted(false);
            applyButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            applyButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int response = JOptionPane.showConfirmDialog(null, 
                        "Are you sure you want to apply for " + job.getTitle() + "?", 
                        "Confirm Application", 
                        JOptionPane.YES_NO_OPTION);
                    if (response == JOptionPane.YES_OPTION) {
                        // Remove job from the stack and update the UI
                        jobs.remove(job);
                        displayJobs(); // Refresh the job listings
                        JOptionPane.showMessageDialog(null, "Applied for " + job.getTitle());
                    }
                }
            });

            // Add the job details panel to the center of the job item panel
            jobItemPanel.add(jobDetailsPanel, BorderLayout.CENTER);
            // Add the apply button to the right of the job item panel
            jobItemPanel.add(applyButton, BorderLayout.EAST);

            jobPanel.add(jobItemPanel); // Add the job item panel to the job panel
        }
        jobPanel.revalidate(); // Refresh the job panel
        jobPanel.repaint(); // Repaint the job panel
    }

    private void filterJobs(String query) {
        jobs.clear(); // Clear the current job stack
        for (Jobs job : allJobs) {
            if (job.getTitle().toLowerCase().contains(query.toLowerCase()) || 
                job.getLocation().toLowerCase().contains(query.toLowerCase())) {
                jobs.push(job); // Add matching jobs to the stack
            }
        }
        displayJobs(); // Update the UI with the filtered jobs
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        label6 = new java.awt.Label();
        jTextField1 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel14 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1620, 900));

        jPanel4.setBackground(new java.awt.Color(67, 67, 172));
        jPanel4.setMinimumSize(new java.awt.Dimension(1620, 910));
        jPanel4.setPreferredSize(new java.awt.Dimension(1622, 900));

        jPanel3.setBackground(new java.awt.Color(61, 61, 157));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setMinimumSize(new java.awt.Dimension(1620, 900));
        jPanel3.setPreferredSize(new java.awt.Dimension(1600, 165));

        jPanel1.setBackground(new java.awt.Color(84, 84, 167));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(1470, 150));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 58)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CODE CATALYST");
        jLabel1.setToolTipText("");

        jButton2.setBackground(new java.awt.Color(84, 84, 167));
        jButton2.setToolTipText("");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setPreferredSize(new java.awt.Dimension(72, 70));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        label6.setAlignment(java.awt.Label.CENTER);
        label6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText("Search");

        jTextField1.setBackground(new java.awt.Color(204, 204, 255));
        jTextField1.setText("                                                                                                  🔎");
        jTextField1.setToolTipText("Search for keywords");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel1)
                .addGap(184, 184, 184)
                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel1);

        jPanel4.add(jPanel3);

        jPanel7.setBackground(new java.awt.Color(61, 61, 157));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setPreferredSize(new java.awt.Dimension(1600, 60));
        jPanel7.setRequestFocusEnabled(false);
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(61, 61, 157));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.setMinimumSize(new java.awt.Dimension(1530, 450));
        jPanel8.setPreferredSize(new java.awt.Dimension(1600, 480));
        jPanel8.setRequestFocusEnabled(false);
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 51, 51));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel14.setBackground(new java.awt.Color(61, 61, 157));
        jPanel14.setLayout(new java.awt.GridLayout(1, 5));

        jLabel3.setText("jLabel3");
        jPanel14.add(jLabel3);

        jLabel5.setText("jLabel5");
        jPanel14.add(jLabel5);

        jLabel6.setText("jLabel6");
        jPanel14.add(jLabel6);

        jLabel4.setText("jLabel4");
        jPanel14.add(jLabel4);

        jLabel2.setText("jLabel2");
        jPanel14.add(jLabel2);

        jScrollPane1.setViewportView(jPanel14);

        jPanel8.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 1480, 380));

        jButton3.setBackground(new java.awt.Color(108, 108, 190));
        jButton3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("APPLY NOW");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 420, 260, 50));

        jPanel4.add(jPanel8);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private java.awt.Label label6;
    // End of variables declaration//GEN-END:variables
}
