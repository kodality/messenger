# Messenger

This a template application for "Messenger" test assignment.

## Prerequisities

1. Java 8
1. Docker CE (v17+)
1. Node.js (v9+)

## Prepare database (PostgreSQL 10.3)

```
docker run --name messenger-postgres -e POSTGRES_PASSWORD=thisispassword -p 5432:5432 -d postgres:10.3-alpine
```
This command will start PostgreSQL container listening for connection on **localhost:5432**.
Username is **postgres** and password is **thisispassword**.

If for some reason you have to re-initialize Postgres container from the scratch then run:
`docker rm -fv messenger-postgres` and execute `docker run` command again.


## Running the backend application

From backend project root execute the following command:
```
./gradlew bootRun
```
After that navigate to `http://localhost:8080/api/messages` in your browser
to verify that backend application is running.

## Running the frontend application

First, install angular-cli globally:
```
npm install -g @angular/cli
``` 

Then navigate to frontend project root and install required dependencies:
```
npm install
```

When dependencies are installed run the frontend application:
```
ng serve
```

and navigate to `http://localhost:4200` in your browser

#
**Happy coding!**