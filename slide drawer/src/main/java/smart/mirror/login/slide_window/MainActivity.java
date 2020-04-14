package smart.mirror.login.slide_window;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawer);
        toolbar = findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.navigationView);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.drawerOpen,R.string.drawerClose);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.weather:
                Toast.makeText(MainActivity.this, "Weather Selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.profile:
                Toast.makeText(MainActivity.this, "Profile us Selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.connect:
                Toast.makeText(MainActivity.this, "Connect to the mirror Selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.common_questions:
                Toast.makeText(MainActivity.this, "Common questions and common answers Selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.about_us:
                Toast.makeText(MainActivity.this, "About us Selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.donate:
                Toast.makeText(MainActivity.this, "Donate Selected", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return false;
    }
}