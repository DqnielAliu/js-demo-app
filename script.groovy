
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
     this.runFrontend()
    // TODO: #2 Comment this line below until, gradle installation problem is resolved in Jenkins
    //  this.runBackend()
    } 

def runFrontend() {
    echo 'Executing frontend...'
    nodejs('NodeJS_17.10'){
        sh 'npm init -y'
        sh 'yarn run build'
        sh 'yarn install'
    } 
    }
def runBackend() { 
    echo 'executing gradle...'
        sh './gradlew -v '
    // for some unexplainable the gradle does not setup
    }

return this

