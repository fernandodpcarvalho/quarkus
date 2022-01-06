mvn clean package

https://aws.amazon.com/pt/serverless/sam/
https://docs.aws.amazon.com/serverless-application-model/latest/developerguide/serverless-sam-cli-install-linux.html

sam package --template-file target/sam.jvm.yaml  --output-template-file package.yaml --s3-bucket quarkuslambdarest

sam deploy --template-file package.yaml --capabilities CAPABILITY_IAM --stack-name stack-quarkus-rest

https://ihqfc8mwz3.execute-api.sa-east-1.amazonaws.com/Prod/hello

https://ihqfc8mwz3.execute-api.sa-east-1.amazonaws.com/Prod/vertx/hello

https://ihqfc8mwz3.execute-api.sa-east-1.amazonaws.com/Prod/servlet/hello

OBS: Escolher uma destas