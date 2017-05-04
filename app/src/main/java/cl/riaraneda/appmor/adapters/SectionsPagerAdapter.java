package cl.riaraneda.appmor.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import cl.riaraneda.appmor.views.tabs.SendFragment;
import cl.riaraneda.appmor.views.tabs.ShowFragment;

/**
 * Created by RicardoAraneda on 02-05-2017.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        switch (position){
            case 0:
                return ShowFragment.newInstance();
            case 1:
                return SendFragment.newInstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "RECIBIR APPMOR";
            case 1:
                return "ENVIAR APPMOR";
        }
        return null;
    }
}
