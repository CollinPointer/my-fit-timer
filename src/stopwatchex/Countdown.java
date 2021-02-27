package stopwatchex;

public class Countdown extends javax.swing.JFrame implements Runnable {

    int hour = 0, min = 0, sec = 0, milli = 0, count = 0;
    String mainDisplay = "", milliDisplay = "", timeDisplay = "";
    
    Thread t;
    
    // creates a new thread and resets timer displays
    public Countdown() {
        initComponents();
        t = new Thread(this);
        reset();
    }
    
    // clears the timer displays to 0
    public void clear() {
        hour = 0; min = 0; sec = 0; milli = 0;
        mainDisplay = "00:00:00";
        milliDisplay = "000";
        
        display();
    }
    
    // resets the timer displays to 0 and clears the list
    public void reset() {
        hour = 0; min = 0; sec = 0; milli = 0;
        mainDisplay = "00:00:00";
        milliDisplay = "000";
        timeDisplay = "";
        
        display();
    }
    
    // displays the time
    public void display() {
        lbMainTime.setText(mainDisplay);
        lbSecondaryTime.setText(milliDisplay);
    }

    // sets the main timer display (Hours, Minutes, Seconds)
    public void setMainTimer() {
        mainDisplay = "";
        
        // formats the hours
        if (hour < 10) {
            mainDisplay = "0" + hour;
        } else {
            mainDisplay = "" + hour;
        }
        
        // formats the minutes
        if (min < 10) {
            mainDisplay += ":0" + min;
        } else {
            mainDisplay += ":" + min;
        }
        
        // formats the seconds
        if (sec < 10) {
            mainDisplay += ":0" + sec;
        } else {
            mainDisplay += ":" + sec;
        }
    }
    
    // sets the secondary timer display (Milliseconds)
    public void setSecondaryTimer() {
        milliDisplay = "";
        
        if (milli < 10) {
            milliDisplay = "00" + milli;
        } else if (milli >= 10 && milli < 100) {
            milliDisplay = "0" + milli;
        } else {
            milliDisplay = "" + milli;
        }
    }
    
    public void run() {
        try {
            while(true) {
                milli++;
                
                if (milli > 999) {
                    milli = 0;
                    sec++;
                }
                
                if (sec > 59) {
                    sec = 0;
                    min++;
                }
                
                if (min > 59) {
                    min = 0;
                    hour++;
                }
                
                if (hour > 99) {
                    min = 0;
                    hour++;
                }
                
                setMainTimer();
                setSecondaryTimer();
                display();
                Thread.sleep(1);
            }
        } catch(Exception e) {}
        
    }
    
    // prints the elapsed time in the textList area
    public void printTime() {
        timeDisplay += lbMainTime.getText() + " "
                + lbSecondaryTime.getText() + "\n";   
        
        textList.setText(timeDisplay);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbMainTime = new javax.swing.JLabel();
        lbSecondaryTime = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textList = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(lbMainTime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbSecondaryTime))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMainTime)
                    .addComponent(lbSecondaryTime))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            clear();
        }
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed

        reset();
        t.suspend();
        btnStart.setText("Start");
        textList.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Countdown().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnStart;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbMainTime;
    private javax.swing.JLabel lbSecondaryTime;
    private javax.swing.JTextArea textList;
    // End of variables declaration//GEN-END:variables
}
