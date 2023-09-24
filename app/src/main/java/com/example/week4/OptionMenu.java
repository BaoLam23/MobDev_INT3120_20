package com.example.week4;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.core.view.MenuItemCompat;

public class OptionMenu extends Activity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        MenuItem menuItem = menu.findItem(R.id.item2);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(menuItem);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.item2)
            Toast.makeText(this, "This is item 2", Toast.LENGTH_LONG).show();
        else if (id == R.id.item3)
            Toast.makeText(this, "This is item 3", Toast.LENGTH_LONG).show();


        return super.onOptionsItemSelected(item);
    }
}
