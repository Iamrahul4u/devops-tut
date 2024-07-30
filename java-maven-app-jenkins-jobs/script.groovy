def buildApp(){
    echo "Building the application..."
    echo "Building the application...${params.version}"

}
def testApp(){
    echo "Deploying the application ${params.version} "
    sh 'printenv'
}

return this