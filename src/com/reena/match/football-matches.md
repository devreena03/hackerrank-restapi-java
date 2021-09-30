## Hackerrank REST API Intermediate certification 

### Question 1 : Total Goal By a team

#### Input
Year and Team name.

To access collection of match perform GET request
`https://jsonmock.hackerrank.com/api/football_matches?year=<year>&team1=<team>&page=<page>` and
`https://jsonmock.hackerrank.com/api/football_matches?year=<year>&team2=<team>&page=<page>`

- `<year>`: year of competition
- `<team>`: name of team
- `<page>`: page number of request
- `team1` : home team
- `team2` : visiting team
 
#### Output
Get all matches a particular team played. 

In order to get all matches a team played in , need to retrive the matches where team was home team and the visiting team.

totalgoal = team1goal(from 1st URL)+team2goal(from 2nd URL)

#### Sample Input

```
https://jsonmock.hackerrank.com/api/football_matches?year=2011&team1=Barcelona&page=1
{
    "page": 1,
    "per_page": 10,
    "total": 6,
    "total_pages": 1,
    "data": [
        {
            "competition": "UEFA Champions League",
            "year": 2011,
            "round": "GroupH",
            "team1": "Barcelona",
            "team2": "AC Milan",
            "team1goals": "2",
            "team2goals": "2"
        },
        {
            "competition": "UEFA Champions League",
            "year": 2011,
            "round": "GroupH",
            "team1": "Barcelona",
            "team2": "Viktoria Plzen",
            "team1goals": "2",
            "team2goals": "0"
        },
        ....
    ]
}
https://jsonmock.hackerrank.com/api/football_matches?year=2011&team2=Barcelona&page=1
{
    "page": 1,
    "per_page": 10,
    "total": 6,
    "total_pages": 1,
    "data": [
        {
            "competition": "UEFA Champions League",
            "year": 2011,
            "round": "GroupH",
            "team1": "BATE Borisov",
            "team2": "Barcelona",
            "team1goals": "0",
            "team2goals": "5"
        },
        {
            "competition": "UEFA Champions League",
            "year": 2011,
            "round": "GroupH",
            "team1": "Viktoria Plzen",
            "team2": "Barcelona",
            "team1goals": "0",
            "team2goals": "4"
        },
        ...
    ]
}
```

### Question 2 : Football competition winner team goal

### Question 3 : Number of Drawn matches

#### Solution used

- Java 8
- `URL` and `HttpURLConnection` from package java.net.*;
- Parsing json object with Gson. External jar used: gson-2.8.2
- recursive call to get all pagination data response