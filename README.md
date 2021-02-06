# Welcome to your CDK Java project!

This is a blank project for Java development with CDK.

The `cdk.json` file tells the CDK Toolkit how to execute your app.

It is a [Maven](https://maven.apache.org/) based project, so you can open this project with any Maven compatible Java IDE to build and run tests.

## Useful commands

 * `mvn package`     compile and run tests
 * `cdk ls`          list all stacks in the app
 * `cdk synth`       emits the synthesized CloudFormation template
 * `cdk deploy`      deploy this stack to your default AWS account/region
 * `cdk diff`        compare deployed stack with current state
 * `cdk docs`        open CDK documentation

Enjoy!

### VPC

* Permite criar uma rede virtual
* Os componentes dentro dessa rede podem ficar isolados de acesso fora rede virtual
* Regras de segurança podem ser criadas para abrir portas/protocolos para a Internet

### AWS Fargate

* Serviço de orquestração de containers
* Com AWS Fargate, não é necessário gerenciar instâncias de máquinas
* A cobrança é feita somente sobre os recursos especificados por cada aplicação

### Auto Scaling

* Pode monitorar métricas, como consumo de CPU, RAM e quantidade de requisições
* Baseado nos valores das métricas, pode aumentar ou diminuir a quantidade de instâncias
da aplicação em execução, para se adequar à carga a ser executada
  
### Aplication Load Balancer

* Faz o balanceamento de requisições nas instâncias em execução
* verifica a integridade da aplicação em execução
* Associa regras de segurança, liberando somente as portas e protocolos configurados

### Security Rules

* Atua como firewal virtual para suas instâncias EC2 para controlar o tráfego de
entrada e saída
* Ao iniciar uma instância em uma VPC, deve especificar um grupo de segurança para essa VPC
* Os grupos de segurança são associados a interface de rede
