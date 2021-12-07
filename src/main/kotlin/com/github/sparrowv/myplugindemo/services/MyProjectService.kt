package com.github.sparrowv.myplugindemo.services

import com.intellij.openapi.project.Project
import com.github.sparrowv.myplugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
