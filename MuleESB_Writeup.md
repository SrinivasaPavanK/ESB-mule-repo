#ESB

An Enterprise Service Bus (ESB) is a software architecture model used for designing and implementing communication between mutually interacting software applications in a service-oriented architecture (SOA). 

As a Software Architectural model for distributed computing it is a specialty variant of the more general client server model and promotes agility and flexibility with regard to communication between applications. 

Its primary use is in enterprise application integration (EAI) of heterogeneous and complex landscapes.

ESB offers integration with a lot of different protocols in addition to JMS. 
Most use JMS behind the scenes to transfer, stor and move messages. One such solution OpenESB, uses XML format messages. 

Following are Open Source ESB:

-OpenESB

-Apache Camel

-MuleESB

-WSO2 ESB



#Mule ESB


Mule ESB is a lightweight Java-based enterprise service bus (ESB) and integration platform that allows developers to connect applications together quickly and easily, enabling them to exchange data. Mule ESB enables easy integration of existing systems, regardless of the different technologies that the applications use, including JMS, Web Services, JDBC, HTTP, and more.


#Advantages:

The key advantage of an ESB is that it allows different applications to communicate with each other by acting as a transit system for carrying data between applications within your enterprise or across the Internet.


-Faster and cheaper accommodation of existing systems.

-Increased flexibility; easier to change as requirements change.

-Scales from point-solutions to enterprise-wide deployment (distributed bus).

-More configuration rather than integration coding.

-No central rules-engine, no central broker.

-Incremental patching with zero down-time; enterprise becomes “refactorable”.



#Pitfalls


-Usually requires an Enterprise Message Model, resulting in additional management overhead. 

-Potential difficulties integrating many disparate systems to collaborate via message standards.

-It normally requires more hardware than simple point-to-point messaging.

-Middleware analysis skills needed to configure, manage, and operate an ESB.

-Extra overhead and increased latency caused by messages traversing the extra ESB layer, especially as compared to point-to-point communications. The increased latency also results from additional XML processing (the ESB normally uses XML as the communication language)

--ESB becomes a single point of failure.

-Though ESB systems can require a significant effort to implement, they produce no commercial value without the subsequent development of SOA services for the ESB.

