# Remote audio control
## Information for developers
### Build for production
```
gradlew clean build
```
### Build without frontend
```
gradlew -DskipFrontend=true clean build
```
### Webpack watch for development
```
gradlew npm_run_watch
```
### Launch on embedded tomcat
Deploy application to http://localhost:8080/
```
gradlew tomcatRun
```
