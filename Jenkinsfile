pipeline{
	agent any 
	stages{
		stage('Desplegando artefacto'){
				environment {
					MAVEN_HOME = '/usr/share/maven'
				}
			steps{
					echo 'Iniciando despliegue'
				
				rtMavenDeployer (
					id: 'IS_P2_BUBBLE_SORT',
					serverId: 'artifactory',
					releaseRepo: 'parcial2',
					snapshotRepo: 'parcial2',
				)
				rtMavenRun (
					pom: 'pom.xml',
					goals: 'install',
					deployerId: 'IS_P2_BUBBLE_SORT',
				)
					echo 'Finalizando Despliegue'
				
			
			}
		}
		
	}
}		
