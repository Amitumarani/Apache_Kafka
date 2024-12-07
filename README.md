# Apache_Kafka
In this project there are 2 services
1: deliveryboy 
2: userservice 
These two services are using APACHE_KAFKA for asynchronous communication.
deliveryboy service is producer
userservice is consumer

Spring boot project steps create producer 
1: Create spring boot project with two dependency 
    Spring web 
    Apache kafka for spring 
2: Start apache kafka server on localhost 
3: In the application.properties mention 3 properties
   kafkaserver host
   key.serialization 
   value.serialization
4: Create configuration package and class
5: create 2 beans in the configuration class
   * NewTopic using TopicBuilder
   * KafkaTemplate using ProducerFactory
6: Create controller class to add message to apache kafka
7: In the service class use KafkaTemplate.send() method to add message to apachekafka

Spring boot project steps create producer 
1: Create spring boot project with two dependency 
    Spring web 
    Apache kafka for spring 
2: In the applicaton.properties mention 5 properties
   kafkaserver host
   key.serialization 
   value.serialization
   group id 
   offset-reset
3: create configuration package and class 
4: create method with @kafkalistener annotation
