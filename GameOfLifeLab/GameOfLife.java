import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.ArrayList;

//http://www.greenteapress.com/thinkapjava/html/thinkjava018.html
//http://apcentral.collegeboard.com/apc/members/repository/ap07_gridworld_casestudy_3.pdf
//http://apcentral.collegeboard.com/apc/public/repository/ap_comp_sci_a_quick_reference.pdf

/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    
    // the game board will have 6 rows and 6 columns
    private final int ROWS = 10;
    private final int COLS = 10;
    
    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGame();
        
        // display the newly constructed and populated world
        world.show();
        
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // constants for the location of the three cells initially alive
        final int X1 = 1, Y1 = 1;
        final int X2 = 2, Y2 = 2;
        final int X3 = 3, Y3 = 2;
        final int X4 = 1, Y4 = 3;
        final int X5 = 4, Y5 = 4;
        
        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add flocwers (a type of Actor) to the five locations
        Flower flower1 = new Flower();
        Location loc1 = new Location(Y1, X1);
        grid.put(loc1, flower1);
        
        Flower flower2 = new Flower();
        Location loc2 = new Location(Y2, X2);
        grid.put(loc2, flower2);
        
        Flower flower3 = new Flower();
        Location loc3 = new Location(Y3, X3);
        grid.put(loc3, flower3);
        
        Flower flower4 = new Flower();
        Location loc4 = new Location(Y4, X4);
        grid.put(loc4, flower4);
        
        Flower flower5 = new Flower();
        Location loc5 = new Location(Y5, X5);
        grid.put(loc5, flower5);
    }

    
    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        
        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();
        BoundedGrid<Actor> grid2 = new BoundedGrid<Actor>(ROWS, COLS);

        // insert magic here...
        
        
        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                Actor cell = this.getActor(row, col);
                Location loc = new Location(row,col);
                ArrayList<Actor> neighbors = grid.getNeighbors(loc);
                if (cell == null)
                {
                    Flower newFlower = new Flower();
                    if (neighbors.size() == 3)
                    {
                        grid2.put(loc, newFlower);
                    }
                }
                else
                {
                    Flower newFlower = new Flower();
                    if (neighbors.size() == 3 || neighbors.size() == 2)
                    {
                        grid2.put(loc,newFlower);
                    }
                    else
                    {
                        //grid2.remove(loc);
                    }
                }
                
            }
        }
        world.setGrid(grid2);
    }
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }
    
    

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        GameOfLife game = new GameOfLife();
        for(int i = 0; i < 300; i++)
        {
            Thread.sleep(500);
            game.createNextGeneration();
        }
    }

}
