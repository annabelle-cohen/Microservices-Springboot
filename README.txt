<b>Microservice Via Spring Boot</b>
<hr/>
<p>
the project comes to demonstrate the idea of microsevices by modules in spring boot framework,<br/>the whole idea is creating a customer but first i check if the customer is not a fraudster then i sending a notification that kind of welcome message.
</p>

<b>Modules:</b>
<hr/>
<ul>
<li>customer</li>
<li>fraud</li>
<li>notification</li>
<li>eureka-server</li>
<li>clients</li>
<li>apigw</li>
<li>amqp</li>
</ul>

<br/>
<b>Technologies:</b>
<hr/>
<ul>
<li>Docker - activate the server and dataBase and other feacher more easy</li>
<li>Postgres - DataBase used for storing the data</li>
<li>Eureka - handling the communication in the server(register each module)</li>
<li>Zipkin - showing the tracing of the request</li>
<li>RabbitMQ - helping handling the notification in asynchronously way</li>
<li>Feign Client (Spring Cloud) - loose coupling and reduce duplicates</li>
<li>Spring-gateway - demonstarte load balancer</li>
</ul>


<b>More imporatnt thing:</b>
<hr/>
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
