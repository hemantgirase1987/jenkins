pipeline {
    agent any
        stages {
            stage ("Build") {
                steps {
                    echo "This is a build stage from master branch"
                }
            }

            stage ("Test") {
                steps {
                    echo "This is a testing stage from dev branch"
                }
            }

            stage ("Deploy") {
                steps {
                    echo "This is a deploy stage from master branch"
                }
            }
        }
}