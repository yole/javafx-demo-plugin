package com.jetbrains.demo;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class JavafxDemoDialog extends DialogWrapper {
    private JFXPanel myPanel;

    protected JavafxDemoDialog(@Nullable Project project) {
        super(project);
        init();
    }

    @Override
    protected @Nullable JComponent createCenterPanel() {
        myPanel = new JFXPanel();
        Platform.runLater(this::initFXPanel);
        return myPanel;
    }

    private void initFXPanel() {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(event -> System.out.println("Hello World!"));

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        Scene scene = new Scene(root, 300, 250);
        myPanel.setScene(scene);
    }
}
