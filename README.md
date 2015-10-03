# GameInfo

This gets game data from [TheGamesDB.net](http://thegamesdb.net/), colapses games with the same name into one row, and outputs them into a TSV.

The list of games is located at [here](https://github.com/thefroatgt/GameInfo/blob/master/src/main/java/thefroatgt/gameinfo/App.java#L31).

An example API call made by the app is [thegamesdb.net/api/GetGame.php?exactname=Call of Duty: Black Ops](http://thegamesdb.net/api/GetGame.php?exactname=Call%20of%20Duty:%20Black%20Ops).

The documentation of the API is [here](http://wiki.thegamesdb.net/index.php/API_Introduction).

The output of the program given the current list is [here](https://github.com/thefroatgt/GameInfo/blob/master/exampleResponse/example.tsv).
