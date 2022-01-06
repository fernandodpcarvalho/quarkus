mvn clean package/create/delete/update

export LAMBDA_ROLE_ARN=arn:aws:iam::120245270950:role/lambda-quarkus


mvn package -Pnative