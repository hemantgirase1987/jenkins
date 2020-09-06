def buildFunction() {
    echo "This is a build stage from master branch"
}

def testFunction() {
    echo "This is a test stage from master branch"
}

def deployFunction() {
    echo "This is a deploy stage from master branch"
}

return this