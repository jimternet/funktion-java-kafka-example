## Example Kafka Funktion

This example shows [funktion](https://github.com/fabric8io/funktion/blob/master/README.md) can be used for more than restful integration but can support many different integrations, such as kafka.

<p align="center">
  <a href="http://fabric8.io/">
  	<img src="https://raw.githubusercontent.com/fabric8io/funktion/master/docs/images/icon.png" alt="funktion logo" width="200" height="200"/>
  </a>
</p>

The source code consists of 2 parts: consumer and producer. The producer is triggered by a timer every 500ms to send a message to Kafka. The consumer listens on topic test and logs consumption of that messaage.

You will need to first [setup fabric8](https://fabric8.io/guide/getStarted/index.html)
Then [install Zookeeper and Kafka](https://fabric8.io/guide/getStarted/apps.html).

To run the consumer, naviage to the consumer directory and install it on your flavour of kubernetes via:

```
mvn clean fabric8:run
```

To run the producer, naviage to the producer directory and install it on your flavour of kubernetes via:

```
mvn clean fabric8:run
```
