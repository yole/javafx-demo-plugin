package com.jetbrains.demo;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class JavafxDemo extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent e) {
        new JavafxDemoDialog(e.getProject()).show();
    }
}
