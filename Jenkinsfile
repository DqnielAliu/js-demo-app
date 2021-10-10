def gv

pipeline {
    agent any

    tools { //Support maven, gradle, and jdk
        gradle 'Gradle 6-9'
    }

    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: 'Version locking / version fixing')
        booleanParam(name: 'executeTests', defaultValue: true, description: 'Test trigger')
    }
    stages {
        stage("init") {
            steps {
                script {
                   gv = load "script.groovy" 
                }
            }
        }
        stage("build") {
            steps {
                script {
                    gv.buildApp()
                }
            }
        }
        stage("test") {
            when {
                expression {
                    params.executeTests
                }
            }
            steps {
                script {
                    gv.testApp()
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
        // stage("run Frontend") {
        //     steps {
        //         script {
        //             gv.runFrontend()
        //         }
        //     }
        // }
        // The code below is commented out bcos I don't have gradle installed
        // stage("run Backend") {
        //     steps {
        //         script {
        //             gv.runBackend()
        //         }
        //     }
        // }
    }   
}
