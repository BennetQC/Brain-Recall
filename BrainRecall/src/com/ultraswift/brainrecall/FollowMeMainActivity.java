
package com.ultraswift.brainrecall;

import bennet_za.followme.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

/**
* @author Bennet Makwakwa - Bennet_ZA (twitter)
 * Presents the title screen with GUI by which the player can
 * go into the game, or display high scores.
 */
public class FollowMeMainActivity extends Activity 
{
	/**
     * Called when the activity is first created. 
     *
     * @param  savedInstanceState  If the activity is being re-initialized after previously being shut down
     *                             then this Bundle contains the data it most recently supplied in
     *                             onSaveInstanceState(Bundle). Note: Otherwise it is null.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        SavedData.initialize(getApplicationContext());
    }
    
    /**
     * Called whenever the play button is clicked. 
     *
     * @param  view  The view that was clicked.  This is unused.
     */
    public void playGameButtonClicked(View view) {
    	
    	
    	
    	setContentView(R.layout.main);
    	//Create AddView
    	
    
    	
    	
    	
    	
    	
    	Intent i = new Intent(this, FollowMeGameActivity.class);
        startActivity(i);
    }
    
    /**
     * Called whenever the high scores button is clicked. 
     *
     * @param  view  The view that was clicked.  This is unused.
     */
    public void viewScoresButtonClicked(View view) {
    	Intent i = new Intent(this, FollowMeScoresActivity.class);
        startActivity(i);
    }
}
