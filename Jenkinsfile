pipeline {
    agent any
        stages {
            stage ("Build") {
                when {
                    expression {
                        env.BRANCH_NAME == "master"
                    }
                }

                steps {
                    echo "This is a build stage from master branch"
                }
            }

            stage ("Test") {
                when {
                    expression {
                        env.BRANCH_NAME == "dev"
                    }
                }
                steps {
                    echo "This is a testing stage from dev branch"
                }
            }

            stage ("Deploy") {
                when {
                    expression {
                        env.BRANCH_NAME == "master"
                    }
                }
                steps {
                    echo "This is a deploy stage from master branch"
                }
            }
        }
}