## Vaadin K8 Kit Issue, Test Project

Vaadin Kubernetes Kit Session Serialization Issue Reproduction
This project demonstrates the session serialization issue encountered in the Vaadin Kubernetes Kit. Follow the steps below to reproduce the problem:

### Prerequisites
Java Development Kit (JDK) 17 or later
Maven (for building the project)
Docker (for running Kubernetes locally)

### Steps to Reproduce
cd vaadin-k8s-session-issue

#### Build the Project:

```
mvn clean package -Pproduction,redis
```

Then build a Docker image

```
docker build -t k8-project-test:1.0.0 .
```

#### Deploy to Kubernetes:
Ensure you have a local Kubernetes cluster running (e.g., Minikube or Docker Desktop with Kubernetes enabled).

Deploy the application using the provided Kubernetes manifests:

```
kubectl apply -f deployment/app-v1.yaml -f deployment/redis.yaml
```

#### Trigger Serialization:
Access the deployed Vaadin application via browser (localhost:8080).
At this point serialization process should already start, after around 1 minute you should see the exception in the logs:

```
2024-09-13T07:20:02.343Z ERROR 7 --- [er-1043508183-1] c.v.k.s.s.SessionSerializer              : An error occurred during pessimistic serialization of session 1DD2F4FC65334E184C65B929B2D63F7C with distributed key 0908b23a-15d4-482d-9b22-cb7f79370a53
2024-09-13 10:20:02
2024-09-13 10:20:02 org.springframework.beans.factory.support.ScopeNotActiveException: Error creating bean with name 'vaadinUiScopeBean': Scope 'vaadin-ui' is not active for the current thread; consider defining a scoped proxy for this bean if you intend to refer to it from a singleton
```

### Expected Behavior
The application should handle session serialization correctly, even when injecting beans with the “vaadin-ui” or “vaadin-session” scope.
