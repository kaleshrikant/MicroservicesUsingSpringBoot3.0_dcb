# MicroservicesUsingSpringBoot3.0_dcb

# How to Resolve the "Port Already in Use" Error
#### Identify the Process Using the Port

For Linux/macOS :

```sh
lsof -i :8080
```

For Windows :

```sh
netstat -ano | findstr 8080
```
#### Kill the Process

For Linux/macOS:
```sh
kill -9 <PID>
```

Where <PID> is the process ID. 

For Windows:
```sh
taskkill /F /PID <PID>
```


