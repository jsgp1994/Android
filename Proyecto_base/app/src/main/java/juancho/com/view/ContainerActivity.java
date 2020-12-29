package juancho.com.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import juancho.com.R;
import juancho.com.view.fragment.HomeFragment;
import juancho.com.view.fragment.ProfileFragment;
import juancho.com.view.fragment.SearchFragment;

public class ContainerActivity extends AppCompatActivity {

    HomeFragment homeFragment = new HomeFragment();
    SearchFragment searchFragment = new SearchFragment();
    ProfileFragment profileFragment = new ProfileFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        /*BottomNavigationView navigation = findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener((BottomNavigationView.OnNavigationItemSelectedListener) mOnNavigationItemReselectedListener);
        loadFragment(homeFragment);*/
        loadFragment(homeFragment);
    }

    private final BottomNavigationView.OnNavigationItemReselectedListener mOnNavigationItemReselectedListener = new BottomNavigationView.OnNavigationItemReselectedListener() {
        @Override
        public void onNavigationItemReselected(@NonNull MenuItem item) {
            switch(item.getItemId()){
                case R.id.fragmentSearch:
                    loadFragment(searchFragment);
                case R.id.fragmentHome:
                    loadFragment(homeFragment);
                case R.id.fragmentProfile:
                    loadFragment(profileFragment);
            }
        }
    };

    public void loadFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.commit();
    }

}