Activate Docker:
cmd->cd projectPath
type: docker compose up -d
information about the port: docker compose ps

url postres: http://localhost:5050/browser/
url eureka: http://localhost:8761/

running zipkin for tracing:docker logs zipkin
then take the url that apear below at the cmd.


level=warning msg="Found orphan containers ([customer notification fraud zipkin rabbitmq]) for this project.
If you removed or renamed this service in your compose file,
you can run this command with the --remove-orphans flag to clean it up."