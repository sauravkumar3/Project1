class HelloJava {

	public static void main(String args[]){

		System.out.Println(“ I am your Java Program. Thank you! ”);

	}

}
https://www.docker.com/sites/default/files/UseCase/RA_CI%20with%20Docker_08.25.2015.pdf

sudo apt-get remove unscd
sudo usermod -a -G docker $USER
sudo usermod -aG docker jenkins
sudo service jenkins restart

docker build --pull=true -t saurav242/node-web-app:$GIT_COMMIT .
docker push saurav242/node-web-app:$GIT_COMMIT
docker login -u "saurav242" -p "57d69324-9ef2-45d2-9b37-58976cdc8870" docker.io
docker push saurav242/node-web-app:$GIT_COMMIT


docker build --pull=true -t saurav242/node-jenkins-docker-app:$GIT_COMMIT .
docker push saurav242/node-jenkins-docker-app:$GIT_COMMIT
docker login -u "saurav242" -p "57d69324-9ef2-45d2-9b37-58976cdc8870" docker.io
docker push saurav242/node-jenkins-docker-app:$GIT_COMMIT

docker run -p 49160:8080 -d saurav242/node-jenkins-docker-app:21f796917e41c7cc42180f5c52dde9ba0767a1c1
