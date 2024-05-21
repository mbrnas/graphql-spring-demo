# Spring Boot with GraphQL and Grafana Monitoring

## Overview

The project utilizes GraphQL to handle queries to a Spring Boot application, with the data being monitored via Grafana dashboards that visualize metrics scraped by Prometheus.

## Technologies Used

- **Spring Boot**: For the backend application.
- **GraphQL**: For handling data queries.
- **Grafana**: For visualizing application metrics.
- **Prometheus**: For metrics collection.
- **Docker**: For containerization of the services.

## Application Setup

![GraphQL Query in Action](https://github.com/mbrnas/graphql-spring-demo/blob/main/assets/Screenshot%202024-05-21%20at%2007.26.42.png)
*Figure 1: GraphQL query executed in the GraphiQL interface, retrieving details about a book and its author.*

## Monitoring Setup

![Grafana Dashboard](https://github.com/mbrnas/graphql-spring-demo/blob/main/assets/Screenshot%202024-05-21%20at%2008.11.14.png)
*Figure 2: Grafana dashboard showing the metrics for GraphQL request durations and outcomes.*

## Docker Containers

![Docker Containers](https://github.com/mbrnas/graphql-spring-demo/blob/main/assets/Screenshot%202024-05-21%20at%2007.46.28.png)
*Figure 3: Docker Desktop showing the running containers for Prometheus, Grafana, and the monitoring stack.*

## Conclusion

This setup showcases a modern application development and monitoring environment, demonstrating the power of combining these technologies for efficient development and robust observability.
