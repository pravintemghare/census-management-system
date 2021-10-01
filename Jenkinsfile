pipeline {
    agent any
    environment {
        BUILD_TAG = sh(returnStdout: true, script: 'git rev-parse HEAD  | head -c 6')  
    }

    stages {
        stage('GitCheckout') {
            steps {
                git 'https://github.com/pravintemghare/census-management-system.git'    
            }
        }
        stage('Census_Application_Build') {
            steps {
                withMaven(maven : 'mvn83') {
                    sh 'mvn -DskipTests=true clean'
                }
            }
        }
        stage('Census_Application_Package') {
            steps {
                withMaven(maven : 'mvn83'){
                    sh 'mvn -DskipTests=true package'
                }
            }
        }
                stage('Ansible-Census_Docker_Build') {
            steps {
                ansiblePlaybook become: true, credentialsId: 'ansible_host', extras: '-e build_tag=$BUILD_TAG -e workspace_dir=$WORKSPACE', installation: 'ansible', inventory: 'ansible_playbooks/ansible_hosts', playbook: 'ansible_playbooks/create_docker_image.yml', vaultCredentialsId: 'ansible_vault_password'
            }
        }
        stage('Ansible-Census_MiniKube_Deploy') {
            steps {
                sh 'sed -i "s|docker_tag|$BUILD_TAG|g" minikube_deployment/census-deployment.yml'
                ansiblePlaybook credentialsId: 'ansible_host', extras: '-e workspace_dir=$WORKSPACE', installation: 'ansible', inventory: 'ansible_playbooks/ansible_hosts', playbook: 'ansible_playbooks/census-minikube-deploy.yml'
            }
        }
    }
}
