def gv

pipeline {
    agent any
    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: 'Version locking')
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
        stage("run Frontend") {
            steps {
                script {
                    gv.runFrontend()
                }
            }
        }
        stage("run Backend") {
            steps {
                script {
                    gv.runBackend()
                }
            }
        }
    }   
}
