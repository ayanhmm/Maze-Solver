# Maze Solver
 Code to find the path to escape a maze

input format::

0  0  1  1  0 

0  1  1  1  1 

0  0  0  1  1 

0  1  0  0  0

0 represents empty gaps where you can move

1 represents walls of the maze

algorithm::

it follows a simple set of rules defined furthur. it starts heading on a predefined path(initially towards right block then if wall on right then bottom block) untill you hit a dead end where all 3 directions are walls and then you mark the current block as wall and return to the previus block and chose a new path
