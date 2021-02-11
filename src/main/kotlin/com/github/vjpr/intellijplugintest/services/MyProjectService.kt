package com.github.vjpr.intellijplugintest.services

import com.github.vjpr.intellijplugintest.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
