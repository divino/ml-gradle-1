package com.rjrudin.marklogic.gradle.task.security

import org.gradle.api.tasks.TaskAction;

import com.rjrudin.marklogic.gradle.task.MarkLogicTask;

class DeployPrivilegesTask extends MarkLogicTask {

    @TaskAction
    void deployPrivileges() {
        invokeDeployerCommandWithClassName("DeployPrivilegesCommand")
    }
    
}