# KnowledgeNet

KnowledgeNet is a exam service containing multiple microservices for quiz, question and registry.

It uses Feign client for microservice communication.



How to install redis:

&nbsp;- install wsl

&nbsp;- curl -fsSL https://packages.redis.io/gpg | sudo gpg --dearmor -o /usr/share/keyrings/redis-archive-keyring.gpg



&nbsp;- echo "deb \[signed-by=/usr/share/keyrings/redis-archive-keyring.gpg] https://packages.redis.io/deb $(lsb\_release -cs) main" | sudo tee /etc/apt/sources.list.d/redis.list



sudo apt-get update

sudo apt-get install redis



sudo service redis-server start



redis-cli

&nbsp;sudo service redis-server start



How to start:

&nbsp;- on cmd typr wsl.exe

&nbsp;- sudo service redis-server start

redis



Start MySQL server

run cmd as administrator

net start mysql80

