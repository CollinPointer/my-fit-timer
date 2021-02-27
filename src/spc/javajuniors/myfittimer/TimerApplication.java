package spc.javajuniors.myfittimer;

public class TimerApplication extends javax.swing.JFrame implements Runnable {
    
    Timer timer = new Timer();
    Thread t;
    
    // creates a new thread and resets timer displays
    public TimerApplication() {
        initComponents();
        t = new Thread(this);
        timer.reset();
    }
    
    // displays the timer displays on the frame
    public void display() {
        lbMainTime.setText(timer.getMainDisplay());
        lbSecondaryTime.setText(timer.getMilliDisplay());
    }
    
    public void run() {
        
        try {
            while(true) {
                timer.setMilli(timer.getMilli() + 1);
                
                if (timer.getMilli() > 999) {
                    timer.setMilli(0);
                    timer.setSec(timer.getSec() + 1);
                }
                
                if (timer.getSec() > 59) {
                    timer.setSec(0);
                    timer.setMin(timer.getMin() + 1);
                }
                
                if (timer.getMin() > 59) {
                    timer.setMin(0);
                    timer.setHour(timer.getHour() + 1);
                }
                
                if (timer.getHour() > 99) {
                    timer.setMin(0);
                    timer.setHour(timer.getHour() + 1);
                }
                
                timer.setMainTimer();
                timer.setSecondaryTimer();
                display();
                Thread.sleep(1);
            }
        } catch(Exception e) {}
        
    }
    
    // prints the elapsed time in the textList area
    public void printTime() {
        timer.setTimeDisplay(timer.getTimeDisplay() + lbMainTime.getText() + " "
                + lbSecondaryTime.getText() + "\n");   
        
        textList.setText(timer.getTimeDisplay());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel1 = new javax.swing.JPanel();
        lbMainTime = new javax.swing.JLabel();
        lbSecondaryTime = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textList = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Fit Timer");

        JPanel1.setBackground(new java.awt.Color(204, 204, 204));

        lbMainTime.setFont(new java.awt.Font("Lucida Grande", 0, 70)); // NOI18N
        lbMainTime.setText("00:00:00");

        lbSecondaryTime.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        lbSecondaryTime.setText("000");

        btnStart.setBackground(new java.awt.Color(255, 255, 255));
        btnStart.setFont(new java.awt.Font("Optima", 0, 36)); // NOI18N
        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 255, 255));
        btnReset.setFont(new java.awt.Font("Optima", 0, 36)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        textList.setColumns(20);
        textList.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        textList.setRows(6);
        textList.setTabSize(4);
        jScrollPane1.setViewportView(textList);

        javax.swing.GroupLayout JPanel1Layout = new javax.swing.GroupLayout(JPanel1);
        JPanel1.setLayout(JPanel1Layout);
        JPanel1Layout.setHorizontalGroup(
            JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel1Layout.createSequentialGroup()
                .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(lbMainTime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbSecondaryTime))
                    .addGroup(JPanel1Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        JPanel1Layout.setVerticalGroup(
            JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMainTime)
                    .addComponent(lbSecondaryTime))
                .addGap(32, 32, 32)
                .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int count = 0;
    
    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        
        if (btnStart.getText().equals("Start")) {
            btnStart.setText("Stop");
            count++;

            if (count == 1) {
                t.start();
            } else {
                t.resume();
            }

        } else {
            btnStart.setText("Start");
            t.suspend();
            printTime();
            timer.clear();
        }
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed

        timer.reset();
        t.suspend();
        btnStart.setText("Start");
        textList.setText("");
        display();
    }//GEN-LAST:event_btnResetActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TimerApplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel1;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnStart;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbMainTime;
    private javax.swing.JLabel lbSecondaryTime;
    private javax.swing.JTextArea textList;
    // End of variables declaration//GEN-END:variables
}
