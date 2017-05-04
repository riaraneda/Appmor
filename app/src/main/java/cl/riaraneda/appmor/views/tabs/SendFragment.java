package cl.riaraneda.appmor.views.tabs;


import android.content.Intent;
import android.net.Uri;
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

import static cl.riaraneda.appmor.R.id.messageLove;


/**
 * A simple {@link Fragment} subclass.
 */
public class SendFragment extends Fragment {


    public SendFragment() {
        // Required empty public constructor
    }

    public static SendFragment newInstance() {
        return new SendFragment();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_send, container, false);
    }

    @Override
    public void onViewCreated(final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        final EditText addresseelove = (EditText) view.findViewById(R.id.addresseeLove);
        final EditText message = (EditText) view.findViewById(messageLove);
        final Button send = (Button) view.findViewById(R.id.sendBtn);
        final TextView confirmation = (TextView) view.findViewById(R.id.confirmation);
        final Button emailUs = (Button) view.findViewById(R.id.emailUs);
        final Button sendEmail = (Button) view.findViewById(R.id.sendEmail);


        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addresseelove.setVisibility(View.GONE);
                message.setVisibility(View.GONE);
                send.setVisibility(View.GONE);
                confirmation.setVisibility(View.VISIBLE);
                emailUs.setVisibility(View.VISIBLE);
                sendEmail.setVisibility(View.VISIBLE);


            }
        });

        emailUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setType("*/*");
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]
                        {"hola@appmor.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Habilitar Appmor Gratis");
                intent.putExtra(Intent.EXTRA_TEXT, "Habilitar Appmor gratis por hoy.".toString());
                startActivity(intent);
            }
        });


        sendEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setType("*/*");
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]
                        {addresseelove.getText().toString()});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Te estoy enviando un Appmor");
                intent.putExtra(Intent.EXTRA_TEXT, message.getText().toString());
                startActivity(intent);
            }
        });

        }
    }
