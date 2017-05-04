package cl.riaraneda.appmor.views.tabs;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import cl.riaraneda.appmor.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShowFragment extends Fragment {


    public ShowFragment() {
        // Required empty public constructor
    }

    public static ShowFragment newInstance(){
        return new ShowFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_show, container, false);



    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final EditText addresseeMe = (EditText) view.findViewById(R.id.addresseeMe);
        final Button show = (Button) view.findViewById(R.id.showBtn);
        final TextView messageMe = (TextView) view.findViewById(R.id.messageMe);
        final TextView msgCount = (TextView) view.findViewById(R.id.msgCount);

show.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        addresseeMe.setVisibility(View.INVISIBLE);
        show.setVisibility(View.INVISIBLE);
        messageMe.setVisibility((View.VISIBLE));
        msgCount.setVisibility(View.VISIBLE);
    }
});


    }
}

