
<<<<<<< HEAD
=======

>>>>>>> a0c9405fb1b79e6c730c4be873927ac1e204fa9f
def buildApp() {
    echo 'building the application...' 
    }
def testApp() {
<<<<<<< HEAD
     echo 'testing the application...'
     ls 
     echo "testing parameter ${params.executeTests}"
=======
     echo 'testing the application...' 
>>>>>>> a0c9405fb1b79e6c730c4be873927ac1e204fa9f
    } 
def deployApp() {  
     echo 'deplying the application...'    
     echo "deploying version ${params.VERSION}" 
    } 
<<<<<<< HEAD
def runFrontend() {
    echo 'executing yarn...' 
    }
def runBackend() {
    echo 'executing gradle...' 
    }

=======
>>>>>>> a0c9405fb1b79e6c730c4be873927ac1e204fa9f
return this

