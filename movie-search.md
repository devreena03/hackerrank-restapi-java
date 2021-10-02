Input
---------
To access the movie details by subtitle , make a GET request to `https://jsonmock.hackerrank.com/api/movies/search/?Title=substr&page=1`
 
Output
---------
List of movie names in ascending order

Solution used
------------
- Java 8
- `URL` and `HttpURLConnection` from package java.net.*;
- Parsing json object with Gson. External jar used: gson-2.8.2
- while loop with total_page limit to get all pagination data response