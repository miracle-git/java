package com.miracle.pattern.client;

import com.miracle.pattern.template.PayServiceProjectManager;
import com.miracle.pattern.template.ProjectManager;
import com.miracle.pattern.template.UserServiceProjectManager;

public class TemplateMethodClient {
    public static void run() {
        ProjectManager project;
        project = new PayServiceProjectManager();
        project.process();

        project = new UserServiceProjectManager();
        project.process();
    }
}
