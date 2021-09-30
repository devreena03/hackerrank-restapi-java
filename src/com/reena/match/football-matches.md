## Hackerrank REST API Intermediate certification 

### Question 1 : Total Goal By a team

#### Input
To access collection of match perform GET request
`https://jsonmock.hackerrank.com/api/football_matches?year=<year>&team1=<team>&page=<page>` and
`https://jsonmock.hackerrank.com/api/football_matches?year=<year>&team2=<team>&page=<page>`

- `<year>`: year of competition
- `<team>`: name of team
- `<page>`: page number of request
- `team1` : home team
- `team2` : visiting team
 
#### Output
Get all matches a particular team played in. In order to get all matches a team played in , need to retrive the matches where team was home team and the visiting team.

#### Solution used

- Java 8
- `URL` and `HttpURLConnection` from package java.net.*;
- Parsing json object with Gson. External jar used: gson-2.8.2
- recursive call to get all pagination data response