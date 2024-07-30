def buildApp(){
    echo "Building the application..."
    echo "Building the application...${params.version}"

}
def testApp(){
    echo "testing the application ${params.version} "
    sh 'printenv'
}
def deployApp(){
    echo "Deploying the application  "
}

return this