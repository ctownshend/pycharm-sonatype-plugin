package com.github.ctownshend.pycharmsonatypeplugin.services

import com.github.ctownshend.pycharmsonatypeplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
