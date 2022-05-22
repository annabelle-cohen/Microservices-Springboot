
## Microservice Via Spring Boot
the project comes to demonstrate the idea of microsevices by modules in spring boot framework,<br/>the whole idea is creating a customer but first i check if the customer is not a fraudster then i sending a notification that kind of welcome message.
<hr/><br/>

## Modules:
<ul>
<li>customer</li>
<li>fraud</li>
<li>notification</li>
<li>eureka-server</li>
<li>clients</li>
<li>apigw (api gateway)</li>
<li>amqp (advanced message queue protocol)</li>
</ul>

<hr/><br/>

## Technologies:
<ul>
<li>Docker - activate the server and dataBase and other feacher more easy</li>
<li>Postgres - DataBase used for storing the data</li>
<li>Eureka - handling the communication in the server(register each module)</li>
<li>Zipkin - showing the tracing of the request</li>
<li>RabbitMQ - helping handling the notification in asynchronously way</li>
<li>Feign Client (Spring Cloud) - loose coupling and reduce duplicates</li>
<li>Spring-gateway - demonstarte load balancer</li>
</ul>

<hr/><br/>
## More Imporatant Things:

Activate Docker: <br/>
cmd->cd projectPath <br/>
type: docker compose up -d <br/>
information about the port: docker compose ps
<br/><br/>
url postres: http://localhost:5050/browser/ <br/>
url eureka: http://localhost:8761/ <br/>

running zipkin for tracing:docker logs zipkin <br/>
then take the url that apear below at the cmd. <br/>

<br/> <br/>
level=warning msg="Found orphan containers ([customer notification fraud zipkin rabbitmq]) for this project.<br/>
If you removed or renamed this service in your compose file,<br/>
you can run this command with the --remove-orphans flag to clean it up."<br/>
