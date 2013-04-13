package fr.tikione.jacocoverage.plugin.config;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.prefs.Preferences;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.openide.awt.Mnemonics;
import org.openide.util.NbBundle;
import org.openide.util.NbPreferences;

final class JaCoCoveragePanel extends javax.swing.JPanel {

    private static final long serialVersionUID = 1L;

    private static final int DEF_COVERED_R = 205;

    private static final int DEF_COVERED_G = 235;

    private static final int DEF_COVERED_B = 175;

    private static final int DEF_PARTIAL_COVERED_R = 255;

    private static final int DEF_PARTIAL_COVERED_G = 231;

    private static final int DEF_PARTIAL_COVERED_B = 157;

    private static final int DEF_NOT_COVERED_R = 252;

    private static final int DEF_NOT_COVERED_G = 201;

    private static final int DEF_NOT_COVERED_B = 194;

    private final JaCoCoverageOptionsPanelController controller; // TODO remove if useless

    JaCoCoveragePanel(JaCoCoverageOptionsPanelController controller) {
        this.controller = controller;
        initComponents();
    }

    /** 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHighlightingCoveredCode = new JPanel();
        jLabelCoveredCodeBG = new JLabel();
        jLabelPartiallyCoveredCodeBG = new JLabel();
        jLabelNotCoveredCodeBG = new JLabel();
        jPanelNotCoveredPreview = new JPanel();
        jPanelPartiallyCoveredPreview = new JPanel();
        jPanelCoveredPreview = new JPanel();
        jLabelInfoColorsAreRGB = new JLabel();
        jSpinnerCoveredR = new JSpinner();
        jSpinnerCoveredG = new JSpinner();
        jSpinnerCoveredB = new JSpinner();
        jSpinnerPartiallyCoveredR = new JSpinner();
        jSpinnerPartiallyCoveredG = new JSpinner();
        jSpinnerPartiallyCoveredB = new JSpinner();
        jSpinnerNotCoveredR = new JSpinner();
        jSpinnerNotCoveredG = new JSpinner();
        jSpinnerNotCoveredB = new JSpinner();
        jButtonResoreDefaults = new JButton();

        jPanelHighlightingCoveredCode.setBorder(BorderFactory.createTitledBorder(NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jPanelHighlightingCoveredCode.border.title"))); // NOI18N

        Mnemonics.setLocalizedText(jLabelCoveredCodeBG, NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jLabelCoveredCodeBG.text")); // NOI18N

        Mnemonics.setLocalizedText(jLabelPartiallyCoveredCodeBG, NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jLabelPartiallyCoveredCodeBG.text")); // NOI18N

        Mnemonics.setLocalizedText(jLabelNotCoveredCodeBG, NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jLabelNotCoveredCodeBG.text")); // NOI18N

        jPanelNotCoveredPreview.setBackground(new Color(255, 255, 255));
        jPanelNotCoveredPreview.setMaximumSize(new Dimension(16, 16));
        jPanelNotCoveredPreview.setMinimumSize(new Dimension(16, 16));
        jPanelNotCoveredPreview.setName(""); // NOI18N

        GroupLayout jPanelNotCoveredPreviewLayout = new GroupLayout(jPanelNotCoveredPreview);
        jPanelNotCoveredPreview.setLayout(jPanelNotCoveredPreviewLayout);
        jPanelNotCoveredPreviewLayout.setHorizontalGroup(
            jPanelNotCoveredPreviewLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        jPanelNotCoveredPreviewLayout.setVerticalGroup(
            jPanelNotCoveredPreviewLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jPanelPartiallyCoveredPreview.setBackground(new Color(255, 255, 255));
        jPanelPartiallyCoveredPreview.setMaximumSize(new Dimension(16, 16));
        jPanelPartiallyCoveredPreview.setMinimumSize(new Dimension(16, 16));
        jPanelPartiallyCoveredPreview.setName(""); // NOI18N

        GroupLayout jPanelPartiallyCoveredPreviewLayout = new GroupLayout(jPanelPartiallyCoveredPreview);
        jPanelPartiallyCoveredPreview.setLayout(jPanelPartiallyCoveredPreviewLayout);
        jPanelPartiallyCoveredPreviewLayout.setHorizontalGroup(
            jPanelPartiallyCoveredPreviewLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        jPanelPartiallyCoveredPreviewLayout.setVerticalGroup(
            jPanelPartiallyCoveredPreviewLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jPanelCoveredPreview.setBackground(new Color(255, 255, 255));
        jPanelCoveredPreview.setMaximumSize(new Dimension(16, 16));
        jPanelCoveredPreview.setMinimumSize(new Dimension(16, 16));
        jPanelCoveredPreview.setName(""); // NOI18N

        GroupLayout jPanelCoveredPreviewLayout = new GroupLayout(jPanelCoveredPreview);
        jPanelCoveredPreview.setLayout(jPanelCoveredPreviewLayout);
        jPanelCoveredPreviewLayout.setHorizontalGroup(
            jPanelCoveredPreviewLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        jPanelCoveredPreviewLayout.setVerticalGroup(
            jPanelCoveredPreviewLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jLabelInfoColorsAreRGB.setFont(new Font("Tahoma", 2, 11)); // NOI18N
        Mnemonics.setLocalizedText(jLabelInfoColorsAreRGB, NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jLabelInfoColorsAreRGB.text")); // NOI18N

        jSpinnerCoveredR.setModel(new SpinnerNumberModel(0, 0, 255, 1));
        jSpinnerCoveredR.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                jSpinnerCoveredRStateChanged(evt);
            }
        });

        jSpinnerCoveredG.setModel(new SpinnerNumberModel(0, 0, 255, 1));
        jSpinnerCoveredG.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                jSpinnerCoveredGStateChanged(evt);
            }
        });

        jSpinnerCoveredB.setModel(new SpinnerNumberModel(0, 0, 255, 1));
        jSpinnerCoveredB.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                jSpinnerCoveredBStateChanged(evt);
            }
        });

        jSpinnerPartiallyCoveredR.setModel(new SpinnerNumberModel(0, 0, 255, 1));
        jSpinnerPartiallyCoveredR.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                jSpinnerPartiallyCoveredRStateChanged(evt);
            }
        });

        jSpinnerPartiallyCoveredG.setModel(new SpinnerNumberModel(0, 0, 255, 1));
        jSpinnerPartiallyCoveredG.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                jSpinnerPartiallyCoveredGStateChanged(evt);
            }
        });

        jSpinnerPartiallyCoveredB.setModel(new SpinnerNumberModel(0, 0, 255, 1));
        jSpinnerPartiallyCoveredB.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                jSpinnerPartiallyCoveredBStateChanged(evt);
            }
        });

        jSpinnerNotCoveredR.setModel(new SpinnerNumberModel(0, 0, 255, 1));
        jSpinnerNotCoveredR.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                jSpinnerNotCoveredRStateChanged(evt);
            }
        });

        jSpinnerNotCoveredG.setModel(new SpinnerNumberModel(0, 0, 255, 1));
        jSpinnerNotCoveredG.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                jSpinnerNotCoveredGStateChanged(evt);
            }
        });

        jSpinnerNotCoveredB.setModel(new SpinnerNumberModel(0, 0, 255, 1));
        jSpinnerNotCoveredB.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                jSpinnerNotCoveredBStateChanged(evt);
            }
        });

        GroupLayout jPanelHighlightingCoveredCodeLayout = new GroupLayout(jPanelHighlightingCoveredCode);
        jPanelHighlightingCoveredCode.setLayout(jPanelHighlightingCoveredCodeLayout);
        jPanelHighlightingCoveredCodeLayout.setHorizontalGroup(
            jPanelHighlightingCoveredCodeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHighlightingCoveredCodeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHighlightingCoveredCodeLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelHighlightingCoveredCodeLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelPartiallyCoveredCodeBG)
                        .addComponent(jLabelNotCoveredCodeBG))
                    .addComponent(jLabelCoveredCodeBG, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelHighlightingCoveredCodeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHighlightingCoveredCodeLayout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelHighlightingCoveredCodeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelHighlightingCoveredCodeLayout.createSequentialGroup()
                                .addComponent(jSpinnerNotCoveredR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerNotCoveredG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerNotCoveredB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelNotCoveredPreview, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelHighlightingCoveredCodeLayout.createSequentialGroup()
                                .addComponent(jSpinnerCoveredR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerCoveredG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerCoveredB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelCoveredPreview, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelHighlightingCoveredCodeLayout.createSequentialGroup()
                                .addComponent(jSpinnerPartiallyCoveredR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerPartiallyCoveredG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerPartiallyCoveredB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelPartiallyCoveredPreview, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelHighlightingCoveredCodeLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabelInfoColorsAreRGB, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelHighlightingCoveredCodeLayout.setVerticalGroup(
            jPanelHighlightingCoveredCodeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHighlightingCoveredCodeLayout.createSequentialGroup()
                .addComponent(jLabelInfoColorsAreRGB)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelHighlightingCoveredCodeLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelCoveredCodeBG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelCoveredPreview, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerCoveredR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerCoveredG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerCoveredB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelHighlightingCoveredCodeLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelPartiallyCoveredCodeBG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelHighlightingCoveredCodeLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(jSpinnerPartiallyCoveredR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinnerPartiallyCoveredG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinnerPartiallyCoveredB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanelPartiallyCoveredPreview, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelHighlightingCoveredCodeLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelNotCoveredCodeBG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelHighlightingCoveredCodeLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(jSpinnerNotCoveredR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinnerNotCoveredG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinnerNotCoveredB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanelNotCoveredPreview, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        Mnemonics.setLocalizedText(jButtonResoreDefaults, NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jButtonResoreDefaults.text")); // NOI18N
        jButtonResoreDefaults.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonResoreDefaultsActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonResoreDefaults))
            .addComponent(jPanelHighlightingCoveredCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelHighlightingCoveredCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jButtonResoreDefaults))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonResoreDefaultsActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButtonResoreDefaultsActionPerformed
        jSpinnerCoveredR.setValue(DEF_COVERED_R);
        jSpinnerCoveredG.setValue(DEF_COVERED_G);
        jSpinnerCoveredB.setValue(DEF_COVERED_B);
        jSpinnerPartiallyCoveredR.setValue(DEF_PARTIAL_COVERED_R);
        jSpinnerPartiallyCoveredG.setValue(DEF_PARTIAL_COVERED_G);
        jSpinnerPartiallyCoveredB.setValue(DEF_PARTIAL_COVERED_B);
        jSpinnerNotCoveredR.setValue(DEF_NOT_COVERED_R);
        jSpinnerNotCoveredG.setValue(DEF_NOT_COVERED_G);
        jSpinnerNotCoveredB.setValue(DEF_NOT_COVERED_B);
        updateCoveredPreview();
        updatePartiallyCoveredPreview();
        updateNotCoveredPreview();
    }//GEN-LAST:event_jButtonResoreDefaultsActionPerformed

    private void jSpinnerCoveredRStateChanged(ChangeEvent evt) {//GEN-FIRST:event_jSpinnerCoveredRStateChanged
        updateCoveredPreview();
        updatePartiallyCoveredPreview();
        updateNotCoveredPreview();
    }//GEN-LAST:event_jSpinnerCoveredRStateChanged

    private void jSpinnerCoveredGStateChanged(ChangeEvent evt) {//GEN-FIRST:event_jSpinnerCoveredGStateChanged
        updateCoveredPreview();
        updatePartiallyCoveredPreview();
        updateNotCoveredPreview();
    }//GEN-LAST:event_jSpinnerCoveredGStateChanged

    private void jSpinnerCoveredBStateChanged(ChangeEvent evt) {//GEN-FIRST:event_jSpinnerCoveredBStateChanged
        updateCoveredPreview();
        updatePartiallyCoveredPreview();
        updateNotCoveredPreview();
    }//GEN-LAST:event_jSpinnerCoveredBStateChanged

    private void jSpinnerPartiallyCoveredRStateChanged(ChangeEvent evt) {//GEN-FIRST:event_jSpinnerPartiallyCoveredRStateChanged
        updateCoveredPreview();
        updatePartiallyCoveredPreview();
        updateNotCoveredPreview();
    }//GEN-LAST:event_jSpinnerPartiallyCoveredRStateChanged

    private void jSpinnerPartiallyCoveredGStateChanged(ChangeEvent evt) {//GEN-FIRST:event_jSpinnerPartiallyCoveredGStateChanged
        updateCoveredPreview();
        updatePartiallyCoveredPreview();
        updateNotCoveredPreview();
    }//GEN-LAST:event_jSpinnerPartiallyCoveredGStateChanged

    private void jSpinnerPartiallyCoveredBStateChanged(ChangeEvent evt) {//GEN-FIRST:event_jSpinnerPartiallyCoveredBStateChanged
        updateCoveredPreview();
        updatePartiallyCoveredPreview();
        updateNotCoveredPreview();
    }//GEN-LAST:event_jSpinnerPartiallyCoveredBStateChanged

    private void jSpinnerNotCoveredRStateChanged(ChangeEvent evt) {//GEN-FIRST:event_jSpinnerNotCoveredRStateChanged
        updateCoveredPreview();
        updatePartiallyCoveredPreview();
        updateNotCoveredPreview();
    }//GEN-LAST:event_jSpinnerNotCoveredRStateChanged

    private void jSpinnerNotCoveredGStateChanged(ChangeEvent evt) {//GEN-FIRST:event_jSpinnerNotCoveredGStateChanged
        updateCoveredPreview();
        updatePartiallyCoveredPreview();
        updateNotCoveredPreview();
    }//GEN-LAST:event_jSpinnerNotCoveredGStateChanged

    private void jSpinnerNotCoveredBStateChanged(ChangeEvent evt) {//GEN-FIRST:event_jSpinnerNotCoveredBStateChanged
        updateCoveredPreview();
        updatePartiallyCoveredPreview();
        updateNotCoveredPreview();
    }//GEN-LAST:event_jSpinnerNotCoveredBStateChanged

    private void updateCoveredPreview() {
        jPanelCoveredPreview.setBackground(new Color(
                (Integer) jSpinnerCoveredR.getValue(),
                (Integer) jSpinnerCoveredG.getValue(),
                (Integer) jSpinnerCoveredB.getValue()));
    }

    private void updatePartiallyCoveredPreview() {
        jPanelPartiallyCoveredPreview.setBackground(new Color(
                (Integer) jSpinnerPartiallyCoveredR.getValue(),
                (Integer) jSpinnerPartiallyCoveredG.getValue(),
                (Integer) jSpinnerPartiallyCoveredB.getValue()));
    }

    private void updateNotCoveredPreview() {
        jPanelNotCoveredPreview.setBackground(new Color(
                (Integer) jSpinnerNotCoveredR.getValue(),
                (Integer) jSpinnerNotCoveredG.getValue(),
                (Integer) jSpinnerNotCoveredB.getValue()));
    }

    void load() {
        Preferences pref = NbPreferences.forModule(JaCoCoveragePanel.class);
        int coveredR = pref.getInt(Globals.PROP_COVERAGE_HILIGHT_COLOR_R, DEF_COVERED_R);
        int coveredG = pref.getInt(Globals.PROP_COVERAGE_HILIGHT_COLOR_G, DEF_COVERED_G);
        int coveredB = pref.getInt(Globals.PROP_COVERAGE_HILIGHT_COLOR_B, DEF_COVERED_B);
        int parCoveredR = pref.getInt(Globals.PROP_PARTIALCOVERAGE_HILIGHT_COLOR_R, DEF_PARTIAL_COVERED_R);
        int parCoveredG = pref.getInt(Globals.PROP_PARTIALCOVERAGE_HILIGHT_COLOR_G, DEF_PARTIAL_COVERED_G);
        int parCoveredB = pref.getInt(Globals.PROP_PARTIALCOVERAGE_HILIGHT_COLOR_B, DEF_PARTIAL_COVERED_B);
        int notCoveredR = pref.getInt(Globals.PROP_NOCOVERAGE_HILIGHT_COLOR_R, DEF_NOT_COVERED_R);
        int notCoveredG = pref.getInt(Globals.PROP_NOCOVERAGE_HILIGHT_COLOR_G, DEF_NOT_COVERED_G);
        int notCoveredB = pref.getInt(Globals.PROP_NOCOVERAGE_HILIGHT_COLOR_B, DEF_NOT_COVERED_B);
        jSpinnerCoveredR.setValue(coveredR);
        jSpinnerCoveredG.setValue(coveredG);
        jSpinnerCoveredB.setValue(coveredB);
        jSpinnerPartiallyCoveredR.setValue(parCoveredR);
        jSpinnerPartiallyCoveredG.setValue(parCoveredG);
        jSpinnerPartiallyCoveredB.setValue(parCoveredB);
        jSpinnerNotCoveredR.setValue(notCoveredR);
        jSpinnerNotCoveredG.setValue(notCoveredG);
        jSpinnerNotCoveredB.setValue(notCoveredB);
        jPanelCoveredPreview.setBackground(new Color(coveredR, coveredG, coveredB));
        jPanelPartiallyCoveredPreview.setBackground(new Color(parCoveredR, parCoveredG, parCoveredB));
        jPanelNotCoveredPreview.setBackground(new Color(notCoveredR, notCoveredG, notCoveredB));
    }

    void store() {
        Preferences pref = NbPreferences.forModule(JaCoCoveragePanel.class);
        pref.putInt(Globals.PROP_COVERAGE_HILIGHT_COLOR_R, (Integer) jSpinnerCoveredR.getValue());
        pref.putInt(Globals.PROP_COVERAGE_HILIGHT_COLOR_G, (Integer) jSpinnerCoveredG.getValue());
        pref.putInt(Globals.PROP_COVERAGE_HILIGHT_COLOR_B, (Integer) jSpinnerCoveredB.getValue());
        pref.putInt(Globals.PROP_PARTIALCOVERAGE_HILIGHT_COLOR_R, (Integer) jSpinnerPartiallyCoveredR.getValue());
        pref.putInt(Globals.PROP_PARTIALCOVERAGE_HILIGHT_COLOR_G, (Integer) jSpinnerPartiallyCoveredG.getValue());
        pref.putInt(Globals.PROP_PARTIALCOVERAGE_HILIGHT_COLOR_B, (Integer) jSpinnerPartiallyCoveredB.getValue());
        pref.putInt(Globals.PROP_NOCOVERAGE_HILIGHT_COLOR_R, (Integer) jSpinnerNotCoveredR.getValue());
        pref.putInt(Globals.PROP_NOCOVERAGE_HILIGHT_COLOR_G, (Integer) jSpinnerNotCoveredG.getValue());
        pref.putInt(Globals.PROP_NOCOVERAGE_HILIGHT_COLOR_B, (Integer) jSpinnerNotCoveredB.getValue());
    }

    boolean valid() {
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton jButtonResoreDefaults;
    private JLabel jLabelCoveredCodeBG;
    private JLabel jLabelInfoColorsAreRGB;
    private JLabel jLabelNotCoveredCodeBG;
    private JLabel jLabelPartiallyCoveredCodeBG;
    private JPanel jPanelCoveredPreview;
    private JPanel jPanelHighlightingCoveredCode;
    private JPanel jPanelNotCoveredPreview;
    private JPanel jPanelPartiallyCoveredPreview;
    private JSpinner jSpinnerCoveredB;
    private JSpinner jSpinnerCoveredG;
    private JSpinner jSpinnerCoveredR;
    private JSpinner jSpinnerNotCoveredB;
    private JSpinner jSpinnerNotCoveredG;
    private JSpinner jSpinnerNotCoveredR;
    private JSpinner jSpinnerPartiallyCoveredB;
    private JSpinner jSpinnerPartiallyCoveredG;
    private JSpinner jSpinnerPartiallyCoveredR;
    // End of variables declaration//GEN-END:variables
}