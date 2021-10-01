
def buildApp() {
    echo 'building the application...' 
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
    } 

def runFrontend() {
    echo 'executing yarn...' 
    }
def runBackend() {
    echo 'executing gradle...' 
    }

return this

