# MKS21X-FinalProject
How to play:
How to launch Greeblers in the terminal: bash Game.sh
Use Arrow Keys for movement
Press Space to attack (can only attack when right next to a greebler)
Collect All Babies(Marked with a B-like symbol) by moving over them and get to exit (purple) to win
Avoid or attack greeblers (red)

DevLog:
-1/4/19 created creature class with basic methods
-1/5/19 Added simple get and change-variable methods as well as a dodge method to Creature class.
-1/7/19 Added more change-variable methods and began experimenting with lanterna
-1/8/19 Started interconnecting classes and displaying creatures on terminal.
-1/9/19 fixing bugs to allow players and Greeblers to properly display on terminal.
-1/10/19 Tried to instantiate a grid of walls on the screen - failed to do so. Checkinfront function created. Baby class written.
-1/11/19 Instantiated grid, babies, and greeblers arraylists and finished player's interaction with these items in terms of movement, must write attack methods and show graphics of babies and greeblers. Created pickUpBaby() method and implemented necessary methods in baby and Player. Also makes babies disappear from the screen once they are collected.
-1/12/19 Began creation of map. All classes interact with each other properly in attack, pick up, and in movement. perimeter has been drawn, but we still have to draw the maze and allow greeblers to attack players.
-1/13/29 Map completed. Fixed pickUpBaby so that it works in all directions. Attack modified to work with greeblers. Map added to grid arraylist. More greeblers and babies placed around the map. Output messages like "you won" and others created. Game ready for demo.
-1/14/19 Added player tracking to greeblers' functionality. They now follow the player, making the game more challenging. Greeblers disappear when killed and babies disappear when picked up now. Greeblers attack/move every second rather than every time the while loop is called. Changed design of the walls. Trying to get rid of lag, but having trouble doing so.
1/16/19 Added bandage class to allow the player to heal. The pickUpBandage method does not yet work. The graphic for the bandages also glitches as it multiplies its graphic over other spaces and does not allow a seamless interaction with the player. Projectiles have been added in a separate branch. As of now the projectile kills the player immediately open generation. We also tried to start to figure out how to generate another screen open completion of the first map. Our first idea was scraped as we will use the same set perimeter and add the internal walls depending on the map number.
1/20/19 Added 2nd map for another level in the game. Figured out how to clear the previous map and add a new group of greeblers and babies to the new map.
1/21/19 Finished the second map and touched up the mechanics of the second set of greeblers and babies. Wrote in comments for each class and the very simple instructions to the game. 
