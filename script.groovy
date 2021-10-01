
def buildApp() {
    echo 'building the application...'
    echo ' checking periodic trigger' 
    }
def testApp() {
     echo 'testing the application...'
     sh 'ls'
     echo "testing parameter ${params.executeTests}"
     echo 'testing the application...' 
    } 
def deployApp() {  
     echo 'deplying the application...'
     echo 're-deplying the application...'    
     echo "deploying version ${params.VERSION}" 
    //  runFrontend()
    //  runBackend()
    } 

def runFrontend() {
    echo 'executing yarn...'
    nodejs('NodeJS-10_17_0'){
        sh 'yarn install'
        //sh 'yarn build'
    } 
    }
def runBackend() {
    echo 'executing gradle...' 
    withGradle(){
        sh './gradlew -v '
    }
    }

return this

