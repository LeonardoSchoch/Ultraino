/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package acousticfield3d.gui.panels;

import acousticfield3d.algorithms.CalcField;
import acousticfield3d.gui.MainForm;
import acousticfield3d.math.M;
import acousticfield3d.math.Vector3f;
import acousticfield3d.scene.Entity;
import acousticfield3d.scene.MeshEntity;
import acousticfield3d.scene.Scene;
import acousticfield3d.simulation.AnimKeyFrame;
import acousticfield3d.utils.Parse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author Asier
 */
public class MovePanel extends javax.swing.JPanel {
    final MainForm mf;
    final ArrayList<Vector3f> snapBeadPositions = new ArrayList<>();
    final HashMap<Integer, ArrayList<Entity>> selections = new HashMap<>();
    
    public MovePanel(MainForm mf) {
        this.mf = mf;
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

        jLabel2 = new javax.swing.JLabel();
        beadNSpinner = new javax.swing.JSpinner();
        autoCalcCheck = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        speedText = new javax.swing.JTextField();
        leftButton = new javax.swing.JButton();
        upButton = new javax.swing.JButton();
        rightButton = new javax.swing.JButton();
        downButton = new javax.swing.JButton();
        forwardButton = new javax.swing.JButton();
        backwardsButton = new javax.swing.JButton();
        autoSendCheck = new javax.swing.JCheckBox();
        resetButton = new javax.swing.JButton();
        snapButton = new javax.swing.JButton();
        autoAddCheck = new javax.swing.JCheckBox();
        moveAllCheck = new javax.swing.JCheckBox();
        neutralButton = new javax.swing.JButton();
        useAlgCheck = new javax.swing.JCheckBox();
        rXPButton = new javax.swing.JButton();
        rYPButton = new javax.swing.JButton();
        rZPButton = new javax.swing.JButton();
        rZNButton = new javax.swing.JButton();
        rYNButton = new javax.swing.JButton();
        rXNButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        angleText = new javax.swing.JTextField();
        interpButton = new javax.swing.JButton();
        stepSizeText = new javax.swing.JTextField();
        gatherButton = new javax.swing.JButton();
        expandButton = new javax.swing.JButton();
        autoReturnButton = new javax.swing.JButton();
        interpolAutoSendCheck = new javax.swing.JCheckBox();
        repeatCheck = new javax.swing.JCheckBox();
        repeatText = new javax.swing.JTextField();
        repeatWaitText = new javax.swing.JTextField();

        jLabel2.setText("N:");

        beadNSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        autoCalcCheck.setSelected(true);
        autoCalcCheck.setText("calc");

        jLabel3.setText("Step size:");

        speedText.setText("0.001");

        leftButton.setText("←");
        leftButton.setToolTipText("move point(s) left");
        leftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftButtonActionPerformed(evt);
            }
        });

        upButton.setText("↑");
        upButton.setToolTipText("move point up");
        upButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upButtonActionPerformed(evt);
            }
        });

        rightButton.setText("→");
        rightButton.setToolTipText("move point(s) right");
        rightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightButtonActionPerformed(evt);
            }
        });

        downButton.setText("↓");
        downButton.setToolTipText("move point(s) down");
        downButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downButtonActionPerformed(evt);
            }
        });

        forwardButton.setText("↗");
        forwardButton.setToolTipText("move point(s) forward");
        forwardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forwardButtonActionPerformed(evt);
            }
        });

        backwardsButton.setText("↖");
        backwardsButton.setToolTipText("move point(s) back");
        backwardsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backwardsButtonActionPerformed(evt);
            }
        });

        autoSendCheck.setSelected(true);
        autoSendCheck.setText("send");

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        snapButton.setText("Snap");
        snapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snapButtonActionPerformed(evt);
            }
        });

        autoAddCheck.setText("genAnim");

        moveAllCheck.setText("Move All");

        neutralButton.setText("0");
        neutralButton.setToolTipText("Neutral");
        neutralButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neutralButtonActionPerformed(evt);
            }
        });

        useAlgCheck.setText("useAlg");

        rXPButton.setText("Rx+");
        rXPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rXPButtonActionPerformed(evt);
            }
        });

        rYPButton.setText("Ry+");
        rYPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rYPButtonActionPerformed(evt);
            }
        });

        rZPButton.setText("Rz+");
        rZPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rZPButtonActionPerformed(evt);
            }
        });

        rZNButton.setText("Rz-");
        rZNButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rZNButtonActionPerformed(evt);
            }
        });

        rYNButton.setText("Ry-");
        rYNButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rYNButtonActionPerformed(evt);
            }
        });

        rXNButton.setText("Rx-");
        rXNButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rXNButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("angle:");

        angleText.setText("1");

        interpButton.setText("Inter");
        interpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interpButtonActionPerformed(evt);
            }
        });

        stepSizeText.setText("0.0005");

        gatherButton.setText(">");
        gatherButton.setToolTipText("gather");
        gatherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gatherButtonActionPerformed(evt);
            }
        });

        expandButton.setText("<");
        expandButton.setToolTipText("expand");
        expandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expandButtonActionPerformed(evt);
            }
        });

        autoReturnButton.setText("Auto Return");
        autoReturnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoReturnButtonActionPerformed(evt);
            }
        });

        interpolAutoSendCheck.setText("auto Send");

        repeatCheck.setText("repeat");

        repeatText.setText("10");

        repeatWaitText.setText("0.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(angleText, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(repeatCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(repeatText, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(repeatWaitText, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(moveAllCheck)
                        .addGap(18, 18, 18)
                        .addComponent(useAlgCheck))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(leftButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(backwardsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(expandButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(downButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(upButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(forwardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(neutralButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gatherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(snapButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(interpolAutoSendCheck)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(autoAddCheck)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(speedText))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(beadNSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(autoCalcCheck)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(autoSendCheck)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(interpButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(stepSizeText, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(rXNButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rXPButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rYNButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rYPButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(rZPButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rZNButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(autoReturnButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(beadNSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(autoCalcCheck)
                    .addComponent(autoSendCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autoAddCheck)
                    .addComponent(jLabel3)
                    .addComponent(speedText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(upButton)
                    .addComponent(forwardButton)
                    .addComponent(backwardsButton)
                    .addComponent(snapButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(downButton)
                    .addComponent(leftButton)
                    .addComponent(rightButton)
                    .addComponent(resetButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expandButton)
                    .addComponent(neutralButton)
                    .addComponent(gatherButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(angleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rXPButton)
                    .addComponent(rYPButton)
                    .addComponent(rZPButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rXNButton)
                    .addComponent(rYNButton)
                    .addComponent(rZNButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moveAllCheck)
                    .addComponent(useAlgCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repeatCheck)
                    .addComponent(repeatText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(repeatWaitText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(interpButton)
                    .addComponent(stepSizeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(autoReturnButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(interpolAutoSendCheck)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    public ArrayList<Entity> getSelection(final int n){
        return selections.get(n);
    }
            
    public void snapSelection(final int n){
        final ArrayList<Entity> sel = new ArrayList<>( mf.selection );
        selections.put(n, sel);
    }
    
    public void applySelection(final int n){
        final ArrayList<Entity> sel = selections.get(n);
        mf.setSelection( sel );
        mf.needUpdate();
    }
    
    public void doAutoCalcAndSend(){
        final boolean autoCalc = autoCalcCheck.isSelected();
        final boolean autoAddKeyFrame = autoAddCheck.isSelected();
        final boolean autoSend = autoSendCheck.isSelected();

        if (autoCalc) {

            if (!useAlgCheck.isSelected()) {
                Entity e = getBeadEntity();
                if (e != null) {
                    final Vector3f pos = e.getTransform().getTranslation();
                    mf.trapsPanel.applyOnPosition(pos);
                }
            } else {
                mf.algForm.runBFGS(false, false, true);
            }
        }
        
        
        if( autoAddKeyFrame ){
            // add the key frame
            mf.animPanel.addKeyFrame();
        }
        
        if (autoSend) {
            mf.transControlPanel.sendPattern();
        }
    }
    
    public Entity getBeadEntity(){
        final int n = (Integer)beadNSpinner.getValue();
        
        //check bead number n in selection
        final ArrayList<Entity> sel = mf.selection;
        if (n < 0 || n >= sel.size()){
            return null;
        }        
        return sel.get( n );
    }
    public void applyDisplacementRepeat(float x, float y, float z){
        if (! repeatCheck.isSelected()){
            applyDisplacement(x,y,z);
        }else{
            final int repeats = Parse.toInt( repeatText.getText() );
            final int waitMs = Parse.toInt( repeatWaitText.getText() );
            for (int i = 0; i < repeats; i++) {
                applyDisplacement(x,y,z);
                if (waitMs > 0){
                    try {
                        Thread.sleep( waitMs );
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MovePanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }
    
    public void applyDisplacement(float x, float y, float z){
        final Entity e = getBeadEntity();
        if (e == null){ return;}
        
        final Vector3f t = new Vector3f(x, y, z);
        t.multLocal( getDisplacementStep() );
        
        if (moveAllCheck.isSelected()){
            final ArrayList<Entity> sel = mf.getSelection();
            for (Entity ent : sel) {
                ent.getTransform().getTranslation().addLocal(t);
            }
        }else{
            e.getTransform().getTranslation().addLocal(t);
        }
        
        
        mf.transformToGUI( e.getTransform() );
        doAutoCalcAndSend();
        mf.needUpdate();
    }

    public void applyRotationRepeat(float rx,  float ry,  float rz){
        if (! repeatCheck.isSelected()){
            applyRotation(rx,ry,rz);
        }else{
            final int repeats = Parse.toInt( repeatText.getText() );
            final int waitMs = Parse.toInt( repeatWaitText.getText() );
            for (int i = 0; i < repeats; i++) {
                applyRotation(rx,ry,rz);
                if (waitMs > 0){
                    try {
                        Thread.sleep( waitMs );
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MovePanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }
    
    public void applyRotation(float rx,  float ry,  float rz){
        final Entity e = getBeadEntity();
        if (e == null || mf.selection.isEmpty() ){ return;}
        
        final float angles = Parse.toFloat( angleText.getText() );
        rx *= M.DEG_TO_RAD * angles;
        ry *= M.DEG_TO_RAD * angles;
        rz *= M.DEG_TO_RAD * angles;
        
        //get selection center
        final Vector3f selectionCenter = Scene.calcCenter( mf.selection );
        
        if (moveAllCheck.isSelected()){
            final ArrayList<Entity> sel = mf.getSelection();
            for (Entity ent : sel) {
                ent.rotateAround(selectionCenter, rx, ry, rz);
            }
        }else{
            e.rotateAround(selectionCenter, rx, ry, rz);
        }
        
        
        mf.transformToGUI( e.getTransform() );
        doAutoCalcAndSend();
        mf.needUpdate();
    }
   
    public void applyScaleRepeat(final float stepScale){
        if (! repeatCheck.isSelected()){
            applyScale(stepScale);
        }else{
            final int repeats = Parse.toInt( repeatText.getText() );
            final int waitMs = Parse.toInt( repeatWaitText.getText() );
            for (int i = 0; i < repeats; i++) {
                applyScale(stepScale);
                if (waitMs > 0){
                    try {
                        Thread.sleep( waitMs );
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MovePanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }
    
   public void applyScale(final float stepScale){
        final Entity e = getBeadEntity();
        if (e == null || mf.selection.isEmpty() ){ return;}
        
        final float stepSize =  stepScale  * Parse.toFloat( speedText.getText() );
        final Vector3f sCenter = Scene.calcCenter( mf.selection );
        
        if (moveAllCheck.isSelected()){
            final ArrayList<Entity> sel = mf.getSelection();
            float maxDist = 0;
            for (Entity ent : sel) {
                maxDist = M.max(maxDist, ent.distanceTo( sCenter ));
            }
            final float scale = 1 + stepSize/maxDist;
            for (Entity ent : sel) {
                ent.getTransform().getTranslation().applyCenteredScale(sCenter, scale);
            }
        }else{
            final Vector3f pos = e.getTransform().getTranslation();
            //sCenter.y = pos.y;
            pos.moveTowards(mf.simulation.getSimulationCenter(), stepSize);
        }
        
       
        mf.transformToGUI( e.getTransform() );
        doAutoCalcAndSend();
        mf.needUpdate();
    }
    
    private void leftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftButtonActionPerformed
        applyDisplacementRepeat(-1,0,0);
    }//GEN-LAST:event_leftButtonActionPerformed

    private void upButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upButtonActionPerformed
         applyDisplacementRepeat(0,1,0);
    }//GEN-LAST:event_upButtonActionPerformed

    private void downButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downButtonActionPerformed
        applyDisplacementRepeat(0,-1,0);
    }//GEN-LAST:event_downButtonActionPerformed

    private void rightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightButtonActionPerformed
        applyDisplacementRepeat(1,0,0);
    }//GEN-LAST:event_rightButtonActionPerformed

    private void forwardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardButtonActionPerformed
        applyDisplacementRepeat(0,0,-1);
    }//GEN-LAST:event_forwardButtonActionPerformed

    private void backwardsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backwardsButtonActionPerformed
        applyDisplacementRepeat(0,0,1);
    }//GEN-LAST:event_backwardsButtonActionPerformed

 
    public float getDisplacementStep(){
        return Parse.toFloat( speedText.getText() );    
    }
    
    public float getRotationStep(){
        return Parse.toFloat( angleText.getText() );    
    }

    
    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
       resetParticlePos();
    }//GEN-LAST:event_resetButtonActionPerformed

    public void resetParticlePos(){
        final ArrayList<Entity> sel = mf.selection;
        final int n = M.min(sel.size(), snapBeadPositions.size());
        for (int i = 0; i < n; ++i){
            sel.get(i).getTransform().getTranslation().set( snapBeadPositions.get(i) );
        }

  
        applyDisplacement(0,0,0);
    }
    
    public void selectFirstBead() {
        Entity e = mf.scene.getFirstWithTag( Entity.TAG_CONTROL_POINT );
        if (e == null){ return;}
        mf.clearSelection();
        mf.getSelection().add( e );
        e.selected = true;
    }
    
    private void snapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snapButtonActionPerformed
        snapParticlesPosition();
    }//GEN-LAST:event_snapButtonActionPerformed

    private void neutralButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutralButtonActionPerformed
        applyDisplacement(0, 0, 0);
    }//GEN-LAST:event_neutralButtonActionPerformed

    private void rYNButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rYNButtonActionPerformed
        applyRotationRepeat(0, -1, 0);
    }//GEN-LAST:event_rYNButtonActionPerformed

    private void rXPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rXPButtonActionPerformed
        applyRotationRepeat(1, 0, 0);
    }//GEN-LAST:event_rXPButtonActionPerformed

    private void rXNButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rXNButtonActionPerformed
        applyRotationRepeat(-1, 0, 0);
    }//GEN-LAST:event_rXNButtonActionPerformed

    private void rYPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rYPButtonActionPerformed
        applyRotationRepeat(0, 1, 0);
    }//GEN-LAST:event_rYPButtonActionPerformed

    private void rZPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rZPButtonActionPerformed
        applyRotationRepeat(0, 0, 1);
    }//GEN-LAST:event_rZPButtonActionPerformed

    private void rZNButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rZNButtonActionPerformed
        applyRotationRepeat(0, 0, -1);
    }//GEN-LAST:event_rZNButtonActionPerformed

    
    
    private void interpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interpButtonActionPerformed
        final boolean generateAnimation = ! interpolAutoSendCheck.isSelected();
        final float stepSize = Parse.toFloat( stepSizeText.getText() );
        final AnimKeyFrame lastKey = mf.animPanel.currentAnimation.lastKeyFrame();
        final ArrayList<MeshEntity> points = mf.simulation.controlPoints;
                
        final HashMap<Entity, Vector3f> targetPos = new HashMap<>( points.size() );
        for (Entity e : points){
            final Vector3f pos = e.getTransform().getTranslation();
            targetPos.put(e, pos.clone() );
            final Vector3f sPos = lastKey.getPointsPositions().get( e );
            if (sPos != null){
                pos.set(sPos);
            }
        }
            
        moveParticlesTowardsTarget(points, targetPos, stepSize, generateAnimation);
        if (! generateAnimation){
            mf.animPanel.addKeyFrame();
        }
    }//GEN-LAST:event_interpButtonActionPerformed

    
    
    private void gatherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gatherButtonActionPerformed
        applyScaleRepeat( 1 );
    }//GEN-LAST:event_gatherButtonActionPerformed

    private void expandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expandButtonActionPerformed
        applyScaleRepeat( -1 );
    }//GEN-LAST:event_expandButtonActionPerformed

    private void autoReturnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoReturnButtonActionPerformed
        final ArrayList<MeshEntity> initialPoints = mf.simulation.controlPoints;
                
        final HashMap<Entity, Vector3f> targetPositions = new HashMap<>( initialPoints.size() );
        final int nSnaps = M.min( snapBeadPositions.size(), initialPoints.size());
        for(int i = 0; i < nSnaps; ++i){
            final Vector3f targetPos = snapBeadPositions.get(i);
            final Entity e = mf.simulation.controlPoints.get(i);
            targetPositions.put(e, targetPos);
        }
            
        final float stepSize = Parse.toFloat( stepSizeText.getText() );
        
        moveParticlesTowardsTarget(initialPoints, targetPositions, stepSize, false);
    }//GEN-LAST:event_autoReturnButtonActionPerformed

    protected void moveParticlesTowardsTarget(final ArrayList<MeshEntity> points, 
            final HashMap<Entity, Vector3f> targetPositions, final float stepSize,
            final boolean useBFGSandAddToKeyFrames) {
        //while all the particles have not reached their destination
        boolean allParticlesReached = false;
        final Vector3f diffPos = new Vector3f();
        while( ! allParticlesReached ){
            allParticlesReached = true;
            for ( Entity e : points){
                final Vector3f cPos = e.getTransform().getTranslation();
                final Vector3f tPos = targetPositions.get(e);
                if (tPos != null){
                    diffPos.set(tPos).subtractLocal(cPos);
                    final float distance = diffPos.length();
                    if (distance > M.FLT_EPSILON){
                        allParticlesReached = false;
                        diffPos.multLocal( M.min(distance, stepSize) ).divideLocal( distance );
                        cPos.addLocal( diffPos );
                    }
                }
            }
            if (useBFGSandAddToKeyFrames){
                mf.algForm.runBFGS(false, false, true);
                mf.animPanel.addKeyFrame();
            }else{
                doAutoCalcAndSend();
            }
        
        }
    }


    public void snapParticlesPosition(){
        snapBeadPositions.clear();
        for ( Entity e : mf.simulation.controlPoints){
            snapBeadPositions.add( e.getTransform().getTranslation().clone() ); 
        }
    }
    

    public void incBeadSelNumber(final int amount){
        beadNSpinner.setValue( ((Integer)beadNSpinner.getValue()) + amount );
    }
  
    public JButton getNeutralButton() {
        return neutralButton;
    }

    public JButton getUpButton() {
        return upButton;
    }

    public JButton getDownButton() {
        return downButton;
    }
    
    public void setGenerateKeyFrame(final boolean enabled){
        autoAddCheck.setSelected(enabled);
    }
    
    public void setCalculate(final boolean enabled){
        autoCalcCheck.setSelected(enabled);
    }
    
    public boolean isGenerateKeyFrame(){
        return autoAddCheck.isSelected();
    }
    
    public boolean isCalculate(){
        return autoCalcCheck.isSelected();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField angleText;
    private javax.swing.JCheckBox autoAddCheck;
    private javax.swing.JCheckBox autoCalcCheck;
    private javax.swing.JButton autoReturnButton;
    private javax.swing.JCheckBox autoSendCheck;
    private javax.swing.JButton backwardsButton;
    private javax.swing.JSpinner beadNSpinner;
    private javax.swing.JButton downButton;
    private javax.swing.JButton expandButton;
    private javax.swing.JButton forwardButton;
    private javax.swing.JButton gatherButton;
    private javax.swing.JButton interpButton;
    private javax.swing.JCheckBox interpolAutoSendCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton leftButton;
    private javax.swing.JCheckBox moveAllCheck;
    private javax.swing.JButton neutralButton;
    private javax.swing.JButton rXNButton;
    private javax.swing.JButton rXPButton;
    private javax.swing.JButton rYNButton;
    private javax.swing.JButton rYPButton;
    private javax.swing.JButton rZNButton;
    private javax.swing.JButton rZPButton;
    private javax.swing.JCheckBox repeatCheck;
    private javax.swing.JTextField repeatText;
    private javax.swing.JTextField repeatWaitText;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton rightButton;
    private javax.swing.JButton snapButton;
    private javax.swing.JTextField speedText;
    private javax.swing.JTextField stepSizeText;
    private javax.swing.JButton upButton;
    private javax.swing.JCheckBox useAlgCheck;
    // End of variables declaration//GEN-END:variables

    
    

}
