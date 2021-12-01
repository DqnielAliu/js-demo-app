def gv

pipeline {
    agent {
        {node {label 'aws'}}
    }

    tools { //Support maven, gradle, and jdk
        gradle 'Gradle7.3'
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
        stage("run Frontend") {
            steps {
                script {
                    gv.runFrontend()
                }
            }
        }
        stage("Clean up") {
            steps {
                script {
                    gv.cleanUp()
                }
            }
        }
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
// pipeline {
//     agent any
//     environment {
//         DOCKER_IMAGE_NAME = "ptran32/nodejs-express-app"
//     }
    
//     options {
//     skipDefaultCheckout(true)
//     }

//     stages {
//         stage('Clean Workspace') {
//             steps {
//             deleteDir()
//             }
//         }
//         stage('Git Clone Source') {
//             steps {
//                 git url: 'https://github.com/ptran32/nodejs-express-app.git'
//             }
//         }

//         stage('Test and Build Docker Image') {
//             when {
//                 branch 'master'
//                 }
//             steps {
//                 script {
//                     env.GIT_COMMIT_REV = sh (script: 'git log -n 1 --pretty=format:"%h"', returnStdout: true)
//                     customImage = docker.build("${DOCKER_IMAGE_NAME}:${GIT_COMMIT_REV}-${env.BUILD_NUMBER}")
//                 }
//             }
//         }
//         stage('Push Docker Image') {
//             when {
//                 branch 'master'
//             }
//             steps {
//                 script {
//                     docker.withRegistry('https://registry.hub.docker.com', 'dockerhub_creds') {
//                         customImage.push("${GIT_COMMIT_REV}-${env.BUILD_NUMBER}")
//                         customImage.push("latest")
//                     }
//                 }
//             }
//         }
//         stage('Deploy to kubernetes cluster') {
//             when {
//                 branch 'master'
//             }
//             steps {
//                 kubernetesDeploy(
//                     kubeconfigId: 'kubeconfig',
//                     configs: 'deploy/*.yml',
//                     enableConfigSubstitution: true
//                 )
//             }
//         }
//     }
// }

 