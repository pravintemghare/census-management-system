pipeline {
    agent any
    stages {
        stage('GitCheckout') {
            steps {
                git(
                    branch: 'master',
                    credentialsId: 'github',
                    url: 'https://github.com/pravintemghare/census-management-system.git'
                )    
            }
        }
        stage('ApplicationBuild') {
            steps {
                withMaven(maven : 'mvn83') {
                    sh 'mvn -DskipTests=true clean'
                }
            }
        }
        stage('ApplicationPackage') {
            steps {
                withMaven(maven : 'mvn83'){
                    sh 'mvn -DskipTests=true package'
                }
            }
        }
        stage('Ansible_Docker_Image_build') {
            steps {
                sshPublisher(publishers: [sshPublisherDesc(configName: 'ansible_host', transfers: [sshTransfer(cleanRemote: false, excludes: '', execCommand: 'ansible-playbook -i /opt/zensus-deploy/hosts /opt/zensus-deploy/create-docker-image.yml --vault-password-file /opt/zensus-deploy/.vault_pass', execTimeout: 120000, flatten: false, makeEmptyDirs: false, noDefaultExcludes: false, patternSeparator: '[, ]+', remoteDirectory: '//opt//zensus-deploy', remoteDirectorySDF: false, removePrefix: 'target', sourceFiles: 'target/zensus-0.0.1-SNAPSHOT.war')], usePromotionTimestamp: false, useWorkspaceInPromotion: false, verbose: false)])
            }
        }
    }
}
