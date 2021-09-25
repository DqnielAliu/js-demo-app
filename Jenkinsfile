def gv

pipeline {
    agent any
    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
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
<<<<<<< HEAD
                    params.exexcuteTests
=======
                    params.executeTests
>>>>>>> a0c9405fb1b79e6c730c4be873927ac1e204fa9f
                }
            }
            steps {
                script {
                    gv.testApp()
                }
            }
        }
<<<<<<< HEAD
        
=======
        stage("deploy") {
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
>>>>>>> a0c9405fb1b79e6c730c4be873927ac1e204fa9f
    }   
}
