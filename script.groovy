

def buildApp() {
    echo 'building the application...' 
    }
def testApp() {
     echo 'testing the application...' 
    } 
def deployApp() {  
     echo 'deplying the application...'    
     echo "deploying version ${params.VERSION}" 
    }
def buildFrontend() {
    echo 'executing yarn...' 
    }
def buildBackend() {
    echo 'executing gradle...' 
    } 
return this

