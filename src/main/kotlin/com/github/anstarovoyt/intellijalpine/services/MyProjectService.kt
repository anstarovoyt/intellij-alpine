package com.github.anstarovoyt.intellijalpine.services

import com.github.anstarovoyt.intellijalpine.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
